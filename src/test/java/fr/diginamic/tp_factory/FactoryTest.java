package fr.diginamic.tp_factory;

import org.junit.Test;

public class FactoryTest {
    @Test
    public void testCreateTelephonePortable(){
        ObjetConnecte telephone = ObjetConnecteFactory.getObjetConnecte(TypeObjet.TelephonePortable, 12);

    }
}
