package tp6;

import java.util.*;

public class Client {
    int numero;
    String nom;

    public Client(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public String toString() {
        return "Client{numero=" + numero + ", nom='" + nom + "'}";
    }

    public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<>();

        //Ajouter des clients
        file.add(new Client(1, "fatima"));
        file.add(new Client(2, "ali"));
        file.add(new Client(3, "sara"));

        //Afficher la file
        System.out.println("File des clients :");
        for (Client c : file) {
            System.out.println(c);
        }

        //Servir le premier client
        if (!file.isEmpty()) {
            Client servi = file.removeFirst();
            System.out.println("Client servi : " + servi);
        }

        //Ajouter un client à la fin
        file.addLast(new Client(4, "youssef"));

        //Afficher la file après ajout
        System.out.println("File après ajout :");
        for (Client c : file) {
            System.out.println(c);
        }

        //Afficher le client en tête
        if (!file.isEmpty()) {
            System.out.println("Client en tête : " + file.getFirst());
        }
    }
}