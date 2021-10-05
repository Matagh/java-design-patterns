package fr.diginamic.singleton;

import fr.diginamic.singleton.externe.FicheSalaireIndividuelle;
import fr.diginamic.tp_adapter.FicheSalaireIndividuelleAdapter;

public class DemoGeneration {

	public static void main(String[] args) {
		
		BulletinSalaire bs = new BulletinSalaire("Untel", "Bob", 2337.5);
		FicheSalaireIndividuelle fs = new FicheSalaireIndividuelle("Atan", "Charles", 4500);

		//Adapter
		FicheSalaireIndividuelleAdapter adapterFicheSalaire = new FicheSalaireIndividuelleAdapter(fs);
		
		SystemeGestion sg = new SystemeGestion();
		sg.genererPdf(bs, "D:/bulletin_salaire.pdf");
		sg.genererPdf(adapterFicheSalaire, "D:/fiche_salaire.pdf");
	}

}
