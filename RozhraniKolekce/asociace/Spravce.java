
public class Spravce {
	//ATRIBUTY------------------------------------------------------------
	private String jmeno;
	private String prijmeni;
	
	//ATRIBUTY VAZEB (ASOCIACÍ)-------------------------------------------
	/**
	 * Reference na kanceláø, kterou má správce na starosti. Pokud je null,
	 * pak není co spravovat.
	 */
	private Kancelar kancelar = null;
	
	//KONSTRUKTORY -------------------------------------------------------
	public Spravce() {}

	/**
	 * Konstruktor nastavující kompletní sadu atributù, vèetnì asociace na kanceláø
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
	 * Konstruktor, který nastavuje jenom atributy jméno a pøíjmení. Asociaci je možno
	 * nastavit pozdìji pomocí setru.
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
	 * Modifikátor jmeno
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
	 * Modifikátor kancelar
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
	 * Modifikátor prijmeni
	 * @param prijmeni prijmeni
	 */
	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}
	
}
