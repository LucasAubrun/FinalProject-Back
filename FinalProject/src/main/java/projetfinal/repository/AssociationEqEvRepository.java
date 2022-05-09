package projetfinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.AssociationEqEv;


public interface AssociationEqEvRepository extends CrudRepository<AssociationEqEv, Long> {

	
	public Optional<AssociationEqEv> findById(Long id);
	
	
	public List<AssociationEqEv> findByEvenementsId(Long id);
	
	public List<AssociationEqEv> findByEquipesId(Long id);
}
