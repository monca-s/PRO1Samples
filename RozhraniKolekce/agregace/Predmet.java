import java.util.ArrayList;
import java.util.List;

/**
 * Tøída pøedstavující jeden vyuèovací pøedmìt
 */
public class Predmet {
    //ATRIBUTY---------------------------------------------
    /** Název pøedmìtu*/
    String nazev;
    /** Poèet hodin pøednášek */
    int hodPredn;
    /** Poèet hodin cvièení */
    int hodCvic;

    //ASOCICACE--------------------------------------------
    private Ucitel ucitel;
    private List<Student> studenti = new ArrayList<Student>();
    
    //KONSTRUKTORY-----------------------------------------
    /** 
     * Konstruktor bez parametrù 
     * Nastavuje vzorová data 
     */
    public Predmet() {
        nazev = "Programování I";
        ucitel = new Ucitel("Kozel","Tomáš");
        studenti.add(
            new Student("Novák","Josef","IM(3)")
        );
        studenti.add(
            new Student("Novotná","Petra","AI(3)")
        );
        studenti.add(
            new Student("Osuška","Ludvík","IM(5)")
        );
        studenti.add(
            new Student("Hradecká","Júlie","IM(5)")
        );
    }
    
    /**
     * Konstruktor nastavující název a dotaci pøedmìtu
     */
    public Predmet(String nazev, int predn, int cvic) {
        this.nazev = nazev;
        hodPredn = predn;
        hodCvic = cvic;
    }
     
    //METODY-----------------------------------------------
    public String getNazev() {
        return nazev;
    }
    
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
    
    public int getHodPredn() {
        return hodPredn;
    }
    
    public void setHodPredn(int predn) {
        hodPredn = predn;
    }
    
    public int getHodCvic() {
        return hodCvic;
    }
    
    public void setHodCvic(int cvic) {
        hodPredn = cvic;
    }
    
    public List<Student> getStudenti() {
        return studenti;
    }
    
    public Ucitel getUcitel() {
        return ucitel;
    }
}
