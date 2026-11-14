import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        //DecimalFormat decimalFormat = new DecimalFormat("#.##");
        do
        {
            do
            {
                System.out.println("1 - Exercice n°1");
                System.out.println("2 - Exercice n°2");
                System.out.println("3 - Exercice n°3");
                System.out.println("4 - Exercice n°4");
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
                    int[] tabExo1 = new int[] {31,6,17,4,9};
                    // Afficher le tableau
                    for(int i = 0 ; i < tabExo1.length ; i++)
                    {
                        System.out.print(tabExo1[i] + " - ");
                    }
                    System.out.println();
                    // Afficher la plus grande valeur
                    int max = tabExo1[0];
                    for(int i = 1 ; i < tabExo1.length;i++)
                    {
                        if(tabExo1[i] > max)
                        {
                            max = tabExo1[i];
                        }
                    }
                    System.out.println("La plus grande valeur est : " + max);
                    int i = 0;
                    int pos = 0;
                    boolean trouve = false;
                    int valeurRecherchee;
                    do {
                        System.out.print("Valeur recherchée : ");
                        valeurRecherchee = scanner.nextInt();
                    }while (valeurRecherchee < 0);

                    String chaine;
                    // Tant que non trouvé et pas à la fin du tableau
                    while(i < tabExo1.length && !trouve)
                    {
                        if(tabExo1[i] == valeurRecherchee)
                        {
                            trouve = true;
                            pos = i;
                        }
                        else
                        {
                            i++;
                        }
                    }
                    if(trouve)
                    {
                        System.out.println("Votre valeur se trouve en position : " +pos);
                    }
                    else
                    {
                        System.out.println("Valeur non présente");
                    }
                    break;
                case 2:
                    int[] tabExo2 = new int[] {11,32,41,632,10};
                    int[] tabI = new int[5];
                    int[] tabP = new int[5];
                    int pair = 0;
                    int impair = 0;
                    int sommeP = 0;
                    int sommeI = 0;
                    for(int j = 0; j < tabExo2.length; j++)
                    {
                        if(tabExo2[j] % 2 == 0)
                        {
                            tabP[pair] = tabExo2[j];
                            pair++;
                            sommeP = sommeP + tabExo2[j];
                        }
                        else
                        {
                            tabI[impair] = tabExo2[j];
                            impair++;
                            sommeI = sommeI + tabExo2[j];
                        }
                    }
                    System.out.println("Valeurs paires");
                    for(int j = 0; j < pair; j++)
                    {
                        System.out.print(tabP[j] + " - ");
                    }
                    System.out.println();
                    System.out.println("Valeurs impaires");
                    for(int j = 0; j < impair; j++)
                    {
                        System.out.print( tabI[j] + " - ");
                    }
                    System.out.println();
                    System.out.println("Somme paire : " +sommeP);
                    System.out.println("Somme impaire : " +sommeI);
                    break;
                case 3:
                    int[] tab1Exo3 = new int[] {4,8,7,12};
                    int[] tab2Exo3 = new int[] {3,6};
                    int schtroumpf = 0;
                    for(i = 0 ; i < tab1Exo3.length ; i++)
                    {
                        System.out.print(tab1Exo3[i] + " - ");
                    }
                    System.out.println();
                    for(i = 0 ; i < tab2Exo3.length ; i++)
                    {
                        System.out.print(tab2Exo3[i] + " - ");
                    }
                    System.out.println();
                    for(i = 0 ; i < tab1Exo3.length;i++)
                    {
                        for(int j = 0 ; j < tab2Exo3.length;j++)
                        {
                            schtroumpf = schtroumpf + tab1Exo3[i] * tab2Exo3[j];
                        }
                    }
                    System.out.println("Le schtroumpf est de : " + schtroumpf);

                    break;
                case 4:
                    int[][] tabExo4 = new int[4][4];

                    // Exemple n°1
                    /*tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 0;tabExo4[1][1] = 3;tabExo4[1][2] = 0;tabExo4[1][3] = 6;
                    tabExo4[2][0] = 0;tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;tabExo4[3][3] = 0;*/

                    // Exemple n°2

                    tabExo4[0][0] = 1;tabExo4[0][1] = 2;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 3;tabExo4[1][1] = 4;tabExo4[1][2] = 0;tabExo4[1][3] = 0;
                    tabExo4[2][0] = 5;tabExo4[2][1] = 6;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 7;tabExo4[3][1] = 8;tabExo4[3][2] = 0;tabExo4[3][3] = 0;
                    
                    String lesValeurs = "";
                    String lesLignes = "";
                    String lesColonnes = "";

                    for(i = 0 ; i < tabExo4.length;i++)
                    {
                        for(int j = 0 ; j < tabExo4.length;j++)
                        {
                            System.out.print( tabExo4[i][j]+ " - ");
                            if(tabExo4[i][j]!=0)
                            {
                                lesValeurs = lesValeurs + tabExo4[i][j]+ " - ";
                                lesLignes = lesLignes + i+ " - ";
                                lesColonnes = lesColonnes + j + " - ";
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("Valeurs");
                    System.out.println(lesValeurs);
                    System.out.println("Lignes");
                    System.out.println(lesLignes);
                    System.out.println("Colonnes");
                    System.out.println(lesColonnes);
                    break;
            }
        }while (choix != 0);
    }
}
