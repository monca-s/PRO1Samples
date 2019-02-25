
public class Spravce {
	//ATRIBUTY------------------------------------------------------------
	private String jmeno;
	private String prijmeni;
	
	//ATRIBUTY VAZEB (ASOCIAC�)-------------------------------------------
	/**
	 * Reference na kancel��, kterou m� spr�vce na starosti. Pokud je null,
	 * pak nen� co spravovat.
	 */
	private Kancelar kancelar = null;
	
	//KONSTRUKTORY -------------------------------------------------------
	public Spravce() {}

	/**
	 * Konstruktor nastavuj�c� kompletn� sadu atribut�, v�etn� asociace na kancel��
	 * @param jmeno
	 * @param prijmeni
	 * @param kancelar
	 */
	public Spravce(String jmeno, String prijmeni, Kancelar kancelar) {
		super();
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.kancelar = kancelar;
	}

	/**
	 * Konstruktor, kter� nastavuje jenom atributy jm�no a p��jmen�. Asociaci je mo�no
	 * nastavit pozd�ji pomoc� setru.
	 * @param jmeno
	 * @param prijmeni
	 */
	public Spravce(String jmeno, String prijmeni) {
		super();
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
	}

	//METODY--------------------------------------------------------------
	
	/**
	 * Selektor jmeno
	 * @return jmeno
	 */
	public String getJmeno() {
		return jmeno;
	}

	/**
	 * Modifik�tor jmeno
	 * @param jmeno jmeno
	 */
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	/**
	 * Selektor kancelar
	 * @return kancelar
	 */
	public Kancelar getKancelar() {
		return kancelar;
	}

	/**
	 * Modifik�tor kancelar
	 * @param kancelar kancelar
	 */
	public void setKancelar(Kancelar kancelar) {
		this.kancelar = kancelar;
	}

	/**
	 * Selektor prijmeni
	 * @return prijmeni
	 */
	public String getPrijmeni() {
		return prijmeni;
	}

	/**
	 * Modifik�tor prijmeni
	 * @param prijmeni prijmeni
	 */
	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}
	
}
