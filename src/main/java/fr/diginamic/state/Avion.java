package fr.diginamic.state;

import fr.diginamic.tp_state.EtatAvion;

public class Avion {

	//private String etat;
	private EtatAvion etat;
	private String etatTrain;
	
	public void rentrerTrainAtterrissage() {
		etat.rentrerTrainAtterrissage();
	}
	
	public void sortirTrainAtterrissage() {
		etat.sortirTrainAtterrissage();
	}

	/** Getter
	 * @return the etat
	 */
	public EtatAvion getEtat() {
		return etat;
	}

	/** Setter
	 * @param etat the etat to set
	 */
	public void setEtat(EtatAvion etat) {
		this.etat = etat;
	}
}
