package cz.uhk.seznam.app;

/**
 * Datov? polo?ka, kter? bude pou?ita pro ulo?en? kontaktu do seznamu
 * @author Tom?? Kozel
 *
 */
public class Kontakt {
	
	private String jm,	//jm?no
				   pr,	//p??jmen?
				   tel; //telefon
	
	/**
	 * Konstruktor
	 * @param jmeno
	 * @param prijmeni
	 * @param cislo
	 */
	public Kontakt(String jmeno, String prijmeni, String cislo) {
		jm = jmeno;
		pr = prijmeni;
		tel = cislo;
	}
	
	public String getJmeno() {
		return jm;
	}
	
	public void setJmeno(String jm) {
		this.jm = jm;
	}
	
	public String getPrijmeni() {
		return pr;
	}
	
	public void setPrijmeni(String pr) {
		this.pr = pr;
	}
	
	public String getTelefon() {
		return tel;
	}
	
	public void setTelefon(String tel) {
		this.tel = tel;
	}
}
