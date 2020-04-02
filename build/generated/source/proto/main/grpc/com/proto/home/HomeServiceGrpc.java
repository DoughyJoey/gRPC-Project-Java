package com.proto.home;

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
    comments = "Source: home/home.proto")
public final class HomeServiceGrpc {

  private HomeServiceGrpc() {}

  public static final String SERVICE_NAME = "home.HomeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.home.BathRequest,
      com.proto.home.BathResponse> getBathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bath",
      requestType = com.proto.home.BathRequest.class,
      responseType = com.proto.home.BathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.home.BathRequest,
      com.proto.home.BathResponse> getBathMethod() {
    io.grpc.MethodDescriptor<com.proto.home.BathRequest, com.proto.home.BathResponse> getBathMethod;
    if ((getBathMethod = HomeServiceGrpc.getBathMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getBathMethod = HomeServiceGrpc.getBathMethod) == null) {
          HomeServiceGrpc.getBathMethod = getBathMethod =
              io.grpc.MethodDescriptor.<com.proto.home.BathRequest, com.proto.home.BathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.BathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.BathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("Bath"))
              .build();
        }
      }
    }
    return getBathMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HomeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeServiceStub>() {
        @java.lang.Override
        public HomeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeServiceStub(channel, callOptions);
        }
      };
    return HomeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HomeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeServiceBlockingStub>() {
        @java.lang.Override
        public HomeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeServiceBlockingStub(channel, callOptions);
        }
      };
    return HomeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HomeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeServiceFutureStub>() {
        @java.lang.Override
        public HomeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeServiceFutureStub(channel, callOptions);
        }
      };
    return HomeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HomeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bath(com.proto.home.BathRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.BathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBathMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBathMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.home.BathRequest,
                com.proto.home.BathResponse>(
                  this, METHODID_BATH)))
          .build();
    }
  }

  /**
   */
  public static final class HomeServiceStub extends io.grpc.stub.AbstractAsyncStub<HomeServiceStub> {
    private HomeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeServiceStub(channel, callOptions);
    }

    /**
     */
    public void bath(com.proto.home.BathRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.BathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBathMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HomeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HomeServiceBlockingStub> {
    private HomeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.home.BathResponse bath(com.proto.home.BathRequest request) {
      return blockingUnaryCall(
          getChannel(), getBathMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HomeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HomeServiceFutureStub> {
    private HomeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.home.BathResponse> bath(
        com.proto.home.BathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBathMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HomeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HomeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATH:
          serviceImpl.bath((com.proto.home.BathRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.home.BathResponse>) responseObserver);
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

  private static abstract class HomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HomeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.home.Home.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HomeService");
    }
  }

  private static final class HomeServiceFileDescriptorSupplier
      extends HomeServiceBaseDescriptorSupplier {
    HomeServiceFileDescriptorSupplier() {}
  }

  private static final class HomeServiceMethodDescriptorSupplier
      extends HomeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HomeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HomeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HomeServiceFileDescriptorSupplier())
              .addMethod(getBathMethod())
              .build();
        }
      }
    }
    return result;
  }
}
