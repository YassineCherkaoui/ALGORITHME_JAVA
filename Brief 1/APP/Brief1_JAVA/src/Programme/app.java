package Programme;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable
		String name;
		String prenom;
		int houre;
		int tarif;
		double extarif;
		int prixtotal;
		int nextarif;
		int exprixtotal;
		int finalprix;
		int choix;
		
	
		Scanner scanner = new Scanner (System.in);
		//Afficher un message d’accueil
		System.out.println("------------Bienvenue dans notre société------------");
		System.out.println("------------Page d’accueil------------");
		System.out.println("------------Voir Votre Salaire cette semaine(1)------------");
		System.out.println("------------Qutter(2)------------");
		System.out.print("Choix : ");
		choix = scanner.nextInt();
			
		switch (choix) {
		case 1: 
			//Inviter l’utilisateur d’introduire le nom est le prénom
			System.out.println("Entre Vote Nom SVP!:");
			name = scanner.next();
			System.out.println("Entre Vote Prenom SVP!:");
			prenom = scanner.next();
			// Afficher un message de bienvenue au nom de l’utilisateur
			System.out.println("Bienvenu "+name+" "+prenom);
			//Inviter l’utilisateur d’introduire le nombre d’heures travaillées
			System.out.println("Introduire le nombre d’heures travaillées SVP!");
			houre = scanner.nextInt();
			System.out.println("introduire le tarif par heure");
			tarif = scanner.nextInt();

			//Si le nombre d’heures ne dépasse pas 40 
			//inviter l’utilisateur à introduire le tarif par heure
			if (houre<40) {
				//Afficher le message suivant : votre indemnisation est de xxx MAD
				prixtotal = houre*tarif;
				System.out.println("votre indemnisation est de "+prixtotal+" MAD");
			}
			if (houre >= 40 && houre <= 60) {
		nextarif = houre-40;
		extarif = nextarif + (0.5*nextarif);//extra houre tarif
		prixtotal = houre*nextarif;
		exprixtotal = houre*40;
		finalprix = prixtotal+exprixtotal;
		
		System.out.println("votre indemnisation est de "+finalprix+" MAD");
			}
			if (houre>60) {
				//Si le nombre d’heures dépassent 60, afficher un message : informations erronés !
				System.out.println("informations erronés !");
			}	
			

		case 2 :
			System.out.println("quitter");
			System.out.println("bye XC");

			
			

			
		
		default:
			return;
		}

		
		
		
		
		}}	
		
	

