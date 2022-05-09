package projetfinal.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//import fr.solutec.entities.Memo;
import projetfinal.entities.Evenements;
import projetfinal.entities.Activites;
import projetfinal.entities.Associations;
import projetfinal.entities.Equipes;
import projetfinal.entities.Membres;

public interface EvenementsRepository extends CrudRepository<Evenements, Long> {
	
	public List<Evenements> findByNom(String nom);
	public List<Evenements> findByDate(Date date);
	public List<Evenements> findByAdresse(String adresse);
	public List<Evenements> findByNbMin(int nbMin);
	public List<Evenements> findByNbMax(int nbMax);
	public List<Evenements> findByNomActivite(String nom);
	public List<Evenements> findByCreateurId(Long id);
	//public List<Evenements> findByRandId2(Long id);
	//public Evenements findByRandId(Long id);
	
	@Query("SELECT e FROM Evenements e, Participants p "
			+ "WHERE p.membres.id =?1 "
			+ "AND p.evenements.id = e.id "
			+ "AND e.date < ?2 "
			+ "AND e.fini = false")
	public List<Evenements> getByDateBefore(Long id, Date now);
	
	@Query("SELECT e FROM Evenements e, Participants p "
			+ "WHERE p.membres.id =?1 "
			+ "AND p.evenements.id = e.id "
			+ "AND e.date > ?2")
	public List<Evenements> getByDateAfter(Long id, Date now);
	
/*	public List<Evenements> findByMembresNom(String nom);*/

}