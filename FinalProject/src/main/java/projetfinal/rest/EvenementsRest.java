package projetfinal.rest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import fr.solutec.entities.Person;
//import fr.solutec.entities.Memo;
import projetfinal.entities.Evenements;
import projetfinal.repository.EvenementsRepository;
//import projetfinal.entities.Membres;
//import projetfinal.repository.MembresRepository;
import projetfinal.entities.Activites;
import projetfinal.repository.ActivitesRepository;

@RestController @CrossOrigin("*")
public class EvenementsRest {
	@Autowired
	private EvenementsRepository eventRepo;

	
	
	@GetMapping("Evenements/{nom}")
	public List<Evenements> EventByNom(@PathVariable String nom) {
		return eventRepo.findByNom(nom);
	}
	
	@GetMapping("Evenements/{date}")
	public List<Evenements> EventByDate(@PathVariable Date date) {
		return (eventRepo.findByDate(date));
	}
	
	@GetMapping("Evenements/{adresse}")
	public List<Evenements> EventByAdresse(@PathVariable String adresse) {
		return eventRepo.findByAdresse(adresse);
	}
	
	@GetMapping("Evenements/{nbMin}")
	public List<Evenements> EventByNbMin(@PathVariable int nbMin) {
		return eventRepo.findByNbMin(nbMin);
	}
	
	@GetMapping("Evenements/{nbMax}")
	public List<Evenements> EventByNbMax(@PathVariable int nbMax) {
		return eventRepo.findByNbMax(nbMax);
	}
	
	@GetMapping("memo/activites/{nom}")
	public List<Evenements> EventByActivities(@PathVariable String nom) { 
		return eventRepo.findByActivitesNom(nom);
	}
	
	///////////////////////////////////////////
	
	@PostMapping("Evenements")
	public Evenements saveEvenement(@RequestBody Evenements e) {
		return eventRepo.save(e);
	}
	
	
	
}
	