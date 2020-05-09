package com.freezk.server.dubbo;

import com.freezk.service.dubbo.GreetingService;

public class GreetingsServiceImpl implements GreetingService {
    @Override
    public String sayHi(String name) {
        StringBuilder test = new StringBuilder("hello dubbo!");
        for (int i = 0; i < 10; i++) {
            test.append(test);
        }
        return "hi, " + name + test ;
    }
}
