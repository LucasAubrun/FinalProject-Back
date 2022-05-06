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
	
	@PostMapping("membre/get")
	public Optional<Membres> getMembreByMailAndMdp(@RequestBody Membres m) {
		return membreRepo.findByMailAndMdp(m.getMail(), m.getMdp());
	}
	 
	@GetMapping("membre/get/leaderboard")
	public Iterable<Membres> getMembreOrderByScore() {
		return membreRepo.findAllByOrderByScoreDesc();
	}
	
	@GetMapping("membre/get/all")
	public Iterable<Membres> getAllMembre() {
		return membreRepo.findAll();
	}
	
	@PostMapping("membre/edit/{id}")
	public Membres setMembre(@RequestBody Membres newM, @PathVariable Long id) {
		Membres m = membreRepo.findById(id).get();
		m.setNom(newM.getNom());
		m.setPrenom(newM.getPrenom());
		m.setMail(newM.getMail());
		m.setDateNaissance(newM.getDateNaissance());
		m.setNote(newM.getNote());
		m.setMdp(newM.getMdp());
		return membreRepo.save(m);
	}
	
	@PatchMapping("membre/set/score/{id}")
	public Membres setScore(@PathVariable Long id, @RequestBody Integer score) {
		Membres m = membreRepo.findById(id).get();
		m.setScore(score);
		return membreRepo.save(m);
	}
	
	@PatchMapping("membre/set/xp/{id}")
	public Membres setXp(@PathVariable Long id, @RequestBody Integer xp) {
		Membres m = membreRepo.findById(id).get();
		m.setXp(xp);
		return membreRepo.save(m);
	}	
}
