package projetfinal.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.repository.MessagesRepository;
import projetfinal.entities.Membres;
import projetfinal.entities.Messages;

@RestController @CrossOrigin("*")
public class MessagesRest {
	
	@Autowired
	private MessagesRepository messageRepo;
	
	@GetMapping("message/get/{id}")
	public Optional<Messages> getMessage(@PathVariable Long id) {
		return messageRepo.findById(id);
	}
	
	@GetMapping("message/get/nonlu/{idRecepteur}")
	public Iterable<Messages> getMessageByIdIfNonLu(@PathVariable Long idRecepteur) {
		return messageRepo.findByLuIsFalseAndRecepteurId(idRecepteur);
	}
	
	@PostMapping("message/save")
	public Messages saveMessage(@RequestBody Messages m) {
		return messageRepo.save(m);
	}

}
