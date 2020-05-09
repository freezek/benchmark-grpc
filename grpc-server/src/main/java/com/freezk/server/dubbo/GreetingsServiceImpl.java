package com.freezk.server.dubbo;

public class GreetingsServiceImpl implements GreetingService{
    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
}
