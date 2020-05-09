package com.freezk.client;

import com.freezk.server.HelloWorld;
import io.grpc.stub.StreamObserver;

public  interface Greeter {
    public void sayHello(HelloWorld.HelloRequest request,
                         StreamObserver<HelloWorld.HelloReply> responseObserver);

}
