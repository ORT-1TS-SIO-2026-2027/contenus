void main()
{
    Scanner scanner = new Scanner(System.in);
    int anciennete;
    double salaire;
    String niveau;
    double tauxNiveau = 15;
    double tauxAnciennete = 0;
    double tauxSalaire = 0;
    do {
        System.out.print("Ancienneté en années : ");
        anciennete = scanner.nextInt();
    }while(anciennete < 0);

    do {
        System.out.print("Salaire mensuel brut : ");
        salaire = scanner.nextDouble();
    }while(salaire < 0);

    System.out.print("Niveau du développeur (junior/confirme/senior) : ");
    niveau = scanner.next();

    if (niveau.equals("junior"))
    {
        tauxNiveau = 5;
    }
    else if (niveau.equals("confirme"))
    {
        tauxNiveau = 10;
    }

    if (anciennete >= 5)
    {
        tauxAnciennete = 5;
    }
    else if (anciennete >= 2)
    {
        tauxAnciennete = 3;
    }

    if (salaire >= 4000)
    {
        tauxSalaire = 2;
    }
    double tauxTotal = tauxNiveau + tauxAnciennete + tauxSalaire;
    double prime = salaire * tauxTotal / 100;
    double primeExceptionnelle = 0;

    if (tauxTotal >= 20)
    {
        primeExceptionnelle = 500;
    }
    double primeFinale = prime + primeExceptionnelle;

    System.out.println("Ancienneté : " + anciennete + " ans");
    System.out.println("Salaire mensuel : " + salaire + " €");
    System.out.println("Niveau : " + niveau);
    System.out.println("Taux niveau : " + tauxNiveau);
    System.out.println("Bonus ancienneté : " + tauxAnciennete);
    System.out.println("Bonus salaire : " + tauxSalaire);
    System.out.println("Taux total : " + tauxTotal);
    System.out.println("Prime : " + prime);
    System.out.println("Prime exceptionnelle : " + primeExceptionnelle);
    System.out.println("PRIME FINALE : " + primeFinale);
}
