package nombrehasard;

public class Hasard {
	private int[] tableau;
	private int moyenne;
	private int somme;

	public Hasard() {
		//int[] tableau = new int[10];
		this(10);
	}
	
	public Hasard(int dimension) {
		this.tableau = new int[dimension];
		int nombreAleatoire;
		for (int i = 0; i < this.tableau.length; i++) {
			nombreAleatoire = (int) (Math.random() * 100);
			this.tableau[i] = (int) nombreAleatoire;
		}
	}

	public void afficher() {
		contenu();
		System.out.println("Moyenne : " + this.calculerMoyenne());
		System.out.println("Somme : " + this.somme());
	}

	// contenu du tableau
	public void contenu() {
		System.out.println("contenu du tableau");
		for (int i = 0; i < this.tableau.length; i++) {
			System.out.print(this.tableau[i] + " ");
		}
		System.out.println();
	}

	

	public int calculerMoyenne() {
		int moyenne = 0;
		for (int i = 0; i <= this.tableau.length - 1; i++) {
			moyenne = (moyenne + this.tableau[i]);
		}
		return moyenne / this.tableau.length;
	}

	public void afficherNombreSupMoyenne() {
		System.out.println("Les nombre supérieures du tableau sont :");
		for (int i = 0; i <= this.tableau.length - 1; i++) {
			if (this.tableau[i] > calculerMoyenne()) {
				System.out.println(this.tableau[i]);
			}
		}
	}

	public void ajouter(int nombre) {
		tableau[this.tableau.length - 1] = nombre;
	}

	public void ajouterEnPlus(int parametre) {
		for (int i = 0; i < this.tableau.length - 1; i++) {
			this.tableau[i] += parametre;
		}
	}

	public int somme() {
		int somme = 0;
		for (int i = 0; i <= this.tableau.length - 1; i++) {
			somme += this.tableau[i];
		}
		return somme;
	}

}
