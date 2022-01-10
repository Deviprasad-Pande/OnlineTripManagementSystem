package com.cg.otms;
//no errors
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
//@EnableScheduling
//@EnableSwagger2
public class OnlineTripManagementSystemApplication {

	public static void main(String[] args) {
		
		// SpringApplication otms =new SpringApplication(OnlineTripManagementSystemApplication.class);
	
	//	System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
	     
		// otms.run(args);
		
		SpringApplication.run(OnlineTripManagementSystemApplication.class, args);
	}

}



