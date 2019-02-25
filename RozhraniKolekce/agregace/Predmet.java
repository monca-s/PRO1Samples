import java.util.ArrayList;
import java.util.List;

/**
 * T��da p�edstavuj�c� jeden vyu�ovac� p�edm�t
 */
public class Predmet {
    //ATRIBUTY---------------------------------------------
    /** N�zev p�edm�tu*/
    String nazev;
    /** Po�et hodin p�edn�ek */
    int hodPredn;
    /** Po�et hodin cvi�en� */
    int hodCvic;

    //ASOCICACE--------------------------------------------
    private Ucitel ucitel;
    private List<Student> studenti = new ArrayList<Student>();
    
    //KONSTRUKTORY-----------------------------------------
    /** 
     * Konstruktor bez parametr� 
     * Nastavuje vzorov� data 
     */
    public Predmet() {
        nazev = "Programov�n� I";
        ucitel = new Ucitel("Kozel","Tom�");
        studenti.add(
            new Student("Nov�k","Josef","IM(3)")
        );
        studenti.add(
            new Student("Novotn�","Petra","AI(3)")
        );
        studenti.add(
            new Student("Osu�ka","Ludv�k","IM(5)")
        );
        studenti.add(
            new Student("Hradeck�","J�lie","IM(5)")
        );
    }
    
    /**
     * Konstruktor nastavuj�c� n�zev a dotaci p�edm�tu
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
