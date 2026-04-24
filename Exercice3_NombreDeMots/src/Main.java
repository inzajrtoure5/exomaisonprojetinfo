import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Nombre total de mots dans le fichier
        int totalMots = 0;

        try {
            // Utiliser le lecteur de fichiers (File Scanner) pour lire le fichier
            File fichier = new File("words.txt");
            Scanner scanner = new Scanner(fichier);

            // Boucle qui lit chaque ligne dans une chaîne de caractères
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();

                // Séparer la chaîne en utilisant l'espace comme délimiteur
                String[] mots = ligne.split(" ");

                int nombreMotsLigne = mots.length;

                totalMots += nombreMotsLigne;

                System.out.println("Ligne : \"" + ligne + "\" → " + nombreMotsLigne + " mots");
            }

            System.out.println("Nombre total de mots : " + totalMots);

            scanner.close();

        } catch (Exception exception) {
            // Gérer l'exception si le fichier est introuvable
            System.out.println("Impossible de trouver le fichier !");
        }
    }
}