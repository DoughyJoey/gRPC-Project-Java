package com.grpc.smart_watch.server;

import com.proto.smart_watch.*;
import io.grpc.stub.StreamObserver;

import java.nio.file.WatchService;

public class WatchServiceImpl extends WatchServiceGrpc.WatchServiceImplBase {

    @Override
    public StreamObserver<SleepAverageRequest> sleepAverage(StreamObserver<SleepAverageResponse> responseObserver) {
        StreamObserver<SleepAverageRequest> requestObserver = new StreamObserver<SleepAverageRequest>() {
            // running sum and count
            int sum = 0;
            int count = 0;

            @Override
            public void onNext(SleepAverageRequest value) {
                // increment the sum
                sum += value.getNumber();
                // increment the count
                count += 1;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                // compute average
                double average = (double) sum / count;
                responseObserver.onNext(
                        SleepAverageResponse.newBuilder()
                                .setAverage(average)
                                .build()
                );
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }

    @Override
    public StreamObserver<MaxHeartRateRequest> maxHeartRate(StreamObserver<MaxHeartRateResponse> responseObserver) {

        return new StreamObserver<MaxHeartRateRequest>() {

            int currentMaximum = 0;

            @Override
            public void onNext(MaxHeartRateRequest value) {
                int currentNumber = value.getNumber();

                if (currentNumber > currentMaximum) {
                    currentMaximum = currentNumber;
                    responseObserver.onNext(
                            MaxHeartRateResponse.newBuilder()
                                    .setMaximum(currentMaximum)
                                    .build()
                    );
                } else {
                    // nothing
                }
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                // send the current last maximum
                responseObserver.onNext(
                        MaxHeartRateResponse.newBuilder()
                                .setMaximum(currentMaximum)
                                .build());
                // the server is done sending data
                responseObserver.onCompleted();
            }
        };
    }
}
