package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Amis;

public interface AmisRepository extends CrudRepository<Amis,Long>{
	public Optional<Amis> findById(Long id);
	public List<Amis> findByMembre1Id(Long id);
	public List<Amis> findByMembre2Id(Long id);

}
