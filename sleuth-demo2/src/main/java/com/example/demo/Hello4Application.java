package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

@SpringBootApplication
@EnableZipkinServer
public class Hello4Application {

	public static void main(String[] args) {
		SpringApplication.run(Hello4Application.class, args);
	}
	@Bean
	@Primary
	public MySQLStorage mySQLStorage(DataSource datasource) {
		return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
	}


}
