package com.freezk.server.grpc;

import io.grpc.stub.StreamObserver;

import java.util.concurrent.atomic.AtomicInteger;

public class GreeterImpl extends GreeterGrpc.GreeterImplBase {
    private static AtomicInteger i = new AtomicInteger(0);
//    @Override
//    public void sayHello(HelloWorld.HelloRequest req, StreamObserver<HelloWorld.HelloReply> responseObserver) {
//        HelloWorld.HelloReply reply = HelloWorld.HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
//        responseObserver.onNext(reply);
//        responseObserver.onCompleted();
//    }

    @Override
    public void sayHello(GreeterGrpc.HelloWorld.HelloRequest request, StreamObserver<GreeterGrpc.HelloWorld.HelloReply> responseObserver) {
       // super.sayHello(request, responseObserver);
        //System.out.println("=================="+i.getAndIncrement());
        GreeterGrpc.HelloWorld.HelloReply reply = GreeterGrpc.HelloWorld.HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
