package fr.diginamic.tp_factory;

enum TypeObjet { TelephonePortable, Tablette, Enceinte};

public abstract class ObjetConnecte {
    public int limiteVolts;

    ObjetConnecte(int limiteVolts){
        this.limiteVolts = limiteVolts;
    }

    public void recharger(int volts){
        if(volts > limiteVolts){
            System.out.println(typeToString() + " est grillé !");
        }
        else if(volts == limiteVolts){
            System.out.println(typeToString() + " est en charge");
        }
        else {
            System.out.println("La tension est insuffisante pour recharger " + typeToString());
        };
    }

    public abstract String typeToString();


}
