package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnCountryApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringLearnCountryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnCountryApplication.class, args);
        logger.info("SpringLearnCountryApplication started successfully");
    }
}