package projetfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Messages {
	
	@Id @GeneratedValue
	private Long id;
	private String contenu;
	private boolean lu;
	
	@ManyToOne
	private Membres emetteur;
	@ManyToOne
	private Membres recepteur;
}
