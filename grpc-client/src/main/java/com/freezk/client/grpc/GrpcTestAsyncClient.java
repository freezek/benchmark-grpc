package com.freezk.client.grpc;

import com.freezk.service.grpc.GreeterGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GrpcTestAsyncClient {
    private static final Logger log = LoggerFactory.getLogger(GrpcTestAsyncClient.class);
    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterStub stub;

    private AtomicInteger atomicInteger = new AtomicInteger(0);

   // final CountDownLatch latch = new CountDownLatch(1);

    public GrpcTestAsyncClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext().build());
    }

    /**
     * Construct client for accessing RouteGuide server using the existing channel.
     */
    GrpcTestAsyncClient(ManagedChannel channel) {
        this.channel = channel;
        stub = GreeterGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) {
        log.info("Will try to greet {} ...",name);
        GreeterGrpc.HelloWorld.HelloRequest request = GreeterGrpc.HelloWorld.HelloRequest.newBuilder().setName(name).build();
        StreamObserver<GreeterGrpc.HelloWorld.HelloReply> stream = new StreamObserver<GreeterGrpc.HelloWorld.HelloReply>() {

            @Override
            public void onNext(GreeterGrpc.HelloWorld.HelloReply value) {
                log.info("Greeting:{}", value.getMessage());
              //  latch.countDown();
            }

            @Override
            public void onError(Throwable t) {
                log.info("error:{}",t.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("Completed!".concat(String.valueOf(atomicInteger.getAndIncrement())));
                try {
                    shutdown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        try {
            long l = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                stub.sayHello(request, stream);
            }
            System.out.println("spend time :".concat(String.valueOf(System.currentTimeMillis()-l)));
        } catch (StatusRuntimeException e) {
            log.info("{} RPC failed:{}", Level.WARN, e.getStatus());
            return;
        }
    }
}
