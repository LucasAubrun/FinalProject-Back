package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Equipes;



public interface EquipesRepository extends CrudRepository<Equipes, Long> {

	public Optional<Equipes> findByNom(String nom); //Pour chercher les équipes d'un membre
	
//	public List<Equipes> findByMembresId(long id);
	
//	@Query("SELECT e.nom FROM Equipes e")
//	public List<String> getEquipeStringByMemberId(Long id);
	
	public List<Equipes> findByMembresId(Long id); //Pour afficher les équipes avec l'id 
	
}
