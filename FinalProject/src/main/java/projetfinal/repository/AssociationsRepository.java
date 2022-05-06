package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Associations;


public interface AssociationsRepository extends CrudRepository<Associations, Long> {

	public Optional<Associations> findById(Long id);
	
	
	public List<Associations> findByMembresId(Long id);
	
	public List<Associations> findByEquipesId(Long id);


	
	
}
