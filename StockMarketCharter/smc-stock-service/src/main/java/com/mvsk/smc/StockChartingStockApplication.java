package com.mvsk.smc;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//@EnableDiscoveryClient

@EnableEurekaClient
@SpringBootApplication
public class StockChartingStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockChartingStockApplication.class, args);
	}

}
