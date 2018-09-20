package ihm.ci.techno.project.test.techno_test_for_ihm_ci.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ihm.ci.techno.project.test.techno_test_for_ihm_ci.entity.Flux;

@Component
public class FluxService {

	public static List<Flux> list = new ArrayList<>();
	private static long cnt = 4;
	
	static {
		list.add(new Flux(1, "ART00123", "CFT", "FTP"));
		list.add(new Flux(2, "ART00456", "Local", "FTP"));
		list.add(new Flux(3, "ART00789", "CFT", "CFT"));
		list.add(new Flux(4, "ART00147", "CFT", "SFTP"));
	}
	
	public List<Flux> getAllFlux(){
		return list;
	}
	
	public Flux getoneFlux(int id){
		for(Flux flux:list) {
			if(flux.getId() == id)
				return flux;
		}
		
		return null;
	}
	
	
	public Flux saveFlux(Flux flux) {
		if(flux.getId() == 0) {
			flux.setId(++cnt);
		}
		
		list.add(flux);
		
		return flux;
	}
	
	
}
