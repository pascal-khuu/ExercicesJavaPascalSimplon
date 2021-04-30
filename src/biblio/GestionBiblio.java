package biblio;

import java.util.HashMap;
import java.util.Scanner;

public class GestionBiblio {
	private HashMap<Integer, Livre> bibliotheque;
	
	public GestionBiblio() {
		this(new HashMap<Integer, Livre>());
	}
	public GestionBiblio(HashMap<Integer, Livre> bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

	public void ajouterLivre(Livre livre) {
		this.bibliotheque.put(livre.getNumeroISBN(), livre);
	}
	
	public void supprimerLivre(int  numeroISBN) {
		this.bibliotheque.remove(numeroISBN);
		System.out.println("le livre " +numeroISBN+ " a été supprimé" );
	}
	
	public int nbTotalLivre() {
		return this.bibliotheque.size();
	}
	
	public void afficherListeLivres() {
		System.out.println("liste de tous les livres");
		for (Livre livre: this.bibliotheque.values()) {
			System.out.println(livre.toString());
		}
	}
	public int montantTotalLivreStocke() {
		int prixTotal=0;
		for (Livre montant :this.bibliotheque.values()) {
			prixTotal+=montant.getPrix();
		}
		return prixTotal;
	}
	
	public void rechercheLivre(int numeroId) {
		
		for(int numeroIsbn:this.bibliotheque.keySet()) {
			if (numeroIsbn==numeroId) {
				System.out.println("Le Numéro ISBN " + numeroIsbn + " correspond au livre :"+ this.bibliotheque.get(numeroIsbn));
			}
		}
	}
	public void informationLivre () {
		Scanner isbn= new Scanner(System.in);
		System.out.println("veuillez saisir un numéro Isbn");
		int isbnsaisi= isbn.nextInt();
		rechercheLivre(isbnsaisi);
		
	}
	@Override
	public String toString() {
		return "GestionBiblio [bibliotheque=" + bibliotheque + "]";
	}
	
	
}
