# Les tableaux

Un tableau est un ensemble structuré de données (**table de données**) présentées en lignes et colonnes. Un tableau vous permet de retrouver rapidement et facilement des valeurs au croisement entre différents types de données.

(facultatif) Ajouter un style aux tableaux

```CSS
<link rel="stylesheet" href="tables.css">
```
**_tables.css_**
```CSS
html {
    font-family: sans-serif;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align: center;
    padding: 10px 20px;
}
```

# Tableau simple
```HTML
<table >
    <tr>
        <td>ligne 1 colonne 1</td>
        <td>ligne 1 colonne 2</td>
        <td>ligne 1 colonne 3</td>
    </tr>
    <tr>
        <td>ligne 2 colonne 1</td>
        <td>ligne 2 colonne 2</td>
        <td>ligne 2 colonne 3</td>
    </tr>
</table>
```
**Résultat**
![[ressources/html_4-1.png]]
# Ajouter un titre au tableau
```HTML
<table >
    <caption>Titre du tableau simple</caption>
    <tr>
        <td>ligne 1 colonne 1</td>
        <td>ligne 1 colonne 2</td>
        <td>ligne 1 colonne 3</td>
    </tr>
    <tr>
        <td>ligne 2 colonne 1</td>
        <td>ligne 2 colonne 2</td>
        <td>ligne 2 colonne 3</td>
    </tr>
</table>
```
**Résultat**
![[ressources/html_4-2.png]]
# Ajouter des headers de colonnes
```HTML
<table >
    <thead>
        <tr>
            <th>Header colonne 1</th>
            <th>Header colonne 3</th>
            <th>Header colonne 4</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>ligne 1 colonne 1</td>
            <td>ligne 1 colonne 2</td>
            <td>ligne 1 colonne 3</td>
        </tr>
        <tr>
            <td>ligne 2 colonne 1</td>
            <td>ligne 2 colonne 2</td>
            <td>ligne 2 colonne 3</td>
        </tr>
    </tbody>
</table>
```
**Résultat**
![[ressources/html_4-3.png]]
# Ajouter des headers de lignes
```HTML
<table >
    <thead>
    <tr>
        <th></th>
        <th>Header colonne 1</th>
        <th>Header colonne 3</th>
        <th>Header colonne 4</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th>Ligne 1</th>
        <td>ligne 1 colonne 1</td>
        <td>ligne 1 colonne 2</td>
        <td>ligne 1 colonne 3</td>
    </tr>
    <tr>
        <th>Ligne 2</th>
        <td>ligne 2 colonne 1</td>
        <td>ligne 2 colonne 2</td>
        <td>ligne 2 colonne 3</td>
    </tr>
    </tbody>
</table>
```
**Résultat**
![[ressources/html_4-4.png]]
# Fusion de cellules
```HTML
<table >
        <thead>
        <tr>
            <th></th>
            <th>Header colonne 1</th>
            <th>Header colonne 2</th>
            <th>Header colonne 3</th>
            <th>Header colonne 4</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>Ligne 1</th>
            <td rowspan="2">ligne 1 et 2 colonne 1</td>
            <td>ligne 1 colonne 2</td>
            <td>ligne 1 colonne 3</td>
            <td rowspan="3">ligne 1,2 et 3 colonne 4</td>
        </tr>
        <tr>
            <th>Ligne 2</th>
			<!--  <td>ligne 2 colonne 1</td>-->
            <td>ligne 2 colonne 2</td>
            <td>ligne 2 colonne 3</td>
			<!--  <td>ligne 2 colonne 4</td>-->
        </tr>
	        <tr>
            <th>Ligne 3</th>
            <td>ligne 3 colonne 1</td>
            <td>ligne 3 colonne 2</td>
            <td>ligne 3 colonne 3</td>
			<!--  <td>ligne 3 colonne 4</td>-->
        </tr>
        <tr>
            <th>Ligne 4</th>
            <td colspan="2">ligne 4 colonne 1 et 2</td>
			<!--  <td>ligne 4 colonne 2</td>-->
            <td>ligne 4 colonne 3</td>
            <td>ligne 4 colonne 4</td>
        </tr>
        </tbody>
    </table>
```
**Résultat**
![[ressources/html_4-5.png]]
