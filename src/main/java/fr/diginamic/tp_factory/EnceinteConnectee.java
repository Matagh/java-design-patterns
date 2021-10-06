package fr.diginamic.tp_factory;

public class EnceinteConnectee extends ObjetConnecte {
    EnceinteConnectee(int limiteVolts){
        super(limiteVolts);
    }

    @Override
    public String typeToString() {
        return "l'enceinte connectée";
    }
}
