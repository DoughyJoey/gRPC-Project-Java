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

  private static volatile io.grpc.MethodDescriptor<com.proto.home.LightRequest,
      com.proto.home.LightResponse> getLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Light",
      requestType = com.proto.home.LightRequest.class,
      responseType = com.proto.home.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.home.LightRequest,
      com.proto.home.LightResponse> getLightMethod() {
    io.grpc.MethodDescriptor<com.proto.home.LightRequest, com.proto.home.LightResponse> getLightMethod;
    if ((getLightMethod = HomeServiceGrpc.getLightMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getLightMethod = HomeServiceGrpc.getLightMethod) == null) {
          HomeServiceGrpc.getLightMethod = getLightMethod =
              io.grpc.MethodDescriptor.<com.proto.home.LightRequest, com.proto.home.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Light"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("Light"))
              .build();
        }
      }
    }
    return getLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.home.PrinterRequest,
      com.proto.home.PrinterResponse> getPrinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Printer",
      requestType = com.proto.home.PrinterRequest.class,
      responseType = com.proto.home.PrinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.home.PrinterRequest,
      com.proto.home.PrinterResponse> getPrinterMethod() {
    io.grpc.MethodDescriptor<com.proto.home.PrinterRequest, com.proto.home.PrinterResponse> getPrinterMethod;
    if ((getPrinterMethod = HomeServiceGrpc.getPrinterMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getPrinterMethod = HomeServiceGrpc.getPrinterMethod) == null) {
          HomeServiceGrpc.getPrinterMethod = getPrinterMethod =
              io.grpc.MethodDescriptor.<com.proto.home.PrinterRequest, com.proto.home.PrinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Printer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.PrinterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.PrinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("Printer"))
              .build();
        }
      }
    }
    return getPrinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.home.VacuumRequest,
      com.proto.home.VacuumResponse> getVacuumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vacuum",
      requestType = com.proto.home.VacuumRequest.class,
      responseType = com.proto.home.VacuumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.home.VacuumRequest,
      com.proto.home.VacuumResponse> getVacuumMethod() {
    io.grpc.MethodDescriptor<com.proto.home.VacuumRequest, com.proto.home.VacuumResponse> getVacuumMethod;
    if ((getVacuumMethod = HomeServiceGrpc.getVacuumMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getVacuumMethod = HomeServiceGrpc.getVacuumMethod) == null) {
          HomeServiceGrpc.getVacuumMethod = getVacuumMethod =
              io.grpc.MethodDescriptor.<com.proto.home.VacuumRequest, com.proto.home.VacuumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vacuum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.VacuumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.VacuumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("Vacuum"))
              .build();
        }
      }
    }
    return getVacuumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.home.VacuumWithDeadlineRequest,
      com.proto.home.VacuumWithDeadlineResponse> getVacuumWithDeadlineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VacuumWithDeadline",
      requestType = com.proto.home.VacuumWithDeadlineRequest.class,
      responseType = com.proto.home.VacuumWithDeadlineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.home.VacuumWithDeadlineRequest,
      com.proto.home.VacuumWithDeadlineResponse> getVacuumWithDeadlineMethod() {
    io.grpc.MethodDescriptor<com.proto.home.VacuumWithDeadlineRequest, com.proto.home.VacuumWithDeadlineResponse> getVacuumWithDeadlineMethod;
    if ((getVacuumWithDeadlineMethod = HomeServiceGrpc.getVacuumWithDeadlineMethod) == null) {
      synchronized (HomeServiceGrpc.class) {
        if ((getVacuumWithDeadlineMethod = HomeServiceGrpc.getVacuumWithDeadlineMethod) == null) {
          HomeServiceGrpc.getVacuumWithDeadlineMethod = getVacuumWithDeadlineMethod =
              io.grpc.MethodDescriptor.<com.proto.home.VacuumWithDeadlineRequest, com.proto.home.VacuumWithDeadlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VacuumWithDeadline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.VacuumWithDeadlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.home.VacuumWithDeadlineResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HomeServiceMethodDescriptorSupplier("VacuumWithDeadline"))
              .build();
        }
      }
    }
    return getVacuumWithDeadlineMethod;
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
     * <pre>
     * simple
     * </pre>
     */
    public void bath(com.proto.home.BathRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.BathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBathMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.home.LightRequest> light(
        io.grpc.stub.StreamObserver<com.proto.home.LightResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLightMethod(), responseObserver);
    }

    /**
     */
    public void printer(com.proto.home.PrinterRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.PrinterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrinterMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.home.VacuumRequest> vacuum(
        io.grpc.stub.StreamObserver<com.proto.home.VacuumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getVacuumMethod(), responseObserver);
    }

    /**
     */
    public void vacuumWithDeadline(com.proto.home.VacuumWithDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.VacuumWithDeadlineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVacuumWithDeadlineMethod(), responseObserver);
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
          .addMethod(
            getLightMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.home.LightRequest,
                com.proto.home.LightResponse>(
                  this, METHODID_LIGHT)))
          .addMethod(
            getPrinterMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.home.PrinterRequest,
                com.proto.home.PrinterResponse>(
                  this, METHODID_PRINTER)))
          .addMethod(
            getVacuumMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.home.VacuumRequest,
                com.proto.home.VacuumResponse>(
                  this, METHODID_VACUUM)))
          .addMethod(
            getVacuumWithDeadlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.home.VacuumWithDeadlineRequest,
                com.proto.home.VacuumWithDeadlineResponse>(
                  this, METHODID_VACUUM_WITH_DEADLINE)))
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
     * <pre>
     * simple
     * </pre>
     */
    public void bath(com.proto.home.BathRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.BathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.home.LightRequest> light(
        io.grpc.stub.StreamObserver<com.proto.home.LightResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLightMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void printer(com.proto.home.PrinterRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.PrinterResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPrinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.home.VacuumRequest> vacuum(
        io.grpc.stub.StreamObserver<com.proto.home.VacuumResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getVacuumMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void vacuumWithDeadline(com.proto.home.VacuumWithDeadlineRequest request,
        io.grpc.stub.StreamObserver<com.proto.home.VacuumWithDeadlineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVacuumWithDeadlineMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * simple
     * </pre>
     */
    public com.proto.home.BathResponse bath(com.proto.home.BathRequest request) {
      return blockingUnaryCall(
          getChannel(), getBathMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.home.PrinterResponse> printer(
        com.proto.home.PrinterRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPrinterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.home.VacuumWithDeadlineResponse vacuumWithDeadline(com.proto.home.VacuumWithDeadlineRequest request) {
      return blockingUnaryCall(
          getChannel(), getVacuumWithDeadlineMethod(), getCallOptions(), request);
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
     * <pre>
     * simple
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.home.BathResponse> bath(
        com.proto.home.BathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.home.VacuumWithDeadlineResponse> vacuumWithDeadline(
        com.proto.home.VacuumWithDeadlineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVacuumWithDeadlineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATH = 0;
  private static final int METHODID_PRINTER = 1;
  private static final int METHODID_VACUUM_WITH_DEADLINE = 2;
  private static final int METHODID_LIGHT = 3;
  private static final int METHODID_VACUUM = 4;

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
        case METHODID_PRINTER:
          serviceImpl.printer((com.proto.home.PrinterRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.home.PrinterResponse>) responseObserver);
          break;
        case METHODID_VACUUM_WITH_DEADLINE:
          serviceImpl.vacuumWithDeadline((com.proto.home.VacuumWithDeadlineRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.home.VacuumWithDeadlineResponse>) responseObserver);
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
        case METHODID_LIGHT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.light(
              (io.grpc.stub.StreamObserver<com.proto.home.LightResponse>) responseObserver);
        case METHODID_VACUUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.vacuum(
              (io.grpc.stub.StreamObserver<com.proto.home.VacuumResponse>) responseObserver);
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
              .addMethod(getLightMethod())
              .addMethod(getPrinterMethod())
              .addMethod(getVacuumMethod())
              .addMethod(getVacuumWithDeadlineMethod())
              .build();
        }
      }
    }
    return result;
  }
}
