package projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.entities.AssociationEqEv;
import projetfinal.repository.AssociationEqEvRepository;

@RestController @CrossOrigin("*")
public class AssociationsEqEvRest {

	
	@Autowired
	private AssociationEqEvRepository assoEqEvRepo;
	
	
	//trouver toutes les associations
	@GetMapping("associationsEV")
	public Iterable<AssociationEqEv> allAssociations (){
		return assoEqEvRepo.findAll();
	}
	
	//Invité un membre (créer une association)
	@PostMapping("associationEV/ajouterEvEq")
	public AssociationEqEv saveAssociationsEvEq(@RequestBody AssociationEqEv a) {
		return assoEqEvRepo.save(a);
	}
	
	//Trouver les équipes d'un membre
	@GetMapping("associationsEV/membres/{id}")
	public List<AssociationEqEv> FindAssociationsEqEvByEvenementssid(@PathVariable long id){
		return assoEqEvRepo.findByEvenementsId(id);
	}
	
	@GetMapping("associationsEV/equipe/{id}")
	public List<AssociationEqEv> FindAssociationsByEquipesId(@PathVariable long id){
		return assoEqEvRepo.findByEquipesId(id);
	}
}
