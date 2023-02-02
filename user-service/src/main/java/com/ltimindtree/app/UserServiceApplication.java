package com.ltimindtree.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.infybuzz.controller", "com.infybuzz.service"})
@EntityScan("com.infybuzz.entity")
@EnableJpaRepositories("com.infybuzz.repository")
@EnableFeignClients("com.infybuzz.feignclients")
@EnableEurekaClient
public class UserServiceApplication {
	
	@Value("${address.service.url}")
	private String coachServiceUrl;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	@Bean
	public WebClient webClient () {
		WebClient webClient =WebClient.builder()
				.baseUrl(coachServiceUrl).build();
		
		return webClient;
	}

}
