package projetfinal.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.entities.Equipes;
import projetfinal.repository.EquipesRepository;

@RestController @CrossOrigin("*")
public class EquipesRest {
	
	@Autowired
	private EquipesRepository equipesRepo;
	
	//trouver toutes les équipes 
	@GetMapping("equipes")
	public Iterable<Equipes> allEquipes () {
		return equipesRepo.findAll();
		
	}
	//créer une équipe 
	@PostMapping("equipes") 
	public Equipes saveEquipes(@RequestBody Equipes e) {
		return equipesRepo.save(e);
	}
	

//	@GetMapping("equipes/membres/{id}")
//	public Iterable<String> OneEquipeByMembreId(@RequestBody long id) {
//	return equipesRepo.getEquipeStringByMemberId(id);
	
	
	//chercher une équipe
	@GetMapping("equipes/membres/{id}")
	public List<Equipes> FindEquipesByMembresId(@PathVariable long id) {
		return equipesRepo.findByMembresId(id); 
	}
	
	@GetMapping("equipes/{nom}")
	public List<Equipes> finEquipeByNom (@PathVariable String nom){
		return equipesRepo.findByNom(nom);
		}
	
}

