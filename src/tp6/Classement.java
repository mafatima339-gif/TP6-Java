package tp6;

import java.util.*;

public class Classement {
    public static void main(String[] args) {

        //Créer TreeMap
        TreeMap<Integer, String> etudiants = new TreeMap<>();

        // Ajouter des étudiants
        etudiants.put(120, "fatima");
        etudiants.put(90, "ali");
        etudiants.put(150, "sara");
        etudiants.put(80, "hassan");
        etudiants.put(200, "youssef");

        //Afficher la liste triée automatiquement
        System.out.println("Liste triée des étudiants :");
        for (Integer num : etudiants.keySet()) {
            System.out.println(num + " : " + etudiants.get(num));
        }

        //  Afficher le premier étudiant
        System.out.println("Premier étudiant :");
        System.out.println(etudiants.firstEntry());

        // Afficher le dernier étudiant
        System.out.println("Dernier étudiant :");
        System.out.println(etudiants.lastEntry());

        //Étudiants avec numéro > 100
        System.out.println("Étudiants avec numéro > 100 :");
        for (Integer num : etudiants.keySet()) {
            if (num > 100) {
                System.out.println(num  + etudiants.get(num));
            }
        }
    }
}