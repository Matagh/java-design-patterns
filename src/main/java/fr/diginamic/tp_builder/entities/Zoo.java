package fr.diginamic.tp_builder.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public String nom;
    public List<Zone> zones;

    public Zoo(String nom) {
        this.nom = nom;
        zones = new ArrayList<>();
    }

    public Zone getZoneByName(String nomZone){
        for (Zone zone : zones) {
            if(zone.nom.equals(nomZone))
                return zone;
        }
        return null;
    }
}
