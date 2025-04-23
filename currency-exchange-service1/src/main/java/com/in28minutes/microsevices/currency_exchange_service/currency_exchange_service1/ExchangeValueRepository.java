package com.in28minutes.microsevices.currency_exchange_service.currency_exchange_service1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends  
	JpaRepository<ExchangeValue, Long>{
		ExchangeValue findByFromAndTo(String from, String to);
	}



