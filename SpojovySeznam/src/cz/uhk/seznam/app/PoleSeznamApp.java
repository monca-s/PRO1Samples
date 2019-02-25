package cz.uhk.seznam.app;

import cz.uhk.seznam.data.PoleSeznam;
import cz.uhk.seznam.data.Seznam;
import fim.utils.Application;
import fim.utils.FIMReadException;

/**
 * Aplikace pouzivajici seznam implementovany pomoci obycejneho pole.
 * 
 * Pouzivame knihovnu FIMUTILS, ktera prostrednictvim nadtridy Application
 * nabizi menu, vystupni okno (out) apod. Knihovna je ve slozce libs projektu
 * 
 * @author Tomas Kozel
 *
 */
public class PoleSeznamApp extends Application {

	//jedine misto, kde se oba priklady lisi
	private Seznam s = new PoleSeznam(100);
	
	public void start() {
		//sestavime menu, druhy parametr=kod volby
		menu.add("Pridat kontakt",1000);
		menu.addSeparator();
		menu.add("Smazat kontakt",1001);
		menu.add("Vypsat kontakty",1002);
		menu.add("Vycistit seznam",1003);
		menu.setVisible(true);
	}
	
	//metoda, ktera je automaticky zavolana ve chvili, kdy uzivatel
	//vybere v menu nejakou funkci programu, kod volby je predan jako parametr
	public void handleMenu(int volba) {
		switch (volba) {
			case 1000 : //nacteni kontaktu
				Kontakt k = nactiKontakt();
				if (k != null) {
					s.pridej(k);
				}
				break;
			case 1001 : //smazani kontaktu
				try {
					s.smaz(in.readInt("Zadej pozici"));
				} catch (FIMReadException ex) {};
				break;
			case 1002 : //vypsani celeho seznamu
				vypisSeznam();
				break;
			case 1003 : //vyprazdneni seznamu
				s.vyprazdni();
				out.println("Seznam smazan!");
				break;

			default :
				break;
		}
	}

	/**
	 * Vypsani celeho seznamu na obrazovku
	 */
	private void vypisSeznam() {
		Kontakt k;
		
		out.println("SEZNAM KONTAKTU");
		for (int i = 0; i < s.getPocet(); i++) {
			k = (Kontakt)s.get(i);	//Prirazeni s pretypovanim
			out.println(k.getJmeno()+", "+k.getPrijmeni()+", "+k.getTelefon());
		}
	}

	/**
	 * Vytvoreni objektu Kontakt nactenim hodnot z klavesnice
	 * @return
	 */
	private Kontakt nactiKontakt() {
		String jm, pr, tel;
		Kontakt k = null;
		
		try {
			jm = in.readString("Jmeno");
			pr = in.readString("Prijmeni");
			tel = in.readString("Telefonni cislo");
			k = new Kontakt(jm,pr,tel);
		} catch (FIMReadException ex) {
			out.println("Chybne zadani kontaktu nebo stornovano!");
		}
		return k;
	}

	public static void main(String[] args) {
		new PoleSeznamApp().start();
	}
}
