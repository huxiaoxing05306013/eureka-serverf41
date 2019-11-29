package com.test4f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestService1 {
  public static void main(String[] args) {
    SpringApplication.run(TestService1.class,args);
  }
}
