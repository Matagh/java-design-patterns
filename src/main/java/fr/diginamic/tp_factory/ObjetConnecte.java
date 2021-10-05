package fr.diginamic.tp_factory;

enum TypeObjet { TelephonePortable, Tablette, Enceinte};

public class ObjetConnecte {
    public int limiteVolts;

    ObjetConnecte(int limiteVolts){
        this.limiteVolts = limiteVolts;
    }
}
