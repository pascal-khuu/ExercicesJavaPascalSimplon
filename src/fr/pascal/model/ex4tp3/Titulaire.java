package fr.pascal.model.ex4tp3;

public class Titulaire {
	private String prenom;
	private String nom;
	private String numeroTelephone;
	
	public Titulaire(String prenom, String nom, String numeroTelephone) {
		this.prenom = prenom;
		this.nom = nom;
		this.numeroTelephone = numeroTelephone;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the numeroTelephone
	 */
	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	/**
	 * @param numeroTelephone the numeroTelephone to set
	 */
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	
	
	
	
}
