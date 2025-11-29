🟢 Projet : BOOKIT – Application Java Swing

Description :
BOOKIT est une application Java Swing développée avec NetBeans pour gérer la réservation des outils électroniques dans une université.
Le projet permet aux utilisateurs de consulter, réserver et gérer les équipements disponibles, et offre une interface administrateur pour le suivi des réservations.

📂 Structure des fichiers

Tous les fichiers sont dans le dossier principal (pas de sous-dossiers) :

BOOKITfinal/
│
├── acceuilAdmin1.form
├── acceuilAdmin1.java
├── acceuilList.form
├── acceuilList.java
├── acceuilListDem.form
├── acceuilListDem.java
├── connexionDb.java
├── DeleteReservation.form
├── DeleteReservation.java
├── login.form
├── login.java
├── Manage_article.form
├── Manage_article.java
├── Ordering.form
├── Ordering.java
├── premier_page.form
├── premier_page.java
├── Reserv.java
├── Reseve.form
├── Reseve.java
├── search.form
├── search.java
├── signUp.form
├── signUp.java
├── Utilisateur_home.form
└── Utilisateur_home.java

🎯 Fonctionnalités principales
1️⃣ Utilisateur

Inscription et connexion (signUp.java et login.java)

Consulter la liste des outils disponibles (acceuilList.java)

Réserver un outil (Ordering.java)

Suivre ses réservations (Utilisateur_home.java)

Recherche d’outils (search.java)

2️⃣ Administrateur

Gestion des réservations (DeleteReservation.java)

Gestion des articles/outils (Manage_article.java)

Consultation des demandes (acceuilListDem.java)

Tableau de bord administrateur (acceuilAdmin1.java)

3️⃣ Base de données

Connexion via connexionDb.java (MySQL ou autre)

Gestion des réservations et utilisateurs

🛠️ Technologies utilisées

Langage : Java 8+

Interface graphique : Swing

IDE : NetBeans

Base de données : MySQL (via JDBC)

⚙️ Installation et exécution

Ouvrir NetBeans et importer le projet :

File → Open Project → sélectionner BOOKITfinal

Configurer la base de données dans connexionDb.java :

String url = "jdbc:mysql://localhost:3306/bookit_db";
String user = "root";
String password = "";


Compiler et exécuter le projet (Run → Run Project)

Tester les fonctionnalités utilisateurs et administrateur
