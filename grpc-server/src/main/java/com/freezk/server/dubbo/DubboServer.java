package com.freezk.server.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

public class DubboServer {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");

    public static void main(String[] args) throws Exception {
//        ServiceConfig<GreetingService> service = new ServiceConfig<>();
//        service.setApplication(new ApplicationConfig("first-dubbo-provider"));
//        service.setRegistry(new RegistryConfig("zookeeper://" + zookeeperHost + ":2181"));
//        service.setInterface(GreetingService.class);
//        service.setRef(new GreetingsServiceImpl());
//        service.export();
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
