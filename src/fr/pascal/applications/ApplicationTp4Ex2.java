package fr.pascal.applications;

import biblio.GestionBiblio;
import biblio.Livre;

public class ApplicationTp4Ex2 {

	public static void main(String[] args) {
		Livre livre1 = new Livre(1234,"titre1",12);
		Livre livre2 = new Livre(5678,"titre2",13);
		Livre livre3 = new Livre(6789,"titre3",14);
		
		GestionBiblio bibliotheque = new GestionBiblio();
		
		// ajouter une liste de livres
		bibliotheque.ajouterLivre(livre1);
		bibliotheque.ajouterLivre(livre2);
		bibliotheque.ajouterLivre(livre3);
		bibliotheque.rechercheLivre(5678);
		// afficher la liste de livres et le nombre de livres dans la bibliotheque
		bibliotheque.afficherListeLivres();
		System.out.println("Montant de livres en biblio en euros "+ +bibliotheque.montantTotalLivreStocke());
		System.out.println("Le nombre de livres en biblio est : "+bibliotheque.nbTotalLivre());
		// ajouter un livre
		Livre livre4 = new Livre(9876,"titre4",18);
		bibliotheque.ajouterLivre(livre4);
		// afficher la liste de livres mise à jour
		bibliotheque.afficherListeLivres();
		System.out.println("Montant de livres en biblio en euros "+ +bibliotheque.montantTotalLivreStocke());
		System.out.println("Le nombre de livres en biblio est : "+bibliotheque.nbTotalLivre());
		bibliotheque.afficherListeLivres();
		bibliotheque.supprimerLivre(5678);
		bibliotheque.afficherListeLivres();
		// rechercher un livre 
		bibliotheque.informationLivre();
	}

}
