package projetfinal.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import projetfinal.entities.Membres;
import projetfinal.entities.Activites;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Evenements {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private Date date;
	private String adresse;
	private String description;
	private String nomActivite;
	private Integer nbMin;
	private Integer nbMax;
	public boolean fini;
	private String niveau;

	
	
	
	@ManyToOne
	private Membres createur;

}
