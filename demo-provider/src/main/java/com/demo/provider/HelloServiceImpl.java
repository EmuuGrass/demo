package com.demo.provider;

import com.demo.api.HelloService;

import java.util.concurrent.CompletableFuture;


public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        System.out.println("Hello " + name + ", request from consumer: local" );
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name + ", response from provider: local" ;
    }

    public CompletableFuture<String> sayHelloAsync(String name) {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            return "async result";
        });
        return cf;
    }
}
