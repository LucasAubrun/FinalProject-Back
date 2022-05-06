package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Activites;

public interface ActivitesRepository extends CrudRepository<Activites, Long>{
	public List<Activites> findByNom(String nom);
	public List<Activites> findByNbJoueurs(Integer joueurs);
	public List<Activites> findByType(String type);
	public Optional<Activites> findById(Long id);
	@Query("SELECT a.valide FROM Activites a WHERE a.id =?1")
	public Optional<Activites> getValideById(Long id);

}
