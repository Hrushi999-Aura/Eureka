package com.in28minutes.microsevices.currency_exchange_service.currency_exchange_service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeService1Application.class, args);
	}

}
