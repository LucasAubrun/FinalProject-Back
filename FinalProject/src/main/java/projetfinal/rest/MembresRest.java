package projetfinal.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.entities.Membres;
import projetfinal.repository.MembresRepository;

@RestController @CrossOrigin("*")
public class MembresRest {
	
	@Autowired
	private MembresRepository membreRepo;
	
	@PostMapping("membre/save")
	public Membres saveMembre(@RequestBody Membres m) {
		return membreRepo.save(m);
	}
	
	@GetMapping("membre/get/{id}")
	public Optional<Membres> getMembre(@PathVariable Long id) {
		return membreRepo.findById(id);
	}
	
	@GetMapping("membre/get/{mail}/{mdp}")
	public Optional<Membres> getMembreByMailAndMdp(@PathVariable String mail, @PathVariable String mdp) {
		return membreRepo.findByMailAndMdp(mail, mdp);
	}
	
	@GetMapping("membre/get/all")
	public Iterable<Membres> getAllMembre() {
		return membreRepo.findAll();
	}
	
	@PatchMapping("user/set/score/{id}")
	public Membres setScore(@PathVariable Long id, @RequestBody Integer score) {
		Membres m = membreRepo.findById(id).get();
		m.setScore(score);
		return membreRepo.save(m);
	}
	
	@PatchMapping("user/set/xp/{id}")
	public Membres setXp(@PathVariable Long id, @RequestBody Integer xp) {
		Membres m = membreRepo.findById(id).get();
		m.setXp(xp);
		return membreRepo.save(m);
	}	
	
	@GetMapping("membre/getNP/{nom}/{prenom}")
	public Optional<Membres> getMembreByNomlAndPrenom(@PathVariable String nom, @PathVariable String prenom) {
		return membreRepo.findByNomAndPrenom(nom, prenom);
	}
	
	
}


