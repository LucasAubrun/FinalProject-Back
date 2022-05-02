package projetfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//import fr.solutec.entities.Memo;
//import fr.solutec.entities.Person;
//import fr.solutec.repository.MemoRepository;
//import fr.solutec.repository.PersonRepository;

@SpringBootApplication
public class FinalProjectApplication implements CommandLineRunner {

	//@Autowired
	//private MemoRepository memoRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
		System.out.println("lancement est terminé");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("lancement en cours");
	}
}