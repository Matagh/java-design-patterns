package fr.diginamic.singleton;

import fr.diginamic.tp_adapter.IDocSalaire;

/** Système de gestion de la paye
 * @author RichardBONNAMY
 *
 */
public class SystemeGestion {

	/** Génère un bulletin de salaire au format PDF
	 * @param docSalaire
	 * @param filePath path du fichier (ex: C:/Temp/monFichier.pdf) 
	 */
	public void genererPdf(IDocSalaire docSalaire, String filePath) {
		
		BulletinSalairePdf pdf = new DocumentPdfBuilder(filePath)
				                     .appendIdentite(docSalaire.getNom(), docSalaire.getPrenom())
				                     .appendSalaire(docSalaire.getSalaire())
				                     .get();
		pdf.generer();
	}
}
