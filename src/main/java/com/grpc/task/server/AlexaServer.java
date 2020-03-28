package com.grpc.task.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AlexaServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new AlexaServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
