package cz.uhk.rprikazy;

import javax.swing.JOptionPane;  //musime importovat pouzitou tridu (viz nize)

/**
 * Ukazka pouziti cyklu s podminkou na konci
 * Prevod km/h na m/s
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class PrikladDoWhile {

	/**
	 * Startovaci metoda
	 * @param args
	 */
	public static void main(String[] args) {
		double kmh; 	//rychlost v km/h
		double ms;		//rychlost v m/s
		
		do {
			//nechame uzivatele zadat cislo, snad se to povede, JOptionPane = sikovne okenko
			String strKmH = JOptionPane.showInputDialog("Zadejte rychlost v km/h");
			//problem je, ze jsme cislo ziskali jako text :( Ukusime to prevest
			kmh = Double.parseDouble(strKmH); //osklive, ale funkcni
			if (kmh != 0) { //zadana nula -> koncime, tak proc vypisovat
				//vypocteme m/s
				ms = kmh / 3.6;  //od ted jsme "amici" a misto des. carky piseme tecku!!!
				//pochlubime se s vysledkem na obrazovce
				System.out.printf("%.2f km/h = %.2f m/s\n", kmh, ms);  //%.2f je zastupcem realneho cisla s 2 des. misty
			}
		} while (kmh != 0); //koncime, kdyz nekdo zada 0
	}

}
