package fr.diginamic.tp_builder.builder;

import fr.diginamic.tp_builder.entities.Animal;
import fr.diginamic.tp_builder.entities.Zone;
import fr.diginamic.tp_builder.entities.Zoo;

public class ZooBuilder {
    private Zoo zoo;

    public ZooBuilder(String nom) {
        this.zoo = new Zoo(nom);
    }

    public void appendZone(String nom, int capacite){
        this.zoo.zones.add(new Zone(nom, capacite));
    }

    public void appendAnimal(String nomZone, String nomAnimal){
        Zone zone = this.zoo.getZoneByName(nomZone);
        zone.addAnimal(new Animal(nomAnimal));
    }

    public Zoo getZoo() {
        return zoo;
    }
}
