package projetfinal.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Admins {
	
	private long id;
	private String nom;
	private String prenom;
	private String mail;
	private String mdp;
	private String login;
	
	@OneToMany
	private Activites activite;

}
