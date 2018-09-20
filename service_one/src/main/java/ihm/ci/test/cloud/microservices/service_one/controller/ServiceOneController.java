package ihm.ci.test.cloud.microservices.service_one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ihm.ci.test.cloud.microservices.service_one.bean.serviceOneConfiguration;

@RefreshScope
@RestController
public class ServiceOneController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/service-one")
	public serviceOneConfiguration getcongigurationForServiceOne() {
		
		return new serviceOneConfiguration(config.getMax(), config.getMin());
	}
	
	

}
