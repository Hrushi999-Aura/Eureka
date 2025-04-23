package com.in28minutes.microservices.currency_conversion_services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="currency-exchange-service1", url="localhost:8000")
//@FeignClient(name="currency-exchange-service1")
//@RibbonClient(name="currency-exchange-service1")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveexchangeValue
	(@PathVariable("from") String from,@PathVariable("to") String to) ;
	

}
