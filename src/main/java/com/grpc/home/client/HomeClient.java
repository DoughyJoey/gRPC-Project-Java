package com.grpc.home.client;

import com.proto.home.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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

        doBathCall(channel);
        doLightCall(channel);


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

}
