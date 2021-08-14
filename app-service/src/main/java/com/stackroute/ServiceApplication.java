package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Enables Spring Boot auto config and component scanning.
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * Add annotation to make your Spring Boot application
 * acts as a Eureka Client
 */
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
