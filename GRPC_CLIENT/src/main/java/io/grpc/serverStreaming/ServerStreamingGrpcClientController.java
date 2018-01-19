package io.grpc.serverStreaming;

import java.util.concurrent.CountDownLatch;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.serverStreaming.ServerStreamingGrpc.ServerStreamingReply;
import io.grpc.serverStreaming.ServerStreamingGrpc.ServerStreamingRequest;
import io.grpc.stub.StreamObserver;

@RestController
public class ServerStreamingGrpcClientController {

	@RequestMapping("ServerGrpcClient")
	public void ServerStreamingGrpcClient(@RequestParam String parm1) throws InterruptedException {
	    CountDownLatch done = new CountDownLatch(1);		//동기화 보조기구(쓰레드 대기를 위한)
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext(true).build();
		
		ServerStreamingServiceGrpc.ServerStreamingServiceStub stub = ServerStreamingServiceGrpc.newStub(channel);
		
		
		StreamObserver<ServerStreamingReply> streamObserver = new StreamObserver<ServerStreamingReply>() {

			@Override
			public void onNext(ServerStreamingReply value) {
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
		
		ServerStreamingRequest request = ServerStreamingRequest.newBuilder().setRequsetParm1(parm1).build();
		
		
		stub.serverStreamingCall(request, streamObserver);
		done.await();
		
		/*
		ServerStreamingServiceGrpc.ServerStreamingServiceBlockingStub stub = ServerStreamingServiceGrpc.newBlockingStub(channel);
		
		ServerStreamingRequest request = ServerStreamingRequest.newBuilder().setRequsetParm1(parm1).build();
		
		Iterator<ServerStreamingReply> list = stub.serverStreamingCall(request);
		
		while(list.hasNext()) {
			System.out.println(list.next().getReplyParm1());
		}
		*/
		channel.shutdown();
	}

}
