package jeu;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import Autre.Clavier;

public class Ludotheque {

    static List<JeuVideo> listeJeux = new LinkedList<JeuVideo>();
    static List<JeuVideo> listeJeux2 = new ArrayList<JeuVideo>();

    public static void main(String[] args) throws ClassNotFoundException {

        lire();
        AjouterUnJeu();
    }

        public static void compare1() {
            String choix;

        System.out.println("comment veut tu trier la liste ?");
        choix=Clavier.lireString();

        if (choix.compareTo("Nom")==0) {
            Collections.sort(listeJeux,JeuVideo.compareNom);
            AfficherListeJeux();
            }
        if (choix.compareTo("Genre")==0) {
            Collections.sort(listeJeux,JeuVideo.compareGenre);
            AfficherListeJeux();
            }

        if (choix.compareTo("Editeur")==0) {
            Collections.sort(listeJeux,JeuVideo.compareEditeur);
            AfficherListeJeux();
            }

        if (choix.compareTo("Annee")==0) {
            Collections.sort(listeJeux,JeuVideo.compareAnnee);
            AfficherListeJeux();
            }

        if (choix.compareTo("Note")==0) {
            Collections.sort(listeJeux,JeuVideo.compareNote);
            AfficherListeJeux();
        }
        copie();
    }

    public static void copie() {
        try {
            FileOutputStream fos = new FileOutputStream("listeJeux.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listeJeux);
            oos.close( );
            fos.close( );
            System.out.println("copie faite");
            } catch (IOException e) {
    }
public static void lire() throws ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("listeJeux.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listeJeux=(LinkedList<JeuVideo>)ois.readObject();
            ois.close( );
            fis.close( );
            System.out.println("copie faite");
            } catch (IOException e) {
    }
    }
    public static void AfficherListeJeux() {
        Iterator<JeuVideo> it = listeJeux.iterator();
        while (it.hasNext()) {
        System.out.println(it.next());
    }

}
    public static void AjouterUnJeu() {
        String Nom;
        String Genre;
        String Editeur;
        int Date;
        int Note;

        System.out.println("Entrez le nom du jeux ?");
        Nom=Clavier.lireString();
        System.out.println("Entrez le genre du jeux ?");
        Genre=Clavier.lireString();
        System.out.println("Entrez l'éditeur du jeux ?");
        Editeur=Clavier.lireString();
        System.out.println("Entrez la date de sortie du jeux ?");
        Date=Clavier.lireInt();
        System.out.println("Entrez la note du jeux ?");
        Note=Clavier.lireInt();
        listeJeux.add(new JeuVideo(Nom,Genre,Editeur,Date,Note));
        System.out.println("Le jeu à été enregistré");
    }
}