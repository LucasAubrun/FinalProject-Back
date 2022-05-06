package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Activites;
import projetfinal.entities.Membres;

public interface MembresRepository extends CrudRepository<Membres, Long> {
	
	public Optional<Membres> findById(Long id);
	public Optional<Membres> findByMailAndMdp(String mail, String mdp);

	public Optional<Membres> findByNomAndPrenom(String nom, String prenom);
	

	@Query("SELECT m.photoprofil FROM Membres m WHERE m.id =?1")
	public Optional<Membres> getPhotoprofilById(Long id);


}
