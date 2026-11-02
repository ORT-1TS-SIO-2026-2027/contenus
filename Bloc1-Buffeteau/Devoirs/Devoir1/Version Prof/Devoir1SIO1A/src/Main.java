void main()
{
    int choix;
    Scanner scanner = new Scanner(System.in);
    do
    {
        do
        {
            System.out.println("1 - Tirages aléatoirs");
            System.out.println("2 - Supervision de la salle serveur");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
        } while (choix > 3);

        switch (choix)
        {
            case 0:
                System.out.println("Fin du programme");
                break;
            case 1:
                int nbGrilles;
                int meilleureSomme = 0;
                int meilleureGrille = 0;
                int somme;
                int numero;

                do
                {
                    System.out.print("Combien de grilles souhaitez-vous : ");
                    nbGrilles = scanner.nextInt();
                }while (nbGrilles <= 0);

                for(int grille = 1; grille <= nbGrilles; grille++)
                {
                    somme = 0;
                    System.out.print("Grille " + grille + " : ");
                    for(int i = 0; i < 6; i++)
                    {
                        numero = (int)(Math.random() * 49) + 1;
                        somme += numero;
                        System.out.print(numero + " ");
                    }
                    System.out.println("\nSomme : " + somme + "\n");
                    if(somme > meilleureSomme) {
                        meilleureSomme = somme;
                        meilleureGrille = grille;
                    }
                }
                System.out.println("Meilleure grille : "+ meilleureGrille);
                System.out.println("Somme maximale : " + meilleureSomme);
                break;
            case 2:
                int temperature;
                int nbReleves = 0;
                int sommeTemperatures = 0;
                int temperatureMax = 0;
                int nbVigilance = 0;
                int nbCritique = 0;
                int critiquesConsecutifs = 0;
                double moyenne = 0;

                do {
                    System.out.print("Relevé n°1 (ou 0 pour terminer) : ");
                    temperature = scanner.nextInt();
                }while (temperature < 0);

                while (temperature != 0 && critiquesConsecutifs != 3)
                {
                    nbReleves++;
                    sommeTemperatures += temperature;
                    if (temperature > temperatureMax)
                    {
                        temperatureMax = temperature;
                    }

                    if (temperature > 32) {
                        critiquesConsecutifs++;
                        System.out.println("--> " + temperature + " Celcius : CRITIQUE (" + critiquesConsecutifs + " relevé(s) consécutif(s)");
                        nbCritique++;

                    } else if (temperature > 27) {
                        System.out.println("--> " + temperature + " Celcius : VIGILANCE");
                        nbVigilance++;
                        critiquesConsecutifs = 0;
                    } else {
                        System.out.println("--> " + temperature + " Celcius : NORMAL" );
                        critiquesConsecutifs = 0;
                    }

                    if (critiquesConsecutifs != 3)
                    {
                        do {
                            System.out.print("Relevé n°" + (nbReleves + 1) + " (ou 0 pour terminer) : ");
                            temperature = scanner.nextInt();
                        }while (temperature < 0);
                    }
                }

                if (nbReleves > 0)
                {
                    moyenne = sommeTemperatures / nbReleves;
                }
                System.out.println();
                System.out.println("BILAN");
                System.out.println("Relevés effectués : " + nbReleves);
                System.out.println("Température moyenne : " + moyenne);
                System.out.println("Température maximale : " + temperatureMax);
                System.out.println("Vigilance : " + nbVigilance + "   Critique : " + nbCritique);

                if (critiquesConsecutifs == 3)
                {
                    System.out.println("ARRET D'URGENCE : 3 relevés critiques consécutifs");
                }
                break;
        }
    }while (choix != 0);
}
