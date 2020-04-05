package com.grpc.alexa.client;

import com.proto.task.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AlexaClient {

    public static void main(String[] args) {
        System.out.println("Hello i am a gRPC client");

        // create a new alexa client
        AlexaClient main = new AlexaClient();
        // call run method
        main.run();
    }

    private void run() {

        // creates the channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // creates the taskClient
        TaskServiceGrpc.TaskServiceBlockingStub taskClient = TaskServiceGrpc.newBlockingStub(channel);

        // CREATE TASK
        Task task = Task.newBuilder()
                .setTitle("Schedule Appointment")
                .setContent("Schedule an appointment for the 4th of January")
                .build();

        // creates the response
        CreateTaskResponse createResponse = taskClient.createTask(
                CreateTaskRequest.newBuilder()
                        .setTask(task)
                        .build()
        );

        // logging
        System.out.println("Received create task response");
        System.out.println(createResponse.toString());

        // READ TASK
        // gets the task ID
        String taskId = createResponse.getTask().getId();

        System.out.println("Reading task....");

        // responds with the first task
        ReadTaskResponse readTaskResponse = taskClient.readTask(ReadTaskRequest.newBuilder()
                .setTaskId(taskId)
                .build());

        System.out.println(readTaskResponse.toString());

        // Testing error handling
//        System.out.println("Reading task with non existing id...");
//
//        ReadTaskResponse readTaskResponseNotFound = taskClient.readTask(ReadTaskRequest.newBuilder()
//                .setTaskId("5e7f98df22d3cb015c998471")
//                .build());


        // UPDATE TASK
        // updates task with new data
        Task newTask = Task.newBuilder()
                .setId(taskId)
                .setTitle("New appointment (updated)!")
                .setContent("Appointment is now scheduled for the 17 of March (Updated)!")
                .build();

        // updates the task
        System.out.println("Updating task...");
        UpdateTaskResponse updateTaskResponse = taskClient.updateTask(
                UpdateTaskRequest.newBuilder().setTask(newTask).build());

        // print the updated task
        System.out.println("Updated task");
        System.out.println(updateTaskResponse.toString());

        // DELETE TASK
        // deletes the task, sends response to the user
        System.out.println("Deleting task");
        DeleteTaskResponse deleteTaskResponse = taskClient.deleteTask(
                DeleteTaskRequest.newBuilder().setTaskId(taskId).build()
        );
        System.out.println("Deleted task");

        // testing error handing
//        System.out.println("Reading task");
        // this should return NOT_FOUND
//        ReadTaskResponse readTaskResponseAfterDeletion = taskClient.readTask(ReadTaskRequest.newBuilder()
//                .setTaskId(taskId)
//                .build());

        // LIST TASKS
        // lists each task found in the database
        System.out.println("Listing tasks");
        taskClient.listTask(ListTaskRequest.newBuilder().build()).forEachRemaining(
                listTaskResponse -> System.out.println(listTaskResponse.getTask().toString())
        );
    }
}
