package exemplemaven;

import ij.IJ;
import ij.ImagePlus;

public class ExempleMaven {

	public static void main(String[] args) {
		ImagePlus monImage = IJ.openImage(); // Choisit un fichier et stocke le résultat dans monImage
		monImage.show(); // Affiche l'image à l'écran

	}

}
