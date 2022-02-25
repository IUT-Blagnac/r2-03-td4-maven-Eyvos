package test;

import lesschtroumpfs.Village;

public class MainVillage {

	public static void main (String[] argv) {
		String[] nomsSchtroumpfs = {
		        "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur à lunettes",
		        "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf étonné", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
		Village catonvielle;
		catonvielle = new Village("Catonvielle",25,nomsSchtroumpfs);
		catonvielle.solstice_d_ete();
		catonvielle.chefDuVillage().sePresenter();
		catonvielle.envoyerAuTravail();
		catonvielle.schtroumpsfHeureux();
		catonvielle.envoyerAuTravail();
		catonvielle.solstice_d_ete();
		catonvielle.dinerTousEnsemble();
		catonvielle.solstice_d_ete();
	}
}