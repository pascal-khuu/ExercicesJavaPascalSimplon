package nombrehasard;

public class ApplicationEx3 {

	public static void main(String[] args) {
		Hasard hTest = new Hasard(3);
		hTest.afficher();
		hTest.afficherNombreSupMoyenne();
		hTest.ajouterEnPlus(5);
		System.out.println("La moyenne après ajoute de 5 est "+hTest.calculerMoyenne());
		hTest.afficher();

	}

}
