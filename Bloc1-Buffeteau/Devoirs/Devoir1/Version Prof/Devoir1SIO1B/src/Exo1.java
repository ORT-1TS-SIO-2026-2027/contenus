void main()
{
    Scanner scanner = new Scanner(System.in);

    int nbIncidents;
    double tempsReponse;
    String typeServeur;
    int scorePerformance = 40;
    int penalite = 30;
    double coefficient = 0.90;
    double indiceFinal;

    do {
        System.out.print("Nombre d'incidents : ");
        nbIncidents = scanner.nextInt();
    }while (nbIncidents < 0);

    do {
        System.out.print("Temps de réponse moyen (ms) : ");
        tempsReponse = scanner.nextDouble();
    }while (tempsReponse <= 0);

    System.out.print("Type de serveur (web/bdd/fichier) : ");
    typeServeur = scanner.next();

    if (tempsReponse < 100) {
        scorePerformance = 100;
    } else if (tempsReponse < 300) {
        scorePerformance = 80;
    } else if (tempsReponse <= 500) {
        scorePerformance = 60;
    }

    if (nbIncidents == 0) {
        penalite = 0;
    } else if (nbIncidents <= 2) {
        penalite = 5;
    } else if (nbIncidents <= 5) {
        penalite = 15;
    }

    if (typeServeur.equals("web")) {
        coefficient = 1.00;
    } else if (typeServeur.equals("bdd")) {
        coefficient = 1.10;
    }

    indiceFinal = (scorePerformance - penalite) * coefficient;

    String etatServeur = "CRITIQUE";

    if (indiceFinal >= 90) {
        etatServeur = "EXCELLENT";
    } else if (indiceFinal >= 70) {
        etatServeur = "BON";
    } else if (indiceFinal >= 50) {
        etatServeur = "A SURVEILLER";
    }

    System.out.println("Type de serveur     : " + typeServeur);
    System.out.println("Nombre d'incidents  : " + nbIncidents);
    System.out.println("Temps de réponse    : " + tempsReponse);

    System.out.println("Score performance   : " + scorePerformance);
    System.out.println("Pénalité incidents  : " + penalite);
    System.out.println("Coefficient serveur : " + coefficient);
    System.out.println("Indice final        : " + indiceFinal);

    System.out.println("État du serveur     : " + etatServeur);

}