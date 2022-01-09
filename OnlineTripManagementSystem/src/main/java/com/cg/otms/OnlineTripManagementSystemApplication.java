package com.cg.otms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableScheduling

@EnableSwagger2
public class OnlineTripManagementSystemApplication {

	public static void main(String[] args) {
		
		 SpringApplication otms =new SpringApplication(OnlineTripManagementSystemApplication.class);
	
		 System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
	     System.out.println("Online Trip Management System Application");
		 otms.run(args);
		
		//SpringApplication.run(OnlineTripManagementSystemApplication.class, args);
	}

}

