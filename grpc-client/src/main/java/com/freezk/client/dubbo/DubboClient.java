package com.freezk.client.dubbo;

import com.freezk.service.dubbo.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboClient {
    private static String zookeeperHost = System.getProperty("zookeeper.address", "127.0.0.1");

    public void sayHi() {
//        ReferenceConfig<GreetingService> reference = new ReferenceConfig<>();
//        reference.setApplication(new ApplicationConfig("first-dubbo-consumer"));
//        reference.setRegistry(new RegistryConfig("zookeeper://" + zookeeperHost + ":2181"));
//        reference.setInterface(GreetingService.class);
//        GreetingService service = reference.get();
//        String message = service.sayHi("dubbo");
//        System.out.println(message);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        GreetingService demoService = (GreetingService) context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHi("world");
        // Display the call result
        System.out.println(hello);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        GreetingService demoService = (GreetingService) context.getBean("demoService");
        long l = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            // Executing remote methods
            String hello = demoService.sayHi("world");
            // Display the call result
            System.out.println(hello);
        }
        System.out.println("spend time:".concat(String.valueOf(System.currentTimeMillis()-l)));
    }
}
