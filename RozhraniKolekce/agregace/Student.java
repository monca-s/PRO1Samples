
public class Student {
    private String prijmeni;
    private String jmeno;
    private String obor;
    
    public Student() {}
    
    public Student(String prijmeni, String jmeno, String obor) {
        this.prijmeni = prijmeni;
        this.jmeno = jmeno;
        this.obor = obor;
    }
    
    public String getJmeno() {
        return jmeno;
    }
    
    public String getPrijmeni() {
        return prijmeni;
    }

    public String getObor() {
        return obor;
    }
    
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setObor(String obor) {
        this.obor = obor;
    }
}
