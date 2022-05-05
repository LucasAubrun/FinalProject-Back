package projetfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Entity
public class Participants {
	
	@Id @GeneratedValue
	private Long idEvMb;

	@ManyToOne
	private Membres membres;
	
	@ManyToOne
	private Evenements evenements;
	

}
