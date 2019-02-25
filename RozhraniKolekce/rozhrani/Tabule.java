import java.awt.*;

import javax.swing.*;


/**
 * T��da reprezentuj�c� �ernou tabuli na obrazovce. Pou�it n�vrhov� vzor jedin��ek (Singleton).
 */
public class Tabule extends JFrame {
    private Graphics2D graph;
    private Platno platno;
    private static final long serialVersionUID = -4958460417875391688L;
    
    /** atribut pro pou�it� v n�vrhov�m vzoru jedin��ek */
    private static Tabule _instance = null;

    /**
     * Kontruktor tabule
     */
    private Tabule() {
        super("Okno s mal��sk�m pl�tnem");
        
        platno = new Platno(800,600);
        graph = (Graphics2D) platno.getImg().getGraphics();
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        add(new JScrollPane(platno));
        
        pack();
        setVisible(true);
    }
    
    /**
     * metoda pro z�sk�n� instance jedin��ka
     * @return
     */
    public static Tabule getInstance() {
        if (_instance==null) {
            _instance = new Tabule();
        } 
        return _instance;
    }
    
    /**
     * Smaz�n� tabule
     */
    public void smazat() {
        graph.clearRect(0, 0, 800, 600);
        platno.repaint();
    }
    
    /**
     * Vrac� objekt, kter� um� na z�klad� na�ich pokyn� malovat
     * @return
     */
    public Graphics2D getGraph() {
        return graph;
    }
    
    /**
     * Obnovuje zobrazeni v okne
     */
    public void obcerstvit() {
        platno.repaint();
    }
}
