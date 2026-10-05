# Organiser son contenu texte
## Les titres
Les éléments de titre permettent de définir certains textes comme des titres ou sous-titres pour le contenu. D'une certaine façon, ceux-ci fonctionnent comme pour un livre : on a le titre du livre (le plus important) puis les titres des différents chapitres et parfois des sous-titres au sein de ces chapitres. HTML contient des éléments pour 6 niveaux de titres : [`<h1>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/Heading_Elements)–[`<h6>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/Heading_Elements).
```HTML
<h1>Mon titre principal</h1>
<h2>Mon titre de section</h2>
<h3>Mon sous-titre</h3>
<h4>Mon sous-sous-titre</h4>
```
_**Résultat**_
![[ressources/html_2-1.png]]
## Les paragraphes
les éléments [`<p>`](https://developer.mozilla.org/fr/docs/Web/HTML/Element/p)sont utilisés pour contenir des paragraphes de texte. Vous les utiliserez fréquemment pour placer du texte sur une page.
```HTML
<p>Ceci est un paragraphe</p>
<p>
	Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
	Ut enim ad minim veniam, Duis aute irure dolor
</p>
```
_**Résultat**_
![[ressources/html_2-2.png]]
## Formater du texte
HTML contient des balises permettant de formater du texte à l’intérieur d’un élément de manière spécifique.
```HTML
<p>Texte normal</p>
<p><b>Texte en gras</b></p>
<p><strong>Texte en gras</strong></p>
<p><i>Texte en italique</i></p>
<p><em>Texte accentué</em></p>
<p><small>Texte en petit</small></p>
<p><mark>Texte surligné</mark></p>
<p><del>Texte rayé</del></p>
<p><ins>Texte souligné</ins></p>
<p>Ce <sub>texte</sub> est un demi caractère en dessous</p>
<p>Ce <sup>texte</sup> est un demi caractère en dessus</p>
```
_**Résultat**_
![[ressources/html_2-3.png]]
## Les liens
Les liens sont très importants, ce sont eux qui permettent naviguer de page en page sur l’ensemble du web
Pour créer un lien, il suffit d'utiliser l'élément `<a>` et de renseigner l’attribut `href` avec l’adresse ou l’on souhaite se rendre.
```HTML
<a href="https://youtube.com">Accéder à Youtube</a>
```
_**Résultat**_
![[ressources/html_2-4.png]]
**Il existe 4 types de liens possibles:**
- Un lien vers une autre page HTML de notre site
    
    ```HTML
    <a href="autre-page.html">Autre page</a>
    ```
    
- Un lien vers un autre site
    
    ```HTML
    <a href="https://youtube.com">Accéder à Youtube</a>
    ```
    
- Un lien vers un email
    
    ```HTML
    <a href="mailto:moi@moi.com">Envoyer un mail a moi@moi.com</a>
    ```
    
- Un lien vers une position dans la page
    
    ```HTML
    <a href="\#postion">Aller directement au contenu</a>
    ```