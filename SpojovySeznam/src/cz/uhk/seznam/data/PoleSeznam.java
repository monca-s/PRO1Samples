package cz.uhk.seznam.data;

/**
 * Implementace rozhrani Seznam pomoci obycejneho 
 * pole objektu
 * @author Tomas Kozel
 *
 */
public class PoleSeznam implements Seznam {
	private Object[] pole = null;
	private int pocet = 0;
	
	/**
	 * Konstruktor
	 * @param kapacita maximalni kapacita seznamu
	 */
	public PoleSeznam(int kapacita) {
		pole = new Object[kapacita];
	}
	
	public void pridej(Object o) {
		if (pocet<pole.length) {
			pole[pocet++] = o;
		}
	}

	public Object get(int pozice) {
		if (pozice < pocet) {
			return pole[pozice];
		} else {
			return null;
		}
	}

	public void smaz(int pozice) {
		if (pozice < pocet) {
			for(int i = pozice; i<pocet; i++) {
				pole[i] = pole[i+1];
			}
			pocet--;
		}
	}

	public void vyprazdni() {
		pocet = 0;
	}
	
	public int getPocet() {
		return pocet;
	}

}
