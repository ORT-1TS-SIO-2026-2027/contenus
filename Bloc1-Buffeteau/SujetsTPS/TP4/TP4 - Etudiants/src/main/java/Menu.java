import java.util.Scanner;

public class Menu
{
    static int choix;
    static char[][] unTab = new char[2][27];
    static String[] tabExo2;
    static int[] tabExo3;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("1 - Exercice n°1");
                System.out.println("2 - Exercice n°2");
                System.out.println("3 - Exercice n°3");
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
                    // Ne pas effacer cette ligne
                    // Elle permet de remplir le tableau qui se nomme unTab
                    // et qui a été déclaré plus haut dans le code
                    RemplirTablo();

                    // A vous de jouer


                    break;
                case 2:
                    // Exercice n°2
                    // Exemple n°1  des « P » et des « F » sans aucune valeur « P » consécutive
                    tabExo2 = new String[]{"P","F","F","P","F"};

                    // Exemple n°2  des « P » et des « F » avec des valeurs « P » consécutives
                    //tabExo2 = new String[]{"P","P","F","P","P"};

                    // Exemple n°3  que des piles
                    //tabExo2 = new String[]{"P","P","P","P","P"};

                    // Exemple n°4  que des faces
                    //tabExo2 = new String[]{"F","F","F","F","F"};

                    // A vous de jouer

                    break;
                case 3:
                    tabExo3 = new int[]{4,8,3,1,6,4,-2,9,10,3};
                    // A vous de jouer

                    break;
            }
        }while (choix != 0);
    }

    private static void RemplirTablo()
    {
        unTab[0][0] = 'a';
        unTab[0][1] = 'b';
        unTab[0][2] = 'c';
        unTab[0][3] = 'd';
        unTab[0][4] = 'e';
        unTab[0][5] = 'f';
        unTab[0][6] = 'g';
        unTab[0][7] = 'h';
        unTab[0][8] = 'i';
        unTab[0][9] = 'j';
        unTab[0][10] = 'k';
        unTab[0][11] = 'l';
        unTab[0][12] = 'm';
        unTab[0][13] = 'n';
        unTab[0][14] = 'o';
        unTab[0][15] = 'p';
        unTab[0][16] = 'q';
        unTab[0][17] = 'r';
        unTab[0][18] = 's';
        unTab[0][19] = 't';
        unTab[0][20] = 'u';
        unTab[0][21] = 'v';
        unTab[0][22] = 'w';
        unTab[0][23] = 'x';
        unTab[0][24] = 'y';
        unTab[0][25] = 'z';
        unTab[0][26] = ' ';

        // 2ème colonne
        unTab[1][0] = 'a';
        unTab[1][1] = 'z';
        unTab[1][2] = 'e';
        unTab[1][3] = 'r';
        unTab[1][4] = 't';
        unTab[1][5] = 'y';
        unTab[1][6] = 'u';
        unTab[1][7] = 'i';
        unTab[1][8] = 'o';
        unTab[1][9] = 'p';
        unTab[1][10] = 'q';
        unTab[1][11] = 's';
        unTab[1][12] = 'd';
        unTab[1][13] = 'f';
        unTab[1][14] = 'g';
        unTab[1][15] = 'h';
        unTab[1][16] = 'j';
        unTab[1][17] = 'k';
        unTab[1][18] = 'l';
        unTab[1][19] = 'm';
        unTab[1][20] = 'w';
        unTab[1][21] = 'x';
        unTab[1][22] = 'c';
        unTab[1][23] = 'v';
        unTab[1][24] = 'b';
        unTab[1][25] = 'n';
        unTab[1][26] = ' ';
    }
}


