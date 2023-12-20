package sae;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.io.FileNotFoundException;

import sae.*;

public class InterfaceV2 {
	
	
	
	public static void main(String[] args) throws IOException   {
		List<Film> cinema;
		cinema=main.Array("IMDbmoviesCUT100.tsv");
		int a=0,b=0,c=0,z,d=0, x = 0 ;
		String row = new String();
		String choix;
	while (a==0) {
			c=0;
			System.out.println("===============================================");	
			System.out.println("choisissez le document pour votre recherche : ");
			System.out.println("");
			System.out.println("1. document a 100 lignes");
			System.out.println("2. document a 1000 lignes");
			System.out.println("3. document a 10000 lignes");
			System.out.println("4. document a 40000 lignes");
			System.out.println("5. document complet");
			int y = Clavier.lireInt();
			if (y == 1) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document a 100 lignes");
				choix = "IMDbmoviesCUT100.tsv";
				System.out.println("ArrayList ou LinkedList ?");
				String choixliste = Clavier.lireLigne();
				if (choixliste == "ArrayList") {
					cinema=main.Array(choix);
				}
				if (choixliste == "LinkedList") {
					cinema=main.Linked(choix);
				}
				else {
					System.out.println("Vous devez écrire ArrayList ou LinkedList");
				}
			}
			if (y == 2) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document a 1000 lignes");
				choix = "IMDbmoviesCUT1000.tsv";
				System.out.println("ArrayList ou LinkedList ?");
				String choixliste = Clavier.lireLigne();
				if (choixliste == "ArrayList") {
					cinema=main.Array(choix);
				}
				if (choixliste == "LinkedList") {
					cinema=main.Linked(choix);
				}
				else {
					System.out.println("Vous devez écrire ArrayList ou LinkedList");
				}
			}
			if (y == 3) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document a 10000 lignes");
				choix = "IMDbmoviesCUT10000.tsv";
				System.out.println("ArrayList ou LinkedList ?");
				String choixliste = Clavier.lireLigne();
				if (choixliste == "ArrayList") {
					cinema=main.Array(choix);
				}
				if (choixliste == "LinkedList") {
					cinema=main.Linked(choix);
				}
				else {
					System.out.println("Vous devez écrire ArrayList ou LinkedList");
				}
			}
			if (y == 4) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document a 40000 lignes");
				choix = "IMDbmoviesCUT40000.tsv";
				System.out.println("ArrayList ou LinkedList ?");
				String choixliste = Clavier.lireLigne();
				if (choixliste == "ArrayList") {
					cinema=main.Array(choix);
				}
				if (choixliste == "LinkedList") {
					cinema=main.Linked(choix);
				}
				else {
					System.out.println("Vous devez écrire ArrayList ou LinkedList");
				}
			}
			if (y == 5) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document complet");
				choix = "IMDbmoviesFULL.tsv";
				System.out.println("ArrayList ou LinkedList ?");
				String choixliste = Clavier.lireLigne();
				if (choixliste == "ArrayList") {
					cinema=main.Array(choix);
				}
				if (choixliste == "LinkedList") {
					cinema=main.Linked(choix);
				}
				else {
					System.out.println("Vous devez écrire ArrayList ou LinkedList");
				}
			}
			if (y > 5) {
				System.out.println("============================================");	
				System.out.println("veuillez saisir une valeur valide (entre 1 et 5) ");
				System.out.println("============================================");	
				c=1;
			}
		while (c == 0 ) {	
			System.out.println("============================================");	
			System.out.println("choisissez le mode de votre recherche : ");
			System.out.println("");
			System.out.println("0. Affichage des données");
			System.out.println("1. Filtre");
			System.out.println("2. Tris");
			System.out.println("3. Recherche");
			System.out.println("4. Suppression");
			System.out.println("5. Sauvegarde");
			System.out.println("6. Retour");
			x = Clavier.lireInt();
			if (x == 0) {
				System.out.println("==============================");	
				System.out.println("Vous avez choisi l'affichage des données");
				System.out.println("");
				System.out.println("1. Afficher un film sur deux");
				System.out.println("2. Afficher un film sur dix");	
				System.out.println("3. Afficher un film sur cent");
				System.out.println("4. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. Afficher un film sur deux");
					c=1;
					main.Affichage(cinema);
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Afficher un film sur dix");
					c=1;
				}
				if (z==3) {
					System.out.println("==============================");	
					System.out.println("3. Afficher un film sur cent");
					c=1;
				}
				if (z==4) {
					System.out.println("==============================");	
					System.out.println("3. Retour");
				}
			}
			if (x == 1) {
				System.out.println("==============================");	
				System.out.println("Vous avez choisi le Filtre");
				System.out.println("");
				System.out.println("1. Filtre linéaire");
				System.out.println("2. Filtre java");	
				System.out.println("3. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. Filtre linéaire selectionné");
					System.out.println("==============================");	
					System.out.println("choisissez la classe de filtre");
					System.out.println("1. le titre du film");
					System.out.println("2. l’année de réalisation");
					System.out.println("3. le genre du film");
					System.out.println("4. la durée du film");
					System.out.println("5. le pays de production");
					System.out.println("6. la langue");
					System.out.println("7. le réalisateur");
					System.out.println("8. le scénariste");
					System.out.println("9. liste des acteurs");
					System.out.println("10. le description");
					System.out.println("11. nombre de votes de spectateurs");
					System.out.println("12. la moyenne des votes");
					int xx = Clavier.lireInt();
					if (xx == 1) {
						System.out.println("==============================");	
						System.out.println("1. filtre linéaire par titre de film selectionné");
						System.out.println("Donnez un nom de film");
						String choixTitre = Clavier.lireLigne();
						main.Filtre_Titre(cinema, choixTitre);
						main.Affichage(cinema);
					}
					if (xx == 2) {
						System.out.println("==============================");	
						System.out.println("2. filtre linéaire par année de réalisation de film selectionné");
						System.out.println("Donnez une année");
						int choixAnnee = Clavier.lireInt();
						main.Filtre_Annee(cinema, choixAnnee);
						main.Affichage(cinema);
					}
					if (xx == 3) {
						System.out.println("==============================");	
						System.out.println("3. filtre linéaire par genre de film selectionné");
						System.out.println("Donnez un genre");
						String choixGenre = Clavier.lireLigne();
						main.Filtre_Genre(cinema, choixGenre);
						main.Affichage(cinema);
					}
					if (xx == 4) {
						System.out.println("==============================");	
						System.out.println("4. filtre linéaire par durée de film selectionné");
						System.out.println("Donnez une durée");
						int choixDuree = Clavier.lireInt();
						main.Filtre_Duree(cinema, choixDuree);
						main.Affichage(cinema);
					}
					if (xx == 5) {
						System.out.println("==============================");	
						System.out.println("5. filtre linéaire par pays de production de film selectionné");
						System.out.println("Donnez un pays");
						String choixPays = Clavier.lireLigne();
						main.Filtre_Pays(cinema, choixPays);
						main.Affichage(cinema);
					}
					if (xx == 6) {
						System.out.println("==============================");	
						System.out.println("6. filtre linéaire par langue de film selectionné");
						System.out.println("Donnez une langue");
						String choixLangue = Clavier.lireLigne();
						main.Filtre_Langue(cinema, choixLangue);
						main.Affichage(cinema);
					}
					if (xx == 7) {
						System.out.println("==============================");	
						System.out.println("7. filtre linéaire par réalisateur de film selectionné");
						System.out.println("Donnez un nom de réalisateur");
						String choixReal = Clavier.lireLigne();
						main.Filtre_Realisateur(cinema, choixReal);
						main.Affichage(cinema);
					}
					if (xx == 8) {
						System.out.println("==============================");	
						System.out.println("8. filtre linéaire par scénariste de film selectionné");
						System.out.println("Donnez un nom de scénariste");
						String choixScenar = Clavier.lireLigne();
						main.Filtre_Scenariste(cinema, choixScenar);
						main.Affichage(cinema);
					}
					if (xx == 9) {
						System.out.println("==============================");	
						System.out.println("9. filtre linéaire par liste des acteurs de film selectionné");
						System.out.println("Donnez un acteur");
						String choixActeur = Clavier.lireLigne();
						main.Filtre_Acteurs(cinema, choixActeur);
						main.Affichage(cinema);
					}
					if (xx == 10) {
						System.out.println("==============================");	
						System.out.println("10. filtre linéaire par description de film selectionné");
						System.out.println("Donnez une description");
						String choixDescription = Clavier.lireLigne();
						main.Filtre_Description(cinema, choixDescription);
						main.Affichage(cinema);
					}
					if (xx == 11) {
						System.out.println("==============================");	
						System.out.println("11. filtre linéaire par votes de spectateurs de film selectionné");
						System.out.println("Donnez un nombre de vote");
						int choixVote = Clavier.lireInt();
						main.Filtre_Vote(cinema, choixVote);
						main.Affichage(cinema);
					}
					if (xx == 12) {
						System.out.println("==============================");	
						System.out.println("12. filtre linéaire par moyenne des votes de film selectionné");
						System.out.println("Donnez une moyenne de vote");
						int choixVotemoy = Clavier.lireInt();
						main.Filtre_Moyenne(cinema, choixVotemoy);
						main.Affichage(cinema);
					}
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Filtre java selectionné");
					c=1;
				}
				if (z==3) {
					System.out.println("==============================");	
					System.out.println("3. Retour");
				}
			}
			if (x == 2) {
				System.out.println("==============================");	
				System.out.println("Vous avez choisi le Tris");
				System.out.println("");
				System.out.println("1. tri par sélection");
				System.out.println("2. tri Fusion");
				System.out.println("3. tri java");
				System.out.println("4. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. tri par selection selectionné");
					main.Tri_Selection(cinema);
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. tri fusion selectionné");
					c=1;
				}
				if (z==3) {
					System.out.println("==============================");	
					System.out.println("3. tri java selectionné");
					System.out.println("==============================");	
					System.out.println("choisissez le tri de votre choix");
					System.out.println("1. le tri java par année");
					System.out.println("2. le tri java par titre");
					System.out.println("3. le tri java par note");
					System.out.println("4. le tri java par moyenne");
					System.out.println("5. le tri java par langue");
					System.out.println("6. le tri java par genre");
					System.out.println("7. le tri java par duree");
					System.out.println("8. le tri java par pays");
					int xx = Clavier.lireInt();
					if (xx == 1) {
						System.out.println("==============================");	
						System.out.println("1. Tri java par année");
						main.triJava_Annee(cinema);
						main.Affichage(cinema);
					}
					if (xx == 2) {
						System.out.println("==============================");	
						System.out.println("2. Tri java par titre");
						main.triJava_Titre(cinema);
						main.Affichage(cinema);
					}
					if (xx == 3) {
						System.out.println("==============================");	
						System.out.println("3. Tri java par note");
						main.triJava_Note(cinema);
						main.Affichage(cinema);
					}
					if (xx == 4) {
						System.out.println("==============================");	
						System.out.println("4. Tri java par Moyenne");
						main.triJava_Moyenne(cinema);
						main.Affichage(cinema);
					}
					if (xx == 5) {
						System.out.println("==============================");	
						System.out.println("5. Tri java par Langue");
						main.triJava_Langue(cinema);
						main.Affichage(cinema);
					}
					if (xx == 6) {
						System.out.println("==============================");	
						System.out.println("6. Tri java par Genre");
						main.triJava_Genre(cinema);
						main.Affichage(cinema);
					}
					if (xx == 7) {
						System.out.println("==============================");	
						System.out.println("7. Tri java par Durée");
						main.triJava_Duree(cinema);
						main.Affichage(cinema);
					}
					if (xx == 8) {
						System.out.println("==============================");	
						System.out.println("8. Tri java par Pays");
						main.triJava_Pays(cinema);
						main.Affichage(cinema);
					}
				}
				c=1;
				if (z==4) {
					System.out.println("==============================");	
					System.out.println("4. Retour");
				}
			}
			if (x == 3) {
				System.out.println("==============================");	
				System.out.println("Vous avez choisi la Recherche");
				System.out.println("");
				System.out.println("1. Recherche linéaire");
				System.out.println("2. Recherche dichotomique");
				System.out.println("3. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. Recherche linéaire selectionné");
					System.out.println("Que voulez-vous rechercher ?");
					String recherche = Clavier.lireLigne();
					main.rechercheLineaire(recherche, cinema);
					main.Affichage(cinema);
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Recherche dichotomique selectionné");
					System.out.println("Que voulez-vous rechercher ?");
					String recherche = Clavier.lireLigne();
					main.rechercheDichotomique(recherche, cinema);
					main.Affichage(cinema);
					c=1;
				}
				if (z==3) {
					System.out.println("==============================");	
					System.out.println("3. Retour");
				}
			}
			if (x == 4) {
				System.out.println("==============================");	
				System.out.println("Vous avez choisi le Suppression");
				System.out.println("1. validé la suppression ?");
				System.out.println("2. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. Suppression faite");
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Retour");
				}
			}
			if (x == 5) {
				System.out.println("==============================");	
				System.out.println("Vous avez choisi la Sauvegarde");
				System.out.println("");
				System.out.println("1. Sauvegarde en mode texte");
				System.out.println("2. Sauvegarde en mode binaire");
				System.out.println("3. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. Sauvegarde en mode texte selectionné");
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Sauvegarde en mode binaire selectionné");
					c=1;
				}
				if (z==3) {
					System.out.println("==============================");	
					System.out.println("3. Retour");
				}
			}
			if (x == 6) {
				System.out.println("==============================");	
				System.out.println("retour");
				c=1;
			}
		}
	}
	}
	
}
