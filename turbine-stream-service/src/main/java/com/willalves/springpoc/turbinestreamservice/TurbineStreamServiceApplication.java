package com.willalves.springpoc.turbinestreamservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineStreamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineStreamServiceApplication.class, args);
	}

}
