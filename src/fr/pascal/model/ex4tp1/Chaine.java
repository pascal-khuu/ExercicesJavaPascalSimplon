package fr.pascal.model.ex4tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chaine {

	String maChaine;
	private  int nbVoyelles = 0;
	private int nbMots = 0;
	private int nbConsonnes = 0;
	private int nbEspaces = 0;
	int nbLettres = 0;

	// constructeur Chaine
	public Chaine()
	{
		System.out.println("Donnez une suite de mots puis validez (entrée)");
		try {
			InputStreamReader entree = new InputStreamReader(System.in);
			BufferedReader clavier = new BufferedReader(entree);
			this.maChaine = clavier.readLine();
		} catch (IOException e) {
			System.out.println("Problème de lecture en entrée !");
		}
	}
	// calculer le nombre de voyelles
	public void nombreVoyelles() {
		for (int nb = 0; nb <= maChaine.length() - 1; nb++) {
			if (maChaine.charAt(nb) == 'a' || maChaine.charAt(nb) == 'e' || maChaine.charAt(nb) == 'i'
					|| maChaine.charAt(nb) == 'o' || maChaine.charAt(nb) == 'u') {
				this.nbVoyelles++;
			}
			// else { if (maChaine.charAt(nb) != ' ') { this.nbConsonnes++; }
		}

		//return this.nbVoyelles;

	}

	// calculer le nombre de consonnes
	public void nombreConsonnes() {

		for (int nb = 0; nb <= maChaine.length() - 1; nb++) {
			if (!(maChaine.charAt(nb) == 'a' || maChaine.charAt(nb) == 'e' || maChaine.charAt(nb) == 'i'
					|| maChaine.charAt(nb) == 'o' || maChaine.charAt(nb) == 'u' || maChaine.charAt(nb) == ' ')) {
				this.nbConsonnes++;
			}

		}
		//return this.nbConsonnes;
	}

	// calculer le nombre d'espaces
	public void nombreEspaces() {
		for (int nb = 0; nb <= maChaine.length() - 1; nb++) {
			if (maChaine.charAt(nb) == ' ') {
				this.nbEspaces++;
			}
		}
		
	}
	// calculer le nombre de lettres d'un mot
	public void nbLettres() {
		for (int nb=0; nb<= maChaine.length()-1; nb++) {
			if (!(maChaine.charAt(nb)== ' ')) {
				this.nbLettres++;
			}
		}
		
	}

	// calculer le nombre de mots
	public void nbMots() {
		String[] tableau = maChaine.split("\\ ");
		this.nbMots=tableau.length;
		
	}



	public void extraire() {
		
		this.nombreVoyelles();
		this.nombreConsonnes();
		this.nombreEspaces();
		this.nbLettres();
		this.nbMots();
		
	}
	// afficher le nombre de voyelles, de consonnes , d'espaces, de lettres et de mots d'un mot saisi
	public void afficher() {
		System.out.println("le nombre de voyelles du mot saisi est : "+ this.nbVoyelles);
		System.out.println("le nombre de consonnes du mot saisi est : "+ this.nbConsonnes);
		System.out.println("le nombre d'espaces du mot saisi est : " + this.nbEspaces);
		System.out.println("le nombre de lettres du mot saisi est : "+ this.nbLettres);
		System.out.println("le nombre de mots du mot saisi est: " + this.nbMots);
	}
	// getters& setters
	/**
	 * @return the maChaine
	 */
	public String getMaChaine() {
		return maChaine;
	}

	/**
	 * @param maChaine the maChaine to set
	 */
	public void setMaChaine(String maChaine) {
		this.maChaine = maChaine;
	}

	/**
	 * @return the nbVoyelles
	 */
	public int getNbVoyelles() {
		return nbVoyelles;
	}

	/**
	 * @param nbVoyelles the nbVoyelles to set
	 */
	public void setNbVoyelles(int nbVoyelles) {
		this.nbVoyelles = nbVoyelles;
	}

	/**
	 * @return the nbMots
	 */
	public int getNbMots() {
		return nbMots;
	}

	/**
	 * @param nbMots the nbMots to set
	 */
	public void setNbMots(int nbMots) {
		this.nbMots = nbMots;
	}

	/**
	 * @return the nbConsonnes
	 */
	public int getNbConsonnes() {
		return nbConsonnes;
	}

	/**
	 * @param nbConsonnes the nbConsonnes to set
	 */
	public void setNbConsonnes(int nbConsonnes) {
		this.nbConsonnes = nbConsonnes;
	}

	/**
	 * @return the nbEspaces
	 */
	public int getNbEspaces() {
		return nbEspaces;
	}

	/**
	 * @param nbEspaces the nbEspaces to set
	 */
	public void setNbEspaces(int nbEspaces) {
		this.nbEspaces = nbEspaces;
	}

	/**
	 * @return the nbLettres
	 */
	public int getNbLettres() {
		return nbLettres;
	}

	/**
	 * @param nbLettres the nbLettres to set
	 */
	public void setNbLettres(int nbLettres) {
		this.nbLettres = nbLettres;
	}

}
