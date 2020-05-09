package com.freezk.controller;

import com.freezk.client.grpc.GrpcTestBlockingClient;
import com.freezk.common.HttpCommons;
import com.freezk.common.OkHttpCommon;
import com.freezk.service.dubbo.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {

    @Autowired
    private HttpCommons httpCommons;
    @Autowired
    private OkHttpCommon okHttpCommon;

    @Reference
    private GreetingService greetingService;

    @RequestMapping("/say")
    public void sayHello(){
       doMain();
    }

    @RequestMapping("/hi")
    public void sayHi(){
        doMain();
    }

    @RequestMapping("/rpc")
    public void sayRpc(){
        doRpc();
    }

    @RequestMapping("/dubbo")
    public void hiDubbo(){
        long l = System.currentTimeMillis();
        String jack = greetingService.sayHi("jack");
        System.out.println(jack.concat(String.valueOf(System.currentTimeMillis()-l)));

    }

    public String doMain(){
        long l = System.currentTimeMillis();
            String hello = httpCommons.exchange("http://localhost:8082/hello?hello=".concat("china"), HttpMethod.GET, new ParameterizedTypeReference<String>() {
            }, "");
            System.out.println(hello);
        System.out.println("spend time :".concat(String.valueOf(System.currentTimeMillis()-l)));
        return "success";
    }

    public String doRpc(){
        try {
            //GrpcTestAsyncClient client = new GrpcTestAsyncClient("localhost", 50051);
            GrpcTestBlockingClient client = new GrpcTestBlockingClient("localhost", 50051);
            client.greet("jack");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
