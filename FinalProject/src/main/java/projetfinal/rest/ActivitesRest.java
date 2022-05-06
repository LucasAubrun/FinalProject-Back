package projetfinal.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.repository.ActivitesRepository;
import projetfinal.entities.Activites;
import projetfinal.entities.Membres;



@RestController @CrossOrigin("*")
public class ActivitesRest {
	@Autowired
	private ActivitesRepository actiRepo;
	
	@PostMapping("activites/save")
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
	
	@GetMapping("activites/id")
	public Optional<Activites> id(@RequestBody Long id){
		return actiRepo.findById(id);
	}
	
	@GetMapping("activites/valide/{id}")
	public Optional<Activites> vld(@PathVariable Long id){
		return actiRepo.getValideById(id);
	}
	
	@PatchMapping("activites/set/valide/{id}")
	public Activites setValide(@PathVariable Long id, @RequestBody Boolean valide) {
		Activites a = actiRepo.findById(id).get();
		a.setValide(valide);
		return actiRepo.save(a);
	}
	
	

}
