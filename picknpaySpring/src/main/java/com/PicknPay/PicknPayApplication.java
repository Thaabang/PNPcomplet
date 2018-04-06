package com.PicknPay;
// Property of Thabang Orapeleng 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.PicknPay","com.PicknPay.model","com.PicknPay.services","com.PicknPay.controller","com.PicknPay.repositories"})
public class PicknPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicknPayApplication.class, args);
	}
}
