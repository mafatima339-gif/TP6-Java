package tp6;

import java.util.*;

public class Notes {
    public static void main(String[] args) {

        //Créer HashMap
        HashMap<String, Double> notes = new HashMap<>();

        //Ajouter des étudiants
        notes.put("fatima", 18.0);
        notes.put("ali", 15.5);
        notes.put("sara", 17.0);
        notes.put("hassan", 12.0);

        //Afficher toutes les notes
        System.out.println("Liste des étudiants et leurs notes :");
        for (String nom : notes.keySet()) {
            System.out.println(nom + " : " + notes.get(nom));
        }

        //Rechercher la note d’un étudiant
        System.out.println("Recherche note de sara :");
        if (notes.containsKey("sara")) {
            System.out.println("Note : " + notes.get("sara"));
        } 

        //Modifier la note
        notes.put("ali", 16.5); 
        System.out.println("Nouvelle note de ali : " + notes.get("ali"));

        // Supprimer un étudiant
        notes.remove("hassan");
        System.out.println("Liste après suppression :");
        for (String nom : notes.keySet()) {
            System.out.println(nom + " : " + notes.get(nom));
        }

        // Calculer la moyenne générale
        double somme = 0;
        for (double note : notes.values()) {
            somme += note;
        }

        double moyenne = somme / notes.size();
        System.out.println("Moyenne générale : " + moyenne);
    }
}
