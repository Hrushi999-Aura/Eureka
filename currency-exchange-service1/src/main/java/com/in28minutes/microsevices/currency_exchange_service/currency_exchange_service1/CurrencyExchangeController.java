package com.in28minutes.microsevices.currency_exchange_service.currency_exchange_service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CurrencyExchangeController {
	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepository repository;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveexchangeValue(@PathVariable String from,@PathVariable String to) {
		 ExchangeValue exchangeValue=
		 repository.findByFromAndTo(from,to);
		 exchangeValue.setPort(Integer.parseInt( environment.getProperty("local.server.port")));
		 return exchangeValue;
	}

}
