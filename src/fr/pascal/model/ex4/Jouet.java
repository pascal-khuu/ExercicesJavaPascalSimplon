package fr.pascal.model.ex4;

public class Jouet {
	private String libelle;
	private Boolean etat=true;
	
	// Constructeurs
	public Jouet() {
		this(null);
	}
	 
	public Jouet(String libelle) {
		this.libelle=libelle;
	}

	public Jouet(String libelle, Boolean etat) {
		this.libelle=libelle;
		this.etat=etat;
	}
	
	// Getters & Setters
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the etat
	 */
	public Boolean getEtat() {
		return etat;
	}

	/**
	 * @param etat the etat to set
	 */
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}


	@Override
	public String toString() {
		return "Jouet [libelle=" + libelle + ", etat=" + etat + "]";
	}
	
	
}
