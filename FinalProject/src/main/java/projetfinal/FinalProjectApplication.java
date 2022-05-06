package projetfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import projetfinal.entities.Activites;
import projetfinal.entities.Admins;
import projetfinal.entities.Associations;
import projetfinal.entities.Equipes;
import projetfinal.entities.Evenements;
import projetfinal.entities.Membres;
import projetfinal.entities.Participants;
import projetfinal.repository.ActivitesRepository;
import projetfinal.repository.AdminsRepository;
import projetfinal.repository.AssociationsRepository;
import projetfinal.repository.EquipesRepository;
import projetfinal.repository.MembresRepository;
import projetfinal.repository.ParticipantsRepository;
import projetfinal.repository.EvenementsRepository;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

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
	
	@Autowired
	private AssociationsRepository assoRepo;
	
	@Autowired
	private EquipesRepository equipesRepo;
	
	@Autowired
	private ActivitesRepository actiRepo;
	
	@Autowired
	private EvenementsRepository eventRepo;
	
	@Autowired
	private ParticipantsRepository partRepo;
	
	@Autowired //a supprimer avant de pull
	private MembresRepository membreRepo;  //a supprimer avant de pull
	
	@Autowired
	private AdminsRepository adminRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
		System.out.println("lancement est terminé");
	}




	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("lancement en cours");

		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");  //a supprimer avant de pull (création pour équipe)
		Date date1 = d.parse("14/01/1997");	  //a supprimer avant de pull	
		
		Membres m1 = new Membres( null, "Member1", "Luidi", date1, "m1@mario",  "m1", 15, 10, 1); //à supprimer créé pour l'équipe
		Membres m2 = new Membres( null, "Member2", "loukal", date1, "m2@mario", "m2", 15, 10, 2); //à supprimer créé pour l'équipe
		Membres m3 = new Membres( null, "Member3", "popol", date1, "m3@mario",  "m3", 15, 10, 3); //à supprimer créé pour l'équipe
		Membres m4 = new Membres( null, "Member4", "padouk", date1, "m4@mario", "m4", 15, 10, 3); //à supprimer créé pour l'équipe
		membreRepo.save(m1);		 //à supprimer créé pour l'équipe
		membreRepo.save(m2);		 //à supprimer créé pour l'équipe
		membreRepo.save(m3);		 //à supprimer créé pour l'équipe
		membreRepo.save(m4);		 //à supprimer créé pour l'équipe
		
		Equipes e1 = new Equipes( null, "Solutec Gang", m1); //à supprimer créé pour l'équipe
		Equipes e2 = new Equipes( null, "La DreamTeam", m1); //à supprimer créé pour l'équipe
		Equipes e3 = new Equipes( null, "CocoBanana", m3); //à supprimer créé pour l'équipe
		equipesRepo.save(e1); //à supprimer créé pour l'équipe
		equipesRepo.save(e2); //à supprimer créé pour l'équipe
		equipesRepo.save(e3); //à supprimer créé pour l'équipe
		
		Associations a1 = new Associations( null, m1, e1);//à supprimer créé pour l'équipe
		Associations a2 = new Associations( null, m1, e2);//à supprimer créé pour l'équipe
	    Associations a3 = new Associations( null, m1, e3);//à supprimer créé pour l'équipe
		Associations a4 = new Associations( null, m2, e1);//à supprimer créé pour l'équipe
		Associations a5 = new Associations( null, m3, e3);//à supprimer créé pour l'équipe
		Associations a6 = new Associations( null, m3, e2);//à supprimer créé pour l'équipe
		assoRepo.save(a1);//à supprimer créé pour l'équipe
		assoRepo.save(a2);//à supprimer créé pour l'équipe
		assoRepo.save(a3);//à supprimer créé pour l'équipe
		assoRepo.save(a4);//à supprimer créé pour l'équipe
		assoRepo.save(a5);//à supprimer créé pour l'équipe
		assoRepo.save(a6);//à supprimer créé pour l'équipe

		
		//Activites act1 = new Activites( null, "AAA", "BBB", 4, "aert", true);
		
		Activites act1 = new Activites(null,"basket","ba en gros tu joues avec une balle",10,"Sport",true);
		Activites act2 = new Activites(null,"fifa","ba en gros tu joues avec une balle",2,"Jeu Vidéo",true);
		Activites act3 = new Activites(null,"corde à sauter","ba en gros tu sautes",4,"Autre",false);
		Activites act4 = new Activites(null,"tarot","c'est un jeu avec un chien",5,"Jeu de Société",false);
		actiRepo.save(act1);
		actiRepo.save(act2);
		actiRepo.save(act3);
		actiRepo.save(act4);
		
		Evenements ev1 = new Evenements( null, "nom1", date1, "chez oim","Grosse ambiance","toutes les secondes","tout", 12, 100, "Che pa", act1, m1); //à supprimer créé pour l'évent
		Evenements ev2 = new Evenements( null, "nom2", date1, "chez twa","que du love","h24","expert", 2 , 2, "miam", act1, m1); //à supprimer créé pour l'évent
		Evenements ev3 = new Evenements( null, "nom3", date1, "chez","quegerger","h2xcc","expert", 2 , 2, "miam", act1, m1); //à supprimer créé pour l'évent
		eventRepo.save(ev1);
		eventRepo.save(ev2);
		eventRepo.save(ev3);
		
		Admins ad1 = new Admins(null, "Lige", "Terence", "lat@gmail.com", "azerty", "Admin1");
		adminRepo.save(ad1);
		
		Participants p1 = new Participants(null, m1, ev1);
		Participants p2 = new Participants(null, m1, ev2);
		partRepo.save(p1);
		partRepo.save(p2); 
		
		

		
	}//
}

