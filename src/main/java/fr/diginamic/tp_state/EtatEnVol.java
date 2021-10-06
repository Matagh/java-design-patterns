package fr.diginamic.tp_state;

public class EtatEnVol implements EtatAvion {
    @Override
    public void rentrerTrainAtterrissage() {
        System.out.println("Train d'atterrissage rentré.");
    }

    @Override
    public void sortirTrainAtterrissage() {
        System.out.println("L'avion est en vol. Il est interdit de sortir le train d'atterrissage.");
    }
}
