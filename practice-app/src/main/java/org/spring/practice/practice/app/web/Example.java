package org.spring.practice.practice.app.web;

import org.slf4j.Logger;
import org.spring.practice.practice.app.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
    private final HelloService helloService;

    public Example(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/")
    String sayHello() {
        System.out.println("routed!!");
        return helloService.getName();
    }
}
