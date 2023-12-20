package sae;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class main {


	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader tsvReader = new BufferedReader(new FileReader("IMDbmoviesCUT100.tsv"));
		String row=new String();
		row = tsvReader.readLine();
		
		LinkedList<Film> cinema = new LinkedList<Film>();
		while ((row = tsvReader.readLine()) != null) {
	        String[] data = row.split("\t");
			cinema.add(new Film(data[1],data[3],data[5],data[6],data[7],data[8],data[9],data[10],data[12],data[13],data[15],data[14]));
		}
		
		
		BufferedReader tsvReader2 = new BufferedReader(new FileReader("IMDbmoviesCUT100.tsv"));
		String row2=new String();
		row2 = tsvReader2.readLine();
		
		ArrayList<Film> cinema2 = new ArrayList<Film>();
		while ((row2 = tsvReader2.readLine()) != null) {
	        String[] data = row2.split("\t");
			cinema2.add(new Film(data[1],data[3],data[5],data[6],data[7],data[8],data[9],data[10],data[12],data[13],data[15],data[14]));
		}
		
		
		Tri_Selection(cinema);
		Affichage(cinema);
		//rechercheDichotomique("Talla",cinema);
		//rechercheLineaire("Talla",cinema);
	}
	
	public static List<Film> Linked(String choix) throws IOException{
		BufferedReader tsvReader = new BufferedReader(new FileReader(choix));
		String row=new String();
		row=tsvReader.readLine();

		List<Film> cinema= new LinkedList<Film>();

		while ((row = tsvReader.readLine()) != null) {
			String[] data = row.split("\t");
			cinema.add(new Film(data[1], data[3], data[5], data[6], data[7], data[8], data[9], data[10], data[12], data[13], data[15], data[14]));
		}
		return cinema;
	}
	public static List<Film> Array(String choix) throws IOException{
		BufferedReader tsvReader = new BufferedReader(new FileReader(choix));
		String row=new String();
		row=tsvReader.readLine();

		List<Film> cinemaArray= new LinkedList<Film>();

		while ((row = tsvReader.readLine()) != null) {
			String[] data = row.split("\t");
			cinemaArray.add(new Film(data[1], data[3], data[5], data[6], data[7], data[8], data[9], data[10], data[12], data[13], data[15], data[14]));
		}
		return cinemaArray;
	}
	
	public static void Affichage(List<Film> list) {

	    Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	System.out.println(c+" :"+it.next());
	    	c+=1;
	    }
	}
	
	public static void Tri_Selection(List<Film> list) {

	    ListIterator<Film> iterator = list.listIterator();

	    // Tant que la liste n'a pas été parcourue entièrement
	    while (iterator.hasNext()) {
	        Film actuel = iterator.next();                  // On récupère l'élément actuel
	        int minIndex = iterator.previousIndex();            // On initialise l'index du minimum à l'index actuel
	        Film min = actuel;                              // On initialise le minimum à l'élément actuel

	        // On parcourt la liste à partir de l'élément suivant
	        ListIterator<Film> iterator2 = list.listIterator(minIndex);

	        while (iterator2.hasNext()) {

	            Film actualFilm = iterator2.next();
	            int index = iterator2.previousIndex();

	            // Si la valeur actuelle est plus petite que la valeur minimale, on met à jour le minimum
	            if (actualFilm.viewerVotes < min.viewerVotes) {
	                minIndex = index;
	                min = actualFilm;
	            }
	        }

	        // On échange le minimum avec l'élément actuel
	        iterator.set(min);
	        list.set(minIndex, actuel);
	    }

	}

	public static void triFusion(List<Film> list, int g, int d){

        if (g < d) {
            int m = ((d - g) / 2) + g;
            triFusion(list, g, m);
            triFusion(list, m + 1, d);
            fusionner(list, g, m, d);
        }

    }
	
	public static void fusionner(List<Film> list, int g, int m, int d) {

        Film[] result = new Film[d - g + 1];

        int pivotGauche = g;
        int pivotDroite = m + 1;
        int k = 0;

        while (pivotGauche <= m && pivotDroite <= d) {

            if (list.get(pivotGauche).averageVotes < list.get(pivotDroite).averageVotes) {
                result[k] = list.get(pivotGauche);
                pivotGauche++;
            } else {
                result[k] = list.get(pivotDroite);
                pivotDroite++;
            }

            k++;

        }

        while (pivotGauche <= m) {
            result[k] = list.get(pivotGauche);
            pivotGauche++;
            k++;
        }

        while (pivotDroite <= d) {
            result[k] = list.get(pivotDroite);
            pivotDroite++;
            k++;
        }

        //Transfert du tampon
        for (int i = 0; i < result.length; i++) {
            list.set(i + g, result[i]);
        }

    }
	
	
	public static void Filtre_Titre(List<Film> list,String t) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.title.contains(t))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Annee(List<Film> list,int a) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.releaseYear == a)) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Genre(List<Film> list,String g) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.genres.contains(g))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Duree(List<Film> list,int d) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.duration == d)) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Pays(List<Film> list,String p) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.country.contains(p))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Langue(List<Film> list,String l) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.language.contains(l))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Realisateur(List<Film> list,String r) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.director.contains(r))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Scenariste(List<Film> list,String s) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.writer.contains(s))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Acteurs(List<Film> list,String a) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.actors.contains(a))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Description(List<Film> list,String d) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.description.contains(d))) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Vote(List<Film> list,int v) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.viewerVotes == v)) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	public static void Filtre_Moyenne(List<Film> list,double m) {
		Iterator<Film> it = list.iterator();
	    int c=1;
	    while (it.hasNext()){
	    	Film film = it.next();
	    	if (!(film.averageVotes == m)) {
	    		it.remove();
	    	}
	    	c+=1;	
	    }
	  }
	
	public static void Filtre_Java_Titre(List<Film> list, String t) {
		list.removeIf(f -> !f.getTitre().contains(t));
	}
	
	public static void Suppression(List<Film> list) {
		Iterator<Film> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
		}
	}
	
	
	public static void triJava_Annee(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.releaseYear);
		
		Collections.sort(list, comparator);
	}

	public static void triJava_Titre(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.title);
		
		Collections.sort(list, comparator);
	}
	
	public static void triJava_Note(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.viewerVotes);
		
		Collections.sort(list, comparator);
	}

	public static void triJava_Moyenne(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.averageVotes);
		
		Collections.sort(list, comparator);
	}

	public static void triJava_Langue(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.language);
		
		Collections.sort(list, comparator);
	}

	public static void triJava_Genre(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.genres);
		
		Collections.sort(list, comparator);
	}

	public static void triJava_Duree(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.duration);
		
		Collections.sort(list, comparator);
	}

	public static void triJava_Pays(List<Film> list) {
		Comparator<Film> comparator = null;
		comparator = Comparator.comparing(f -> f.country);
		
		Collections.sort(list, comparator);
	}
	
	
	public static void rechercheDichotomique(String value, List<Film> list) {

        //Tri la liste en fonction des titres
        triJava_Titre(list);

        //Recherche dichotomique
        int indexBas = 0;
        int indexHaut = list.size() - 1;

        while (indexBas <= indexHaut) {
            int indexMilieu = (indexBas + indexHaut) / 2;
            Film currentFilm = list.get(indexMilieu);
            int comparison = currentFilm.title.toLowerCase().compareTo(value);

            if (comparison < 0) {
                // L'élément se situe plus bas
                indexBas = indexMilieu + 1;
            } else if (comparison > 0) {
                // L'élément se situe plus haut
                indexHaut = indexMilieu - 1;
            } else {
                // Correspondance trouvée
                System.out.println(currentFilm.toString());
                return;
            }
        }

        //Aucun film n'a été trouver
        System.out.println("Aucun film ne correspond");

    }
    public static void rechercheLineaire(String value, List<Film> list) {

        //Recherche
        Iterator<Film> it = list.iterator();
        while (it.hasNext()) {
            Film current = it.next();
            if (current.title.toLowerCase().contains(value)) {
                //Le titre correspond
                System.out.println(current.toString());
                return;
            }
        }

        //Aucun film n'a été trouver
        System.out.println("Aucun film ne correspond");

    }
}

