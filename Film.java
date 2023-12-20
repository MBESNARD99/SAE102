package codes;

import java.util.Comparator;

//classe pour stocker les informations sur un film
public class Film {
	public String title;
	public int releaseYear;
	public String genres;
	public int duration;
	public String country;
	public String language;
	public String director;
	public String writer;
	public String actors;
	public String description;
	public int viewerVotes;
	public float averageVotes;
	
	public static Comparator<Film> compareTitle = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.title.compareToIgnoreCase(f2.title);

	    }
	    
	};	
	public static Comparator<Film> compareReleaseYear = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {
	    
	    	return f1.releaseYear - f2.releaseYear;
	    }
	};
	public static Comparator<Film> compareGenres = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.genres.compareToIgnoreCase(f2.genres);

	    }
	    
	};
	public static Comparator<Film> compareCountry = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.country.compareToIgnoreCase(f2.country);

	    }
	    
	};
	public static Comparator<Film> compareLanguage = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.language.compareToIgnoreCase(f2.language);

	    }
	    
	};
	public static Comparator<Film> compareDirector = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.director.compareToIgnoreCase(f2.director);

	    }
	    
	};
	public static Comparator<Film> compareWriter = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.writer.compareToIgnoreCase(f2.writer);

	    }
	    
	};
	public static Comparator<Film> compareActors = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.actors.compareToIgnoreCase(f2.actors);

	    }
	    
	};
	public static Comparator<Film> compareDescription = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.description.compareToIgnoreCase(f2.description);

	    }
	    
	};
	public static Comparator<Film> compareNbVotes = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.viewerVotes - f2.viewerVotes;

	    }
	    
	};
	public static Comparator<Film> compareMoyenne = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return (int) (f1.averageVotes - f2.averageVotes);
//Incomplet car si l'écart de notes est trop faible (ex 7.3 contre 7.6) le code renvoie 0 au lieu de 1 ou -1
	    }
	    
	};
	// un constructeur pour donner une valeur a chaque attribut de la classe
	Film(String t, String r, String g, String d, String c, String l, String di, String w, String a, String de, String vv, String av)
	{
		title=t;
		releaseYear=Integer.parseInt(r);
		genres = g;
		duration = Integer.parseInt(d);
		country = c;
		language = l;
		director = di;
		writer = w;
		actors = a;
		description = de;
		viewerVotes = Integer.parseInt(vv);
		averageVotes = Float.parseFloat(av);
	}
	
	// fonction utile pour l'affichage
	public String toString()
	{
		return ("Titre : "+title+" ; Date de sortie : "+releaseYear+" ; Genres : "+genres+" ; Durée : "+duration+" ; Pays : "+country+" ; Langue : "+language+" ; Directeur : "+director+" ; Directeur : "+director+" ; Ecriture : "+writer+" ; Acteurs : "+actors+" ; Description : "+description+" ; Votes : "+viewerVotes+" ; Moyenne des votes : "+averageVotes);
	}
	

}
