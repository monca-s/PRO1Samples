package cz.uhk.seznam.data;

/**
 * Implementace rozhrani Seznam pomoci linearniho spojoveho seznamu - 
 * jednostanne vazaneho
 * 
 * @author Tomas Kozel
 *
 */
public class SpojovySeznam implements Seznam {
	//odkaz na prvni a posledni prvek seznamu
	private Prvek prvni, posledni;
	
	/**
	 * Konstruktor
	 */
	public SpojovySeznam() {
	    prvni = posledni = null;
	}
	
	public void pridej(Object o) {
		if (prvni == null) {
			//seznam je zatim prazdny
			prvni = new Prvek(o);
			posledni = prvni;
		} else {
			//nejake prvky uz v seznamu jsou. Novy prvek dame za ten 
			//doposud posledni
			posledni.setDalsi(new Prvek(o));
			posledni = posledni.getDalsi();
		}
	}

	public Object get(int pozice) {
		//Musime od zacatku (i-1)krat preskocit na dalsi a vratit hodnotu
		//POZOR na konce seznamu (null)!!!
		Prvek pom = prvni;
		
		for(int i = 1; pom!=null && i<=pozice; i++) {
			pom = pom.getDalsi();
		}
		
		if (pom!=null) {
			return pom.getHodnota();	
		} else {
			return null;
		}
		
	}

	public void smaz(int pozice) {
		Prvek pom = prvni;
		
		if (pozice == 0) {
			//mazeme zacatek
			prvni = prvni.getDalsi();
			if (prvni == null || prvni.getDalsi()==null) {
				//Asi jsme smazali posledni, je tedy treba 
				//prenastavit atribut posledni
				posledni = prvni;
			}
		} else {
			for(int i = 1; pom!=null && i<pozice-1; i++) {
				pom = pom.getDalsi();
			}
			if (pom!=null) {
				pom.setDalsi(pom.getDalsi().getDalsi());
				if (pom.getDalsi()==null) {
					//Pokud je dalsi null, asi jsme smazali posledni
					//prvek a je treba prenastavi "posledni"
					posledni = pom;
				}
			}
		}
	}

	public void vyprazdni() {
		prvni = null;
	}

	public int getPocet() {
		Prvek pom = prvni;
		int pocet = 0;
		
		while (pom!=null) {
			pom = pom.getDalsi();
			pocet++;
		}
		return pocet;
	}

}
