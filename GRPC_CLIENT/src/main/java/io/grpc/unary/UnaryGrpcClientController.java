package io.grpc.unary;

import java.util.concurrent.CountDownLatch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.unary.UnaryGrpc.UnaryReply;
import io.grpc.unary.UnaryGrpc.UnaryRequest;

@RestController
public class UnaryGrpcClientController {

	@RequestMapping("UnaryGrpcClient")
	public void unaryGrpcClient(@RequestParam String parm1) throws InterruptedException {
	    CountDownLatch done = new CountDownLatch(1);		//동기화 보조기구(쓰레드 대기를 위한)
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext(true).build();
		
		UnaryServiceGrpc.UnaryServiceStub stub = UnaryServiceGrpc.newStub(channel);
		
		StreamObserver<UnaryReply> streamObserver = new StreamObserver<UnaryReply>() {

			@Override
			public void onNext(UnaryReply value) {
				// TODO Auto-generated method stub
				System.out.println(value.getReplyParm1());
				onCompleted();
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				done.countDown();
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				done.countDown();
			}
			
		};
		

		UnaryRequest request = UnaryRequest.newBuilder().setRequsetParm1(parm1).build();
		
		
		stub.unaryCall(request, streamObserver);

		done.await();
		
		
		/*
		UnaryServiceGrpc.UnaryServiceBlockingStub stub = UnaryServiceGrpc.newBlockingStub(channel);
		
		UnaryRequest request = UnaryRequest.newBuilder().setRequsetParm1(parm1).build();
		
		UnaryReply ur = stub.unaryCall(request);
		
		System.out.println(ur.getReplyParm1());
		*/
		channel.shutdown();
	}

}
