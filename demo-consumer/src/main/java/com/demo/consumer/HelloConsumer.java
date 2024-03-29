package com.demo.consumer;

import java.util.concurrent.CompletableFuture;
import com.demo.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloConsumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-demo-consumer.xml");
        context.start();
        HelloService demoService = context.getBean("demoService", HelloService.class);
        String hello = demoService.sayHello("sadf");
        System.out.println("result: " + hello);
    }
}
