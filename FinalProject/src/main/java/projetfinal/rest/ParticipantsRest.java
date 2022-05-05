package projetfinal.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public Participants saveParticipants(@RequestBody Participants p) {
		return partRepo.save(p);
	}
	
	//Trouver les evenements d'un membre
	@GetMapping("participants/membres/{id}")
	public List<Participants> FindAssociationsByMembresid(@PathVariable long id){
		return partRepo.findByMembresId(id);
	}
}
