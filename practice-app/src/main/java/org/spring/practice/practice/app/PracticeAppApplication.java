package org.spring.practice.practice.app;

import org.spring.practice.practice.app.service.AnotherService;
import org.spring.practice.practice.app.service.SomeService;
import org.spring.practice.practice.app.service.SomeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PracticeAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(PracticeAppApplication.class, args);
        System.out.println("hello1");
    }

    @Bean(name = "someService")
    public SomeService someService() {
        return new SomeServiceImpl();
    }

    @Bean(name = "anotherService")
    public SomeService anotherService() {
        return new AnotherService();
    }


}
