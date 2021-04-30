package fr.pascal.applications;
import fr.pascal.applications.Fonctions;
public class ApplicationEx2 {

	public static void main(String[] args) {
		String mot = "kayak";
		String mot2 = "kkkayakooo";
		String s;
		Fonctions f1 =new Fonctions();
		if (f1.comparerMotInclus(mot, mot2)) {
			System.out.println("le mot est inclus");
		} else {
			System.out.println("le mot n'est pas inclus");
		}

		if (f1.comparerMot(f1.MotEnvers(mot), mot)) {
			System.out.println("c'est un palindrome");
		} else {
			System.out.println("ce n'est pas un palindrome");
		}

	}

	
}
