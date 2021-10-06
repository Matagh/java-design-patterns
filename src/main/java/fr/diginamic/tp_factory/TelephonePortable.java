package fr.diginamic.tp_factory;

public class TelephonePortable extends ObjetConnecte {
    TelephonePortable(int limiteVolts){
        super(limiteVolts);
    }

    @Override
    public String typeToString() {
        return "le téléphone portable";
    }
}
