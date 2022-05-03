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
	
	@Autowired
	private ActivitesRepository activiteRepo;

	
	
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
	
	@GetMapping("Evenements/{nomActivite}")
	public List<Evenements> EventByActivites(@PathVariable String nomActivite) { 
		return eventRepo.findByNomActivite(nomActivite);
	}
	
	///////////////////////////////////////////
	
	//@PostMapping("Evenements")
	//public Evenements saveEvenement(@RequestBody Evenements e, Activites.nom n) {
		//if() :
	//	return eventRepo.save(e);
		//else :
		//	return println("Veuillez vous connecter");
	//}
	
	//@PostMapping("Evenements")
	//public Evenements saveEvenement(@RequestBody Evenements e) {
		//if (Activites.nom contains(e.nomActivite)) {
	//	if (Optional.ofNullable(activiteRepo.findByNom(e.nomActivite) =! NULL) {
	//		return eventRepo.save(e);
			
	//	}else {
	//		System.out.print("Veuillez renseignez une activité existante ou créez en une");
	//	}
	//}

	//@PostMapping("person/login")
	//public Optional<Person> OnePerson(@RequestBody Person p) {
	//	return Optional.ofNullable(personRepo.findByLoginAndPassword(p.getLogin(), p.getPassword()));
	
	//@DeleteMapping("Evenements/MesEvenements/{id}")
	//public boolean deleteEvent(@PathVariable Long id) {
		
	//	Optional<Evenements> e = eventRepo.findById(id);
	//	if(e.isPresent() ) {
	//		eventRepo.deleteById(id);
	//		return true;
	//	}else {
	//		return false;
	//	}
	//}

	@PostMapping("Evenements")
	public Evenements saveEvenement(@RequestBody Evenements e) {
			return eventRepo.save(e);
	}
	
}
	