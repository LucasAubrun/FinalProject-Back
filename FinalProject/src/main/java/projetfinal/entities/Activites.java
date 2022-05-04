package projetfinal.entities;

import java.sql.Clob;
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
public class Activites {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String description;
	private Integer nbJoueurs;
	private String type;
	private Boolean valide;
	
	
	

}
