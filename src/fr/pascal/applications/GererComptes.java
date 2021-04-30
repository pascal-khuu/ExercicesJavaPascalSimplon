package fr.pascal.applications;

import fr.pascal.model.ex4tp3.*;


public class GererComptes {

	public static void main(String[] args) {
		// Instanciation du  compte 1
		Titulaire t1 = new Titulaire ("Pierre","League","14587");
		
		
		Compte compte1 = new Compte (t1);
		
		// ajouter du solde de 3000 euros
		compte1.depotargent(3000);
		// afficher le compte1
		System.out.println(compte1);
		// Instanciation du compte 2
		Titulaire t2 = new Titulaire ("Pascal","K","14587");
		Compte compte2 = new Compte (t2,1000);
		// ajout du solde du compte2 de 80 euros
		compte2.depotargent(80);
		// retrait de 800 euros du solde du ompte 2
		compte2.retrait(800);
		
		System.out.println("Compte après retrait de 800 euros"+ compte2);
		// retrait impossible car supérieur au solde actuel du compte2
		compte2.retrait(300);
		// afficher le compte 2
		System.out.println(compte2);
	}

}
