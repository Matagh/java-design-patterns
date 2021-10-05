package fr.diginamic.tp_builder.entities;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    public String nom;
    public int capacite;
    public List<Animal> animaux;

    public Zone(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
        animaux = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        if(this.animaux.size() >= capacite){
            System.err.println("Capacité limite de la zone déja atteinte");
            return;
        }

        this.animaux.add(animal);
    }
}
