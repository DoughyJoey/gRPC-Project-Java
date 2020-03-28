package com.grpc.task.client;

import com.proto.task.*;
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

        // CREATE TASK
        Task task = Task.newBuilder()
                .setTitle("Schedule Appointment")
                .setContent("Schedule an appointment for the 4th of January")
                .build();

        CreateTaskResponse createResponse = taskClient.createTask(
                CreateTaskRequest.newBuilder()
                        .setTask(task)
                        .build()
        );

        System.out.println("Received create task response");
        System.out.println(createResponse.toString());

        // READ TASK
        String taskId = createResponse.getTask().getId();

        System.out.println("Reading task....");

        ReadTaskResponse readTaskResponse = taskClient.readTask(ReadTaskRequest.newBuilder()
                .setTaskId(taskId)
                .build());

        System.out.println(readTaskResponse.toString());

        // trigger a not found error
//        System.out.println("Reading task with non existing id....");
//
//        ReadTaskResponse readTaskResponseNotFound = taskClient.readTask(ReadTaskRequest.newBuilder()
//                .setTaskId("5e7f98df22d3cb015c998471")
//                .build());



    }
}
