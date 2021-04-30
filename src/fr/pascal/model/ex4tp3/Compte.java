package fr.pascal.model.ex4tp3;

public class Compte {
	
	// Atributs de la classe Compte
	private static final String enseigne="Statut";
	private static final String rib="12345 6789";
	private static int nbclients;
	//private String nomTitulaire;
	private static int numeroCompte;
	private double soldeDuCompte;
	private Titulaire titulaire;
	
	
	// constructeurs de la classe Compte
	public Compte (Titulaire titulaire) {
		this(titulaire,0);
		
	}
	
	public Compte (Titulaire titulaire, int soldeDuCompte) {
		this.titulaire=titulaire;
		this.soldeDuCompte=soldeDuCompte;
		this.nbclients++;
	}
	
	// méthodes de la classe compte
	// renvoyer le solde du compte
	public int soldeCompte() {
		return this.soldeCompte();
	}
	
	//afficher le solde
	public void afficheSolde() {
		System.out.println("le solde est de:"+this.soldeDuCompte);
	}
	
	//ajouter de l'argent et afficher le nouveau solde
	public void depotargent (int somme) {
		this.soldeDuCompte+=somme;// this.soldeDuCompte= this.soldeDuCompte+somme;
		System.out.println("le solde mis à jour est de " +soldeDuCompte+". ");
	}
	
	// retrait d'argent et afficher le nouveau solde
	public void retrait (int retrait) {
		if (retrait<=this.soldeDuCompte) {
			this.soldeDuCompte-=retrait;//// this.soldeDuCompte= this.soldeDuCompte-retrait;
			System.out.println("le solde mis à jour est après le retrait de "+ retrait + " euros est: "+this.soldeDuCompte+". ");
		}
		else {
			System.out.println("le retrait est impossible");
		}
	}
	// Getters & setters
	/**
	 * @return the clients
	 */
	public static int getClients() {
		return nbclients;
	}

	/**
	 * @param clients the clients to set
	 */
	public static void setClients(int clients) {
		Compte.nbclients = clients;
	}

	

	/**
	 * @return the numeroCompte
	 */
	public int getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the soldeDuCompte
	 */
	public double getSoldeDuCompte() {
		return soldeDuCompte;
	}

	/**
	 * @param soldeDuCompte the soldeDuCompte to set
	 */
	public void setSoldeDuCompte(double soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}

	/**
	 * @return the enseigne
	 */
	public static String getEnseigne() {
		return enseigne;
	}

	/**
	 * @return the rib
	 */
	public static String getRib() {
		return rib;
	}
	
	
	/*@Override
	public String toString() {
		return "Compte [nomTitulaire=" + nomTitulaire + ", numeroCompte=" + numeroCompte + ", soldeDuCompte="
				+ soldeDuCompte + "]";
	}*/

	/**
	 * @return the titulaire
	 */
	public Titulaire getTitulaire() {
		return titulaire;
	}

	/**
	 * @param titulaire the titulaire to set
	 */
	public void setTitulaire(Titulaire titulaire) {
		this.titulaire = titulaire;
	}

	@Override
	public String toString() {
		return "Compte [, numeroCompte=" + numeroCompte+", rib="+Compte.getRib() + ", soldeDuCompte="
				+ soldeDuCompte+ ", enseigne " +Compte.getEnseigne()+",titulaire "+ this.getTitulaire().getPrenom() +  "]";
		
	}
	
	
	
}