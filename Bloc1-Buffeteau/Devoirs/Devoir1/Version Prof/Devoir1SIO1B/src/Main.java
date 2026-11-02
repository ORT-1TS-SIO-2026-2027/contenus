void main()
{
    int choix;
    Scanner scanner = new Scanner(System.in);
    do
    {
        do
        {
            System.out.println("1 - Salle de cinéma");
            System.out.println("2 - Bande passante");
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
                final int nbRangees = 8;
                final int nbFauteuils = 12;
                int occupes = 0;
                int nb;

                for (int rangee = 1 ; rangee <= nbRangees ; rangee++)
                {
                    System.out.print("Rangée : " + rangee + " ==> ");
                    for (int fauteuil = 1 ; fauteuil <= nbFauteuils ; fauteuil++)
                    {
                        nb = ((int) (Math.random() * 2));
                        if (nb == 1)
                        {
                            occupes++;
                        }
                        System.out.print(nb +" ");
                    }
                    System.out.println();
                }

                int total = nbRangees * nbFauteuils;
                double taux = occupes * 100.0 / total;

                System.out.println();
                System.out.println("Places occupées : " + occupes + " sur " + total);
                System.out.println("Taux de remplissage : " + taux);
                break;
            case 2:
                String nomClient;
                double quotaHebdo;
                double traficJournalier;
                int jour = 0;
                double cumul = 0.0;
                double traficMax = 0.0;
                int jourDepassement = 0;
                double moyenneJournaliere = 0;

                System.out.print("Nom du client : ");
                nomClient = scanner.next();

                do
                {
                    System.out.print("Quota hebdomadaire : ");
                    quotaHebdo = scanner.nextDouble();
                }while (quotaHebdo <= 0);

                do
                {
                    System.out.print("Jour 1 - Saisir votre trafic journalier (-1 pour arrêter) : ");
                    traficJournalier = scanner.nextDouble();
                }while (traficJournalier == 0 || traficJournalier <-1);

                while (traficJournalier != -1 && jour < 7 && cumul <= quotaHebdo)
                {
                    jour++;
                    cumul += traficJournalier;
                    if (traficJournalier > traficMax)
                    {
                        traficMax = traficJournalier;
                    }
                    System.out.println("Cumul : " + cumul );
                    if (cumul > quotaHebdo)
                    {
                        jourDepassement = jour;
                    }
                    else if (jour < 7)
                    {
                        do
                        {
                            System.out.print("Jour " + (jour + 1) + " - Saisir votre trafic journalier (-1 pour arrêter) : ");
                            traficJournalier = scanner.nextDouble();
                        } while (traficJournalier == 0 || traficJournalier < -1);
                    }
                }
                if(jour > 0)
                {
                    moyenneJournaliere = cumul / jour;
                }

                System.out.println();
                System.out.println("BILAN");
                System.out.println("Client : " + nomClient);
                System.out.println("Jours suivis : " + jour);
                System.out.println("Moyenne journalière : " + moyenneJournaliere + " Go");
                System.out.println("Jour le plus chargé : " + traficMax + " Go");

                if (cumul > quotaHebdo)
                {
                    double excedent = cumul - quotaHebdo;
                    double surcout = excedent * 0.90;
                    System.out.println("Quota dépassé au jour : " + jourDepassement + " avec un excédent de : " + excedent);
                    System.out.println("Surcoût à facturer : " +  surcout + " €");
                }
                else
                {
                    double restant = quotaHebdo - cumul;
                    System.out.println("Volume restant : " + restant + " Go");
                }
                break;
        }
    }while (choix != 0);
}
