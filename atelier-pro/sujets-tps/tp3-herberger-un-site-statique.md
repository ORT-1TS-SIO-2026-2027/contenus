### TP : Hébergement de Sites Statiques avec GitHub Pages (Dépôt Autre que `username.github.io`)

### Objectif

Apprendre à héberger un site statique sur GitHub Pages en utilisant un dépôt standard et une branche dédiée pour le déploiement.

### Prérequis

- Un compte GitHub
- Connaissances de base en HTML et CSS
- Git installé sur votre machine

### Étapes

### Étape 1 : Création d'un dépôt GitHub

1. Connectez-vous à votre compte GitHub.
2. Cliquez sur le bouton "New" pour créer un nouveau dépôt.
3. Nommez votre dépôt (par exemple : mon-site-statique).
4. Initialisez le dépôt avec un fichier README (optionnel).
5. Cliquez sur "Create repository".

### Étape 2 : Création d'un site statique

1. Clonez le dépôt sur votre machine locale :

    ```bash
    git clone <ssh://github.com/username/mon-site-statique>
    
    ```

2. Accédez au répertoire du dépôt :

    ```bash
    cd mon-site-statique
    
    ```

3. Créez un fichier `index.html` avec le contenu suivant :

    ```html
    <!DOCTYPE html>
    <html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Mon Site Statique</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <h1>Bienvenue sur mon site statique hébergé par GitHub Pages!</h1>
        <p>Ceci est un exemple de site statique.</p>
    </body>
    </html>
    
    ```

4. Créez un fichier `styles.css` pour ajouter du style :

    ```css
    body {
        font-family: Arial, sans-serif;
        text-align: center;
        margin-top: 50px;
    }
    
    h1 {
        color: #333;
    }
    
    p {
        color: #666;
    }
    
    ```


### Étape 3 : Déploiement sur GitHub Pages

1. Créez une branche `gh-pages` pour le déploiement :

    ```bash
    git checkout -b gh-pages
    
    ```

2. Ajoutez les fichiers au dépôt :

    ```bash
    git add index.html styles.css
    
    ```

3. Commitez les changements :

    ```bash
    git commit -m "Ajout des fichiers du site statique"
    
    ```

4. Poussez la branche `gh-pages` vers GitHub :

    ```bash
    git push origin gh-pages
    
    ```

5. Accédez à `https://username.github.io/mon-site-statique` dans votre navigateur pour voir votre site en ligne.


### Étape 4 : Personnalisation et gestion

- Modifiez le contenu de `index.html` et `styles.css` pour personnaliser votre site.
- Chaque fois que vous apportez des modifications, répétez les étapes de commit et de push sur la branche `gh-pages` pour mettre à jour votre site en ligne.

### Étape 5 : Insérer le code HTML

- Supprimer le contenu de `index.html` et `styles.css`
- Décompresser et déplacer le contenu du dossier source à la racine de votre repository
- Répétez les étapes de commit et de push sur la branche `gh-pages` pour mettre à jour votre site en ligne.
