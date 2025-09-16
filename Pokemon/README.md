# TP3 - Système de Combat Pokémon

## 📋 Description du Projet

Ce projet implémente un système de combat Pokémon en Java utilisant les concepts de programmation orientée objet, notamment :
- **Héritage** : Classe abstraite `Pokemon` avec des classes dérivées spécifiques
- **Polymorphisme** : Méthodes abstraites implémentées différemment par chaque type de Pokémon
- **Encapsulation** : Attributs protégés avec getters/setters appropriés
- **Abstraction** : Interface commune pour tous les Pokémon

## 🏗️ Architecture du Projet

### Classes Principales

1. **Pokemon.java** (Classe abstraite)
   - Classe de base pour tous les Pokémon
   - Attributs : nom, type, points de vie, attaque, défense, niveau
   - Méthodes abstraites : `attaqueSpeciale()`
   - Méthodes concrètes : `attaqueBasique()`, `soigner()`, `monterNiveau()`

2. **Classes Pokémon Spécifiques**
   - **Pikachu.java** (Type Électrique)
     - Attaque spéciale : Tonnerre
     - Capacité spéciale : Charger
   - **Salameche.java** (Type Feu)
     - Attaque spéciale : Lance-Flammes
     - Capacité spéciale : Brasier
   - **Carapuce.java** (Type Eau)
     - Attaque spéciale : Hydrocanon
     - Capacité spéciale : Retrait dans la coquille
   - **Bulbizarre.java** (Type Plante)
     - Attaque spéciale : Fouet Lianes
     - Capacité spéciale : Photosynthèse

3. **Dresseur.java**
   - Gère une équipe de jusqu'à 6 Pokémon
   - Fonctionnalités : capture, soins, gestion des badges

4. **Combat.java**
   - Système de combat au tour par tour
   - Gestion des types et efficacités
   - Système de victoire et montée de niveau

5. **MainPokemon.java**
   - Programme principal de démonstration
   - Exemples d'utilisation de toutes les fonctionnalités

## ⚡ Système de Types et Efficacités

| Type Attaquant | Type Défenseur | Efficacité |
|----------------|----------------|------------|
| Électrique     | Eau           | 2x (Super efficace) |
| Électrique     | Sol           | 0x (Aucun effet) |
| Feu           | Plante        | 2x (Super efficace) |
| Feu           | Eau           | 0.5x (Peu efficace) |
| Eau           | Feu           | 2x (Super efficace) |
| Eau           | Plante        | 0.5x (Peu efficace) |
| Plante        | Eau           | 2x (Super efficace) |
| Plante        | Feu           | 0.5x (Peu efficace) |

## 🎮 Fonctionnalités Implémentées

### Combat
- Combat au tour par tour entre dresseurs
- Ordre d'attaque basé sur les statistiques
- Choix aléatoire entre attaque basique et spéciale
- Changement automatique de Pokémon quand l'un est K.O.
- Système de victoire avec montée de niveau

### Gestion des Pokémon
- Statistiques évolutives selon le niveau
- Capacités spéciales uniques par type
- Système de soins complet
- Affichage détaillé des informations

### Polymorphisme
- Démonstration claire du polymorphisme avec `attaqueSpeciale()`
- Comportements différents selon le type de Pokémon
- Interface commune pour tous les Pokémon

## 🚀 Comment Utiliser

### Compilation
```bash
javac *.java
```

### Exécution
```bash
java MainPokemon
```

### Exemple d'Utilisation Personnalisée
```java
// Créer des dresseurs
Dresseur joueur1 = new Dresseur("Ash");
Dresseur joueur2 = new Dresseur("Gary");

// Créer et ajouter des Pokémon
Pikachu pikachu = new Pikachu("Pikachu", 10);
Salameche salameche = new Salameche("Salamèche", 8);

joueur1.ajouterPokemon(pikachu);
joueur1.ajouterPokemon(salameche);

// Lancer un combat
Combat combat = new Combat(joueur1, joueur2);
combat.commencerCombat();
```

## 📊 Concepts OOP Démontrés

1. **Héritage** : Toutes les classes Pokémon héritent de la classe abstraite `Pokemon`
2. **Polymorphisme** : La méthode `attaqueSpeciale()` a des implémentations différentes
3. **Encapsulation** : Attributs privés/protégés avec accès contrôlé
4. **Abstraction** : Classe abstraite `Pokemon` définit l'interface commune

## 🎯 Objectifs Pédagogiques Atteints

- ✅ Implémentation d'une hiérarchie de classes
- ✅ Utilisation de méthodes abstraites
- ✅ Démonstration du polymorphisme
- ✅ Gestion d'objets complexes
- ✅ Système de combat interactif
- ✅ Code bien documenté et structuré

## 👨‍💻 Auteur

**Chenggong Zhang**  
Version 1.0 - 2025

---

*Ce projet fait partie du TP3 du cours de Programmation Orientée Objet avec Java.*
