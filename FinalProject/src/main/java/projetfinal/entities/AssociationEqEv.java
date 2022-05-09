package projetfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data @Entity
public class AssociationEqEv {
	
	@Id @GeneratedValue
	private Long idEqEv;

	@ManyToOne
	private Evenements evenements;
	
	@ManyToOne
	private Equipes equipes;

}

