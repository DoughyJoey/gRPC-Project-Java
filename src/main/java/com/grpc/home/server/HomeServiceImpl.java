package com.grpc.home.server;

import com.proto.home.*;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

public class HomeServiceImpl extends HomeServiceGrpc.HomeServiceImplBase {


    @Override
    public void bath(BathRequest request, StreamObserver<BathResponse> responseObserver) {
        Bath bath = request.getBath();
        String title = bath.getTitle();
        double time = bath.getTime();
        TempSentiment temp_sentiment = bath.getTempSentiment();

        // create the response
        String result = "Your bath request have been confirmed: " + "\n TASK: " + title + "\n TIME: " + time + "\n TEMPERATURE: " + temp_sentiment;
        BathResponse response = BathResponse.newBuilder()
                .setResult(result)
                .build();

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<LightRequest> light(StreamObserver<LightResponse> responseObserver) {
        // we create the requestObserver that we'll return in this function
        StreamObserver<LightRequest> requestObserver = new StreamObserver<LightRequest>() {

            String result = "";

            @Override
            public void onNext(LightRequest value) {
                // client sends a message
                result += "Light has been switched to: " + value.getLight().getLightAction() + "! \n";
            }

            @Override
            public void onError(Throwable t) {
                // client sends an error
            }

            @Override
            public void onCompleted() {
                // client is done
                responseObserver.onNext(
                        LightResponse.newBuilder()
                                .setResult(result)
                                .build()
                );
                responseObserver.onCompleted();
            }
        };


        return requestObserver;
    }

    @Override
    public void printer(PrinterRequest request, StreamObserver<PrinterResponse> responseObserver) {
        String name = request.getPrinter().getName();
        String document = request.getPrinter().getDocument();
        int num_pages = request.getPrinter().getNumPages();
        Orientation orientation = request.getPrinter().getOrientation();

        try {
            for (int i = 0; i <= num_pages; i++) {
                String result = " Name: " + name + "\n Document: " + document + "\n Orientation: " + orientation + "\n Printing Page: " + i;
                PrinterResponse response = PrinterResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<VacuumRequest> vacuum(StreamObserver<VacuumResponse> responseObserver) {
        StreamObserver<VacuumRequest> requestObserver = new StreamObserver<VacuumRequest>() {
            @Override
            public void onNext(VacuumRequest value) {
                String result = "Action confirmed: " + value.getVacuum().getAction();
                VacuumResponse vacuumResponse = VacuumResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(vacuumResponse);
            }

            @Override
            public void onError(Throwable t) {
                // do nothing
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }

    @Override
    public void vacuumWithDeadline(VacuumWithDeadlineRequest request, StreamObserver<VacuumWithDeadlineResponse> responseObserver) {
        Context current = Context.current();

        try {

            for (int i = 0; i < 3; i++) {
                if (!current.isCancelled()) {
                    System.out.println("sleep for 100 ms");
                    Thread.sleep(100);
                } else {
                    return;
                }
            }

            System.out.println("send response");
            responseObserver.onNext(
                    VacuumWithDeadlineResponse.newBuilder()
                            .setResult("Action: " + request.getVacuum().getAction())
                            .build()
            );

            responseObserver.onCompleted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
