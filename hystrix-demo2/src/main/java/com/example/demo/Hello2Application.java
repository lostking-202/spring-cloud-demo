package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
//@EnableZipkinStreamServer
/*@EnableEurekaClient*/
public class Hello2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello2Application.class, args);
	}

}
