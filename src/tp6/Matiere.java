package tp6;

import java.util.*;

public class Matiere {
    public static void main(String[] args) {

        // Créer un HashSet
        HashSet<String> matieres = new HashSet<>();

        //Ajouter des matières
        matieres.add("Math");
        matieres.add("Physique");
        matieres.add("Informatique");
        matieres.add("Chimie");
        matieres.add("Math"); 

        //Vérifier les doublons
        // HashSet ne garde pas les doublons automatiquement

        System.out.println("Nombre de matières (sans doublons) : " + matieres.size());

        // Afficher les matières
        System.out.println("Liste des matières :");
        for (String m : matieres) {
            System.out.println(m);
        }

        //Copier dans TreeSet
        TreeSet<String> matieresTri = new TreeSet<>(matieres);

        // Afficher les matières triées
        System.out.println("Matières triées ordre alphabétique :");
        for (String m : matieresTri) {
            System.out.println(m);
        }
    }
}
