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
				System.out.println("1. Filtre lin�aire");
				System.out.println("2. Filtre java");	
				System.out.println("3. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. Filtre lin�aire selectionn�");
					System.out.println("==============================");	
					System.out.println("choisissez la classe de filtre");
					System.out.println("1. le titre du film");
					System.out.println("2. l�ann�e de r�alisation");
					System.out.println("3. le genre du film");
					System.out.println("4. la dur�e du film");
					System.out.println("5. le pays de production");
					System.out.println("6. la langue");
					System.out.println("7. le r�alisateur");
					System.out.println("8. le sc�nariste");
					System.out.println("9. liste des acteurs");
					System.out.println("10. le description");
					System.out.println("11. nombre de votes de spectateurs");
					System.out.println("12. la moyenne des votes");
					int xx = Clavier.lireInt();
					if (xx == 1) {
						System.out.println("==============================");	
						System.out.println("1. filtre lin�aire par titre de film selectionn�");
					}
					if (xx == 2) {
						System.out.println("==============================");	
						System.out.println("2. filtre lin�aire par ann�e de r�alisation de film selectionn�");
					}
					if (xx == 3) {
						System.out.println("==============================");	
						System.out.println("3. filtre lin�aire par genre de film selectionn�");
					}
					if (xx == 4) {
						System.out.println("==============================");	
						System.out.println("4. filtre lin�aire par dur�e de film selectionn�");
					}
					if (xx == 5) {
						System.out.println("==============================");	
						System.out.println("5. filtre lin�aire par pays de production de film selectionn�");
					}
					if (xx == 6) {
						System.out.println("==============================");	
						System.out.println("6. filtre lin�aire par langue de film selectionn�");
					}
					if (xx == 7) {
						System.out.println("==============================");	
						System.out.println("7. filtre lin�aire par r�alisateur de film selectionn�");
					}
					if (xx == 8) {
						System.out.println("==============================");	
						System.out.println("8. filtre lin�aire par sc�nariste de film selectionn�");
					}
					if (xx == 9) {
						System.out.println("==============================");	
						System.out.println("9. filtre lin�aire par liste des acteurs de film selectionn�");
					}
					if (xx == 10) {
						System.out.println("==============================");	
						System.out.println("10. filtre lin�aire par description de film selectionn�");
					}
					if (xx == 11) {
						System.out.println("==============================");	
						System.out.println("11. filtre lin�aire par votes de spectateurs de film selectionn�");
					}
					if (xx == 12) {
						System.out.println("==============================");	
						System.out.println("12. filtre lin�aire par moyenne des votes de film selectionn�");
					}
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Filtre java selectionn�");
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
				System.out.println("1. tri par s�lection");
				System.out.println("2. tri Fusion");
				System.out.println("3. tri java");
				System.out.println("4. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. tri par selection selectionn�");
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. tri fusion selectionn�");
					c=1;
				}
				if (z==3) {
					System.out.println("==============================");	
					System.out.println("3. tri java selectionn�");
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
				System.out.println("1. Recherche lin�aire");
				System.out.println("2. Recherche dichotomique");
				System.out.println("3. Retour");
				z=Clavier.lireInt();
				if (z==1) {
					System.out.println("==============================");	
					System.out.println("1. Recherche lin�aire selectionn�");
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Recherche dichotomique selectionn�");
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
				System.out.println("1. valid� la suppression ?");
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
					System.out.println("1. Sauvegarde en mode texte selectionn�");
					c=1;
				}
				if (z==2) {
					System.out.println("==============================");	
					System.out.println("2. Sauvegarde en mode binaire selectionn�");
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