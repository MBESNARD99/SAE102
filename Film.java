package sae;

import java.util.Comparator;

//classe pour stocker les informations sur un jeu vidŽo
public class Film {
	public String title;
	public String releaseYear;
	public String genres;
	public String duration;
	public String country;
	public String language;
	public String director;
	public String writer;
	public String actors;
	public String description;
	public String viewerVotes;
	public String averageVotes;
	
	static public Comparator<Film> compareTitle = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.title.compareToIgnoreCase(f2.title);

	    }
	    
	};	
	
	// ++++++++++++++++++++++++++++++++++++++
	// d'autres comparateurs seront crŽŽs ici
	// ++++++++++++++++++++++++++++++++++++++
	
	// un constructeur pour donner une valeur ˆ chaque attribut de la classe
	Film(String t, String r, String g, String d, String c, String l, String di, String w, String a, String de, String vv, String av)
	{
		title=t;
		releaseYear=r;
		genres = g;
		duration = d;
		country = c;
		language = l;
		director = di;
		writer = w;
		actors = a;
		description = de;
		viewerVotes = vv;
		averageVotes = av;
	}
	
	// fonction utile pour l'affichage
	public String toString()
	{
		return ("Titre : "+title+" ; Date de sortie : "+releaseYear+" ; Genres : "+genres+" ; Durée : "+duration+" ; Pays : "+country+" ; Langue : "+language+" ; Directeur : "+director+" ; Directeur : "+director+" ; Ecriture : "+writer+" ; Acteurs : "+actors+" ; Description : "+description+" ; Votes : "+viewerVotes+" ; Moyenne des votes : "+averageVotes);
	}
	

}

