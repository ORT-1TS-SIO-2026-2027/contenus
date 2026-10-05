# Les listes
## Liste non ordonnée
L'élément HTML `**<ul>**` représente une liste d'éléments sans ordre particulier. Il est souvent représenté par une liste à puces.
```HTML
<ul>
    <li>lait</li>
    <li>tomates</li>
    <li>oeufs</li>
    <li>gruyère</li>
</ul>
```
_**Résultat**_
![[ressources/html_3-1.png]]
## Liste ordonnée
L'élément HTML `**<ol>**` représente une liste ordonnée. Les éléments d'une telle liste sont généralement affichés avec un indicateur ordinal pouvant prendre la forme de nombres, de lettres, de chiffres romains ou de points. La mise en forme de la numérotation n'est pas utilisée dans la description HTML mais dans la feuille de style CSS associée grâce à la propriété `list-style-type`.
```HTML
<ol>
    <li>Prendre une casserole et la remplier</li>
    <li>Portez l'eau à ébulition</li>
    <li>Plonger les pates dans la casserole</li>
    <li>Attendre 8 minutes</li>
    <li>Egouter les pâtes avec une passoire</li>
    <li>Assaisonner et servez !</li>
</ol>
```
_**Résultat**_
![[ressources/html_3-2.png]]

> [!important]  
> L’attribut start de l’element `<ol>` permet de déterminer indice de démarrage du compteur  

```HTML
<ol start="304">
	<li>Prendre une casserole et la remplir</li>
	<li>Portez l'eau à ébulition</li>
	<li>Plongez les pâtes dans la casserole</li>
	<li>Attendre 8 minutes</li>
	<li>Egoutez les pâtes avec une passoire</li>
	<li>Assaisonner et servez !</li>
</ol>
```
_**Résultat**_
![[ressources/html_3-3.png]]
## Liste de description
L'élément HTML `**<dl>**` représente une liste de descriptions sous la forme d'une liste de paires associant des termes (fournis par des éléments `<dt>`) et leurs descriptions ou définitions (fournies par des éléments `<dd>`).
```HTML
<dl>
    <div>
        <dt>Nom</dt>
        <dd>Godzilla</dd>
    </div>
    <div>
        <dt>Né le</dt>
        <dd>1952</dd>
    </div>
    <div>
        <dt>Lieu de naissance</dt>
        <dd>Japon</dd>
    </div>
    <div>
        <dt>Couleur</dt>
        <dd>Vert</dd>
    </div>
</dl>
```
_**Résultat**_
![[ressources/html_3-4.png]]
## Imbrications de listes
```HTML
<p>La liste des affaires du petit</p>
<ul>
    <li>Le doudou</li>
    <li>Un manteau</li>
    <li>Les affaires de toilettes
        <!-- On voit que </li> n'est pas là -->
        <ul>
            <li>Une serviette</li>
            <li>La trousse de toilette
                <!-- Là on ouvre une autre liste -->
                <ul>
                    <li>Savon</li>
                    <li>peigne</li>
                    <li>les serinfues pour déboucher le nez</li>
                </ul>
            </li> <!-- On ferme la liste la plus imbriquée -->
            <li>Le paignoire</li>
        </ul>
        <!-- On ferme la liste imbriquée avec </li> -->
    </li>
    <li>De l'essuie-tout</li>
</ul>
```
_**Résultat**_
![[ressources/html_3-5.png]]

> [!important]  
> Il est aussi possible d’imbriquer des listes ordonnée et non ordonnée