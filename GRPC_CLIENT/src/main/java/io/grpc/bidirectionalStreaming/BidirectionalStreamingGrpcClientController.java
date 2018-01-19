package io.grpc.bidirectionalStreaming;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply;
import io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest;
import io.grpc.stub.ClientCallStreamObserver;
import io.grpc.stub.ClientResponseObserver;

@RestController
public class BidirectionalStreamingGrpcClientController {
	
	@RequestMapping("BidirectionalGrpcClient")
	public void BidirectionalGrpcClient(@RequestParam String parm1, @RequestParam String parm2, @RequestParam String parm3) throws InterruptedException {

	    CountDownLatch done = new CountDownLatch(1);		//동기화 보조기구(쓰레드 대기를 위한)
		String[] Parm = {parm1, parm2, parm3};	//PARM
				
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6666).usePlaintext(true).build();
		
		
		BidirectionalStreamingServiceGrpc.BidirectionalStreamingServiceStub stub = 
		BidirectionalStreamingServiceGrpc.newStub(channel);
		
		ClientResponseObserver<BidirectionalStreamingRequest, BidirectionalStreamingReply> clientResponseObserver =
		new ClientResponseObserver<BidirectionalStreamingRequest, BidirectionalStreamingReply>(){
			
			ClientCallStreamObserver<BidirectionalStreamingRequest> requestStream;

			@Override
			public void beforeStart(ClientCallStreamObserver<BidirectionalStreamingRequest> requestStream) {
				this.requestStream = requestStream;
				requestStream.disableAutoInboundFlowControl();

				
				requestStream.setOnReadyHandler(
					//runnable
					()->{	
						for(String a : Parm) {
							BidirectionalStreamingRequest bsr = 
									BidirectionalStreamingRequest.newBuilder().setRequsetParm1(a).build();
							requestStream.onNext(bsr);
						}
						
						requestStream.onCompleted();
						
					}
				);
				
				
			}
						
			@Override
			public void onNext(BidirectionalStreamingReply value) {
				System.out.println(value.getReplyParm1());
	            requestStream.request(1);				
			}

			@Override
			public void onError(Throwable t) {
	            t.printStackTrace();
	            done.countDown();
			}

			@Override
			public void onCompleted() {
	            done.countDown();				
			}

		};

		stub.bidirectionalStreamingCall(clientResponseObserver);
        done.await();
		channel.shutdown();
		
		
	    channel.awaitTermination(1, TimeUnit.SECONDS);	
	}

}