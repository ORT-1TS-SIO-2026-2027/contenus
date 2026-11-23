
void main()
{
    int choix;
    Scanner scanner = new Scanner(System.in);
    do
    {
        do
        {
            System.out.println("1 - Tableau original");
            System.out.println("2 - Présence d'un employé");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
        } while (choix > 3);

        switch (choix)
        {
            case 0:
                System.out.println("Fin du devoir");
                break;
            case 1:
                // A vous de jouer

                break;
            case 2:
                // Ne pas effacer les tableaux
                String[][] employes =
                {
                    {"1", "Enzo"},
                    {"2", "Noa"},
                    {"3", "Lilou"},
                    {"4", "Milo"},
                    {"5", "Kitty"}
                };
                String[][] presences =
                {
                    {"P", "P", "A","",""},
                    {"A", "P", "P", "P", "A"},
                    {"A", "A", "A", "P",""},
                    {"P", "P", "P", "P", "P"},
                    {"A", "P","","",""}
                };

                // A vous de jouer


                break;
        }
    }while (choix != 0);
}
