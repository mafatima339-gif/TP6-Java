package tp6;
import java.util.*;


public class Etudiant {
	 int id ;
	 String nom;
	 double moyenne ; 

	public Etudiant(int id,String nom,double moyenne) {
		this.id = id;
		this.nom = nom;
		this.moyenne = moyenne;
	}
	
	public String toString() {
        return "Etudiant{id=" + id + ", nom='" + nom + "', moyenne=" + moyenne + "}";
    }
	
	public static void main(String[] args) {
		ArrayList<Etudiant> Liste = new ArrayList<>();
		 
		Liste.add(new Etudiant(0, "fatima", 18));
		Liste.add(new Etudiant(1, "wissam", 19));
		Liste.add(new Etudiant(2, "ali", 16));
		Liste.add(new Etudiant(3, "hassan", 15));
		Liste.add(new Etudiant(4, "soufian", 12));
		
		//afficher
		System.out.println("Liste des étudaint");
		for(Etudiant e : Liste) {
			System.out.println(e);
		}
		
		//rechercher un étudiant par son nom=fatima
		System.out.println("rechercher un étudiant par son nom");
		for(Etudiant e : Liste) {
			if(e.nom.equals("fatima")) {
				System.out.println(e);
			}
		}
		
		//rechercher un étudiant par son id=3
		System.out.println("rechercher un étudiant par son id ");
		for(Etudiant e : Liste) {
			if(e.id == 3) {
				System.out.println(e);
			}
		}
		
		//supprimer un étudiant par son id
		Liste.remove(2);
		System.out.println("Liste apres la suppression :");
		for (Etudiant e : Liste) {
            System.out.println(e);
        }
		// trier par moyenne croissante
        Collections.sort(Liste, new Comparator<Etudiant>() {
            public int compare(Etudiant e1, Etudiant e2) {
                return Double.compare(e1.moyenne, e2.moyenne);
            }
        });

        // afficher après tri
        System.out.println("Liste triée par moyenne :");
        for (Etudiant e : Liste) {
            System.out.println(e);
		
		
         
	}
	

}
}	
