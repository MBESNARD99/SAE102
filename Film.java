package sae;

import java.util.Comparator;

//classe pour stocker les informations sur un jeu vid�o
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
	
	static public Comparator<Film> compareTitle = new Comparator <Film>() {

	    public int compare(Film f1, Film f2) {

	        return f1.title.compareToIgnoreCase(f2.title);

	    }
	    
	};	
	
	// ++++++++++++++++++++++++++++++++++++++
	// d'autres comparateurs seront cr��s ici
	// ++++++++++++++++++++++++++++++++++++++
	
	// un constructeur pour donner une valeur � chaque attribut de la classe
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
		return ("Titre : "+title+" ; Date de sortie : "+releaseYear+" ; Genres : "+genres+" ; Dur�e : "+duration+" ; Pays : "+country+" ; Langue : "+language+" ; Directeur : "+director+" ; Directeur : "+director+" ; Ecriture : "+writer+" ; Acteurs : "+actors+" ; Description : "+description+" ; Votes : "+viewerVotes+" ; Moyenne des votes : "+averageVotes);
	}
	

}

