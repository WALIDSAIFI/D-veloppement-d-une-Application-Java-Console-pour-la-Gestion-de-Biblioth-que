package src.Présentation;

import java.util.Scanner;


public class Console {



    public static void afficheMenu() {
        while (true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("1- Ajouter un document");
            System.out.println("2- Modifier un document");
            System.out.println("3- Supprimer un document");
            System.out.println("4- Afficher tous les documents");
            System.out.println("5- Rechercher un document");
            System.out.println("6- Emprunter un document");
            System.out.println("7- Retourner un document");
            System.out.println("8- Ajouter un utilisateur");
            System.out.println("9- Modifier un utilisateur");
            System.out.println("10- Supprimer un utilisateur");
            System.out.println("11- Afficher tous les utilisateurs");
            System.out.println("12- Quitter");
            System.out.print("Veuillez entrer votre choix (1-12) : ");
            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

}
