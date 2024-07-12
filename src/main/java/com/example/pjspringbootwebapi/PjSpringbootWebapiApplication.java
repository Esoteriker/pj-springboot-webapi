package com.example.pjspringbootwebapi;

import foo.bar.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PjSpringbootWebapiApplication {

    public static void main(String[] args) {

        SpringApplication.run(PjSpringbootWebapiApplication.class, args);

        var welcomeMessage = new WelcomeMessage();
        System.out.println(welcomeMessage.getWelcomeMessage());
    }

}
