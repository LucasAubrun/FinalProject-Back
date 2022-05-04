package projetfinal.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Equipes {
	
	@Id @GeneratedValue
	private Long id;
	@Column(unique=true)
	private String nom;
	
	@ManyToOne
	// @JoinColumn( name = "menbres_id", referencedColumnName= "id")
	private Membres membres;

}
//test