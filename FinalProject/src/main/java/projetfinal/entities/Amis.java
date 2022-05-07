package projetfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Entity
public class Amis {
	
	@Id @GeneratedValue
	private Long idAmis;

	@ManyToOne
	private Membres membre1;
	
	@ManyToOne
	private Membres membre2;
	
	private Boolean amitievalide;
	

}
