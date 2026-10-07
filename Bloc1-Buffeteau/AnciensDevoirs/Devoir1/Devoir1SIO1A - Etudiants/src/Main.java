import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        int choix = 0;
        do
        {
            do
            {
                System.out.println("1 : Exercice 1");
                System.out.println("2 : Exercice 2");
                System.out.println("3 : Exercice 3");
                System.out.println("4 : Exercice 4");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();
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