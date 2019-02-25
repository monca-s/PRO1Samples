package cz.uhk.seznam.data;

/**
 * Rozhrani obecneho seznamu
 * @author Tomas Kozel
 *
 */
public interface Seznam {
	
	/**
	 * Pridana noveho objektu do seznamu
	 * @param o
	 */
	public void pridej(Object o);
	
	/**
	 * Vraci objekt na i-tou pozici v seznamu. Prvni prvek ma index 0.
	 * @param pozice
	 * @return objekt
	 */
	public Object get(int pozice);
	
	/**
	 * Vypusti prvek na i-te pozici
	 * @param i
	 */
	public void smaz(int pozice);
	
	/**
	 * Vyprazdni cely seznam
	 */
	public void vyprazdni();
	
	/**
	 * Vraci aktualni pocet prvku v seznamu
	 * @return
	 */
	public int getPocet();

}
