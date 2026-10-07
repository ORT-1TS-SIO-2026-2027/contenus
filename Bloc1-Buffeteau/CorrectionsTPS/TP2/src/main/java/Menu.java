import java.io.Console;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
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
                    int nbKm;
                    double frais = 0;
                    do {
                        System.out.print("Nombre de Kms : ");
                        nbKm = scanner.nextInt();
                    }while (nbKm < 0 );
                    if(nbKm < 25000)
                    {
                        frais = nbKm * 0.32;
                    }
                    else
                    {
                        frais = nbKm * 0.22;
                    }
                    System.out.println("Vos frais kilométriques sont de : "+ frais);
                    break;
                case 2:
                    double montant;
                    int consommation;
                    int ancienReleve;
                    int nouveauReleve;
                    do {
                        System.out.print("Ancien relevé : ");
                        ancienReleve = scanner.nextInt();
                    }while(ancienReleve < 0);
                    do {
                        System.out.print("Nouveau relevé : ");
                        nouveauReleve = scanner.nextInt();
                    }while(nouveauReleve < ancienReleve);
                    consommation = nouveauReleve - ancienReleve;
                    if (consommation <= 100)
                    {
                        // Tout est au tarif n°1
                        montant = consommation * 0.083;
                    }
                    // Si la conso est > à 200
                    else if(consommation > 200)
                    {
                        // Les 100 premiers au tarif n°1, les 100 suivants au tarif n°2 et le reste au tarif n°3
                        montant = 100 * 0.083 + 100 * 0.076 + (consommation - 200) * 0.06;
                    }
                    // Sinon la conso est comprise entre 100 et 200
                    else
                    {
                        // Les 100 premiers au tarif n°1 et le reste au tarif n°2
                        montant = 100 * 0.083 + (consommation-100) * 0.076;
                    }
                    System.out.println("Votre consommation est de : " + consommation);
                    System.out.println("Votre facture est de : " + decimalFormat.format(montant));
                    break;
                case 3:
                    int somme = 0;
                    int nb;
                    do {
                        System.out.print("Votre nombre : ");
                        nb = scanner.nextInt();
                    }while(nb < 0);
                    for(int i = 1 ; i <= nb ; i++)
                    {
                        somme = somme + i;
                    }
                    System.out.println("La somme est de : " + somme);
                    break;
                case 4:
                    int factorielle = 1;
                    do {
                        System.out.print("Votre nombre : ");
                        nb = scanner.nextInt();
                    }while(nb < 0);
                    for(int i = 1 ; i <= nb ; i++)
                    {
                        factorielle = factorielle * i;
                    }
                    System.out.println("La factorielle est de : " + factorielle);
                    break;
                case 5:
                    int nbEtoiles;
                    String ligne = "";
                    do {
                        System.out.print("Nombre d'étoiles : ");
                        nbEtoiles = scanner.nextInt();
                    }while(nbEtoiles < 0);

                    for(int i = 1 ; i <= nbEtoiles ; i++)
                    {
                        ligne = ligne + "* ";
                    }
                    System.out.println(ligne);
                    break;
                case 6:
                    int nbLignes;
                    int nbColonnes;
                    ligne = "";
                    do {
                        System.out.print("Nombre de lignes : ");
                        nbLignes = scanner.nextInt();
                    }while(nbLignes < 0);
                    do {
                        System.out.print("Nombre de colonnes : ");
                        nbColonnes = scanner.nextInt();
                    }while(nbColonnes < 0);
                    for(int i = 1 ; i <= nbLignes ; i++)
                    {
                        // Pour chaque colonne
                        for(int j = 1; j <= nbColonnes ; j++)
                        {
                            ligne = ligne + "* ";
                        }
                        ligne = ligne + "\n";
                    }
                    System.out.println(ligne);
                    break;
                case 7:
                    String table = "";
                    int nbDu;
                    int nbJusqua;
                    do {
                        System.out.print("Du : ");
                        nbDu = scanner.nextInt();
                    }while(nbDu < 0);
                    do {
                        System.out.print("Jusqu'à : ");
                        nbJusqua = scanner.nextInt();
                    }while(nbJusqua < 0);
                    for(int i = 1 ; i <= nbJusqua ; i++)
                    {
                        table = table + i + " * " +  nbDu + " = " + i * nbDu + "\n";
                    }
                    System.out.println(table);
                    break;
                case 8:
                    int nbRechercher = 1 + (int) (Math.random()* 100);
                    int nbProposition = 1;
                    do {
                        System.out.print("Votre nombre : ");
                        nb = scanner.nextInt();
                    }while(nb < 0);
                    while (nb != nbRechercher && nbProposition != 5)
                    {
                        if(nb < nbRechercher)
                        {
                            System.out.println(nb + " : trop petit");
                        }
                        else
                        {
                            System.out.println(nb + " : trop grand");
                        }
                        do {
                            System.out.print("Votre nombre : ");
                            nb = scanner.nextInt();
                        }while(nb < 0);
                        nbProposition++;
                    }
                    if(nb == nbRechercher)
                    {
                        System.out.println("Bravo, vous avez trouvé en " + nbProposition + " coups");
                    }
                    else
                    {
                        System.out.println("Perdu : il fallait trouver le nombre " + nbRechercher);
                    }
                    break;
            }
        }while (choix != 0);
    }
}
