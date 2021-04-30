package fr.pascal.model.ex4;

import java.util.ArrayList;

public class PereNoel {
	private ArrayList<Jouet> jouets;
	private ArrayList<Enfant> enfants;

	public PereNoel() {
		this(new  ArrayList<Jouet>(), new ArrayList<Enfant>());
	}

	public PereNoel(ArrayList<Jouet> jouets, ArrayList<Enfant> enfants) {
		this.jouets = jouets;
		this.enfants = enfants;
	}
   //Méthodes
	public void ajouterJouet(Jouet jouet) {
		this.jouets.add(jouet);
	}

	public void ajouterEnfant(Enfant enfant) {
		this.enfants.add(enfant);
	}

	public void afficherListDesEnfants() {
		System.out.println("Liste des enfants");
		for (int i = 0; i <= enfants.size() - 1; i++) {
			System.out.println(enfants.get(i) + "");
		}
	}

	public void afficherListDesJouets() {
		System.out.println("Liste des jouets");
		for (int j = 0; j <= jouets.size() - 1; j++) {
			System.out.println(jouets.get(j) + "");
			
		}
	}
	

	
	public void distribuer(Enfant enfant, Jouet jouet) {
		if (jouet.getEtat() == true) {
			enfant.getCadeaux().add(jouet);
			jouet.setEtat(false);
		}
		else {
			System.out.println(" Le cadeau "+jouet.getLibelle()+ " est déjà distribué. ");
		}
	}

	/**
	 * @return the jouets
	 */
	public ArrayList<Jouet> getJouets() {
		return jouets;
	}

	/**
	 * @param jouets the jouets to set
	 */
	public void setJouets(ArrayList<Jouet> jouets) {
		this.jouets = jouets;
	}

	/**
	 * @return the enfants
	 */
	public ArrayList<Enfant> getEnfants() {
		return enfants;
	}

	/**
	 * @param enfants the enfants to set
	 */
	public void setEnfants(ArrayList<Enfant> enfants) {
		this.enfants = enfants;
	}
	
	
	//Getters et Setters
	
	
	

}