package projetfinal.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import projetfinal.entities.Evenements;
//import fr.solutec.entities.Person;

public interface EvenementRepository extends CrudRepository<Evenements, Long> {

}