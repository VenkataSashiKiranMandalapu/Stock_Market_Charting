package com.mvsk.smc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableDiscoveryClient
@SpringBootApplication
public class StockChartingUsersApplication {

	@RequestMapping("/")
	public String home()
	{return "java aur tomcat chal gaye";}
	
	public static void main(String[] args) {
		SpringApplication.run(StockChartingUsersApplication.class, args);
	}

}
