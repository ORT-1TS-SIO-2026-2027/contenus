
// Tableaux pour l'exercice 1
String[][] mots;
// Il peut y avoir plusieurs mots en commun donc
// on les stocke dans le tableau ci-dessous
String[][] motsCommuns;

// Tableaux pour l'exercice 2
String[][] films =
{
    {"1", "Film1"},
    {"2", "Film2"},
    {"3", "Film3"},
    {"4", "Film4"},
    {"5", "Film5"}
};
int[][] notes =
{
    {2,1,4,0,0},
    {4,5,3,5,3},
    {1,1,3,1,0},
    {3,2,4,2,5},
    {5,4,0,0,0}
};

void main()
{
    int choix;
    Scanner scanner = new Scanner(System.in);
    do
    {
        do
        {
            System.out.println("1 - Matrice de mots");
            System.out.println("2 - Noter un film");
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
                RemplirTableauDesMots();

                break;
            case 2:

                break;
        }
    }while (choix != 0);
}

public void RemplirTableauDesMots()
{
    // Exercice n°1
    mots = new String[6][6];
    motsCommuns = new String[6][6];
    // Ne pas effacer et ne pas toucher le code ci-dessous
    // Voici un jeu d'essai pour le tableau MOTS
    // Dans ce tableau on trouve les mots suivants :
    // arbres ; fleurs ; amours ; rouler ; manger ; vaches
    mots[0][0] = "a";mots[0][1] = "r";mots[0][2] = "b";mots[0][3] = "r";mots[0][4] = "e";mots[0][5] = "s";
    mots[1][0] = "f";mots[1][1] = "l";mots[1][2] = "e";mots[1][3] = "u";mots[1][4] = "r";mots[1][5] = "s";
    mots[2][0] = "a";mots[2][1] = "m";mots[2][2] = "o";mots[2][3] = "u";mots[2][4] = "r";mots[2][5] = "s";
    mots[3][0] = "r";mots[3][1] = "o";mots[3][2] = "u";mots[3][3] = "l";mots[3][4] = "e";mots[3][5] = "r";
    mots[4][0] = "m";mots[4][1] = "a";mots[4][2] = "n";mots[4][3] = "g";mots[4][4] = "e";mots[4][5] = "r";
    mots[5][0] = "v";mots[5][1] = "a";mots[5][2] = "c";mots[5][3] = "h";mots[5][4] = "e";mots[5][5] = "s";
}


