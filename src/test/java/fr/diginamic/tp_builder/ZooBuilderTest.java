package fr.diginamic.tp_builder;

import fr.diginamic.tp_builder.builder.ZooBuilder;
import fr.diginamic.tp_grasps.Params;
import fr.diginamic.tp_grasps.ReservationController;
import fr.diginamic.tp_grasps.beans.Reservation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZooBuilderTest {
    @Test
    public void testCreerZooNominal() {

        ZooBuilder zooBuilder = new ZooBuilder("Zoo de Beauval");
        zooBuilder.appendZone("Zone des félins", 3);
        zooBuilder.appendAnimal("Zone des félins", "Simba");

        assertEquals("Zoo de Beauval", zooBuilder.getZoo().nom);
        assertEquals("Zone des félins", zooBuilder.getZoo().zones.get(0).nom);
        assertEquals("Simba", zooBuilder.getZoo().zones.get(0).animaux.get(0).nom);
    }

    @Test
    public void testCreerZooCapaciteLimite(){

    }
}
