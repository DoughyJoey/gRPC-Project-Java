package com.grpc.task.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.task.CreateTaskRequest;
import com.proto.task.CreateTaskResponse;
import com.proto.task.Task;
import com.proto.task.TaskServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.bson.Document;

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
}
