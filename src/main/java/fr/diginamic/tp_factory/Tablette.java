package fr.diginamic.tp_factory;

public class Tablette extends ObjetConnecte {
    Tablette(int limiteVolts){
        super(limiteVolts);
    }

    @Override
    public String typeToString() {
        return "la tablette";
    }
}
