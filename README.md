# Chapitre 08 – TD Tests Unitaires avec JUnit 5

**LPRGL3 – Projet Informatique II | PIGIER Côte d'Ivoire**

---

## Description

Ce projet Java illustre le développement piloté par les tests (TDD) à l'aide de **JUnit 5**.  
Il modélise une bibliothèque virtuelle (`BookShelf`) permettant d'ajouter, trier et regrouper des livres.

---

## Technologies utilisées

- Java JDK 21
- JUnit 5 (Jupiter)
- AssertJ
- IntelliJ IDEA

---

## Structure du projet

```
src/
└── bookstoread/
    ├── Book.java          # Modèle d'un livre (titre, auteur, date de publication)
    ├── BookShelf.java     # Logique principale (add, books, arrange, groupBy...)
    └── BookShelfSpec.java # Classe de tests JUnit 5
```

---

## Fonctionnalités testées

| Fonctionnalité | Description |
|---|---|
| Étagère vide | Une nouvelle étagère ne contient aucun livre |
| Ajout de livres | Ajout de plusieurs livres en un seul appel |
| Immuabilité | La liste retournée par `books()` n'est pas modifiable |
| Tri lexicographique | Les livres sont triés par titre (ordre naturel) |
| Tri personnalisé | Tri selon un `Comparator` fourni par l'utilisateur |
| Groupement | Regroupement des livres par année de publication ou critère personnalisé |

---

## Exécution des tests

Ouvrir le projet dans **IntelliJ IDEA** et exécuter la classe `BookShelfSpec` avec le runner JUnit intégré.

---

## Auteur 
Yankey N'wollé Ange Christian
