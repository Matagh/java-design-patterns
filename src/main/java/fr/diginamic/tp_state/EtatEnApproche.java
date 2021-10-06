package fr.diginamic.tp_state;

public class EtatEnApproche implements EtatAvion {
    @Override
    public void rentrerTrainAtterrissage() {
        System.out.println("Nous allons atterrir. Il est impossible de rentrer le train d'atterrissage.");
    }

    @Override
    public void sortirTrainAtterrissage() {
        System.out.println("Nous allons atterrir. Le train d'atterrissage est sorti.");
    }
}
