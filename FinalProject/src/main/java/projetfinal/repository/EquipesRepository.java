package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Equipes;



public interface EquipesRepository extends CrudRepository<Equipes, Long> {

	public Optional<Equipes> findByNom(String nom);
	
//	public List<Equipes> findByNom(String nom);
//	public List<Equipes> findByMembresPrenom(String Prenom);
	
}
