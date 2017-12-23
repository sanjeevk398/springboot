package com.sprot.root.sportapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.sport.entity")
@ComponentScan(basePackages = { "com.sport.controller", "com.sport.service" })
@EnableJpaRepositories(basePackages = "com.sprot.repository")
@SpringBootApplication
public class SportapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportapplicationApplication.class, args);
	}
}
