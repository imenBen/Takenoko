package uqam.inf5153.game;




/**
 * Crée par Imen Benzarti le 13/01/2020
 * Une classe qui joue le role de l'interface graphique du jeu.
 * Elle reçoit les actions des joueurs a partir de la ligne de commande.
 */
public class Main {
	public final static int NB_ACTIONS_PAR_TOUR = 2;
	public final static int NB_TOTAL_JOUEUR =  2 ; 
	/* Une constante fictive pour représenter temporairement le dernier tour 
	 * Sinon vous devez implémenter le jeu tel que la partie prend fin lorsqu’un joueur atteint 
	 * son 9e objectif s
	 * La fin de partie est detecté à travers la méthode Partie
	 */
	public final static int nbTour = 3;

	/*
	 * numéro du tour actuel : vous avec le choix de garder ou non cette variable qui représente
	 * le numéro du tour actuel.
	 */
	static int tourActuel = 1;
	public static void main(String[] args) {
		bienvenue();
		   }
		private static void bienvenue() {
			String swValue;
		    System.out.println("==========================================================================");
		    System.out.println("|   Bienvenu au jeu TAKENOKO                                             ");
		    System.out.println("==========================================================================");
		    System.out.println("| Pour commencer une nouvelle partie appuyer sur ENTREE:                 ");
		    System.out.println("==========================================================================");
		    do{
		    	swValue = Keyin.inString();
		    }while (swValue.length() != 0 );
		    do {
		    	for (int i=1; i<=NB_TOTAL_JOUEUR; i++)
		    		menuJoueur(i);
		    	
		    }while (Takenoko.finPartie(tourActuel, nbTour) );
		    System.out.println("Le gagnant est le joueur : "+ Takenoko.annoncerGagnant());
		}
		
		
		private static void menuJoueur(int numJoueur) {
			
			int swValue;
		    System.out.println("\n\n\n==========================================================================");
		    System.out.println("|   TAKENOKO -- MENU JOUEUR " +numJoueur+ "                              ");
		    System.out.println("==========================================================================");
		    System.out.println("| Options:                                                               ");
		    System.out.println("|        1. Déterminer les condition Climatiques                         ");
		    System.out.println("|        2. Effectuer des actions                                        ");
		    System.out.println("|        3. Quitter le jeu                                        ");
		    System.out.println("==========================================================================");
		    swValue = Keyin.inInt(" Selectionner une option: ");
		    switch (swValue) {
		    case 1:
		      System.out.println("Déterminer les condition Climatiques");
		      System.out.println("Cette fonctionnalité sera réalisée dans la deuxième partie  du projet");
		      break;
		    case 2:
		      System.out.println("\n\n\nEffectuer des actions\n\n\n");
		      choixAction(numJoueur);
		      break;
		    case 3:
			      System.out.println("\n\n\nFin du jeu\n\n\n");
			      System.exit(0);
			      break;
		    default:
		      System.out.println("Selection invalide");
		      break; 
		    }
		}
		/*
		 * Actions
		 */
		private static void choixAction(int numJoueur) {
			
			int nbActions = NB_ACTIONS_PAR_TOUR;
			int swValue;
		    System.out.println("==========================================================================");
		    System.out.println("|   TAKENOKO MENU JOUEUR " +numJoueur+ " : Actions                       ");
		    System.out.println("==========================================================================");
		    System.out.println("|		Le joueur effectue deux actions par tour parmi les                  ");
		    System.out.println("|		5 actions disponibles                                                   ");
		    System.out.println("==========================================================================");
		    
		    while (nbActions > 0) {
		    	System.out.println("\n\n--------------------------------------------------------------------------\n\n");
		    	System.out.println("| Choix de l'action "+ (NB_ACTIONS_PAR_TOUR-nbActions + 1  ) +" :                                              ");
		    	System.out.println("\n\n--------------------------------------------------------------------------\n\n");
		    	System.out.println("|        1. Parcelles                                                ");
			    System.out.println("|        2. Canal irrigation                                         ");
			    System.out.println("|        3. Jardinier                                                ");
			    System.out.println("|        4. Panda                                                    ");
			    System.out.println("|        5. Objectif                                                 ");
			    System.out.println("======================================================================");
			    swValue = Keyin.inInt(" Selectionner une option: ");
			    switch (swValue) {
			    case 1:
			      System.out.println("\n\n\nPiocher 3 parcelles et en choisir une\n\n\n");
			      choixParcelle(numJoueur);
				  break;
			    case 2:
			      System.out.println("\n\n\nPrendre une irrigation\n\n\n");
			      prendreIrrigation(numJoueur);
			      break;
			    case 3:
			      System.out.println("\n\n\nDéplacer le jardinier\n\n\n");
			      deplacerJardinier(numJoueur);
			      break;
			    case 4:
			      System.out.println("\n\n\nDéplacer le panda\n\n\n");
			      deplacerPanda(numJoueur);
			      break;
			    case 5:
			      System.out.println("\n\n\nPiocher une carte objectif\n\n\n");
			      piocherObjectif(numJoueur);
			      break;
			    default:
			      System.out.println("Selection invalide");
			      nbActions = nbActions + 1;
			      break; 
			    }
			    nbActions = nbActions - 1;
		    }
		    autresDecisions(numJoueur);
		    
		    
		    
		}
		private static void choixParcelle(int numJoueur) {
			
		    System.out.println("===========================================================================");
		    System.out.println("|   TAKENOKO MENU JOUEUR " +numJoueur+ " : Action Parcelle                        ");
		    System.out.println("===========================================================================");       
		    System.out.println("Étape 1 - Piocher 3 parcelles ");
		    String[] parcelles = Takenoko.piocherParcelles(3, numJoueur);
		    System.out.println("Étape 2 - Vous avez pioché les parcelles suivantes : "); 
		    Takenoko.afficherParcelles(parcelles);
		    System.out.println("Étape 3 - Choisir une");
		    String parcelleChosie = Keyin.inString(" Entrer la parcelle choisie : ");
		    System.out.println("Étape 4 - Replacer les deux autres sous la pioche");
		    Takenoko.selectionnerParcelle(parcelles, parcelleChosie );
		    System.out.println("Étape 5 - Afficher les parcelles du plateau");
		    Takenoko.afficherParcellesPlateau(numJoueur);
		    System.out.println("Étape 6 - Placer une parcelle dans la position (x,y) ");
		    int x = Keyin.inInt(" Entrer la position x : ");
		    int y = Keyin.inInt(" Entrer la position y : ");
		    if (Takenoko.placerParcelleDansPlateau(parcelleChosie, x, y,  numJoueur))
		    	System.out.println("La parcelle est bien placée ");
		    else 
		    	System.out.println("La parcelle n'est pas placée");
			      	    
		}
		private static void prendreIrrigation(int numJoueur) {
			
		    System.out.println("===========================================================================");
		    System.out.println("|   TAKENOKO MENU JOUEUR " +numJoueur+ " : Action Irrigation                        ");
		    System.out.println("===========================================================================");                                              
		    Takenoko.piocherUneIrrigation(numJoueur);
		    System.out.println("|        Une irrigation est prise                                 ");
		    
		    System.out.println("|        Voulez-vous la placer   ?                             ");
		    int reponse = Keyin.inChar(" réponse (O/N) : ");
		    if (reponse == 'o' || reponse == 'O' ) {
		    	placerIrrigation(numJoueur);
		    }   
		 	      	    
		}
		private static void deplacerJardinier(int numJoueur) {
			
		    System.out.println("==========================================================================");
		    System.out.println("|   TAKENOKO MENU JOUEUR " +numJoueur+ " : Action Jardiner                        ");
		    System.out.println("==========================================================================");                                              
		    System.out.println("|        Afficher les parcelles du plateau  (les positions)              ");
		    Takenoko.afficherParcellesPlateau(numJoueur);
		    System.out.println("|        Précisier la nouvelle parcelle (position x,y) du Jardinier      ");
		    int x = Keyin.inInt(" Entrer la position x : ");
		    int y = Keyin.inInt(" Entrer la position y : ");
		    Takenoko.PlacerJardinier(x,y, numJoueur );
		    
  
			      	    
		}
		private static void deplacerPanda(int numJoueur) {
			
		    System.out.println("==========================================================================");
		    System.out.println("|   TAKENOKO MENU JOUEUR " +numJoueur+ " : Action Panda                         ");
		    System.out.println("==========================================================================");                                              
		    System.out.println("|        Afficher les parcelles du plateau  (les positions)                                   ");
		    Takenoko.afficherParcellesPlateau(numJoueur);
		    System.out.println("|        Précisier la nouvelle parcelle (position x,y) du Panda                   ");
		    
		    int x = Keyin.inInt(" Entrer la position x : ");
		    int y = Keyin.inInt(" Entrer la position y : ");
		    Takenoko.PlacerPanda(x,y, numJoueur );
		}
		private static void piocherObjectif(int numJoueur) {
			
		    System.out.println("==========================================================================");
		    System.out.println("|   TAKENOKO MENU JOUEUR " +numJoueur+ " : Action Objectif                        ");
		    System.out.println("==========================================================================");    
		    String objectif = Takenoko.piocherObjectif(numJoueur);
		    System.out.println("|        Cet objectif est pioché                                  ");
		    System.out.println("|        Pouvez vous le remplir tout de suite (O/N)  ?         ");
		    int reponse = Keyin.inChar(" réponse (O/N) : ");
		    if (reponse == 'o' || reponse == 'O' ) {
		    	remplirUnObjectif(numJoueur, objectif);
		    }   
		    System.out.println("|        Si oui, appliquer l'objectif sur le plateau du joueur     ");			      	    
		}
		
