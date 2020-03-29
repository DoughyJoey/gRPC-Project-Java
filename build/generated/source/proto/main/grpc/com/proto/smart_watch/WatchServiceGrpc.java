package com.proto.smart_watch;

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
    comments = "Source: smart_watch/watch.proto")
public final class WatchServiceGrpc {

  private WatchServiceGrpc() {}

  public static final String SERVICE_NAME = "smart_watch.WatchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.smart_watch.SleepAverageRequest,
      com.proto.smart_watch.SleepAverageResponse> getSleepAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SleepAverage",
      requestType = com.proto.smart_watch.SleepAverageRequest.class,
      responseType = com.proto.smart_watch.SleepAverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.smart_watch.SleepAverageRequest,
      com.proto.smart_watch.SleepAverageResponse> getSleepAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.smart_watch.SleepAverageRequest, com.proto.smart_watch.SleepAverageResponse> getSleepAverageMethod;
    if ((getSleepAverageMethod = WatchServiceGrpc.getSleepAverageMethod) == null) {
      synchronized (WatchServiceGrpc.class) {
        if ((getSleepAverageMethod = WatchServiceGrpc.getSleepAverageMethod) == null) {
          WatchServiceGrpc.getSleepAverageMethod = getSleepAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.smart_watch.SleepAverageRequest, com.proto.smart_watch.SleepAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SleepAverage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smart_watch.SleepAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smart_watch.SleepAverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WatchServiceMethodDescriptorSupplier("SleepAverage"))
              .build();
        }
      }
    }
    return getSleepAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.smart_watch.MaxHeartRateRequest,
      com.proto.smart_watch.MaxHeartRateResponse> getMaxHeartRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxHeartRate",
      requestType = com.proto.smart_watch.MaxHeartRateRequest.class,
      responseType = com.proto.smart_watch.MaxHeartRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.smart_watch.MaxHeartRateRequest,
      com.proto.smart_watch.MaxHeartRateResponse> getMaxHeartRateMethod() {
    io.grpc.MethodDescriptor<com.proto.smart_watch.MaxHeartRateRequest, com.proto.smart_watch.MaxHeartRateResponse> getMaxHeartRateMethod;
    if ((getMaxHeartRateMethod = WatchServiceGrpc.getMaxHeartRateMethod) == null) {
      synchronized (WatchServiceGrpc.class) {
        if ((getMaxHeartRateMethod = WatchServiceGrpc.getMaxHeartRateMethod) == null) {
          WatchServiceGrpc.getMaxHeartRateMethod = getMaxHeartRateMethod =
              io.grpc.MethodDescriptor.<com.proto.smart_watch.MaxHeartRateRequest, com.proto.smart_watch.MaxHeartRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxHeartRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smart_watch.MaxHeartRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.smart_watch.MaxHeartRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WatchServiceMethodDescriptorSupplier("MaxHeartRate"))
              .build();
        }
      }
    }
    return getMaxHeartRateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WatchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatchServiceStub>() {
        @java.lang.Override
        public WatchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatchServiceStub(channel, callOptions);
        }
      };
    return WatchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WatchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatchServiceBlockingStub>() {
        @java.lang.Override
        public WatchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatchServiceBlockingStub(channel, callOptions);
        }
      };
    return WatchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WatchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatchServiceFutureStub>() {
        @java.lang.Override
        public WatchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatchServiceFutureStub(channel, callOptions);
        }
      };
    return WatchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WatchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smart_watch.SleepAverageRequest> sleepAverage(
        io.grpc.stub.StreamObserver<com.proto.smart_watch.SleepAverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSleepAverageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smart_watch.MaxHeartRateRequest> maxHeartRate(
        io.grpc.stub.StreamObserver<com.proto.smart_watch.MaxHeartRateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMaxHeartRateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSleepAverageMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.smart_watch.SleepAverageRequest,
                com.proto.smart_watch.SleepAverageResponse>(
                  this, METHODID_SLEEP_AVERAGE)))
          .addMethod(
            getMaxHeartRateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.smart_watch.MaxHeartRateRequest,
                com.proto.smart_watch.MaxHeartRateResponse>(
                  this, METHODID_MAX_HEART_RATE)))
          .build();
    }
  }

  /**
   */
  public static final class WatchServiceStub extends io.grpc.stub.AbstractAsyncStub<WatchServiceStub> {
    private WatchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatchServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smart_watch.SleepAverageRequest> sleepAverage(
        io.grpc.stub.StreamObserver<com.proto.smart_watch.SleepAverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSleepAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.smart_watch.MaxHeartRateRequest> maxHeartRate(
        io.grpc.stub.StreamObserver<com.proto.smart_watch.MaxHeartRateResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMaxHeartRateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WatchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WatchServiceBlockingStub> {
    private WatchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatchServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class WatchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WatchServiceFutureStub> {
    private WatchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatchServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SLEEP_AVERAGE = 0;
  private static final int METHODID_MAX_HEART_RATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WatchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WatchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SLEEP_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sleepAverage(
              (io.grpc.stub.StreamObserver<com.proto.smart_watch.SleepAverageResponse>) responseObserver);
        case METHODID_MAX_HEART_RATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.maxHeartRate(
              (io.grpc.stub.StreamObserver<com.proto.smart_watch.MaxHeartRateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WatchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.smart_watch.Watch.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WatchService");
    }
  }

  private static final class WatchServiceFileDescriptorSupplier
      extends WatchServiceBaseDescriptorSupplier {
    WatchServiceFileDescriptorSupplier() {}
  }

  private static final class WatchServiceMethodDescriptorSupplier
      extends WatchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WatchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WatchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WatchServiceFileDescriptorSupplier())
              .addMethod(getSleepAverageMethod())
              .addMethod(getMaxHeartRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
