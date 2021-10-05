package fr.diginamic.tp_adapter;

import fr.diginamic.singleton.externe.FicheSalaireIndividuelle;

public class FicheSalaireIndividuelleAdapter implements IDocSalaire {
    private FicheSalaireIndividuelle ficheSalaire;

    public FicheSalaireIndividuelleAdapter(FicheSalaireIndividuelle ficheSalaire) {
        this.ficheSalaire = ficheSalaire;
    }

    @Override
    public String getNom() {
        return ficheSalaire.getNomSalarie();
    }

    @Override
    public String getPrenom() {
        return ficheSalaire.getPrenomSalarie();
    }

    @Override
    public double getSalaire() {
        return ficheSalaire.getSalaire();
    }
}
