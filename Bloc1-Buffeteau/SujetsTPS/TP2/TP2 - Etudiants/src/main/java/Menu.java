import java.io.Console;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("1 - Frais kilométriques");
                System.out.println("2 - Consommation électrique");
                System.out.println("3 - Somme des N premiers nombres");
                System.out.println("4 - Factorielle");
                System.out.println("5 - Lignes d'étoiles");
                System.out.println("6 - Rectangle d'étoiles");
                System.out.println("7 - Table de multiplication");
                System.out.println("8 - Jeu de la fourchette");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 8);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    // A vous de jouer
                    break;
                case 2:
                    // A vous de jouer
                    break;
                case 3:
                    // A vous de jouer
                    break;
                case 4:
                    // A vous de jouer
                    break;
                case 5:
                    // A vous de jouer
                    break;
                case 6:
                    // A vous de jouer
                    break;
                case 7:
                    // A vous de jouer
                    break;
                case 8:
                    // A vous de jouer
                    break;
            }
        }while (choix != 0);
    }
}
