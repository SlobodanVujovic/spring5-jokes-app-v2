package com.vujo.spring5JokesAppV2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring5JokesAppV2Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring5JokesAppV2Application.class, args);
    }

    @Bean
    public ChuckNorisQuotesFactory getChuckNorisQuotesFactory() {
        ChuckNorisQuotesFactory factory = new ChuckNorisQuotesFactory();
        return factory;
    }

}
