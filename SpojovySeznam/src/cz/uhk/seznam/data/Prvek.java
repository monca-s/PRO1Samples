package cz.uhk.seznam.data;

/**
 * Trida pro zapojeni hodnoty do spojoveho seznamu
 * @author Tomas Kozel
 *
 */
public class Prvek {
	/**
	 * instancni promenna pro ulozeni hodnoty
	 */
	private Object hodnota;
	/**
	 * Ukazatel na nasledujici prvek v seznamu
	 */
	private Prvek dalsi;	
	
	
	/**
	 * Konstruktor
	 * @param hodnota
	 */
	public Prvek(Object hodnota) {
		this.hodnota = hodnota;
		dalsi = null;
	}
	
	public Prvek getDalsi() {
		return dalsi;
	}
	
	public void setDalsi(Prvek dalsi) {
		this.dalsi = dalsi;
	}
	
	public Object getHodnota() {
		return hodnota;
	}
	
	public void setHodnota(Object hodnota) {
		this.hodnota = hodnota;
	}
}
