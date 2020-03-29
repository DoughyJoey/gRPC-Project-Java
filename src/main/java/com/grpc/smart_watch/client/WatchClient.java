package com.grpc.smart_watch.client;


import com.proto.smart_watch.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class WatchClient {

    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        WatchClient main = new WatchClient();
        main.run();
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053)
                .usePlaintext()
                .build();

        doSleepStreamingCall(channel);
        doHeartRateStreamingCall(channel);


        System.out.println("Shutting down channel");
        channel.shutdown();

    }

    private void doSleepStreamingCall(ManagedChannel channel){
        WatchServiceGrpc.WatchServiceStub asyncClient = WatchServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<SleepAverageRequest> requestObserver = asyncClient.sleepAverage(new StreamObserver<SleepAverageResponse>() {
            @Override
            public void onNext(SleepAverageResponse value) {
                System.out.println("Received a response from the server");
                System.out.println("Your average sleep this week is: \033[1m" + value.getAverage() + " hrs \033[0m");
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Server has completed sending us data");
                latch.countDown();
            }
        });

        requestObserver.onNext((SleepAverageRequest.newBuilder()
                .setNumber(7)
                .build()));

        requestObserver.onNext((SleepAverageRequest.newBuilder()
                .setNumber(6)
                .build()));

        requestObserver.onNext((SleepAverageRequest.newBuilder()
                .setNumber(8)
                .build()));

        requestObserver.onNext((SleepAverageRequest.newBuilder()
                .setNumber(9)
                .build()));

        requestObserver.onNext((SleepAverageRequest.newBuilder()
                .setNumber(6)
                .build()));

        // to demonstrate client streaming - we send 20000 messages to our server
//        for (int i = 0; i < 20000; i++){
//            requestObserver.onNext(SleepAverageRequest.newBuilder()
//                    .setNumber(i)
//                    .build());
//        }

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doHeartRateStreamingCall(ManagedChannel channel){
        WatchServiceGrpc.WatchServiceStub asyncClient = WatchServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);


        StreamObserver<MaxHeartRateRequest> requestObserver = asyncClient.maxHeartRate(new StreamObserver<MaxHeartRateResponse>() {
            @Override
            public void onNext(MaxHeartRateResponse value) {
                System.out.println("Your maximum heart rate is: " + value.getMaximum());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending messages");
            }
        });


        Arrays.asList(68, 65, 77, 80, 101, 111, 90).forEach(
                number -> {
                    System.out.println("Current heart rate: " + number);
                    requestObserver.onNext(MaxHeartRateRequest.newBuilder()
                            .setNumber(number)
                            .build());
                    try {
                        Thread.sleep(200);
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

}
