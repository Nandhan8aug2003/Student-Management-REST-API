package com.StuMang.REST.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RestApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestApiApplication.class, args);

		System.out.println("Hello world");
	}

}
