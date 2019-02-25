package cz.uhk.hovory.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Seznam uskutecnenych hovoru v mesici.
 * @author Tomas Kozel
 *
 */
public class SeznamHovoru implements Serializable {
	/**
	 * Seriove cislo tridy - generovano eclipsem
	 */
	private static final long serialVersionUID = 6594114614006060351L;
	/** Nazev mesice */
	private String mesic;
	/** Rok */
	private int rok;
	/** seznam hovoru*/
	List<Hovor> hovory;
	
	/**
	 * Konstruktor
	 * @param mesic
	 * @param rok
	 */
	public SeznamHovoru(String mesic, int rok) {
		this.mesic = mesic;
		this.rok = rok;
		
		hovory = new ArrayList<Hovor>();
	}

	/**
	 * @return the mesic
	 */
	public String getMesic() {
		return mesic;
	}

	/**
	 * @param mesic the mesic to set
	 */
	public void setMesic(String mesic) {
		this.mesic = mesic;
	}

	/**
	 * @return the rok
	 */
	public int getRok() {
		return rok;
	}

	/**
	 * @param rok the rok to set
	 */
	public void setRok(int rok) {
		this.rok = rok;
	}

	/**
	 * @return the hovory
	 */
	public List<Hovor> getHovory() {
		return hovory;
	}
	
}
