package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Participants;


public interface ParticipantsRepository extends CrudRepository<Participants, Long> {

	public Optional<Participants> findById(Long id);
	
	
	public List<Participants> findByMembresId(Long id);
	
	
}
