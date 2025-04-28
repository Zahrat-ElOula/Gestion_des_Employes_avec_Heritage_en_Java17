# 👨‍💼👩‍💻 Gestion des Employés avec Héritage en Java 17

## 📚 Description
Ce projet illustre l'utilisation des nouvelles fonctionnalités d'héritage introduites en **Java 17** (`sealed`, `non-sealed`, `final`) à travers une hiérarchie de classes représentant différents types d'employés.

## ✨ Fonctionnalités
- 🧑‍💼 **Employee** (classe `sealed`) : Classe de base pour **Manager**, **Developer** et **Intern**.
- 👨‍💼 **Manager** (`final`) : Ne peut pas être hérité. Peut organiser des réunions 🗣️.
- 👩‍💻 **Developer** (`non-sealed`) : Peut être hérité. Peut écrire du code 💻.
- 🚀 **SoftwareEngineer** : Hérite de Developer et peut déployer du code en production.
- 🎓 **Intern** (`sealed`) : Classe de base uniquement pour **SoftwareIntern**.
- 🛠️ **SoftwareIntern** (`final`) : Ne peut pas être hérité. Peut développer de petites fonctionnalités.

## ▶️ Exécution
Dans la classe `Main` :
- Créer un **Manager** et appeler ses méthodes.
- Créer un **Developer** et appeler ses méthodes.
- Créer un **SoftwareEngineer** et appeler ses méthodes.
- Créer un **SoftwareIntern** et appeler ses méthodes.

## 🛠️ Technologies utilisées
- ☕ **Java 17**

## 🚀 Comment exécuter
1. Compiler toutes les classes Java :
   javac *.java
   
3. Exécuter la classe principale :
   java Main


# 👨‍💼👩‍💻 Employee Management with Inheritance in Java 17

## 📚 Description
This project demonstrates the use of new inheritance features introduced in **Java 17** (`sealed`, `non-sealed`, `final`) through a class hierarchy representing different types of employees.

## ✨ Features
- 🧑‍💼 **Employee** (sealed class): Base class for **Manager**, **Developer**, and **Intern**.
- 👨‍💼 **Manager** (`final`): Cannot be inherited. Can organize meetings 🗣️.
- 👩‍💻 **Developer** (`non-sealed`): Can be inherited. Can write code 💻.
- 🚀 **SoftwareEngineer**: Inherits from Developer and can deploy code to production.
- 🎓 **Intern** (`sealed`): Base class only for **SoftwareIntern**.
- 🛠️ **SoftwareIntern** (`final`): Cannot be inherited. Can develop small features.

## ▶️ Execution
In the `Main` class:
- Create a **Manager** and call its methods.
- Create a **Developer** and call its methods.
- Create a **SoftwareEngineer** and call its methods.
- Create a **SoftwareIntern** and call its methods.

## 🛠️ Technologies Used
- ☕ **Java 17**

## 🚀 How to Run
1. Compile all Java classes:
   javac *.java

2. Run the main class:
   java Main
   


