package fr.diginamic.tp_factory;

public class TestObjetConnecte {
    public static void main(String[] args) {
        ObjetConnecte telephone = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TelephonePortable, 12);
        ObjetConnecte tablette = ObjetConnecteFactory.getObjetConnecte(TypeObjet.Tablette, 24);
        ObjetConnecte enceinte = ObjetConnecteFactory.getObjetConnecte(TypeObjet.Enceinte, 6);

        telephone.recharger(12);
        tablette.recharger(21);
        enceinte.recharger(24);

    }
}
