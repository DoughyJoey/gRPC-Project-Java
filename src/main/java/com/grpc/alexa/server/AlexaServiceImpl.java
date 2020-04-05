package com.grpc.alexa.server;

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
    // mongodb connection string mongodb://localhost:27017
    private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    // creates a mongo databse - (alexa_db)
    private MongoDatabase database = mongoClient.getDatabase("alexa_db");
    // gets a collection of tasks
    private MongoCollection<Document> collection = database.getCollection("task");

    @Override
    public void createTask(CreateTaskRequest request, StreamObserver<CreateTaskResponse> responseObserver) {
        System.out.println("Received create task request");

        // gets task from the CreateTaskRequest
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

        // get the task ID
        String taskId = request.getTaskId();

        System.out.println("Searching for a task");
        // initialise result
        Document result = null;

        try {
            // finds the first id in our collection
            result = collection.find(eq("_id", new ObjectId(taskId)))
                    .first();
            // returns NOT_FOUND if ID was not found
        } catch (Exception e) {
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );
        }

        // when there is not match, return a NOT_FOUND error
        if (result == null) {
            System.out.println("Task not found");
            // we don't have a match
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .asRuntimeException()
            );
            // we have a result
        } else {
            System.out.println("Task found, sending response");
            Task task = documentToTask(result);

            // pass in the task in the response
            responseObserver.onNext(ReadTaskResponse.newBuilder().setTask(task).build());

            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateTask(UpdateTaskRequest request, StreamObserver<UpdateTaskResponse> responseObserver) {
        System.out.println("Received Update task request");

        // gets the task
        Task task = request.getTask();

        // gets the task ID
        String taskId = task.getId();

        System.out.println("Searching for a task so we can update it");
        // initialise the result
        Document result = null;

        try {
            // finds the first task in the collection
            result = collection.find(eq("_id", new ObjectId(taskId)))
                    .first();
        } catch (Exception e) {
            // returns a NOT_FOUND error if the ID is not found
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );
        }

        // returns NOT_FOUND if no match is found in the collection
        if (result == null) {
            System.out.println("Task not found");
            // we don't have a match
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .asRuntimeException()
            );
        } else {
            // if the task is found
            // create a replacement object
            Document replacement = new Document("title", task.getTitle())
                    .append("content", task.getContent())
                    .append("_id", new ObjectId(taskId));

            System.out.println("Replacing task in database...");

            // replace object in the collection
            collection.replaceOne(eq("_id", result.getObjectId("_id")), replacement);

            // send response
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

        // get the task ID
        String taskId = request.getTaskId();
        // initialise the result
        DeleteResult result = null;

        try {
            // deletes specific object from the collection
            result = collection.deleteOne(eq("_id", new ObjectId(taskId)));
            // return error if task not found
        } catch (Exception e) {
            System.out.println("Task not found");
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException()
            );
        }

        // if there are no tasks in the database, return NOT_FOUND
        if (result.getDeletedCount() == 0) {
            System.out.println("Task not found");
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("The task with the corresponding id was not found")
                            .asRuntimeException()
            );
        } else {
            // if task was successfully deleted, send response
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

    // method that sets task fields
    // takes a document and returns a task
    private Task documentToTask(Document document){
        return Task.newBuilder()
                .setTitle(document.getString("title"))
                .setContent(document.getString("content"))
                .setId(document.getObjectId("_id").toString())
                .build();
    }

}
