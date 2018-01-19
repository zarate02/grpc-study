package io.grpc.unary;

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
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: unary.proto")
public final class UnaryServiceGrpc {

  private UnaryServiceGrpc() {}

  public static final String SERVICE_NAME = "unary.UnaryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUnaryCallMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.unary.UnaryGrpc.UnaryRequest,
      io.grpc.unary.UnaryGrpc.UnaryReply> METHOD_UNARY_CALL = getUnaryCallMethod();

  private static volatile io.grpc.MethodDescriptor<io.grpc.unary.UnaryGrpc.UnaryRequest,
      io.grpc.unary.UnaryGrpc.UnaryReply> getUnaryCallMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.unary.UnaryGrpc.UnaryRequest,
      io.grpc.unary.UnaryGrpc.UnaryReply> getUnaryCallMethod() {
    io.grpc.MethodDescriptor<io.grpc.unary.UnaryGrpc.UnaryRequest, io.grpc.unary.UnaryGrpc.UnaryReply> getUnaryCallMethod;
    if ((getUnaryCallMethod = UnaryServiceGrpc.getUnaryCallMethod) == null) {
      synchronized (UnaryServiceGrpc.class) {
        if ((getUnaryCallMethod = UnaryServiceGrpc.getUnaryCallMethod) == null) {
          UnaryServiceGrpc.getUnaryCallMethod = getUnaryCallMethod = 
              io.grpc.MethodDescriptor.<io.grpc.unary.UnaryGrpc.UnaryRequest, io.grpc.unary.UnaryGrpc.UnaryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "unary.UnaryService", "UnaryCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.unary.UnaryGrpc.UnaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.unary.UnaryGrpc.UnaryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UnaryServiceMethodDescriptorSupplier("UnaryCall"))
                  .build();
          }
        }
     }
     return getUnaryCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UnaryServiceStub newStub(io.grpc.Channel channel) {
    return new UnaryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UnaryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UnaryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UnaryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UnaryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UnaryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void unaryCall(io.grpc.unary.UnaryGrpc.UnaryRequest request,
        io.grpc.stub.StreamObserver<io.grpc.unary.UnaryGrpc.UnaryReply> responseObserver) {
      asyncUnimplementedUnaryCall(getUnaryCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.unary.UnaryGrpc.UnaryRequest,
                io.grpc.unary.UnaryGrpc.UnaryReply>(
                  this, METHODID_UNARY_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class UnaryServiceStub extends io.grpc.stub.AbstractStub<UnaryServiceStub> {
    private UnaryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UnaryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnaryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UnaryServiceStub(channel, callOptions);
    }

    /**
     */
    public void unaryCall(io.grpc.unary.UnaryGrpc.UnaryRequest request,
        io.grpc.stub.StreamObserver<io.grpc.unary.UnaryGrpc.UnaryReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UnaryServiceBlockingStub extends io.grpc.stub.AbstractStub<UnaryServiceBlockingStub> {
    private UnaryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UnaryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnaryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UnaryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.unary.UnaryGrpc.UnaryReply unaryCall(io.grpc.unary.UnaryGrpc.UnaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnaryCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UnaryServiceFutureStub extends io.grpc.stub.AbstractStub<UnaryServiceFutureStub> {
    private UnaryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UnaryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UnaryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UnaryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.unary.UnaryGrpc.UnaryReply> unaryCall(
        io.grpc.unary.UnaryGrpc.UnaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UnaryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UnaryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_CALL:
          serviceImpl.unaryCall((io.grpc.unary.UnaryGrpc.UnaryRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.unary.UnaryGrpc.UnaryReply>) responseObserver);
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

  private static abstract class UnaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UnaryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.unary.UnaryGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UnaryService");
    }
  }

  private static final class UnaryServiceFileDescriptorSupplier
      extends UnaryServiceBaseDescriptorSupplier {
    UnaryServiceFileDescriptorSupplier() {}
  }

  private static final class UnaryServiceMethodDescriptorSupplier
      extends UnaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UnaryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UnaryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UnaryServiceFileDescriptorSupplier())
              .addMethod(getUnaryCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
