package projetfinal.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Membres {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	@Column(unique=true)
	private String mail;
	private String mdp;
	private Integer xp;
	private Integer score;

}
