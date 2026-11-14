import java.util.Scanner;

public class Menu
{
    static String[][] fleurs;
    static String[][] clients;
    static String [][] commandes;
    static int nbCommandes;
    public static void main(String[] args) {
        int choix;
        Scanner scanner = new Scanner(System.in);
        RemplirTableaux();
        do
        {
            do
            {
                System.out.println("1 - Liste des clients");
                System.out.println("2 - Liste des fleurs");
                System.out.println("3 - Liste des commandes");
                System.out.println("4 - Ajouter une commande");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    //A vous de jouer

                    break;
                case 2:
                    //A vous de jouer

                    break;
                case 3:
                    //A vous de jouer

                    break;
                case 4:
                    //A vous de jouer

                    break;
            }
        }while (choix != 0);
    }

    // Permet de remplir les 3 tableaux
    // NE PAS EFFACER
    private static void RemplirTableaux()
    {
        fleurs = new String[][] {
            {"1", "Rose", "3.50"},
            {"2", "Tulipe", "2.00"},
            {"3", "Lotus", "4.20"},
            {"4", "Iris", "1.80"},
            {"5", "Dahlia", "5.00"},
            {"6", "Pavot", "3.80"},
            {"7", "Muguet", "2.50"},
            {"8", "Aster", "1.60"},
            {"9", "Jasmin", "4.00"},
            {"10", "Bleuet", "3.20"}
        };

        clients = new String[][]{
                {"1", "Dupont Jean"},
                {"2", "Martin Lola"},
                {"3", "Leroy Paul"}
        };

        commandes = new String[5][3];
        commandes[0][0] = "1";
        commandes[0][1] = "Dupont Jean";
        commandes[0][2] = "15.00";

        commandes[1][0] = "2";
        commandes[1][1] = "Martin Lola";
        commandes[1][2] = "20.50";

        commandes[2][0] = "3";
        commandes[2][1] = "Leroy Paul";
        commandes[2][2] = "17.00";

        nbCommandes = 3;
    }
}

