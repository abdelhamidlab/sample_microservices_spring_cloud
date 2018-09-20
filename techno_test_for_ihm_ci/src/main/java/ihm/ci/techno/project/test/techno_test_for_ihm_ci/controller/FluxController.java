package ihm.ci.techno.project.test.techno_test_for_ihm_ci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ihm.ci.techno.project.test.techno_test_for_ihm_ci.entity.Flux;
import ihm.ci.techno.project.test.techno_test_for_ihm_ci.service.FluxService;

@RestController
public class FluxController {

	@Autowired
	private FluxService fluxService;
	
	@GetMapping(path="/flux")
	public List<Flux> showAll(){
		return fluxService.getAllFlux();
	}
	
	
	
	@GetMapping(path="/flux/{id}")
	public Flux showAll(@PathVariable int id){
		return fluxService.getoneFlux(id);
	} 
	
	
	
	@PostMapping(path="/flux")
	public Flux saveFlux(@RequestBody Flux fl) {
		fluxService.saveFlux(fl);
		return fl;
	}
}