
/**
 * T��da p�edstavuj�c� kancel�� v budov�
 * @author Tom� Kozel
 */
public class Kancelar {
    //ATRIBUTY------------------------------------------------------------
    /**
     * ��slo m�stnosti
     */
    private int cislo;
    /**
     * Zkratka odd�len�, ke kter�mu kancel�� pat��
     */
    private String oddeleni;
    /**
     * Celkov� kapacita kancel��e 
     */
    private int kapacita;
    
    //ATRIBUTY VAZEB (ASOCIAC�)-------------------------------------------
    /**
     * Reference na spr�vce m�stnosti 
     */
    Spravce spravce = null;
    
    //KONSTRUKTORY--------------------------------------------------------
    /**
     * Konstruktor bez parametr�. Nastavuje vzorov� data. Instance p��slu�n�ho
     * spr�vce je vytvo�ena v konstruktoru
     */
    public Kancelar() {
        // vytvo��me a nastav�me spr�vce - Asociace Kancelar->Spravce
        spravce = new Spravce("Tom�","Kozel");
        // nastav�me opa�nou asociaci Spravce -> Kancelar
        // prikaz "this" zastupuje pr�v� vytv��enou instanci Kancel��e
        spravce.setKancelar(this);
        // nastav�me dal�� atributy
        cislo = 2181;
        oddeleni="KIKM";
        kapacita = 3;
    }
    
    /**
     * Konstruktor nastavuj�c� v�echny atributy instance, s v�jimkou spr�vce.
     * Spr�vce m�stnosti m��e b�t dodate�n� nastaven pomoc� setru.
     * @param cislo
     * @param oddeleni
     * @param kapacita
     */
    public Kancelar(int cislo, String oddeleni, int kapacita) {
        super();
        this.cislo = cislo;
        this.oddeleni = oddeleni;
        this.kapacita = kapacita;
    }
    
    
    
    /**
     * Konstruktor nastavuj�c� kompletn� v�echny atributy, v�etn� asociace na spr�vce
     * @param cislo
     * @param oddeleni
     * @param kapacita
     * @param spravce
     */
    public Kancelar(int cislo, String oddeleni, int kapacita, Spravce spravce) {
        super();
        this.cislo = cislo;
        this.oddeleni = oddeleni;
        this.kapacita = kapacita;
        this.spravce = spravce;
    }
    
    //METODY--------------------------------------------------------------
    /**
     * @return cislo
     */
    public int getCislo() {
        return cislo;
    }
    /**
     * @param cislo cislo kancel��e
     */
    public void setCislo(int cislo) {
        this.cislo = cislo;
    }
    /**
     * @return kapacita
     */
    public int getKapacita() {
        return kapacita;
    }
    /**
     * @param kapacita kapacita kancel��e
     */
    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }
    /**
     * @return oddeleni
     */
    public String getOddeleni() {
        return oddeleni;
    }
    /**
     * @param oddeleni oddeleni, ke kter�mu kancel�� pat��
     */
    public void setOddeleni(String oddeleni) {
        this.oddeleni = oddeleni;
    }

    /**
     * @return spravce
     */
    public Spravce getSpravce() {
        return spravce;
    }

    /**
     * @param spravce spravce, kter� m� b�t nastaven
     */
    public void setSpravce(Spravce spravce) {
        this.spravce = spravce;
    }   
}
