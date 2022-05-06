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

import projetfinal.entities.Admins;
import projetfinal.repository.AdminsRepository;

@RestController @CrossOrigin("*")
public class AdminsRest {
	@Autowired
	private AdminsRepository adminRepo;
	
	@GetMapping("admin/get/{mail}/{mdp}")
	public Optional<Admins> getAdminByMailAndMdp(@PathVariable String mail, @PathVariable String mdp) {
		return adminRepo.findByMailAndMdp(mail, mdp);
	}

}
