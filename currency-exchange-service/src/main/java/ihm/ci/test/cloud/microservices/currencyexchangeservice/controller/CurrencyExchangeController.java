package ihm.ci.test.cloud.microservices.currencyexchangeservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ihm.ci.test.cloud.microservices.currencyexchangeservice.bean.ExchangeValue;
import ihm.ci.test.cloud.microservices.currencyexchangeservice.dao.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepository repo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue returnExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
			
		ExchangeValue exchangeValue = repo.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		
		return exchangeValue;
	}
}
