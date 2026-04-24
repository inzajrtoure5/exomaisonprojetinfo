import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Créer les outils nécessaires
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Générer un nombre aléatoire entre 1 et 100
        int nombreSecret = random.nextInt(100) + 1;

        final int MAX_ESSAIS = 10;

        System.out.println("=== Bienvenue dans le jeu de devinettes ! ===");
        System.out.println("Devinez un nombre entre 1 et 100.");
        System.out.println("Vous avez " + MAX_ESSAIS + " essais.");

        // Boucle principale : on répète jusqu'à victoire ou fin des essais
        for (int essai = 1; essai <= MAX_ESSAIS; essai++) {

            System.out.println("\nEssai " + essai + "/" + MAX_ESSAIS);
            System.out.print("Votre nombre : ");

            // Vérifier que l'utilisateur entre bien un nombre entier
            while (!scanner.hasNextInt()) {
                System.out.println("⚠️  Entrez un nombre entier valide !");
                System.out.print("Votre nombre : ");
                scanner.next(); // vider l'entrée invalide
            }

            // Lire le nombre entré par l'utilisateur
            int devine = scanner.nextInt();

            // Comparer la devinette au nombre secret
            if (devine < nombreSecret) {
                System.out.println("📉 Trop petit ! Le nombre est plus grand.");
            } else if (devine > nombreSecret) {
                System.out.println("📈 Trop grand ! Le nombre est plus petit.");
            } else {
                // L'utilisateur a trouvé le bon nombre → victoire
                System.out.println("\n🎉 Bravo ! Vous avez trouvé le nombre "
                        + nombreSecret + " en " + essai + " essai(s) !");
                scanner.close();
                return; // On sort du programme → victoire
            }
        }

        // Si la boucle se termine sans bonne réponse → défaite
        System.out.println("\n😢 Vous avez perdu ! Le nombre secret était : " + nombreSecret);

        // Fermer le scanner proprement
        scanner.close();
    }
}