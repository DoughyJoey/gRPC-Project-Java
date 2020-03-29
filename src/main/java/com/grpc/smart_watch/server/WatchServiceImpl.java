package com.grpc.smart_watch.server;

import com.proto.smart_watch.SleepAverageRequest;
import com.proto.smart_watch.SleepAverageResponse;
import com.proto.smart_watch.WatchServiceGrpc;
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
}
