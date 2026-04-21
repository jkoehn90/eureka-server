package com.jkoehn90.microservicessystemeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesSystemEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesSystemEurekaApplication.class, args);
    }

}
