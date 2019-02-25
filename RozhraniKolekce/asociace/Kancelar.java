
/**
 * Tøída pøedstavující kanceláø v budovì
 * @author Tomáš Kozel
 */
public class Kancelar {
    //ATRIBUTY------------------------------------------------------------
    /**
     * Èíslo místnosti
     */
    private int cislo;
    /**
     * Zkratka oddìlení, ke kterému kanceláø patøí
     */
    private String oddeleni;
    /**
     * Celková kapacita kanceláøe 
     */
    private int kapacita;
    
    //ATRIBUTY VAZEB (ASOCIACÍ)-------------------------------------------
    /**
     * Reference na správce místnosti 
     */
    Spravce spravce = null;
    
    //KONSTRUKTORY--------------------------------------------------------
    /**
     * Konstruktor bez parametrù. Nastavuje vzorová data. Instance pøíslušného
     * správce je vytvoøena v konstruktoru
     */
    public Kancelar() {
        // vytvoøíme a nastavíme správce - Asociace Kancelar->Spravce
        spravce = new Spravce("Tomáš","Kozel");
        // nastavíme opaènou asociaci Spravce -> Kancelar
        // prikaz "this" zastupuje právì vytváøenou instanci Kanceláøe
        spravce.setKancelar(this);
        // nastavíme další atributy
        cislo = 2181;
        oddeleni="KIKM";
        kapacita = 3;
    }
    
    /**
     * Konstruktor nastavující všechny atributy instance, s výjimkou správce.
     * Správce místnosti mùže být dodateènì nastaven pomocí setru.
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
     * Konstruktor nastavující kompletnì všechny atributy, vèetnì asociace na správce
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
     * @param cislo cislo kanceláøe
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
     * @param kapacita kapacita kanceláøe
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
     * @param oddeleni oddeleni, ke kterému kanceláø patøí
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
     * @param spravce spravce, který má být nastaven
     */
    public void setSpravce(Spravce spravce) {
        this.spravce = spravce;
    }   
}
