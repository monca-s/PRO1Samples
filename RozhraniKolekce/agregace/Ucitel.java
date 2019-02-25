
public class Ucitel {
    private String prijmeni;
    private String jmeno;
    
    public Ucitel() {}
    
    public Ucitel(String prijmeni, String jmeno) {
        this.prijmeni = prijmeni;
        this.jmeno = jmeno;
    }
    
    public String getJmeno() {
        return jmeno;
    }
    
    public String getPrijmeni() {
        return prijmeni;
    }
    
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
}
