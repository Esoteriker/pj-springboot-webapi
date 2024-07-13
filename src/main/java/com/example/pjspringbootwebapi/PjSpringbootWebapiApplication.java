package com.example.pjspringbootwebapi;

import com.example.pjspringbootwebapi.run.Location;
import com.example.pjspringbootwebapi.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.management.MXBean;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class PjSpringbootWebapiApplication {

    private static final Logger log = LoggerFactory.getLogger(PjSpringbootWebapiApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(PjSpringbootWebapiApplication.class, args);
        log.info("app started");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            Run runRecord = new Run(1,"first run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS),5, Location.OUTDOOR);
            log.info("first run: " + runRecord);
        };
    }


}
