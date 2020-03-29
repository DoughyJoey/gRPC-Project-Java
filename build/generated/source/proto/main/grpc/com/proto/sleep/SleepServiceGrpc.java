package com.proto.sleep;

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
    comments = "Source: sleep/watch.proto")
public final class SleepServiceGrpc {

  private SleepServiceGrpc() {}

  public static final String SERVICE_NAME = "sleep.SleepService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.sleep.SleepAverageRequest,
      com.proto.sleep.SleepAverageResponse> getSleepAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SleepAverage",
      requestType = com.proto.sleep.SleepAverageRequest.class,
      responseType = com.proto.sleep.SleepAverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.sleep.SleepAverageRequest,
      com.proto.sleep.SleepAverageResponse> getSleepAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.sleep.SleepAverageRequest, com.proto.sleep.SleepAverageResponse> getSleepAverageMethod;
    if ((getSleepAverageMethod = SleepServiceGrpc.getSleepAverageMethod) == null) {
      synchronized (SleepServiceGrpc.class) {
        if ((getSleepAverageMethod = SleepServiceGrpc.getSleepAverageMethod) == null) {
          SleepServiceGrpc.getSleepAverageMethod = getSleepAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.sleep.SleepAverageRequest, com.proto.sleep.SleepAverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SleepAverage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sleep.SleepAverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sleep.SleepAverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SleepServiceMethodDescriptorSupplier("SleepAverage"))
              .build();
        }
      }
    }
    return getSleepAverageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SleepServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SleepServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SleepServiceStub>() {
        @java.lang.Override
        public SleepServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SleepServiceStub(channel, callOptions);
        }
      };
    return SleepServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SleepServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SleepServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SleepServiceBlockingStub>() {
        @java.lang.Override
        public SleepServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SleepServiceBlockingStub(channel, callOptions);
        }
      };
    return SleepServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SleepServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SleepServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SleepServiceFutureStub>() {
        @java.lang.Override
        public SleepServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SleepServiceFutureStub(channel, callOptions);
        }
      };
    return SleepServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SleepServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.sleep.SleepAverageRequest> sleepAverage(
        io.grpc.stub.StreamObserver<com.proto.sleep.SleepAverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSleepAverageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSleepAverageMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.sleep.SleepAverageRequest,
                com.proto.sleep.SleepAverageResponse>(
                  this, METHODID_SLEEP_AVERAGE)))
          .build();
    }
  }

  /**
   */
  public static final class SleepServiceStub extends io.grpc.stub.AbstractAsyncStub<SleepServiceStub> {
    private SleepServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SleepServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.sleep.SleepAverageRequest> sleepAverage(
        io.grpc.stub.StreamObserver<com.proto.sleep.SleepAverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSleepAverageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SleepServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SleepServiceBlockingStub> {
    private SleepServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SleepServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SleepServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SleepServiceFutureStub> {
    private SleepServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SleepServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SleepServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SLEEP_AVERAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SleepServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SleepServiceImplBase serviceImpl, int methodId) {
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
              (io.grpc.stub.StreamObserver<com.proto.sleep.SleepAverageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SleepServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SleepServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.sleep.Sleep.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SleepService");
    }
  }

  private static final class SleepServiceFileDescriptorSupplier
      extends SleepServiceBaseDescriptorSupplier {
    SleepServiceFileDescriptorSupplier() {}
  }

  private static final class SleepServiceMethodDescriptorSupplier
      extends SleepServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SleepServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SleepServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SleepServiceFileDescriptorSupplier())
              .addMethod(getSleepAverageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
