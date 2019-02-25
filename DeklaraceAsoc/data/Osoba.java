package data;

/**
 * T��da reprezentuj�c� osobu.
 * @author Tom� Kozel
 */
public class Osoba {
    //Atributy t��dy
    private String jmeno;
    private String prijmeni;
    private int vek = -1; // -1 ... nezadano
    
    Adresa adresa = null;
    
    /**
     * Konstruktor bez parametru
     */
    public Osoba() {
        jmeno = "Neznalec";
        prijmeni = "Nezn�m�";
        vek = 50;
        //konstruktor si s�m "vyrob� adresu"
        adresa = new Adresa("Lenonova","Bub�kov",999,12345);
    }
    
    /**
     * Konstruktor, ktery umi inicializovat vse krome adresy - tj.
     * neumi inicializovat asociaci.
     * @param jmeno
     * @param prijmeni
     * @param vek
     */
    public Osoba(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        /* konec konstruktoru - tohle je implementa�n� koment�� */
    }
    
    
    /** 
     * Kompletni konstruktor - nastavuje vse
     * objekt adresa jiz musi predem existovat!!!
     * 
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param adresa 
     * @see Adresa
     */
    public Osoba(String jmeno, String prijmeni, int vek, Adresa adresa) {
        super();
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.adresa = adresa;
    }

    //Metody - settry a gettry
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    //getter adresy - umozni "dostat" se k pouzivane instanci
    public Adresa getAdresa() {
        return adresa;
    }

    //setter adresy - inicializuje instancni promennou realizujici trvalou asociaci
    //Objekt adresa je opet dodavan jiz jako "predem vyrobeny"
    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
}
