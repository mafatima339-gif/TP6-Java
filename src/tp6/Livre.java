package tp6;

import java.util.*;


class Livre {
 String isbn;
 String titre;
 String auteur;
 int annee;

 public Livre(String isbn, String titre, String auteur, int annee) {
     this.isbn = isbn;
     this.titre = titre;
     this.auteur = auteur;
     this.annee = annee;
 }

 public String toString() {
     return "Livre{ISBN=" + isbn + ", titre='" + titre + "', auteur='" + auteur + "', annee=" + annee + "}";
 }



 public static void main(String[] args) {

     //ArrayList pour les livres
     ArrayList<Livre> livres = new ArrayList<>();

     livres.add(new Livre("1", "Java", "Ali", 2020));
     livres.add(new Livre("2", "traitement d'image", "fatima", 2021));
     livres.add(new Livre("3", "ML2", "Hassan", 2019));

     // HashSet pour les catégories
     HashSet<String> categories = new HashSet<>();
     categories.add("Programmation");
     categories.add("Base de données");
     categories.add("Programmation"); // doublon ignoré

     // HashMap (étudiant : livre emprunté)
     HashMap<String, Livre> emprunts = new HashMap<>();
     emprunts.put("fatima", livres.get(0));
     emprunts.put("ali", livres.get(1));

     // Afficher tous les livres
     System.out.println("Liste des livres :");
     for (Livre l : livres) {
         System.out.println(l);
     }

     //Rechercher un livre par titre
     System.out.println("Recherche livre 'Java' :");
     for (Livre l : livres) {
         if (l.titre.equals("Java")) {
             System.out.println(l);
         }
     }

     //Supprimer un livre (ISBN = "333")
     for (int i = 0; i < livres.size(); i++) {
         if (livres.get(i).isbn.equals("3")) {
             livres.remove(i);
             break;
         }
     }
     System.out.println("Livres après suppression :");
     for (Livre l : livres) {
         System.out.println(l);
     }

     //Afficher catégories
     System.out.println("Catégories :");
     for (String c : categories) {
         System.out.println(c);
     }

     // Afficher les emprunts
     System.out.println("Emprunts :");
     for (String etu : emprunts.keySet()) {
         System.out.println(etu + " a emprunté : " + emprunts.get(etu));
     }

     // 🔹 10. Rapport final
     System.out.println("RAPPORT FINAL");
     System.out.println("Nombre de livres : " + livres.size());
     System.out.println("Nombre de catégories : " + categories.size());
     System.out.println("Nombre d'emprunts : " + emprunts.size());
 }
}