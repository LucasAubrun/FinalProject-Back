package projetfinal.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.lang.Math;

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
import projetfinal.entities.Membres;
import projetfinal.repository.MembresRepository;
import projetfinal.entities.Activites;
import projetfinal.entities.Associations;
import projetfinal.repository.ActivitesRepository;


@RestController @CrossOrigin("*")
public class EvenementsRest {
	
	@Autowired
	private EvenementsRepository eventRepo;

	
	@GetMapping("evenements/id/{id}")
	public Optional<Evenements> EventById(@PathVariable long id) {
		return eventRepo.findById(id);
	}
	//@GetMapping("evenements/all")
	//public Iterable<Evenements> allEvenementsbis(){
	//	return eventRepo.findAll();
	//}
	//@GetMapping("evenements/id")
	//public List<Evenements> EventByRandId(@PathVariable long id) {
	//	int min = 1;
	//	int max = 10;
	//	List value = new ArrayList();
	//	for (int nombre = 0; nombre <=10; nombre++) {
	//		value.add((int) Math.random());
	//	};
	//	return eventRepo.findById(for (int nombre = 0; nombre <=10; nombre++) {
	//		value
	//	}(long) value);
	//}
	
	@GetMapping("evenements/id")
	public Evenements EventByRandId() {
        int max = 16;
        int min = 13;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
		return eventRepo.findById((long) rand).get();
	}
		
	@GetMapping("evenement/multiple/10")
	public ArrayList<Evenements> EventbyrandId2() {
		ArrayList<Evenements> ensemble = new ArrayList<Evenements>();
		for (int nombre = 0; nombre<=10; nombre ++) {
			ensemble.add(EventByRandId());
		}
		return ensemble;
	}
	
	@GetMapping("evenements/all")
	public Iterable<Evenements> allEvenements(){
		return eventRepo.findAll();
	}
	
	@GetMapping("evenements/nom/{nom}")
	public List<Evenements> EventByNom(@PathVariable String nom) {
		return eventRepo.findByNom(nom);
	}
	
	@GetMapping("evenements/{date}")
	public List<Evenements> EventByDate(@PathVariable Date date) {
		return (eventRepo.findByDate(date));
	}
	
	@GetMapping("evenements/{adresse}")
	public List<Evenements> EventByAdresse(@PathVariable String adresse) {
		return eventRepo.findByAdresse(adresse);
	}
	
	@GetMapping("evenements/{nbMin}")
	public List<Evenements> EventByNbMin(@PathVariable int nbMin) {
		return eventRepo.findByNbMin(nbMin);
	}
	
	@GetMapping("evenements/{nbMax}")
	public List<Evenements> EventByNbMax(@PathVariable int nbMax) {
		return eventRepo.findByNbMax(nbMax);
	}
	
	@GetMapping("evenements/{nomActivite}")
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

	@PostMapping("Evenements/save")
	public Evenements saveEvenement(@RequestBody Evenements e) {
			return eventRepo.save(e);
	}
	
	@DeleteMapping("Evenements/supprimer/{id}")
	public boolean deleteEvent(@PathVariable Long id) {
		Optional<Evenements> e = eventRepo.findById(id);
		if(e.isPresent() ) {
			eventRepo.deleteById(id);
			return true;
		}else {
			return false;
		}
	}
	//Trouver les équipes d'un membre
	@GetMapping("evenements/membres/{id}")
	public List<Evenements> FindEvenementsByCreateurId(@PathVariable long id){
		return eventRepo.findByCreateurId(id);
	}
	
}
	