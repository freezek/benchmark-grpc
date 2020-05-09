package com.freezk.client;

import com.freezk.server.GreeterGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import java.util.concurrent.TimeUnit;

public class GrpcTestBlockingClient {

    private static final Logger log = LoggerFactory.getLogger(GrpcTestBlockingClient.class);

    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    /** Construct client connecting to HelloWorld server at {@code host:port}. */
    public GrpcTestBlockingClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    /** Construct client for accessing RouteGuide server using the existing channel. */
    GrpcTestBlockingClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /** Say hello to server. */
    public void greet(String name) throws InterruptedException{
        log.info("Will try to greet " + name + " ...");
        GreeterGrpc.HelloWorld.HelloRequest request = GreeterGrpc.HelloWorld.HelloRequest.newBuilder().setName(name).build();
        GreeterGrpc.HelloWorld.HelloReply response;
        try {
            long l = System.currentTimeMillis();
            response = blockingStub.sayHello(request);
            System.out.println("spend time:".concat(String.valueOf(System.currentTimeMillis()-l)));
        } catch (StatusRuntimeException e) {
            log.info("{} RPC failed:{}", Level.WARN,e.getStatus());
            return;
        }finally {
            this.shutdown();
        }
        log.info("Greeting: " + response.getMessage());
    }

}
