package com.grpc.task.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.proto.task.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class AlexaServiceImpl extends TaskServiceGrpc.TaskServiceImplBase {

    // creates a mongo client
    private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    // creates a mongo databse (alexa_db)
    private MongoDatabase database = mongoClient.getDatabase("alexa_db");
    // creates a collection of tasks
    private MongoCollection<Document> collection = database.getCollection("task");

    @Override
    public void createTask(CreateTaskRequest request, StreamObserver<CreateTaskResponse> responseObserver) {
        System.out.println("Received Create task request");

        Task task = request.getTask();

        // parses the tasks so they can be accepted by MongoDB
        Document doc = new Document("title", task.getTitle())
                .append("content", task.getContent());

        System.out.println("Inserting task...");
        // insert the document into mongoDB
        collection.insertOne(doc);


        // retrieve the ID generate by MongoDB
        String id = doc.getObjectId("_id").toString();

        System.out.println("Inserted task: " + id);

        // send back the response
        CreateTaskResponse response = CreateTaskResponse.newBuilder()
                .setTask(task.toBuilder().setId(id).build())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    @Override
    public void readTask(ReadTaskRequest request, StreamObserver<ReadTaskResponse> responseObserver) {

        System.out.println("Received Read Task request");

        String taskId = request.getTaskId();

        System.out.println("Searching for a task");
        Document result = null;

        try {
            result = collection.find(eq("_id", new ObjectId(taskId)))
                    .first();
        } catch (Exception e) {
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );
        }

        if (result == null) {
            System.out.println("Task not found");
            // we don't have a match
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .asRuntimeException()
            );
        } else {
            System.out.println("Task found, sending response");
            Task task = documentToTask(result);

            responseObserver.onNext(ReadTaskResponse.newBuilder().setTask(task).build());

            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateTask(UpdateTaskRequest request, StreamObserver<UpdateTaskResponse> responseObserver) {
        System.out.println("Received Update task request");

        Task task = request.getTask();

        String taskId = task.getId();

        System.out.println("Searching for a task so we can update it");
        Document result = null;

        try {
            result = collection.find(eq("_id", new ObjectId(taskId)))
                    .first();
        } catch (Exception e) {
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );
        }

        if (result == null) {
            System.out.println("Task not found");
            // we don't have a match
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .asRuntimeException()
            );
        } else {
            Document replacement = new Document("title", task.getTitle())
                    .append("content", task.getContent())
                    .append("_id", new ObjectId(taskId));

            System.out.println("Replacing task in database...");

            collection.replaceOne(eq("_id", result.getObjectId("_id")), replacement);

            System.out.println("Replaced! Sending as a response");
            responseObserver.onNext(
                    UpdateTaskResponse.newBuilder()
                            .setTask(documentToTask(replacement))
                            .build()
            );

            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteTask(DeleteTaskRequest request, StreamObserver<DeleteTaskResponse> responseObserver) {
        System.out.println("Received Delete Task Request");

        String taskId = request.getTaskId();
        DeleteResult result = null;
        try {
            result = collection.deleteOne(eq("_id", new ObjectId(taskId)));
        } catch (Exception e) {
            System.out.println("Task not found");
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );
        }

        if (result.getDeletedCount() == 0) {
            System.out.println("Task not found");
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .asRuntimeException()
            );
        } else {
            System.out.println("Task was deleted");
            responseObserver.onNext(DeleteTaskResponse.newBuilder()
                    .setTaskId(taskId)
                    .build());

            responseObserver.onCompleted();
        }
    }

    @Override
    public void listTask(ListTaskRequest request, StreamObserver<ListTaskResponse> responseObserver) {
        System.out.println("Received List Task Request");

        // gives a list of found documents
        // streams results back to the client
        collection.find().iterator().forEachRemaining(document -> responseObserver.onNext(
                ListTaskResponse.newBuilder().setTask(documentToTask(document)).build()
        ));

        responseObserver.onCompleted();
    }

    private Task documentToTask(Document document){
        return Task.newBuilder()
                .setTitle(document.getString("title"))
                .setContent(document.getString("content"))
                .setId(document.getObjectId("_id").toString())
                .build();
    }

}
