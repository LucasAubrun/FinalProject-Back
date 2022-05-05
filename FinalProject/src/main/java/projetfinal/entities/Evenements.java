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
	private String recurrence;
	private String niveau;
	private String description;
	private Integer nbMin;
	private Integer nbMax;
	public String nomActivite;
	
	@ManyToOne
	private Activites activite;
	
	@ManyToOne
	private Membres membres;

}
