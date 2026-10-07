package sio;

import java.util.Scanner;

public class TP1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        do
        {
            do
            {
                System.out.println("1 : Exo1");
                System.out.println("2 : Exo2");
                System.out.println("3 : Exo3");
                System.out.println("4 : Exo4");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = sc.nextInt();

            }while(choix < 0 || choix > 4);

            switch(choix)
            {
                case 1 :
                    // A vous de jouer
                    break;
                case 2 :
                    // A vous de jouer
                    break;
                case 3 :
                    // A vous de jouer
                    break;
                case 4 :
                   // A vous de jouer
                    break;
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);
    }
}
