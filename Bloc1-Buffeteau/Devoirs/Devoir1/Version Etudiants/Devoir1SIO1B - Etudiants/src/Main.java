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
                // A vous de jouer

                break;
            case 2:
                // A vous de jouer

                break;
        }
    }while (choix != 0);
}
