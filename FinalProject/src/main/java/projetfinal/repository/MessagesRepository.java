package projetfinal.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Messages;

public interface MessagesRepository extends CrudRepository<Messages, Long>{

	public Iterable<Messages> findByLuIsFalseAndRecepteurId(Long idRecepteur);

}
