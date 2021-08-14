package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Enables Spring Boot auto config and component scanning.
 */
@SpringBootApplication
@EnableEurekaServer
/**
 * Add annotation to make your Spring Boot application
 * acts as a Eureka Server
 */

public class ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }

}
