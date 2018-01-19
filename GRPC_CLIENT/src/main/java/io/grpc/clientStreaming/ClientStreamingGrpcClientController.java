package io.grpc.clientStreaming;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply;
import io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest;
import io.grpc.stub.ClientCallStreamObserver;
import io.grpc.stub.ClientResponseObserver;

@RestController
public class ClientStreamingGrpcClientController {
		
	@RequestMapping("ClientGrpcClient")
	public void ClientStreamingGrpcClient(@RequestParam String parm1, @RequestParam String parm2, @RequestParam String parm3) throws InterruptedException {

	    CountDownLatch done = new CountDownLatch(1);		//동기화 보조기구(쓰레드 대기를 위한)
		String[] Parm = {parm1, parm2, parm3};	//PARM
		
		ManagedChannel channel = null;
		channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext(true).build();
		ClientStreamingServiceGrpc.ClientStreamingServiceStub stub = 
		ClientStreamingServiceGrpc.newStub(channel);
				
		
		ClientResponseObserver<ClientStreamingRequest, ClientStreamingReply> clientResponseObserver =
		new ClientResponseObserver<ClientStreamingRequest, ClientStreamingReply>(){

			ClientCallStreamObserver<ClientStreamingRequest> requestStream;
			
			
			
			@Override
			public void beforeStart(ClientCallStreamObserver<ClientStreamingRequest> requestStream) {
				this.requestStream = requestStream;
				requestStream.disableAutoInboundFlowControl();
				
				requestStream.setOnReadyHandler(
					//runnable
					()->{	
						while (requestStream.isReady()) {
							for(String a : Parm) {
								ClientStreamingRequest bsr = 
										ClientStreamingRequest.newBuilder().setRequsetParm1(a).build();
								requestStream.onNext(bsr);
							}
							
							requestStream.onCompleted();
						}
					}				
				);
			}
						
			@Override
			public void onNext(ClientStreamingReply value) {
				requestStream.request(1);
				System.out.println(value.getReplyParm1());
			}
			
			@Override
			public void onCompleted() {
	            done.countDown();			
	    		System.out.println("end");			
			}

			@Override
			public void onError(Throwable t) {
	            t.printStackTrace();
	            done.countDown();				
	    		System.out.println("err");		
			}
	
		};

		stub.clientStreamingCall(clientResponseObserver);
        done.await();
		channel.shutdown();
	    channel.awaitTermination(1, TimeUnit.SECONDS);
	}
}
