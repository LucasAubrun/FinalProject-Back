package projetfinal.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import projetfinal.entities.Associations;
import projetfinal.entities.Membres;
import projetfinal.entities.Participants;
import projetfinal.repository.AssociationsRepository;

@RestController @CrossOrigin("*")
public class AssociationsRest {

	@Autowired
	private AssociationsRepository assoRepo;
	
	//trouver toutes les associations
	@GetMapping("associations")
	public Iterable<Associations> allAssociations (){
		return assoRepo.findAll();
	}
	
	//Invité un membre (créer une association)
	@PostMapping("associations/inviter")
	public Associations saveAssociations(@RequestBody Associations a) {
		return assoRepo.save(a);
	}
	
	//Trouver les équipes d'un membre
	@GetMapping("associations/membres/{id}")
	public List<Associations> FindAssociationsByMembresid(@PathVariable long id){
		return assoRepo.findByMembresId(id);
	}
	
	@GetMapping("associations/equipe/{id}")
	public List<Associations> FindAssociationsByEquipesId(@PathVariable long id){
		return assoRepo.findByEquipesId(id);
	}
	
/*	@DeleteMapping("Associations/supprimer/{id}")
	public boolean deleteEvent(@PathVariable Long id) {
		Optional<Associations> p = assoRepo.findById(id);
		if(p.isPresent() ) {
			assoRepo.deleteById(id);
			return true;
		}else {
			return false;
		}
	}*/
	
}//