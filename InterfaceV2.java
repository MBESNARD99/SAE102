package codes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InterfaceV2 {
	
	public static void main(String[] args) throws IOException   {
		int a=0,b=0,c=0,z,d=0, x = 0 ;
		String row = new String();		
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
				BufferedReader tsvReader = new BufferedReader(new FileReader("IMDbmoviesCUT100.tsv"));
				row = tsvReader.readLine();
				String[] data = row.split("\t");
			}
			if (y == 2) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document a 1000 lignes");
				BufferedReader tsvReader = new BufferedReader(new FileReader("IMDbmoviesCUT1000.tsv"));
				row = tsvReader.readLine();
				String[] data = row.split("\t");
			}
			if (y == 3) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document a 10000 lignes");
				BufferedReader tsvReader = new BufferedReader(new FileReader("IMDbmoviesCUT10000.tsv"));
				row = tsvReader.readLine();
				String[] data = row.split("\t");
			}
			if (y == 4) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document a 40000 lignes");
				BufferedReader tsvReader = new BufferedReader(new FileReader("IMDbmoviesCUT40000.tsv"));
				row = tsvReader.readLine();
				String[] data = row.split("\t");
			}
			if (y == 5) {
				System.out.println("============================================");	
				System.out.println("Vous avez choisi le document complet");
				BufferedReader tsvReader = new BufferedReader(new FileReader("IMDbmoviesFULL.tsv"));
				row = tsvReader.readLine();
				String[] data = row.split("\t");
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
			System.out.println("1. Filtre");
			System.out.println("2. Tris");
			System.out.println("3. Recherche");
			System.out.println("4. Suppression");
			System.out.println("5. Sauvegarde");
			System.out.println("6. Retour");
			x = Clavier.lireInt();
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
					}
					if (xx == 2) {
						System.out.println("==============================");	
						System.out.println("2. filtre linéaire par année de réalisation de film selectionné");
					}
					if (xx == 3) {
						System.out.println("==============================");	
						System.out.println("3. filtre linéaire par genre de film selectionné");
					}
					if (xx == 4) {
						System.out.println("==============================");	
						System.out.println("4. filtre linéaire par durée de film selectionné");
					}
					if (xx == 5) {
						System.out.println("==============================");	
						System.out.println("5. filtre linéaire par pays de production de film selectionné");
					}
					if (xx == 6) {
						System.out.println("==============================");	
						System.out.println("6. filtre linéaire par langue de film selectionné");
					}
					if (xx == 7) {
						System.out.println("==============================");	
						System.out.println("7. filtre linéaire par réalisateur de film selectionné");
					}
					if (xx == 8) {
						System.out.println("==============================");	
						System.out.println("8. filtre linéaire par scénariste de film selectionné");
					}
					if (xx == 9) {
						System.out.println("==============================");	
						System.out.println("9. filtre linéaire par liste des acteurs de film selectionné");
					}
					if (xx == 10) {
						System.out.println("==============================");	
						System.out.println("10. filtre linéaire par description de film selectionné");
					}
					if (xx == 11) {
						System.out.println("==============================");	
						System.out.println("11. filtre linéaire par votes de spectateurs de film selectionné");
					}
					if (xx == 12) {
						System.out.println("==============================");	
						System.out.println("12. filtre linéaire par moyenne des votes de film selectionné");
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
					c=1;
				}
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
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Recherche dichotomique selectionné");
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