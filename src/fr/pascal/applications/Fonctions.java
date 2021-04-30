package fr.pascal.applications;

public class Fonctions {

	public static boolean comparerMotInclus(String mot1, String mot2) {
		StringBuilder result = new StringBuilder();
		boolean b = true;
		int nb;// pour éviter les doublons
		// Parcours du mot inclus
		for (int j = 0; j <= mot1.length() - 1; j++) {
			// parcours du mot complet
			nb = 1;
			for (int i = 0; i <= mot2.length() - 1; i++) {
				if ((mot1.charAt(j) == mot2.charAt(i)) && (nb == 1)) { // nb==0 une seule fois
					result.append(mot1.charAt(j));
					System.out.println(result);
					nb--;
					if (result.toString().equals(mot1)) {
						b = true;
					} else {

						b = false;
					}

				}

			}

		}
		return b;

	}

	public static boolean comparerMot(String mot1, String mot2) {
		int nb;
		/*for (int i = 0; i <= mot1.length() - 1; i++) {
			nb=1;
			for (int j = 0; j <= mot2.length() - 1; j++) {
				if (mot1.charAt(i) == mot2.charAt(j)&&(nb==1)) {
					System.out.println(mot1.charAt(i)+""+ mot2.charAt(j));
				nb--;
				} else {
					return false;
				}
			}
			*/
		if (mot1.contentEquals(mot2)) {
			return true;

		}
		else {
			return false;
		}
	}

	public static String MotEnvers(String a) {
		StringBuilder result = new StringBuilder();
		String r1;
		for (int i = a.length() - 1; i >= 0; i--) {

			result.append(a.charAt(i));
			System.out.println(result);
		}
		r1 = result.toString();
		return r1;
	}

}
