package uqam.inf5153.game;

/**
 * Crée par Imen Benzarti le 13/01/2020
 * une classe controlleur du jeu (voir le parton GRASP controlleur)
 * Elle n'implémente aucune des méthodes : elle oriente les actions envoyées par les joueurs 
 * vers les classes responsable de les implémenter.
 */
public class Takenoko {
	
	/**
	 * les parcelles
	 */
	
	/*
	 * Piocher i parcelle de la pioche du joueur joueur 
	 */
	public static String[] piocherParcelles(int i, int joueur) {
		// TODO Auto-generated method stub
		return null;		
	}
	/*
	 * selectionne uneParcelle parmi les parcelles piochés et retourne les autres à la pioche.
	 */
	public static void selectionnerParcelle(String[] parcelles, String uneParcelle ) {
		// TODO Auto-generated method stub		
	}
	/*
	 * afficher un ensemble de parcelles 
	 */
	public static void afficherParcelles(String[] parcelles) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * afficher les parcelles déposé dans le plateau du joueur joueur
	 */
	public static void afficherParcellesPlateau(int joueur) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * placer une parcelle dans la position (x,y) dans le plateau du joueur joueur.
	 * retourne true si la parcelle est bien placée, sinon elle retourne false.
	 */
	public static boolean placerParcelleDansPlateau(String parcelle, int x, int y, int joueur) {
		// TODO Auto-generated method stub
		return true;
		
	}
	/**
	 * piocher une irrigation du joueur 
	 */
	
	/*
	 * piocher une irrigation dans la pioche des irrigation du joueur 
	 * 
	 */
	public static void piocherUneIrrigation(int joueur) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * placer une irrigation entre les parcelles (x1,y1) et (x2, y2) dans le plateau du joueur joueur
	 * retourne true si l'irrigation est bien placée
	 */
	public static boolean placerUneIrrigation( int x1, int y1, int x2, int y2, int joueur) {
		// TODO Auto-generated method stub
		return true;
	}
	/**
	 * objectifs
	 */
	
	/*
	 * retourne tous les objectis piochées par le joueur 
	 */
	public static String[] afficherObjectifsJoueur(int joueur) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * selectionner un objectif un remplir parmi un ensemble d'objectif piochés
	 * retourne l'objectif selectionné
	 */
	public static String selectionnerObjectifARemplir(String[] objectifs) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * le joueur rempli un objectif
	 * retourne true si l'objectif est rempli, sinon elle retourne false. 
	 */
	public static boolean remplirObjectif(int joueur, String objectif) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*
	 * piocher un objectif dans la pioche du joueur
	 */
	public static String piocherObjectif(int joueur) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * jardinier
	 */
	
	/*
	 * placer le jardinier du joueur dans la parcelle dans la position (x,y) de son plateau.
	 * retourne true si le jardinier est déplacé, sinon elle retourne false
	 */
	public static boolean PlacerJardinier(int x, int y, int joueur) {
		// TODO Auto-generated method stub
		return true;
	}

	
		
	/**
	 * panda
	 */
	
	/*
	 * placer le panda du joueur dans la parcelle dans la position (x,y)  de son plateau.
	 * retourne true si le panda est déplacé, sinon elle retourne false
	 */
	public static boolean PlacerPanda(int x, int y, int joueur) {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**
	 * fin DE partie
	 */
	
	/*
	 * retourne true si la partie est terminé.
	 * Pour deux joueur une partie prend fin si un des joueur remplit son 9ème objectif
	 */
	public static boolean finPartie(int tourActuel, int nbtour) {
		// code temporaire
		return tourActuel <= nbtour;
	}
	/**
	 *  Le gagnant
	 */
	
	/*
	 * annonce la gagnant à la fin de la partie.
	 * et ce en calclant le total des points des objectifs remplis.
	 */
	public static int annoncerGagnant() {
		
		return 1;
	}
	
	

}
