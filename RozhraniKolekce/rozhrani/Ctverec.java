import java.awt.Color;
import java.awt.Graphics2D;


/**
 * T��da implementuj�c� rozhran� Obrazec -> lze ji vykreslit.
 * @author Tom� Kozel
 *
 */
public class Ctverec implements Obrazec {
    /**
     * pozice pro vykreslen� ... x-ov� sou�adnice 
     */
    private int x;
    /**
     * pozice pro vykreslen� ... y-ov� sou�adnice 
     */
    private int y;

    /** velikost strany */
    private int a;
    
    
    /** konstruktor �tverce */
    public Ctverec(int x, int y, int a) {
        super();
        this.x = x;
        this.y = y;
        this.a = a;
    }

    /** 
     * Vykreslen� �tverce. Metoda je p�edepsan� rozhran�m obrazec 
     * Metoda pou��v� pro vykreslen� instanci jedin��ka Tabule.
     * @see Obrazec#nakresliSe()
     */
    public void nakresliSe() {
        // z�sk�me referenci na jedin��ka tabule
        Tabule t = Tabule.getInstance();
        // �ekneme si tabuli o objekt Graphics, kter� "um�" malovat
        Graphics2D g = t.getGraph();
        // nastav�me barvu �t�tce
        g.setColor(Color.WHITE);
        //vykreslen� �tverce
        g.drawRect(x,y,a,a);
        // obcerstvit zobrazen� v okn�
        t.obcerstvit();
    }
    
    /** Po��t� obsah �tverce */
    public int getObsah() {
        return a*a;
    }
    
    /** Po��t� obvod �tverce */
    public int getObvod() {
        return 4*a;
    }
}
