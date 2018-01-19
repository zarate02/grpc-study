package io.grpc.unary;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.stub.StreamObserver;
import io.grpc.unary.UnaryGrpc.UnaryReply;
import io.grpc.unary.UnaryGrpc.UnaryRequest;
import io.grpc.unary.UnaryServiceGrpc.UnaryServiceImplBase;

@GRpcService
public class UnaryService extends  UnaryServiceImplBase{
	@Override
	public void unaryCall(UnaryRequest request, StreamObserver<UnaryReply> responseObserver) {
		
		String result = "hello " + request.getRequsetParm1();
		
		UnaryReply.Builder unaryReply = UnaryReply.newBuilder().setReplyParm1(result);
        responseObserver.onNext(unaryReply.build());
        responseObserver.onCompleted();		
	}
}