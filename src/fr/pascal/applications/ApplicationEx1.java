package fr.pascal.applications;


public class ApplicationEx1 {

	public static void main(String[] args) {
		String formation = "FORMATION-JAVA";
		// char ch1 = formation.charAt(0);
		 afficherLettre(formation);
		afficherLettreEnvers(formation);
			String resultat=afficherLettreEnversIndirect(formation);
		System.out.println(resultat);
	}
	
	public static void afficherLettre(String a) {
		for (int i = 0; i <= a.length() - 1; i++) {
			System.out.println(a.charAt(i));

		}
	}

	public static void afficherLettreEnvers(String a) {
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.println(a.charAt(i));
		}
	}

	public static String afficherLettreEnversIndirect(String a) {
		String result;
		result = null;
		for (int i = a.length() - 1; i >= 0; i--) {
			result = result + a.charAt(i) + "\n";
		}
		return result;
	}
}