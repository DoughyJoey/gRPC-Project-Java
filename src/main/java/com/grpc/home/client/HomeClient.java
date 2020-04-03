package com.grpc.home.client;

import com.proto.home.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class HomeClient {

    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        HomeClient main = new HomeClient();
        main.run();
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055)
                .usePlaintext()
                .build();

        //doBathCall(channel);
        //doLightCall(channel);
        //doPrinterCall(channel);
        //doVacuumCall(channel);
        doVacuumWithDeadline(channel);

        System.out.println("Shutting down channel");
        channel.shutdown();

    }

    private void doBathCall(ManagedChannel channel){
        // created a greet service client (blocking - synchronous)
        HomeServiceGrpc.HomeServiceBlockingStub bathClient = HomeServiceGrpc.newBlockingStub(channel);

        // Unary
        // created a protocol buffer greeting message
        Bath bath = Bath.newBuilder()
                .setTitle("Run Bath")
                .setTime(13.00)
                .setTempSentiment(TempSentiment.HOT)
                .build();

        // do the same for a GreetRequest
        BathRequest bathRequest = BathRequest.newBuilder()
                .setBath(bath)
                .build();

        // call the RPC and get back a GreetResponse (protocol buffers)
        BathResponse bathResponse = bathClient.bath(bathRequest);

        System.out.println(bathResponse.getResult());

    }

    private void doLightCall(ManagedChannel channel) {
        // create an asynchronous client
        HomeServiceGrpc.HomeServiceStub asyncClient = HomeServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<LightRequest> requestObserver = asyncClient.light(new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse value) {
                // we get a response from the server
                System.out.println("Received a response from the server");
                System.out.println(value.getResult());
                // onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get an error from the server
            }

            @Override
            public void onCompleted() {
                // the server is done sending us data
                // onCompleted will be called right after onNext()
                System.out.println("Server has completed sending us something");
                latch.countDown();
            }
        });

        // STREAMING ACTION 1
        System.out.println("First action has been sent");
        requestObserver.onNext(LightRequest.newBuilder()
                .setLight(Light.newBuilder()
                        .setLightAction(Action.ON)
                        .build())
                .build());

        // STREAMING ACTION 2
        System.out.println("Second action has been sent");
        requestObserver.onNext(LightRequest.newBuilder()
                .setLight(Light.newBuilder()
                        .setLightAction(Action.OFF)
                        .build())
                .build());

        // STREAMING ACTION 3
        System.out.println("Third action has been sent");
        requestObserver.onNext(LightRequest.newBuilder()
                .setLight(Light.newBuilder()
                        .setLightAction(Action.ON)
                        .build())
                .build());

        // STREAMING ACTION 4
        System.out.println("Fourth action has been sent");
        requestObserver.onNext(LightRequest.newBuilder()
                .setLight(Light.newBuilder()
                        .setLightAction(Action.OFF)
                        .build())
                .build());

        // we tell the server that the client is done sending data
        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doPrinterCall(ManagedChannel channel) {
        HomeServiceGrpc.HomeServiceBlockingStub printClient = HomeServiceGrpc.newBlockingStub(channel);

        // Server Streaming
        // we prepare the request
        PrinterRequest printerRequest =
                PrinterRequest.newBuilder()
                        .setPrinter(Printer.newBuilder()
                                .setName("HP ENVY 1450")
                                .setDocument("Distributed Systems Report")
                                .setNumPages(10)
                                .setOrientation(Orientation.PORTRAIT))
                        .build();

        // we stream the responses (in a blocking manner)
        printClient.printer(printerRequest)
                .forEachRemaining(printerResponse -> {
                    System.out.println(printerResponse.getResult());
                });

    }

    private void doVacuumCall(ManagedChannel channel) {
        HomeServiceGrpc.HomeServiceStub asyncClient = HomeServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<VacuumRequest> requestObserver = asyncClient.vacuum(new StreamObserver<VacuumResponse>() {
            @Override
            public void onNext(VacuumResponse value) {
                System.out.println("Response from server: " + value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
                latch.countDown();
            }
        });

        Arrays.asList("Turn on", "Clean bathroom", "Clean Kitchen", "Turn left", "Power off").forEach(
                name -> {
                    System.out.println("Request send to vacuum: " + name);
                    requestObserver.onNext(VacuumRequest.newBuilder()
                            .setVacuum(Vacuum.newBuilder()
                                    .setAction(name))
                            .build());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void doVacuumWithDeadline(ManagedChannel channel) {
        HomeServiceGrpc.HomeServiceBlockingStub blockingStub = HomeServiceGrpc.newBlockingStub(channel);

        // first call (3000 ms deadline)
        try {
            System.out.println("Sending a request with a deadline of 3000 ms");
            VacuumWithDeadlineResponse response = blockingStub.withDeadlineAfter(3000, TimeUnit.MILLISECONDS).vacuumWithDeadline(VacuumWithDeadlineRequest.newBuilder().setVacuum(
                    Vacuum.newBuilder().setAction("Clean Kitchen")
            ).build());
            System.out.println(response.getResult());
        } catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.DEADLINE_EXCEEDED) {
                System.out.println("Deadline has been exceeded, we don't want the response");
            } else {
                e.printStackTrace();
            }
        }


        // second call (100 ms deadline)
        try {
            System.out.println("Sending a request with a deadline of 100 ms");
            VacuumWithDeadlineResponse response = blockingStub.withDeadlineAfter(100, TimeUnit.MILLISECONDS).vacuumWithDeadline(VacuumWithDeadlineRequest.newBuilder().setVacuum(
                    Vacuum.newBuilder().setAction("Clean Kitchen")
            ).build());
            System.out.println(response.getResult());
        } catch (StatusRuntimeException e) {
            if (e.getStatus().getCode() == Status.Code.DEADLINE_EXCEEDED) {
                System.out.println("Deadline has been exceeded, we don't want the response");
            } else {
                e.printStackTrace();
            }
        }
    }
}
