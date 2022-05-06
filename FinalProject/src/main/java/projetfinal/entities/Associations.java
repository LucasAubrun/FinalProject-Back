package projetfinal.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Entity
public class Associations {
	
	@Id @GeneratedValue
	private Long idEqMb;

	@ManyToOne
	private Membres membres;
	
	@ManyToOne
	private Equipes equipes;

}
