package projetfinal.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinal.entities.Amis;
import projetfinal.repository.AmisRepository;

@RestController @CrossOrigin("*")
public class AmisRest {
	@Autowired
	private AmisRepository amisRepo;
	
	//Trouver toutes les amitiés
	@GetMapping("amis/all")
	public Iterable<Amis> allAmis(){
		return amisRepo.findAll();
	}
	
	//Trouver les amis de membre 1
	@GetMapping("amis/membre1/{id}")
	public List<Amis> FindAmisByMembre1id(@PathVariable Long id){
		return amisRepo.findByMembre1Id(id);
	}
	
	//Trouver les amis de membre 2
		@GetMapping("amis/membre2/{id}")
		public List<Amis> FindAmisByMembre2id(@PathVariable Long id){
			return amisRepo.findByMembre2Id(id);
		}
		
	//Changer la validite d'une amitié de membre
		@PatchMapping("amis/membre1/valide/{id}")
		public Amis setAmitievalide(@PathVariable Long id, @RequestBody Boolean amitevalide) {
			Amis a = amisRepo.findById(id).get();
			a.setAmitievalide(amitevalide);
			return amisRepo.save(a);
		}
	

}
