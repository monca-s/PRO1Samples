import java.awt.Color;
import java.awt.Graphics2D;


/**
 * Tøída implementující rozhraní Obrazec -> lze ji vykreslit.
 * @author Tomáš Kozel
 *
 */
public class Ctverec implements Obrazec {
    /**
     * pozice pro vykreslení ... x-ová souøadnice 
     */
    private int x;
    /**
     * pozice pro vykreslení ... y-ová souøadnice 
     */
    private int y;

    /** velikost strany */
    private int a;
    
    
    /** konstruktor ètverce */
    public Ctverec(int x, int y, int a) {
        super();
        this.x = x;
        this.y = y;
        this.a = a;
    }

    /** 
     * Vykreslení ètverce. Metoda je pøedepsaná rozhraním obrazec 
     * Metoda používá pro vykreslení instanci jedináèka Tabule.
     * @see Obrazec#nakresliSe()
     */
    public void nakresliSe() {
        // získáme referenci na jedináèka tabule
        Tabule t = Tabule.getInstance();
        // øekneme si tabuli o objekt Graphics, který "umí" malovat
        Graphics2D g = t.getGraph();
        // nastavíme barvu štìtce
        g.setColor(Color.WHITE);
        //vykreslení ètverce
        g.drawRect(x,y,a,a);
        // obcerstvit zobrazení v oknì
        t.obcerstvit();
    }
    
    /** Poèítá obsah ètverce */
    public int getObsah() {
        return a*a;
    }
    
    /** Poèítá obvod ètverce */
    public int getObvod() {
        return 4*a;
    }
}
