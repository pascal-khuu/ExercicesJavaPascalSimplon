package biblio;

public class Livre {
	private int numeroISBN;
	private String titre;
	private int prix;
	
	public Livre() {
		this(0,null,0);
	}

	public Livre(int numeroISBN, String titre, int prix) {
		this.numeroISBN = numeroISBN;
		this.titre = titre;
		this.prix = prix;
	}

	/**
	 * @return the numéroISBN
	 */
	public int getNumeroISBN() {
		return numeroISBN;
	}

	/**
	 * @param numéroISBN the numéroISBN to set
	 */
	public void setNumeroISBN(int numeroISBN) {
		this.numeroISBN = numeroISBN;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Livre [numeroISBN=" + numeroISBN + ", titre=" + titre + ", prix=" + prix + "]";
	}
	
	
	
}
