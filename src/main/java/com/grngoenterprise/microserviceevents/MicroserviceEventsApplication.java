package com.grngoenterprise.microserviceevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroserviceEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEventsApplication.class, args);
	}

}
