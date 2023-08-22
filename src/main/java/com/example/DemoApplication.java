package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        Communication communication = context.getBean("communication", Communication.class);
        // System.out.println(communication.getAllUsers());
        System.out.println("Answer: " + communication.getAnswer());

    }

}
