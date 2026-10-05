# TP 1 - Support - Premiers Pas en JavaScript

## Introduction

JavaScript est un langage de programmation dynamique qui permet de créer des applications web interactives. Contrairement aux langages compilés, JavaScript est interprété directement par le navigateur, ce qui le rend particulièrement adapté au développement web moderne.

Ce cours vous accompagnera dans la découverte des fondamentaux du langage, en mettant l'accent sur les bonnes pratiques de programmation et la compréhension profonde des mécanismes sous-jacents.

## 1. Les Variables en JavaScript

### 1.1 Comprendre le concept de variable

Une variable est un espace mémoire nommé qui permet de stocker une valeur. Imaginez une variable comme une boîte étiquetée dans laquelle vous pouvez placer différents objets. L'étiquette correspond au nom de la variable, et le contenu de la boîte représente sa valeur.

### 1.2 Les mots-clés let et const

JavaScript moderne propose deux façons principales de déclarer des variables :

**Le mot-clé `let`** : Utilisé pour déclarer des variables dont la valeur peut changer au cours de l'exécution du programme.

```javascript
let age = 25;           // Déclaration et initialisation
age = 26;              // Modification de la valeur (autorisée)
```

**Le mot-clé `const`** : Utilisé pour déclarer des constantes, c'est-à-dire des variables dont la valeur ne doit jamais changer après leur initialisation.

```javascript
const PI = 3.14159;    // Déclaration et initialisation obligatoire
// PI = 3.14;          // Erreur ! Impossible de modifier une constante
```

### 1.3 Règles de nommage et bonnes pratiques

Les noms de variables doivent respecter certaines règles techniques :
- Commencer par une lettre, un underscore (_) ou un dollar ($)
- Contenir uniquement des lettres, chiffres, underscores et dollars
- Être sensibles à la casse (age et Age sont différents)

Les conventions de nommage recommandées :
- Utiliser la notation camelCase (premierMot, deuxiemeMot)
- Choisir des noms descriptifs et significatifs
- Éviter les abréviations obscures

```javascript
// Bon nommage
let nombreEtudiants = 30;
const TAUX_TVA = 0.20;
let estConnecte = true;

// Nommage à éviter
let n = 30;           // Trop vague
let nb_etu = 30;     // Abréviation peu claire
```

## 2. Les Types Primitifs

### 2.1 Vue d'ensemble des types primitifs

JavaScript reconnaît plusieurs types de données primitifs. Chaque type correspond à une catégorie de valeurs avec des propriétés et comportements spécifiques.

### 2.2 Le type Number

Le type Number représente tous les nombres, qu'ils soient entiers ou décimaux. JavaScript ne fait pas de distinction entre ces deux catégories, contrairement à d'autres langages.

```javascript
let entier = 42;
let decimal = 3.14;
let negatif = -15;

// Valeurs spéciales
let infini = Infinity;
let pasUnNombre = NaN;  // "Not a Number"
```

### 2.3 Le type String

Les chaînes de caractères permettent de manipuler du texte. Elles peuvent être délimitées par des guillemets simples, doubles, ou des backticks pour les template literals.

```javascript
let nom = "Dupont";
let prenom = 'Jean';
let message = `Bonjour ${prenom} ${nom}`;  // Template literal
```

### 2.4 Le type Boolean

Le type Boolean ne peut prendre que deux valeurs : `true` (vrai) ou `false` (faux). Il est essentiel pour les structures conditionnelles et la logique de programme.

```javascript
let estMajeur = true;
let aPermis = false;
```

### 2.5 Les types null et undefined

Ces deux types représentent l'absence de valeur, mais avec des nuances importantes :

- `undefined` : Variable déclarée mais non initialisée
- `null` : Absence intentionnelle de valeur

```javascript
let variableNonInitialisee;  // undefined
let variableVide = null;     // null explicite
```

### 2.6 L'opérateur typeof

L'opérateur `typeof` permet de déterminer le type d'une variable ou d'une valeur :

```javascript
console.log(typeof 42);        // "number"
console.log(typeof "texte");   // "string"
console.log(typeof true);      // "boolean"
console.log(typeof undefined); // "undefined"
```

## 3. Les Opérateurs Arithmétiques

### 3.1 Les opérateurs de base

JavaScript propose un ensemble complet d'opérateurs arithmétiques pour effectuer des calculs :

```javascript
let a = 10, b = 3;

let addition = a + b;        // 13
let soustraction = a - b;    // 7
let multiplication = a * b;  // 30
let division = a / b;        // 3.333...
let modulo = a % b;         // 1 (reste de la division)
let puissance = a ** b;     // 1000 (10 puissance 3)
```

### 3.2 Ordre de priorité des opérations

JavaScript respecte les règles mathématiques de priorité :

1. Parenthèses `()`
2. Puissance `**`
3. Multiplication `*`, Division `/`, Modulo `%`
4. Addition `+`, Soustraction `-`

