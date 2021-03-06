package com.freezk.client.grpc;

import com.freezk.service.grpc.HelloWorld;
import io.grpc.stub.StreamObserver;

public  interface Greeter {
    public void sayHello(HelloWorld.HelloRequest request,
                         StreamObserver<HelloWorld.HelloReply> responseObserver);

}
