package io.grpc.bidirectionalStreaming;

import java.util.concurrent.atomic.AtomicBoolean;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.Status;
import io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingReply;
import io.grpc.bidirectionalStreaming.BidirectionalStreamingGrpc.BidirectionalStreamingRequest;
import io.grpc.bidirectionalStreaming.BidirectionalStreamingServiceGrpc.BidirectionalStreamingServiceImplBase;
import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;

@GRpcService
public class BidirectionalStreamingService extends  BidirectionalStreamingServiceImplBase{

	@Override
	public StreamObserver<BidirectionalStreamingRequest> bidirectionalStreamingCall(StreamObserver<BidirectionalStreamingReply> responseObserver) {

        final ServerCallStreamObserver<BidirectionalStreamingReply> serverCallStreamObserver = (ServerCallStreamObserver<BidirectionalStreamingReply>) responseObserver;
        serverCallStreamObserver.disableAutoInboundFlowControl();

        final AtomicBoolean wasReady = new AtomicBoolean(false);
		
		
        serverCallStreamObserver.setOnReadyHandler(
				//Runnable
				()->{
					if (serverCallStreamObserver.isReady() && wasReady.compareAndSet(false, true)) {		
						serverCallStreamObserver.request(1);
					}
				}		
	        );
        
        
        StreamObserver<BidirectionalStreamingRequest> result = new StreamObserver<BidirectionalStreamingRequest>() {

			@Override
			public void onNext(BidirectionalStreamingRequest request) {    			
    			try {
        			String name = request.getRequsetParm1();
					
        			String message1 = "Hello " + name;        	
					String message2 = "middle " + name;    
					String message3 = "last " + name;        			
					
        			BidirectionalStreamingReply reply1 = BidirectionalStreamingReply.newBuilder().setReplyParm1(message1).build();	
        			BidirectionalStreamingReply reply2 = BidirectionalStreamingReply.newBuilder().setReplyParm1(message2).build();	
        			BidirectionalStreamingReply reply3 = BidirectionalStreamingReply.newBuilder().setReplyParm1(message3).build();	
        			
					responseObserver.onNext(reply1);								
					responseObserver.onNext(reply2);					        						
					responseObserver.onNext(reply3);
										
					if (serverCallStreamObserver.isReady()) {
						serverCallStreamObserver.request(1);
					} else {
						wasReady.set(false);
					}
        		} catch (Throwable throwable) {
        			throwable.printStackTrace();
        			responseObserver.onError(Status.UNKNOWN.withDescription("Error handling request").withCause(throwable).asException());
        		}
    			
				
			}

			@Override
			public void onError(Throwable t) {
        		t.printStackTrace();
        		responseObserver.onCompleted();
				
			}

			@Override
			public void onCompleted() {
        		responseObserver.onCompleted();
				
			}
        	
        };
		
		return result;
		
		
	}

	
}