package projetfinal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Activites;
import projetfinal.entities.Membres;

public interface ActivitesRepository extends CrudRepository<Activites, Long>{
	public List<Activites> findByNom(String nom);
	public List<Activites> findByNbJoueurs(Integer joueurs);
	public List<Activites> findByType(String type);

}
