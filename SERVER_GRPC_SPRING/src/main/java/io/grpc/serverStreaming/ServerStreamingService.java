package io.grpc.serverStreaming;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.serverStreaming.ServerStreamingGrpc.ServerStreamingReply;
import io.grpc.serverStreaming.ServerStreamingGrpc.ServerStreamingRequest;
import io.grpc.serverStreaming.ServerStreamingServiceGrpc.ServerStreamingServiceImplBase;
import io.grpc.stub.StreamObserver;

@GRpcService
public class ServerStreamingService extends ServerStreamingServiceImplBase{
	
	@Override
	public void serverStreamingCall(ServerStreamingRequest request, StreamObserver<ServerStreamingReply> responseObserver) {
		

		String result = "hello " + request.getRequsetParm1() + " dok2";		
		ServerStreamingReply.Builder ssr = ServerStreamingReply.newBuilder().setReplyParm1(result);		
        responseObserver.onNext(ssr.build());
        
        String result2 = "hello " + request.getRequsetParm1() + " TheQ";		
		ssr = ServerStreamingReply.newBuilder().setReplyParm1(result2);		
        responseObserver.onNext(ssr.build());
        
        String result3 = "hello " + request.getRequsetParm1() + " zino";		
		ssr = ServerStreamingReply.newBuilder().setReplyParm1(result3);		
        responseObserver.onNext(ssr.build());
        
        responseObserver.onCompleted();		
	}

}
