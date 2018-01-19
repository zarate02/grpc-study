package io.grpc.clientStreaming;

import java.util.concurrent.atomic.AtomicBoolean;

import org.lognet.springboot.grpc.GRpcService;

import io.grpc.Status;
import io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingReply;
import io.grpc.clientStreaming.ClientStreamingGrpc.ClientStreamingRequest;
import io.grpc.clientStreaming.ClientStreamingServiceGrpc.ClientStreamingServiceImplBase;
import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;


@GRpcService
public class ClientStreamingService extends ClientStreamingServiceImplBase  {
	
	@Override
	public StreamObserver<ClientStreamingRequest> clientStreamingCall(StreamObserver<ClientStreamingReply> responseObserver) {
		

        final ServerCallStreamObserver<ClientStreamingReply> serverCallStreamObserver = (ServerCallStreamObserver<ClientStreamingReply>) responseObserver;
        serverCallStreamObserver.disableAutoInboundFlowControl();

        final AtomicBoolean wasReady = new AtomicBoolean(false);
		
		
        serverCallStreamObserver.setOnReadyHandler(
				//Runnable
				()->{
					if (serverCallStreamObserver.isReady() && wasReady.compareAndSet(false, true)) {		
						serverCallStreamObserver.request(3);
					}
				}		
	        );
		
        
        
        
        StreamObserver<ClientStreamingRequest> result = new StreamObserver<ClientStreamingRequest>() {

        	String message1="";
        	
			@Override
			public void onNext(ClientStreamingRequest request) {    			
    			try {
        			String name = request.getRequsetParm1();
					
        			message1 += "hello " + name + " / ";
        			
        			
        			System.out.println(message1);
        			
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
    			ClientStreamingReply reply1 = ClientStreamingReply.newBuilder().setReplyParm1(message1).build();	
				responseObserver.onNext(reply1);
        		responseObserver.onCompleted();				
			}
        	
        };
		
        
        System.out.println("gg");
        
		return result;
		
		
		      
	}

}
