package projetfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import projetfinal.entities.Activites;
import projetfinal.entities.Admins;
import projetfinal.entities.Amis;
import projetfinal.entities.AssociationEqEv;
import projetfinal.entities.Associations;
import projetfinal.entities.Equipes;
import projetfinal.entities.Evenements;
import projetfinal.entities.Membres;
import projetfinal.entities.Messages;
import projetfinal.entities.Participants;
import projetfinal.repository.ActivitesRepository;
import projetfinal.repository.AdminsRepository;
import projetfinal.repository.AmisRepository;
import projetfinal.repository.AssociationEqEvRepository;
import projetfinal.repository.AssociationsRepository;
import projetfinal.repository.EquipesRepository;
import projetfinal.repository.MembresRepository;
import projetfinal.repository.MessagesRepository;
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
	
	@Autowired
	private MessagesRepository messageRepo;
	
	@Autowired
	private AmisRepository amisRepo;
	
	@Autowired
	private AssociationEqEvRepository assoEqEvRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
		System.out.println("lancement est terminé");
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("lancement en cours");

		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");  //a supprimer avant de pull (création pour équipe)
		Date date1 = d.parse("14/01/1997");
		Date date2 = d.parse("12/05/2001");
		Date date3 = d.parse("14/05/2005");
		Date date4 = d.parse("17/05/2019");
		Date date5 = d.parse("19/05/2022");
		Date date6 = d.parse("21/05/2022");
		Date date7 = d.parse("24/05/2022");//a supprimer avant de pull	
		
		//Membres m1 = new Membres( null, "Member1", "Luidi", date1, "m1@mario",  "m1", 15, 10, 1); //à supprimer créé pour l'équipe
		//Membres m2 = new Membres( null, "Member2", "loukal", date1, "m2@mario", "m2", 15, 10, 2); //à supprimer créé pour l'équipe
		//Membres m3 = new Membres( null, "Member3", "popol", date1, "m3@mario",  "m3", 15, 10, 3); //à supprimer créé pour l'équipe
		//Membres m4 = new Membres( null, "Member4", "padouk", date1, "m4@mario", "m4", 15, 10, 3); //à supprimer créé pour l'équipe
	
		Membres m1 = new Membres( null, "Member1", "Luidi", date1, "m1@mario",  "m1", 15, 10, "J'aime les bananes", true, 1); //à supprimer créé pour l'équipe
		Membres m2 = new Membres( null, "Member2", "loukal", date1, "m2@mario", "m2", 15, 10, "J'aime les poires", true, 2); //à supprimer créé pour l'équipe
		Membres m3 = new Membres( null, "Member3", "popol", date1, "m3@mario",  "m3", 15, 10, "J'aime les pates", true, 3); //à supprimer créé pour l'équipe
		Membres m4 = new Membres( null, "Member4", "padouk", date1, "m4@mario", "m4", 15, 120, "J'aime les kiwis", true, 4); //à supprimer créé pour l'équipe
		Membres m5 = new Membres( null, "Member5", "jacki", date1, "m5@mario", "m5", 15, 27, "J'aime les fraises", true, 5); //à supprimer créé pour l'équipe
		Membres m6 = new Membres( null, "Member6", "jacki2", date1, "m6@mario", "m6", 15, 27, "J'aime les madeleines", true, 1);
		
		Membres m7 = new Membres( null, "Member7", "Matthieu", date1, "m7@mario",  "m7", 15, 10, "J'aime les boules", true, 5); //à supprimer créé pour l'équipe
		Membres m8 = new Membres( null, "Member8", "loukal8", date1, "m8@mario", "m8", 15, 10, "J'aime les paniers de yoplait", true, 3); //à supprimer créé pour l'équipe
		Membres m9 = new Membres( null, "Member9", "popol9", date1, "m9@mario",  "m9", 15, 10, "J'aime les patates sautées à l'huile d'olive", true, 4); //à supprimer créé pour l'équipe
		Membres m10 = new Membres( null, "Member10", "padouk10", date1, "m10@mario", "m10", 15, 120, "J'aime les kayaks", true, 2); //à supprimer créé pour l'équipe
		Membres m11 = new Membres( null, "Member11", "jacki11", date1, "m11@mario", "m11", 15, 27, "J'aime les fruits en général", true, 4); //à supprimer créé pour l'équipe
		Membres m12 = new Membres( null, "Member12", "lucas", date1, "m12@mario", "m12", 15, 27, "J'aime les mamans", true, 1);
		

		membreRepo.save(m1);		 //à supprimer créé pour l'équipe
		membreRepo.save(m2);		 //à supprimer créé pour l'équipe
		membreRepo.save(m3);		 //à supprimer créé pour l'équipe
		membreRepo.save(m4);		 //à supprimer créé pour l'équipe
		membreRepo.save(m5);		 //à supprimer créé pour l'équipe
		membreRepo.save(m6);		 //à supprimer créé pour l'équipe
		membreRepo.save(m7);		 //à supprimer créé pour l'équipe
		membreRepo.save(m8);		 //à supprimer créé pour l'équipe
		membreRepo.save(m9);		 //à supprimer créé pour l'équipe
		membreRepo.save(m10);		 //à supprimer créé pour l'équipe
		membreRepo.save(m11);		 //à supprimer créé pour l'équipe
		membreRepo.save(m12);		 //à supprimer créé pour l'équipe
		
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
		

		Evenements ev1 = new Evenements( null, "Match de foot ce Week-End", date5, "Stade","Football", "petit match de foot à 11 contre 11, niveau correct sans pretention", 22, 28, false, "Intermédiaire", m1); //à supprimer créé pour l'évent
		Evenements ev2 = new Evenements( null, "Rencontre autour d'un match de basket", date2, "Gymnase","Basket","Match de basket pour faire des rencontres", 10 , 16, false, "debutant", m2); //à supprimer créé pour l'évent
		Evenements ev3 = new Evenements( null, "Apres midi jeux de cartes", date3, "chez moi","Tarot","Petite apres-midi detente", 3 , 5, false, "debutant", m3); //à supprimer créé pour l'évent
		Evenements ev4 = new Evenements( null, "Tryhard FIFA", date4, "A la maison","fifa", "Objectif: s'ameliorer en affrontant des machines", 2, 6, false, "Expert", m4);

		eventRepo.save(ev1);
		eventRepo.save(ev2);
		eventRepo.save(ev3);
		eventRepo.save(ev4);
		
		Admins ad1 = new Admins(null, "Lige", "Terence", "lat@gmail.com", "azerty", "Admin1");
		adminRepo.save(ad1);
		
		Participants p1 = new Participants(null, m1, ev1);
		Participants p2 = new Participants(null, m1, ev2);
		Participants p3 = new Participants(null, m1, ev3);
		Participants p4 = new Participants(null, m2, ev2);
		Participants p5 = new Participants(null, m3, ev3);
		Participants p6 = new Participants(null, m4, ev4);
		partRepo.save(p1);
		partRepo.save(p2);
		partRepo.save(p3);
		partRepo.save(p4);
		partRepo.save(p5);
		partRepo.save(p6);
		
		
		Messages mes1 = new Messages(null, "Salut Clara", false, m1, m2);
		Messages mes2 = new Messages(null, "Salut Clara, je pense que je vais manger un gâteau, est-ce que tu en veux aussi ? ce serait cool mdr il est au chocolat et je sais que t'aime pas ça", false, m1, m2);
		messageRepo.save(mes1);
		messageRepo.save(mes2);
		
		Amis amitie1 = new Amis(null,m1,m3,false);
		Amis amitie2 = new Amis(null,m2,m4,false);
		Amis amitie3 = new Amis(null,m5,m6,false);
		Amis amitie4 = new Amis(null,m8,m10,false);
		Amis amitie5 = new Amis(null,m9,m12,false);
		amisRepo.save(amitie1);
		amisRepo.save(amitie2);
		amisRepo.save(amitie3);
		amisRepo.save(amitie4);
		amisRepo.save(amitie5);
		

		AssociationEqEv aev1 = new AssociationEqEv( null, ev1, e3);//à supprimer créé pour l'équipe
		AssociationEqEv aev2 = new AssociationEqEv( null, ev2, e2);//à supprimer créé pour l'équipe 
		assoEqEvRepo.save(aev1);//à supprimer créé pour l'équipe
		assoEqEvRepo.save(aev2);//à supprimer créé pour l'équipe
		
		eventRepo.getByDateBefore((long) 1, new Date()).forEach(e -> {
			System.out.println(e.toString());
		});;

	}
}

