package fr.pascal.model.ex4;

import java.util.ArrayList;

public class Enfant {
	private String nom;
	private String prenom;
	private int age;
	private ArrayList<Jouet> cadeaux;
	
	
	//Constructeurs
	public Enfant() {
		this(null,null,0);
	}
	public Enfant (String nom, String prenom, int age) {
		this(nom,prenom,age,new ArrayList<Jouet>());
	}
	
	

	public Enfant (String nom, String prenom, int age,ArrayList<Jouet> cadeaux) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.cadeaux=cadeaux;
		
	}
	
	//méthode afficher
	
	public void afficher() {
		System.out.println(this.nom+" " + " "+this.prenom+ " a comme cadeaux");
		for (int i=0; i<=this.cadeaux.size()-1;i++) {
			System.out.println(this.cadeaux.get(i));
		}
	}
	//Getters & Setters
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the cadeaux
	 */
	public ArrayList<Jouet> getCadeaux() {
		return cadeaux;
	}


	/**
	 * @param cadeaux the cadeaux to set
	 */
	public void setCadeaux(ArrayList<Jouet> cadeaux) {
		this.cadeaux = cadeaux;
	}


	@Override
	public String toString() {
		return "Enfant [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", cadeaux=" + cadeaux + "]";
	}


	/*@Override
	public String toString() {
		return "Enfant [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}*/
	
	
	
}
