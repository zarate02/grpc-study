package io.grpc.clientStreaming;

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
    comments = "Source: clientStreaming.proto")
public final class ClientStreamingServiceGrpc {

  private ClientStreamingServiceGrpc() {}

  public static final String SERVICE_NAME = "clientStreaming.ClientStreamingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getClientStreamingCallMethod()} instead. 
  public static final io.grpc.MethodDescriptor<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest,
      io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply> METHOD_CLIENT_STREAMING_CALL = getClientStreamingCallMethod();

  private static volatile io.grpc.MethodDescriptor<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest,
      io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply> getClientStreamingCallMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest,
      io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply> getClientStreamingCallMethod() {
    io.grpc.MethodDescriptor<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest, io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply> getClientStreamingCallMethod;
    if ((getClientStreamingCallMethod = ClientStreamingServiceGrpc.getClientStreamingCallMethod) == null) {
      synchronized (ClientStreamingServiceGrpc.class) {
        if ((getClientStreamingCallMethod = ClientStreamingServiceGrpc.getClientStreamingCallMethod) == null) {
          ClientStreamingServiceGrpc.getClientStreamingCallMethod = getClientStreamingCallMethod = 
              io.grpc.MethodDescriptor.<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest, io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "clientStreaming.ClientStreamingService", "ClientStreamingCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientStreamingServiceMethodDescriptorSupplier("ClientStreamingCall"))
                  .build();
          }
        }
     }
     return getClientStreamingCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientStreamingServiceStub newStub(io.grpc.Channel channel) {
    return new ClientStreamingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientStreamingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientStreamingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientStreamingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientStreamingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientStreamingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest> clientStreamingCall(
        io.grpc.stub.StreamObserver<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamingCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClientStreamingCallMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest,
                io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply>(
                  this, METHODID_CLIENT_STREAMING_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class ClientStreamingServiceStub extends io.grpc.stub.AbstractStub<ClientStreamingServiceStub> {
    private ClientStreamingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientStreamingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientStreamingServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest> clientStreamingCall(
        io.grpc.stub.StreamObserver<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingCallMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ClientStreamingServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientStreamingServiceBlockingStub> {
    private ClientStreamingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientStreamingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientStreamingServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ClientStreamingServiceFutureStub extends io.grpc.stub.AbstractStub<ClientStreamingServiceFutureStub> {
    private ClientStreamingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientStreamingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientStreamingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientStreamingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CLIENT_STREAMING_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientStreamingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientStreamingServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_CLIENT_STREAMING_CALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamingCall(
              (io.grpc.stub.StreamObserver<io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClientStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientStreamingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.clientStreaming.ClientStreamingGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientStreamingService");
    }
  }

  private static final class ClientStreamingServiceFileDescriptorSupplier
      extends ClientStreamingServiceBaseDescriptorSupplier {
    ClientStreamingServiceFileDescriptorSupplier() {}
  }

  private static final class ClientStreamingServiceMethodDescriptorSupplier
      extends ClientStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientStreamingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientStreamingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientStreamingServiceFileDescriptorSupplier())
              .addMethod(getClientStreamingCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
