import java.text.DecimalFormat;
import java.util.Random;
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
                    int nbKms;
                    double volume;
                    double poids;
                    double forfait = 50;
                    do {
                        System.out.print("Nombre de kilomètres : ");
                        nbKms = input.nextInt();
                    }while(nbKms <=0);
                    do {
                        System.out.print("Volume en m3 : ");
                        volume = input.nextDouble();
                    }while(volume <=0);
                    do {
                        System.out.print("Poids : ");
                        poids = input.nextInt();
                    }while(poids <=0);
                    if(poids > 60)
                    {
                        forfait += poids - 60;
                    }
                    if(volume >= 1)
                    {
                        forfait += 20;
                    }
                    if(nbKms > 100)
                    {
                        forfait += (nbKms - 100) * 0.5;
                    }
                    System.out.println("Les frais de port sont de " + forfait);
                    break;
                case 2 :
                    double investissement = 150;
                    double recette = 31;
                    int annee = 1;
                    System.out.println("Année\tRecette\t\tInvestissement");
                    System.out.println(annee+"\t\t"+df.format(recette)+"\t\t"+df.format(investissement));
                    while (investissement >= 0)
                    {
                        investissement -= recette;
                        recette = recette  - (recette * 20/100);
                        annee++;
                        System.out.println(annee+"\t\t"+df.format(recette)+"\t\t"+df.format(investissement));
                    }
                    System.out.println("Le stade sera rentable à partir de la " + annee +" ème année");
                    break;
                case 3 :
                    Random random = new Random();
                    int nb1;
                    int nb2;
                    int nb3;
                    int gain = 50;
                    int mise;
                    System.out.println("Vos gains au départ sont de : " + gain);
                    while (gain != 0)
                    {
                        do
                        {
                            System.out.print("Votre mise : ");
                            mise = input.nextInt();
                        } while (mise <= 0 || mise > gain);
                        nb1 = random.nextInt(1, 5);
                        nb2 = random.nextInt(1, 5);
                        nb3 = random.nextInt(1, 5);
                        System.out.println(nb1 + " - " + nb2 + " - " + nb3);
                        if (nb1 == nb2 && nb1 == nb3)
                        {
                            // 3 numéros
                            gain = gain + mise * 3;
                        }
                        else if (nb1 != nb2 && nb2 != nb3 && nb1 != nb3)
                        {
                            // Aucun numéro
                            gain = gain - mise;
                        }
                        else
                        {
                            // 2 numéros
                            gain = gain + mise * 2;
                        }
                        System.out.println("Vos gains sont de : " + gain);
                    }
                    break;
                case 4 :
                    int nbLignes;
                    do
                    {
                        System.out.print("Nombre de lignes : ");
                        nbLignes = input.nextInt();
                    } while (nbLignes <= 0);
                    for(int i = 1 ; i <= nbLignes ; i++)
                    {
                        for (int j = 1; j <= nbLignes - i + 1; j++)
                        {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);
    }
}