package com.rest.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@EnableEurekaServer
@RestController
public class EurekaServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
	
	@RequestMapping("/greetings")
	public String greeting() {
		return "hello world";
	}

}
