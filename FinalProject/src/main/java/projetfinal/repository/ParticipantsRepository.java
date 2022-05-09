package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Membres;
import projetfinal.entities.Participants;


public interface ParticipantsRepository extends CrudRepository<Participants, Long> {

	public Optional<Participants> findById(Long id);
	public List<Participants> findByMembresId(Long id);
	
	//trouver tous les participants pour un event
	@Query("SELECT p.membres FROM Participants p "
			+ "WHERE p.evenements.id =?1 ")
	public List<Membres> getParticipantsEvent(Long id);
		
}