		/*
		 * Décisions 
		 */
		
		private static void autresDecisions(int numJoueur) {
			int swValue;
			System.out.println("\n\n\n");
			System.out.println("=========================================================================");
		    System.out.println("|   TAKENOKO MENU JOUEUR " +numJoueur+ " : Autres Décisions       ");
		    System.out.println("=========================================================================");			  
			System.out.println("|Pendant un tour un joueur peut prendre des décisions qui");
		    System.out.println("|ne comptent pas pour des actions                            ");
		   do{
 			    System.out.println("\n\n--------------------------------------------------------------------------\n\n");
		    	System.out.println("| Choix de décision                                      ");
		    	System.out.println("\n\n--------------------------------------------------------------------------\n\n");
		    	
		    	System.out.println("|        1. Remplir un objectif                          ");
			    System.out.println("|        2. Placer des irrigations                       ");
			    System.out.println("|        3. Fin du tour                                  ");
			    swValue = Keyin.inInt(" Selectionner une option: ");
			    switch (swValue) {
			    case 1:
			      System.out.println("\n\n\nRemplir un objectif\n\n\n");
			      remplirObjectif(numJoueur);
				  break;
			    case 2:
			      System.out.println("\n\n\nPlacer des irrigations\n\n\n");
			      placerIrrigation(numJoueur);			      
			      break;
			    case 3:
			      System.out.println("Fin du tour"); 
			      break;
			    default:
			      System.out.println("Selection invalide");
			      break; 
			    }
		    }while (swValue != 3);
		}
		private static void placerIrrigation(int numJoueur) {
			System.out.println("=========================================================================");
		    System.out.println("|  TAKENOKO MENU JOUEUR " +numJoueur+ ": décide de placer une irrigation     ");
		    System.out.println("=========================================================================");			  
			
			Takenoko.afficherParcellesPlateau(numJoueur);
	    	System.out.println("|        Si oui, afficher les parcelles du plateau (les positions)     ");	   
	    	System.out.println("|        Préciser les deux parcelles (x1,y1) et (x2, y2) séparés par l'irrigation ");
	    	int x1 = Keyin.inInt(" Entrer la position x1 : ");
		    int y1 = Keyin.inInt(" Entrer la position y1 : ");
		    int x2 = Keyin.inInt(" Entrer la position x2 : ");
		    int y2 = Keyin.inInt(" Entrer la position y2 : ");
	    	if (Takenoko.placerUneIrrigation ( x1, y1, x2, y2, numJoueur ))
	    		System.out.println("L'irrigation est bien placée");
	    	else 
	    		System.out.println("l'irrigation n'est pas placée");
			
		}
		private static void remplirObjectif(int numJoueur) {
			System.out.println("=========================================================================");
		    System.out.println("|  TAKENOKO MENU JOUEUR " +numJoueur+ ": décide de remplir un objectif");
		    System.out.println("=========================================================================");			  
			
			 System.out.println("|        Afficher les objectifs du jour");
			 String[] objectifs = Takenoko.afficherObjectifsJoueur (numJoueur);
			 System.out.println("|        Choisir un objectif à remplir ");
			 String objectif = Takenoko.selectionnerObjectifARemplir (objectifs);
			 remplirUnObjectif( numJoueur,  objectif);
						
		}
		private static void remplirUnObjectif(int numJoueur, String objectif) {
			 
			 boolean estRempli = Takenoko.remplirObjectif (numJoueur, objectif);
			 if (estRempli)
				 System.out.println("Félicitations! objectif rempli");
			 else 
				 System.out.println("Objectif irréalisable pour le moment");
						
		}
		
		
		
	}
