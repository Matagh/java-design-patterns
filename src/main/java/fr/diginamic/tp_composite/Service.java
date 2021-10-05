package fr.diginamic.tp_composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement{
    private String nom;
    private List<IElement> entitesService = new ArrayList<>();

    public Service(String nom) {
        this.nom = nom;
    }

    @Override
    public double calculerSalaire() {
        double totalSalaire = 0;
        for (IElement element : entitesService) {
            totalSalaire += element.calculerSalaire();
        }
        return totalSalaire;
    }

    public void ajoutEntite(IElement entite){
        entitesService.add(entite);
    }
}
