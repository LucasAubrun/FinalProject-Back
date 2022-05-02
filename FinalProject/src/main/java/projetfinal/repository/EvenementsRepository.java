package projetfinal.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

//import fr.solutec.entities.Memo;
import projetfinal.entities.Evenements;
import projetfinal.entities.Activites;

public interface EvenementsRepository extends CrudRepository<Evenements, Long> {
	
	public List<Evenements> findByNom(String nom);
	public List<Evenements> findByDate(Date date);
	public List<Evenements> findByAdresse(String adresse);
	public List<Evenements> findByNbMin(int nbMin);
	public List<Evenements> findByNbMax(int nbMax);
	public List<Evenements> findByNomActivite(String nom);

}