```javascript
let resultat = 2 + 3 * 4;      // 14 (pas 20)
let resultatParentheses = (2 + 3) * 4;  // 20
```

### 3.3 Les opérateurs d'affectation combinée

Ces opérateurs permettent de modifier une variable en effectuant une opération :

```javascript
let compteur = 10;

compteur += 5;    // équivalent à : compteur = compteur + 5
compteur -= 2;    // équivalent à : compteur = compteur - 2
compteur *= 3;    // équivalent à : compteur = compteur * 3
compteur /= 4;    // équivalent à : compteur = compteur / 4
```

### 3.4 Les opérateurs d'incrémentation et décrémentation

Pour modifier une variable de 1, JavaScript propose des raccourcis :

```javascript
let nombre = 5;

nombre++;    // Post-incrémentation : nombre = 6
++nombre;    // Pré-incrémentation : nombre = 7
nombre--;    // Post-décrémentation : nombre = 6
--nombre;    // Pré-décrémentation : nombre = 5
```

## 4. Les Structures Conditionnelles

### 4.1 Le principe des structures conditionnelles

Les structures conditionnelles permettent d'exécuter différents blocs de code selon que certaines conditions sont vraies ou fausses. Elles constituent le fondement de la logique de programmation.

### 4.2 La structure if...else

La structure `if...else` est la plus fondamentale des structures conditionnelles :

```javascript
let age = 18;

if (age >= 18) {
    console.log("Vous êtes majeur");
} else {
    console.log("Vous êtes mineur");
}
```

### 4.3 Les conditions multiples avec else if

Pour tester plusieurs conditions successives :

```javascript
let note = 15;

if (note >= 16) {
    console.log("Très bien");
} else if (note >= 14) {
    console.log("Bien");
} else if (note >= 12) {
    console.log("Assez bien");
} else if (note >= 10) {
    console.log("Passable");
} else {
    console.log("Insuffisant");
}
```

### 4.4 Les opérateurs de comparaison

Pour construire des conditions, JavaScript propose plusieurs opérateurs :

```javascript
let a = 5, b = 10, c = "5";

// Comparaisons numériques
console.log(a < b);   // true
console.log(a > b);   // false
console.log(a <= 5);  // true
console.log(a >= 5);  // true

// Égalité et inégalité
console.log(a == c);  // true (conversion automatique)
console.log(a === c); // false (comparaison stricte)
console.log(a != b);  // true
console.log(a !== c); // true (inégalité stricte)
```

### 4.5 Les opérateurs logiques

Pour combiner plusieurs conditions :

```javascript
let age = 20;
let aPermis = true;

// ET logique (&&) : toutes les conditions doivent être vraies
if (age >= 18 && aPermis) {
    console.log("Peut conduire");
}

// OU logique (||) : au moins une condition doit être vraie
if (age < 18 || !aPermis) {
    console.log("Ne peut pas conduire");
}

// NON logique (!) : inverse la valeur booléenne
let estMineur = !(age >= 18);
```

### 4.6 L'opérateur ternaire

Pour des conditions simples, l'opérateur ternaire offre une syntaxe concise :

```javascript
let age = 17;
let statut = age >= 18 ? "majeur" : "mineur";
console.log(statut); // "mineur"
```

## 5. Bonnes Pratiques et Organisation du Code

### 5.1 La lisibilité du code

Un code lisible est un code maintenable. Quelques principes à retenir :

- Utiliser des noms de variables explicites
- Indenter correctement le code
- Ajouter des commentaires pour expliquer la logique complexe
- Espacer le code pour améliorer la lisibilité

```javascript
// Bon exemple
const SEUIL_MAJORITE = 18;
let ageUtilisateur = 17;

if (ageUtilisateur >= SEUIL_MAJORITE) {
    console.log("Accès autorisé");
} else {
    console.log("Accès refusé - Utilisateur mineur");
}
```

### 5.2 La gestion des erreurs

Anticiper les cas d'erreur améliore la robustesse du programme :

```javascript
let diviseur = 0;
let dividende = 10;

if (diviseur !== 0) {
    let resultat = dividende / diviseur;
    console.log(`Résultat : ${resultat}`);
} else {
    console.log("Erreur : Division par zéro impossible");
}
```

### 5.3 L'organisation logique

Structurer son code de manière logique facilite la compréhension et la maintenance :

1. Déclaration des constantes en début de programme
2. Déclaration et initialisation des variables
3. Logique métier (calculs, conditions)
4. Affichage des résultats

## Conclusion

Ces concepts fondamentaux constituent les briques de base de tout programme JavaScript. La maîtrise de ces éléments vous permettra d'aborder sereinement des concepts plus avancés. L'important est de pratiquer régulièrement et de toujours chercher à comprendre le "pourquoi" derrière chaque syntaxe ou mécanisme.