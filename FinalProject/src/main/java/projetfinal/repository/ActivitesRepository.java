package projetfinal.repository;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Activites;
import projetfinal.entities.Membres;

public interface ActivitesRepository extends CrudRepository<Activites, Long>{

}
