package fr.diginamic.state;

import fr.diginamic.tp_state.EtatAuSol;
import fr.diginamic.tp_state.EtatEnApproche;
import fr.diginamic.tp_state.EtatEnVol;

public class DemoAvion {

	public static void main(String[] args) {
		Avion avion = new Avion();
		avion.setEtat(new EtatAuSol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat(new EtatEnVol());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();
		
		avion.setEtat(new EtatEnApproche());
		avion.rentrerTrainAtterrissage();
		avion.sortirTrainAtterrissage();

	}

}
