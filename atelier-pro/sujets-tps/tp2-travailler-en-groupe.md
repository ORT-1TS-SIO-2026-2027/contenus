### TP - Travailler en groupe avec GIT

### Objectif :

Apprendre à collaborer sur un projet en utilisant Git, en se concentrant sur les fonctionnalités de branchement, de fusion, et de gestion des conflits.

### Prérequis :

- Avoir Git installé sur votre machine.
- Avoir un compte sur GitHub.
- Avoir complété le TP précédent sur "l'ajout de fichiers dans Git".

### Étapes du TP :

1. **Création d'un dépôt collaboratif :**

    - Un membre du groupe crée un nouveau repository sur GitHub nommé `projet-groupe`.
    - Ajoutez les autres membres du groupe en tant que collaborateurs sur le repository GitHub.
2. **Clonage du dépôt :**

    - Chaque membre du groupe clone le repository `projet-groupe` sur sa machine locale.

    ```bash
    git clone mettre_url_clone_github_ssh
    
    ```

3. **Création de branches :**

    - Chaque membre crée une nouvelle branche pour travailler sur une fonctionnalité spécifique.

    ```bash
    git checkout -b feature-nom
    
    ```


> Note : Remplacez nom par le nom de la fonctionnalité sur laquelle vous travaillez. Exemple : feature-authentification, feature-interface, etc.

1. **Développement sur les branches :**

    - Chaque membre ajoute un fichier ou modifie un fichier existant dans sa branche.
    - Ajoutez et commitez les modifications.

    ```bash
    git add nom_du_fichier
    git commit -m "Description des modifications"
    
    ```

2. **Pousser les branches vers le dépôt distant :**

    - Chaque membre pousse sa branche vers le repository distant.

    ```bash
    git push origin feature-nom
    
    ```


> Note : Remplacez nom par le nom de votre branche que vous avez créée en étape 3.

1. **Revue de code et Pull Request :**

    - Sur GitHub, chaque membre crée une Pull Request pour sa branche.
    - Les autres membres du groupe examinent la Pull Request et fournissent des commentaires.
2. **Fusion des branches :**

    - Une fois approuvée, la branche est fusionnée dans la branche principale (`main`).
    - Résolvez les conflits si nécessaire.

    ```bash
    git checkout main
    git merge feature-nom
    
    ```


> Note : Remplacez nom par le nom de votre branche que vous avez créée en étape 3.

1. **Synchronisation des modifications :**

    - Chaque membre met à jour sa branche principale locale avec les dernières modifications.

    ```bash
    git pull origin main
    
    ```


### Questions à explorer :

1. Quelle est l'importance de travailler sur des branches séparées lors du développement collaboratif ?
2. Comment Git aide-t-il à gérer les conflits lors de la fusion de branches ?
3. Pourquoi est-il important de faire une revue de code avant de fusionner une branche ?