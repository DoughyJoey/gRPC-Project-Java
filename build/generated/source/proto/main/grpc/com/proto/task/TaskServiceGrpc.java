package com.proto.task;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.0)",
    comments = "Source: task/task.proto")
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final String SERVICE_NAME = "task.TaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.task.CreateTaskRequest,
      com.proto.task.CreateTaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = com.proto.task.CreateTaskRequest.class,
      responseType = com.proto.task.CreateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.task.CreateTaskRequest,
      com.proto.task.CreateTaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.proto.task.CreateTaskRequest, com.proto.task.CreateTaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = TaskServiceGrpc.getCreateTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getCreateTaskMethod = TaskServiceGrpc.getCreateTaskMethod) == null) {
          TaskServiceGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<com.proto.task.CreateTaskRequest, com.proto.task.CreateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.CreateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.CreateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("CreateTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.task.ReadTaskRequest,
      com.proto.task.ReadTaskResponse> getReadTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadTask",
      requestType = com.proto.task.ReadTaskRequest.class,
      responseType = com.proto.task.ReadTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.task.ReadTaskRequest,
      com.proto.task.ReadTaskResponse> getReadTaskMethod() {
    io.grpc.MethodDescriptor<com.proto.task.ReadTaskRequest, com.proto.task.ReadTaskResponse> getReadTaskMethod;
    if ((getReadTaskMethod = TaskServiceGrpc.getReadTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getReadTaskMethod = TaskServiceGrpc.getReadTaskMethod) == null) {
          TaskServiceGrpc.getReadTaskMethod = getReadTaskMethod =
              io.grpc.MethodDescriptor.<com.proto.task.ReadTaskRequest, com.proto.task.ReadTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.ReadTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.ReadTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("ReadTask"))
              .build();
        }
      }
    }
    return getReadTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.task.UpdateTaskRequest,
      com.proto.task.UpdateTaskResponse> getUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTask",
      requestType = com.proto.task.UpdateTaskRequest.class,
      responseType = com.proto.task.UpdateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.task.UpdateTaskRequest,
      com.proto.task.UpdateTaskResponse> getUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.proto.task.UpdateTaskRequest, com.proto.task.UpdateTaskResponse> getUpdateTaskMethod;
    if ((getUpdateTaskMethod = TaskServiceGrpc.getUpdateTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getUpdateTaskMethod = TaskServiceGrpc.getUpdateTaskMethod) == null) {
          TaskServiceGrpc.getUpdateTaskMethod = getUpdateTaskMethod =
              io.grpc.MethodDescriptor.<com.proto.task.UpdateTaskRequest, com.proto.task.UpdateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.UpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.UpdateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("UpdateTask"))
              .build();
        }
      }
    }
    return getUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.task.DeleteTaskRequest,
      com.proto.task.DeleteTaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTask",
      requestType = com.proto.task.DeleteTaskRequest.class,
      responseType = com.proto.task.DeleteTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.task.DeleteTaskRequest,
      com.proto.task.DeleteTaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<com.proto.task.DeleteTaskRequest, com.proto.task.DeleteTaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = TaskServiceGrpc.getDeleteTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getDeleteTaskMethod = TaskServiceGrpc.getDeleteTaskMethod) == null) {
          TaskServiceGrpc.getDeleteTaskMethod = getDeleteTaskMethod =
              io.grpc.MethodDescriptor.<com.proto.task.DeleteTaskRequest, com.proto.task.DeleteTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.DeleteTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.DeleteTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("DeleteTask"))
              .build();
        }
      }
    }
    return getDeleteTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.task.ListTaskRequest,
      com.proto.task.ListTaskResponse> getListTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTask",
      requestType = com.proto.task.ListTaskRequest.class,
      responseType = com.proto.task.ListTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.task.ListTaskRequest,
      com.proto.task.ListTaskResponse> getListTaskMethod() {
    io.grpc.MethodDescriptor<com.proto.task.ListTaskRequest, com.proto.task.ListTaskResponse> getListTaskMethod;
    if ((getListTaskMethod = TaskServiceGrpc.getListTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getListTaskMethod = TaskServiceGrpc.getListTaskMethod) == null) {
          TaskServiceGrpc.getListTaskMethod = getListTaskMethod =
              io.grpc.MethodDescriptor.<com.proto.task.ListTaskRequest, com.proto.task.ListTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.ListTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.task.ListTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("ListTask"))
              .build();
        }
      }
    }
    return getListTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub>() {
        @java.lang.Override
        public TaskServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceStub(channel, callOptions);
        }
      };
    return TaskServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub>() {
        @java.lang.Override
        public TaskServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceBlockingStub(channel, callOptions);
        }
      };
    return TaskServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub>() {
        @java.lang.Override
        public TaskServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceFutureStub(channel, callOptions);
        }
      };
    return TaskServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TaskServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTask(com.proto.task.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.CreateTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    public void readTask(com.proto.task.ReadTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.ReadTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadTaskMethod(), responseObserver);
    }

    /**
     */
    public void updateTask(com.proto.task.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.UpdateTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskMethod(), responseObserver);
    }

    /**
     */
    public void deleteTask(com.proto.task.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.DeleteTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    /**
     */
    public void listTask(com.proto.task.ListTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.ListTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListTaskMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.task.CreateTaskRequest,
                com.proto.task.CreateTaskResponse>(
                  this, METHODID_CREATE_TASK)))
          .addMethod(
            getReadTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.task.ReadTaskRequest,
                com.proto.task.ReadTaskResponse>(
                  this, METHODID_READ_TASK)))
          .addMethod(
            getUpdateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.task.UpdateTaskRequest,
                com.proto.task.UpdateTaskResponse>(
                  this, METHODID_UPDATE_TASK)))
          .addMethod(
            getDeleteTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.task.DeleteTaskRequest,
                com.proto.task.DeleteTaskResponse>(
                  this, METHODID_DELETE_TASK)))
          .addMethod(
            getListTaskMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.task.ListTaskRequest,
                com.proto.task.ListTaskResponse>(
                  this, METHODID_LIST_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class TaskServiceStub extends io.grpc.stub.AbstractAsyncStub<TaskServiceStub> {
    private TaskServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTask(com.proto.task.CreateTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.CreateTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readTask(com.proto.task.ReadTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.ReadTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTask(com.proto.task.UpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.UpdateTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTask(com.proto.task.DeleteTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.DeleteTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTask(com.proto.task.ListTaskRequest request,
        io.grpc.stub.StreamObserver<com.proto.task.ListTaskResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.task.CreateTaskResponse createTask(com.proto.task.CreateTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.task.ReadTaskResponse readTask(com.proto.task.ReadTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.task.UpdateTaskResponse updateTask(com.proto.task.UpdateTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.task.DeleteTaskResponse deleteTask(com.proto.task.DeleteTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.task.ListTaskResponse> listTask(
        com.proto.task.ListTaskRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.task.CreateTaskResponse> createTask(
        com.proto.task.CreateTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.task.ReadTaskResponse> readTask(
        com.proto.task.ReadTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.task.UpdateTaskResponse> updateTask(
        com.proto.task.UpdateTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.task.DeleteTaskResponse> deleteTask(
        com.proto.task.DeleteTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_READ_TASK = 1;
  private static final int METHODID_UPDATE_TASK = 2;
  private static final int METHODID_DELETE_TASK = 3;
  private static final int METHODID_LIST_TASK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.proto.task.CreateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.task.CreateTaskResponse>) responseObserver);
          break;
        case METHODID_READ_TASK:
          serviceImpl.readTask((com.proto.task.ReadTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.task.ReadTaskResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TASK:
          serviceImpl.updateTask((com.proto.task.UpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.task.UpdateTaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((com.proto.task.DeleteTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.task.DeleteTaskResponse>) responseObserver);
          break;
        case METHODID_LIST_TASK:
          serviceImpl.listTask((com.proto.task.ListTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.task.ListTaskResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.task.TaskOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(getCreateTaskMethod())
              .addMethod(getReadTaskMethod())
              .addMethod(getUpdateTaskMethod())
              .addMethod(getDeleteTaskMethod())
              .addMethod(getListTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
