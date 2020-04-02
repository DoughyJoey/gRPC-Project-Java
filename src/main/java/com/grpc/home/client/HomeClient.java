package com.grpc.home.client;

import com.proto.home.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

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

}
