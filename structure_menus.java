package sae;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            afficherMenuGlobal();
            int choixGlobal = scanner.nextInt();

            switch (choixGlobal) {
                case 1:
                    chargerFichier();
                    break;
                case 2:
                    afficherDonnees();
                    break;
                case 3:
                    trierDonnees(scanner);
                    break;
                case 4:
                    filtrerDonnees(scanner);
                    break;
                case 5:
                    rechercherDonnees(scanner);
                    break;
                case 6:
                    sauvegarderRequete();
                    break;
                case 7:
                    System.out.println("Merci d'avoir utilisé l'application !");
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
                    break;
            }
        }
        scanner.close();
    }

    public static void afficherMenuGlobal() {
        System.out.println("Opérations à effectuer : (Menu Global)");
        System.out.println("1. Charger les données (choix du fichier)");
        System.out.println("2. Afficher les données");
        System.out.println("3. Trier les données");
        System.out.println("4. Filtrer les données");
        System.out.println("5. Rechercher des données");
        System.out.println("6. Sauvegarder une requête (optionnel)");
        System.out.println("7. Quitter");
        System.out.print("Faites votre choix : ");
    }

    public static void chargerFichier() throws IOException {
    	Scanner scanner = new Scanner(System.in);
        boolean running = true;

        BufferedReader tsvReader = null;
        String row=new String();
    	row=tsvReader.readLine();
        
        while (running) {
        	System.out.println("Opérations à effectuer : (Charger les données)");
            System.out.println("1. Charger le fichier complet");
            System.out.println("2. Charger le fichier avec 40000 films");
            System.out.println("3. Charger le fichier avec 10000 films");
            System.out.println("4. Charger le fichier avec 1000 films");
            System.out.println("5. Charger le fichier avec 100 films");
            System.out.println("6. Quitter");
            System.out.print("Faites votre choix : ");
            int choixGlobal = scanner.nextInt();

            switch (choixGlobal) {
                case 1:
                	tsvReader = new BufferedReader(new FileReader("IMDbmoviesFULL.tsv"));
                    break;
                case 2:
                	tsvReader = new BufferedReader(new FileReader("IMDbmovies40000.tsv"));
                    break;
                case 3:
                	tsvReader = new BufferedReader(new FileReader("IMDbmovies10000.tsv"));
                    break;
                case 4:
                	tsvReader = new BufferedReader(new FileReader("IMDbmovies1000.tsv"));
                    break;
                case 5:
                	tsvReader = new BufferedReader(new FileReader("IMDbmovies100.tsv"));
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
                    break;
            }
        }
        scanner.close();
    }

    public static void afficherDonnees() {
        // Implémenter l'affichage des données selon les options
        // Afficher les sous-options du menu d'affichage de données
        // et effectuer le traitement approprié
    }

    public static void trierDonnees(Scanner scanner) {
        System.out.println("---- Menu de Tri des Données ----");
        System.out.println("1. Tri sélection");
        System.out.println("2. Tri fusion");
        System.out.println("3. Tri Java");
        System.out.print("Faites votre choix : ");
        int choixTri = scanner.nextInt();

        switch (choixTri) {
            case 1:
                triSelection(scanner);
                break;
            case 2:
                triFusion(scanner);
                break;
            case 3:
                triJava(scanner);
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
                break;
        }
    }

    public static void triSelection(Scanner scanner) {
        // Implémenter le tri par sélection selon les sous-options
    }

    public static void triFusion(Scanner scanner) {
        // Implémenter le tri par fusion selon les sous-options
    }

    public static void triJava(Scanner scanner) {
        // Implémenter le tri Java selon les sous-options
    }

    public static void filtrerDonnees(Scanner scanner) {
        System.out.println("---- Menu de Filtrage des Données ----");
        System.out.println("1. Filtre linéaire");
        System.out.println("2. Filtre Java");
        System.out.print("Faites votre choix : ");
        int choixFiltre = scanner.nextInt();

        switch (choixFiltre) {
            case 1:
                filtreLineaire(scanner);
                break;
            case 2:
                filtreJava(scanner);
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
                break;
        }
    }

    public static void filtreLineaire(Scanner scanner) {
        // Implémenter le filtre linéaire selon les sous-options
    }

    public static void filtreJava(Scanner scanner) {
        // Implémenter le filtre Java selon les sous-options
    }

    public static void rechercherDonnees(Scanner scanner) {
        // Implémenter la recherche de données selon l'entrée utilisateur
        System.out.print("Entrez le titre du film à rechercher : ");
        String titreRecherche = scanner.next();
        // Effectuer la recherche et afficher les résultats correspondants
    }

    public static void sauvegarderRequete() {
        // Implémenter la sauvegarde d'une requête dans un fichier
    }
}
