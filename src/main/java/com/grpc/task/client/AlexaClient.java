package com.grpc.task.client;

import com.proto.task.CreateTaskRequest;
import com.proto.task.CreateTaskResponse;
import com.proto.task.Task;
import com.proto.task.TaskServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AlexaClient {

    public static void main(String[] args) {
        System.out.println("Hello i am a gRPC client");

        AlexaClient main = new AlexaClient();
        main.run();
    }

    private void run() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        TaskServiceGrpc.TaskServiceBlockingStub taskClient = TaskServiceGrpc.newBlockingStub(channel);

        Task task = Task.newBuilder()
                .setTitle("Cleaning Reminder")
                .setContent("Clean kitchen and sitting room this Wednesday")
                .build();

        CreateTaskResponse createResponse = taskClient.createTask(
                CreateTaskRequest.newBuilder()
                        .setTask(task)
                        .build()
        );

        System.out.println("Received create task response");
        System.out.println(createResponse.toString());

    }
}
