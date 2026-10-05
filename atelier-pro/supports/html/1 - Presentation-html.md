# Présentation

**HTML** signifie « _HyperText Markup Language_» qu'on peut traduire par « langage de balises pour l'hypertexte ».
Il est utilisé afin de créer et de représenter le contenu d'une page web et sa structure. D'autres technologies sont utilisées avec HTML pour décrire la présentation d'une page (CSS) et/ou ses fonctionnalités interactives (JavaScript).
**Une balise**  est un code définissant un format de présentation de l’information.
# Anatomie d’une balise
![[ressources/html_1-1.png]]11_
Les composants principaux de notre élément sont :
- **La balise ouvrante :** celle-ci se compose du nom de l'élément (ici « p »), entre deux **chevrons**. Cela indique le début de l'élément, soit l'endroit à partir duquel celui-ci prend effet. Pour notre exemple, cela indique le début du paragraphe.
- **La balise fermante :** ici on a également des chevrons et le nom de l'élément, auxquels on ajoute une barre oblique avant le nom de l'élément. Cela indique la fin de l'élément. Pour notre exemple, cela indique la fin du paragraphe. Oublier la balise fermante est une erreur courante de débutant et peut conduire à de curieux résultats.
- **Le contenu :** C'est le contenu de l'élément. Ici, c'est simplement du texte.
- **L'élément :** Il est composé de la balise ouvrante, de la balise fermante et du contenu.

Les éléments peuvent aussi avoir des « attributs », ce qui ressemble à :
![[ressources/html_1-2.png]]

Les attributs contiennent des informations supplémentaires qui portent sur l'élément et qu'on ne souhaite pas afficher avec le contenu. Dans cet exemple, l'attribut `class` permet d'utiliser un nom pour identifier l'élément et ce nom pourra être utilisé plus tard pour la mise en forme ou autre chose.
Un attribut doit toujours avoir :
- Un espace entre l'attribut et le nom de l'élément ou l'attribut précédent (s'il y a plusieurs attributs) ;
- Un nom (le nom de l'attribut), suivi d'un signe égal « = » ;
- Des guillemets anglais (") pour encadrer la valeur de l'attribut.
# Imbrication des éléments
Vous pouvez placer des éléments au sein d'autres éléments, c'est ce qu'on appelle l'**imbrication**.
Par exemple, si vous souhaitez montrer que le chat de la voisine est **très gros**, vous pouvez placer le mot « gros ! » dans un élément [`<strong>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/strong), signifiant que le mot sera fortement mis en relief :

![[ressources/html_1-3.png]]
# Les éléments vides ou balises auto-fermantes
Certains éléments n'ont pas de contenu. Ces éléments sont appelés **éléments vides**. Prenons l'élément [`<img>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/Img) présent dans notre fichier HTML

![[ressourceshtml_1-4.png]]

Cet élément contient deux attributs mais les balises ouvrante `<img>`  
 et fermante   
`</img>`sont remplacées par une balise auto-fermante `<img />` et il n'y a aucun contenu interne.
En effet, l'élément image n'embarque pas de contenu, son but est d'intégrer une image dans la page HTML, à l'endroit où l'élément est placé.
# Structure d’un document HTML
![[ressources/html_1-5.png]]
Cet exemple contient :
- `<!DOCTYPE html>` :

  Au début de HTML, dans les années 1991-1992, les _doctypes_ étaient utilisés pour faire référence à des ensembles de règles qu'on pouvait utiliser pour dire qu'un document était du HTML « valide » et détecter les erreurs de balisage. Cependant, ceux-ci ne sont plus utilisés aujourd'hui et sont juste présents pour s'assurer que la page puisse fonctionner y compris sur les anciens navigateurs.

- `<html></html>` :

  Cet élément encadre tout le contenu de la page. Cet élément est parfois appelé l'élément racine.

- `<head></head>` :

  l'élément `<head>`. Cet élément est utilisé comme un container pour toutes les choses qui font partie de la page HTML mais qui ne sont pas du contenu affiché. C'est dans cet élément qu'on mettra des [mots-clés](https://developer.mozilla.org/fr/docs/Glossary/Keyword), une description de la page qui apparaîtra sur les moteurs de recherche, les liens vers les fichiers CSS à utiliser pour la mise en forme, les déclarations des jeux de caractères à utiliser et ainsi de suite.

- `<body></body>` :

  Cet élément est celui qui contient _tout_ le contenu que vous souhaitez afficher pour qu'il soit vu par les visiteurs : cela peut être du texte, des images, des vidéos, des jeux, des pistes audio jouables, et ainsi de suite.

- `<meta charset="utf-8">` :

  Cet élément définit le jeu de caractères qui devrait être utilisé pour le document et indique que c'est utf-8. utf-8 regroupe l'ensemble des caractères connus utilisés dans les différents langages humains. Généralement, utf-8 permet de gérer n'importe quel texte que vous pourriez utiliser sur la page. Il n'y a pas de raison de ne pas le définir, et il permet d'éviter certains problèmes plus tard.

- `<title></title>` :

  Cet élément définit le titre de votre page. C'est ce titre qui apparaîtra sur l'onglet lorsque la page sera chargée. C'est également ce titre qui sera utilisé pour décrire la page lorsque vous la placez dans vos marques-pages.

# Balises Structurantes et sémantique
Dans votre code HTML, vous pouvez marquer des sections de contenu selon leur fonction.
Vous pouvez utiliser des éléments qui représentent sans ambiguïté les sections de contenu décrites ci-dessus, et les technologies d'assistance comme les lecteurs d'écran peuvent reconnaître ces éléments et vous aider avec des tâches comme « trouver la navigation principale » ou « trouver le contenu principal ».
![[ressources/html_1-6.png]]
Pour mettre en œuvre le marquage sémantique, HTML fournit des balises dédiées que vous pourrez utiliser pour représenter ces parties, par exemple :
- **header :** [`<header>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/header).
- **barre de navigation :** [`<nav>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/nav).
- **contenu principal :** [`<main>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/main), avec diverses sous‑sections de contenu représentées à l'aide de des éléments [`<article>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/article), [`<section>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/section) et [`<div>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/div).
- **barre latérale :** [`<aside>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/aside) ; souvent mise à l'intérieur de l'élément [`<main>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/main).
- **pied de page :** [`<footer>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/footer).