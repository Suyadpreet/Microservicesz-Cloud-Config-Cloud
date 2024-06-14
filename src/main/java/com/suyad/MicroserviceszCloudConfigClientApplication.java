package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceszCloudConfigClientApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroserviceszCloudConfigClientApplication.class, args);
		System.out.println("Cloud Config Client has been Started Successfully......");
	}

}
