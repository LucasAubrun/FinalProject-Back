package projetfinal.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.entities.Evenements;
import projetfinal.entities.Membres;
import projetfinal.entities.Participants;
import projetfinal.repository.ParticipantsRepository;

@RestController @CrossOrigin("*")
public class ParticipantsRest {

	@Autowired
	private ParticipantsRepository partRepo;
	
	//trouver tous les participants
	@GetMapping("participants")
	public Iterable<Participants> allParticipants (){
		return partRepo.findAll();
	}
	
	//Invité un membre (créer un participant)
	@PostMapping("Participant/inviter")
	public Participants invitParticipants(@RequestBody Participants p) {
		return partRepo.save(p);
	}
	
	//Trouver les evenements d'un membre
	@GetMapping("participants/membres/{id}")
	public List<Participants> FindAssociationsByMembresid(@PathVariable long id){
		return partRepo.findByMembresId(id);
	}
	
	//quitter un evenement
	@DeleteMapping("Participants/supprimer/{id}")
	public boolean deleteEvent(@PathVariable Long id) {
		Optional<Participants> p = partRepo.findById(id);
		if(p.isPresent() ) {
			partRepo.deleteById(id);
			return true;
		}else {
			return false;
		}
	}
	
	//rejoindre un evenement
	@PostMapping("Participants/save")
	public Participants saveParticipants(@RequestBody Participants p) {
			return partRepo.save(p);
	}
	
	@GetMapping("Participants/getallmember/event/{id}")
	public List<Membres> getParticipantsEvent(@PathVariable Long id){
		return partRepo.getParticipantsEvent(id);
	}
	
}
