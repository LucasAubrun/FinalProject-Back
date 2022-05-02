package projetfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Admins {
	
	@Id @GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private String mail;
	private String mdp;
	private String login;
	
	@ManyToOne
	private Activites activite;

}
