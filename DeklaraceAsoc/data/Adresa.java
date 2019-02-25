package data;

/**
 * Tøída reprezentující adresu.
 * @author Tomáš Kozel
 *
 */
public class Adresa {
	//atributy
	private String ulice;
	private String mesto;
	private int cislo;
	private int psc;
	
	
	/**
	 * Konstruktor nastavující kompletnì všechny atributy
	 * @param ulice
	 * @param mesto
	 * @param cislo
	 * @param psc
	 */
	public Adresa(String ulice, String mesto, int cislo, int psc) {
		super();
		this.ulice = ulice;
		this.mesto = mesto;
		this.cislo = cislo;
		this.psc = psc;
	}

	//settry a gettry
	public int getCislo() {
		return cislo;
	}


	public void setCislo(int cislo) {
		this.cislo = cislo;
	}


	public String getMesto() {
		return mesto;
	}


	public void setMesto(String mesto) {
		this.mesto = mesto;
	}


	public int getPsc() {
		return psc;
	}


	public void setPsc(int psc) {
		this.psc = psc;
	}


	public String getUlice() {
		return ulice;
	}


	public void setUlice(String ulice) {
		this.ulice = ulice;
	}
	
}
