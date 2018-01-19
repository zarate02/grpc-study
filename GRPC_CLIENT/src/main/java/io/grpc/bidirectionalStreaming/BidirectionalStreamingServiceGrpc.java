package io.grpc.bidirectionalStreaming;

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
    comments = "Source: bidirectionalStreaming.proto")
public final class BidirectionalStreamingServiceGrpc {

  private BidirectionalStreamingServiceGrpc() {}

  public static final String SERVICE_NAME = "bidirectional.BidirectionalStreamingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBidirectionalStreamingCallMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest,
      io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply> METHOD_BIDIRECTIONAL_STREAMING_CALL = getBidirectionalStreamingCallMethod();

  private static volatile io.grpc.MethodDescriptor<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest,
      io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply> getBidirectionalStreamingCallMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest,
      io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply> getBidirectionalStreamingCallMethod() {
    io.grpc.MethodDescriptor<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest, io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply> getBidirectionalStreamingCallMethod;
    if ((getBidirectionalStreamingCallMethod = BidirectionalStreamingServiceGrpc.getBidirectionalStreamingCallMethod) == null) {
      synchronized (BidirectionalStreamingServiceGrpc.class) {
        if ((getBidirectionalStreamingCallMethod = BidirectionalStreamingServiceGrpc.getBidirectionalStreamingCallMethod) == null) {
          BidirectionalStreamingServiceGrpc.getBidirectionalStreamingCallMethod = getBidirectionalStreamingCallMethod = 
              io.grpc.MethodDescriptor.<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest, io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bidirectional.BidirectionalStreamingService", "BidirectionalStreamingCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BidirectionalStreamingServiceMethodDescriptorSupplier("BidirectionalStreamingCall"))
                  .build();
          }
        }
     }
     return getBidirectionalStreamingCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BidirectionalStreamingServiceStub newStub(io.grpc.Channel channel) {
    return new BidirectionalStreamingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BidirectionalStreamingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BidirectionalStreamingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BidirectionalStreamingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BidirectionalStreamingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BidirectionalStreamingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest> bidirectionalStreamingCall(
        io.grpc.stub.StreamObserver<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidirectionalStreamingCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBidirectionalStreamingCallMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest,
                io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply>(
                  this, METHODID_BIDIRECTIONAL_STREAMING_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class BidirectionalStreamingServiceStub extends io.grpc.stub.AbstractStub<BidirectionalStreamingServiceStub> {
    private BidirectionalStreamingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalStreamingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalStreamingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalStreamingServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest> bidirectionalStreamingCall(
        io.grpc.stub.StreamObserver<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply> responseObserver) {
      return asyncBidiStreamingCall(getChannel().newCall(getBidirectionalStreamingCallMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BidirectionalStreamingServiceBlockingStub extends io.grpc.stub.AbstractStub<BidirectionalStreamingServiceBlockingStub> {
    private BidirectionalStreamingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalStreamingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalStreamingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalStreamingServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class BidirectionalStreamingServiceFutureStub extends io.grpc.stub.AbstractStub<BidirectionalStreamingServiceFutureStub> {
    private BidirectionalStreamingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidirectionalStreamingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidirectionalStreamingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidirectionalStreamingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BIDIRECTIONAL_STREAMING_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BidirectionalStreamingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BidirectionalStreamingServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_BIDIRECTIONAL_STREAMING_CALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreamingCall(
              (io.grpc.stub.StreamObserver<io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BidirectionalStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BidirectionalStreamingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BidirectionalStreamingService");
    }
  }

  private static final class BidirectionalStreamingServiceFileDescriptorSupplier
      extends BidirectionalStreamingServiceBaseDescriptorSupplier {
    BidirectionalStreamingServiceFileDescriptorSupplier() {}
  }

  private static final class BidirectionalStreamingServiceMethodDescriptorSupplier
      extends BidirectionalStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BidirectionalStreamingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BidirectionalStreamingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BidirectionalStreamingServiceFileDescriptorSupplier())
              .addMethod(getBidirectionalStreamingCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
