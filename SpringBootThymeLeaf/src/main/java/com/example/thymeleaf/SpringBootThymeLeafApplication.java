package com.example.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.thymeleaf"})
@EnableJpaRepositories(basePackages="com.example.thymeleaf.repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.example.thymeleaf.entities")
public class SpringBootThymeLeafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeLeafApplication.class, args);
	}

}
