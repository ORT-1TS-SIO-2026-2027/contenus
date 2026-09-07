
### TP - Ajoutez des fichiers dans GIT

### Objectif :

Apprendre à utiliser les commandes de base de Git pour gérer un repository local et le synchroniser avec un repository distant.

### Prérequis :

- Avoir Git installé sur votre machine.
- Avoir un compte sur GitHub
- Création d'un `repository` sur Github dont le nom est `test-git`

### Étapes du TP :

1. **Cloner d'un dépôt Github :**
    - Ouvrez un terminal et naviguez jusqu'à votre répertoire de travail désiré.
    - Clonez un repository Git dans ce répertoire.

```bash
git clone mettre_url_clone_github_ssh
```

- Entrez dans le répertoire "test-git" (avec la commande )

1. **Création d'un fichier et ajout au suivi de Git :**
    - Créez un nouveau fichier `README.md` dans ce répertoire.
    - Ajoutez du contenu à ce fichier.

```
# Mon premier TP sous GIT

Voici mes premières lignes de commande sur GIT

```

- Ajoutez ce fichier au suivi de Git.

```bash
git add README.md

```

1. **Création d'un commit :**
    - Créez un commit pour enregistrer les modifications ajoutées.

```bash
git commit -m "Ajout du fichier README.md"

```

1. **Pousser les modifications vers le dépôt distant :**
    - Poussez vos modifications locales vers le repository distant sur GitHub.

```bash
git push

```

1. **Vérification sur GitHub :**
    - Allez sur la page de votre repository GitHub et vérifiez que le fichier `README.md` est bien présent avec le contenu que vous avez ajouté.

### Questions à chercher :

1. Que fait la commande `git add` ?
2. Quelle est la différence entre `git commit` et `git push` ?
3. Pourquoi est-il important de créer des messages de commit clairs et descriptifs ?