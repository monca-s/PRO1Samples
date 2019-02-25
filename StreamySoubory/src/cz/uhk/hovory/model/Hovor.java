package cz.uhk.hovory.model;

import java.io.Serializable;

/**
 * Predstavuje informaci o jednom uskutecnenem telefonnim hovoru v mesici.
 * Implementuje rozhrani Serializable, ktere je pouzivano pri prevodu dat 
 * instance do binarni podoby.
 * @author Tomas Kozel
 *
 */
public class Hovor implements Serializable {
	/**
	 * seriove cislo tridy - generovano eclipsem 
	 */
	private static final long serialVersionUID = 3567644893026558924L;
	/**
	 * Cislo dne v mesici, v nemz byl hovor uskutecnen
	 */
	private int den;
	/**
	 * Telefonni cislo, na ktere se volalo
	 */
	private String cislo;
	/**
	 * Delka hovoru v sekundach
	 */
	private int cas;
	
	/**
	 * Konstruktor bez parametru - implicitni konstruktor
	 */
	public Hovor() {}

	/**
	 * Konstruktor nastavujici kompletni sadu atributu
	 * @param den
	 * @param cislo
	 * @param cas
	 */
	public Hovor(int den, String cislo, int cas) {
		this.den = den;
		this.cislo = cislo;
		this.cas = cas;
	}

	/**
	 * @return the cas
	 */
	public int getCas() {
		return cas;
	}

	/**
	 * @param cas the cas to set
	 */
	public void setCas(int cas) {
		this.cas = cas;
	}

	/**
	 * @return the cislo
	 */
	public String getCislo() {
		return cislo;
	}

	/**
	 * @param cislo the cislo to set
	 */
	public void setCislo(String cislo) {
		this.cislo = cislo;
	}

	/**
	 * @return the den
	 */
	public int getDen() {
		return den;
	}

	/**
	 * @param den the den to set
	 */
	public void setDen(int den) {
		this.den = den;
	}
	
}
