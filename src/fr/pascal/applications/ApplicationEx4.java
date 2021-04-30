package fr.pascal.applications;
import fr.pascal.model.ex4.Enfant;
import fr.pascal.model.ex4.Jouet;
import fr.pascal.model.ex4.PereNoel;

public  class ApplicationEx4 {
	public static void main(String[] args) {
		/*	
	// instanciation jouet1, enfant1, jouet2 
	Jouet jouet1 =new Jouet("Toy Story");
	Enfant enfant1 = new Enfant("Li","Mathieu", 5 );
	Jouet jouet2 =new Jouet("Aladin");
	Jouet jouet3 =new Jouet("Monster&Cie");

	// afficher enfant1 et jouet 1
	System.out.println(enfant1);
	System.out.println(jouet1);

	//instanciation enfant2
	Enfant enfant2 = new Enfant();
	enfant2.setNom("Castel");
	enfant2.setPrenom("Bom");
	enfant2.setAge(10);
	System.out.println(enfant2);

	Enfant enfant3 = new Enfant();
	enfant3.setNom("Pierro");
	enfant3.setPrenom("Lombre");
	enfant3.setAge(50);



	// instanciation du père Noël
	PereNoel perenoel = new PereNoel();
	// ajouter les jouets
		perenoel.ajouterJouet(jouet1);
		perenoel.ajouterJouet(jouet2);
		perenoel.ajouterJouet(jouet3);
	// afficher tous les jouets
		perenoel.afficherListDesJouets();
	// ajouter les enfants
	perenoel.ajouterEnfant(enfant1);
	perenoel.ajouterEnfant(enfant2);
	perenoel.ajouterEnfant(enfant3);
	// afficher tous les enfants
	perenoel.afficherListDesEnfants();

	// distribution des cadeaux 
	perenoel.distribuer(enfant2, jouet1);
	perenoel.distribuer(enfant3, jouet2);
	perenoel.distribuer(enfant2, jouet2);
	perenoel.distribuer(enfant2, jouet3);

	enfant2.afficher();
	enfant3.afficher();



	// instanciation de pere noel
	/*
	Enfant[] enfants = new Enfant[2];
	enfants[0]=enfant1;
	enfants[1]=enfant2;
	Jouet[] jouets = new Jouet[3];
	jouets[0]=jouet1;
	jouets[1]=jouet2;
	PereNoel perenoel1 = new PereNoel (enfants, jouets);
	System.out.println(perenoel1);
		 */


		PereNoel papaNono = new PereNoel();
		// Ensuite on va crée 3 enfants :
		// Noémie Truc à 8 ans :
		Enfant nono = new Enfant("Bidule","Noémie",8);
		// Joachim Machin à 6 ans :
		Enfant jojo = new Enfant("Machin","Joachim",6);
		// Soufiane Touti à 9 ans :
		Enfant souf = new Enfant("Truc","Soufiane",9);
		Enfant doublon = new Enfant("Bidule","Noémie",8);
		// Ensuite on crée les jouets à distribuer :
		// on pourrait en mettre davantage
		Jouet joujou1 = new Jouet("Ferrari 308GTB");
		Jouet joujou2 = new Jouet("BarbiZou la poupée qui gazouille ");
		Jouet joujou3 = new Jouet("Super puzzle avec 180 pièces ");
		Jouet joujou4 = new Jouet("Mikado");
		Jouet joujou5 = new Jouet("Rubik's Cube");
		Jouet joujou6 = new Jouet("iPad");
		// le père Noel met dans sa hote des jouets :
		papaNono.ajouterJouet(joujou1);
		papaNono.ajouterJouet(joujou2);
		papaNono.ajouterJouet(joujou3);
		papaNono.ajouterJouet(joujou4);
		papaNono.ajouterJouet(joujou5);
		papaNono.ajouterJouet(joujou6);
		// le père Noel met dans sa liste des enfants :
		papaNono.ajouterEnfant(nono);
		papaNono.ajouterEnfant(jojo);
		papaNono.ajouterEnfant(souf);
		// il affiche la liste des enfants à visiter et
		// les cadeaux à distribuer (ça va, il a pas trop de boulot):
		papaNono.afficherListDesEnfants();
		papaNono.afficherListDesJouets();
		// il affecte des cadeaux aux 3 enfants :
		papaNono.distribuer(nono,joujou1);
		papaNono.distribuer(jojo, joujou2);
		papaNono.distribuer(souf,joujou3);
		papaNono.distribuer(souf,joujou4);
		papaNono.distribuer(nono,joujou5);
		papaNono.distribuer(jojo,joujou6);
		// il va afficher les enfants avec leurs cadeaux :
		nono.afficher();
		jojo.afficher();
		souf.afficher();
		// peut-il ajouter un autre jouet(joujou2) à nono ?
		papaNono.distribuer(nono,joujou2);
	}
}
