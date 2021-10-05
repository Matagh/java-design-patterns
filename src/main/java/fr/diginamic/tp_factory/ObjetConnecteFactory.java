package fr.diginamic.tp_factory;

public class ObjetConnecteFactory {
    public static ObjetConnecte getObjetConnecte(TypeObjet type, int limiteVolts){
        if(type == TypeObjet.TelephonePortable){
            return new TelephonePortable(limiteVolts);
        }
        else if(type == TypeObjet.Tablette){
            return new Tablette(limiteVolts);
        }
        else if(type == TypeObjet.Enceinte){
            return new EnceinteConnectee(limiteVolts);
        }
        return null;
    }
}
