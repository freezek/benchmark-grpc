package com.freezk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(String hello){

        StringBuilder test = new StringBuilder("hello dubbo!");
        for (int i = 0; i < 10; i++) {
            test.append(test);
        }
        return "hi, " + hello + test ;
    }
}
