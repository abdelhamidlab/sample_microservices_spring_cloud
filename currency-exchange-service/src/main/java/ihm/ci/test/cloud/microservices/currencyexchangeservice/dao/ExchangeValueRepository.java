package ihm.ci.test.cloud.microservices.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ihm.ci.test.cloud.microservices.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);

}
