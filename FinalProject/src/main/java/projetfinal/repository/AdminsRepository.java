package projetfinal.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

import projetfinal.entities.Admins;

public interface AdminsRepository extends CrudRepository<Admins, Long> {
	public Optional<Admins> findByMailAndMdp(String mail, String mdp);

}
