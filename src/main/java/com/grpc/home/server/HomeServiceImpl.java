package com.grpc.home.server;

import com.proto.home.*;
import io.grpc.stub.StreamObserver;

public class HomeServiceImpl extends HomeServiceGrpc.HomeServiceImplBase {


    @Override
    public void bath(BathRequest request, StreamObserver<BathResponse> responseObserver) {
        Bath bath = request.getBath();
        String title = bath.getTitle();
        double time = bath.getTime();
        TempSentiment temp_sentiment = bath.getTempSentiment();

        // create the response
        String result = "Your bath request have been confirmed: " + "\n TASK:" + title + "\n TIME:" + time + "\n TEMPERATURE:" + temp_sentiment;
        BathResponse response = BathResponse.newBuilder()
                .setResult(result)
                .build();

        // send the response
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
}
