package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
//@EnableHystrix
//@EnableZipkinStreamServer
@EnableZipkinServer
public class Hello2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello2Application.class, args);
	}

}
