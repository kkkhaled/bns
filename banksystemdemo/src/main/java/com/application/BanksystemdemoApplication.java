package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pagescontroller")
@EnableAutoConfiguration
public class BanksystemdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanksystemdemoApplication.class, args);
	}

}
