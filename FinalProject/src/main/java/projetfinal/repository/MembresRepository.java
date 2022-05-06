package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Membres;

public interface MembresRepository extends CrudRepository<Membres, Long> {
	
	public Optional<Membres> findById(Long id);
	public Optional<Membres> findByMailAndMdp(String mail, String mdp);
	public Iterable<Membres> findAllByOrderByScoreDesc();

}
