package projetfinal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.repository.ActivitesRepository;
import projetfinal.entities.Activites;



@RestController @CrossOrigin("*")
public class ActivitesRest {
	@Autowired
	private ActivitesRepository actiRepo;
	
	@PostMapping("activites")
	public Activites saveActivites(@RequestBody Activites a) {
		return actiRepo.save(a);
	}
	
	@GetMapping("activites/all")
	public Iterable<Activites> allActivies(){
		return actiRepo.findAll();
	}
	
	@GetMapping("activites/nbJoueurs")
	public Iterable<Activites> nbJoueurs(@RequestBody Integer nombre){
		return actiRepo.findByNbJoueurs(nombre);
	}
	
	@GetMapping("activites/type")
	public Iterable<Activites> type(@RequestBody String type){
		return actiRepo.findByType(type);
	}
	
	@GetMapping("activites/nom")
	public Iterable<Activites> nom(@RequestBody String nom){
		return actiRepo.findByNom(nom);
	}
	
	
	
	

}
