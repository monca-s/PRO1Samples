import java.awt.*;

import javax.swing.*;


/**
 * Tøída reprezentující èernou tabuli na obrazovce. Použit návrhový vzor jedináèek (Singleton).
 */
public class Tabule extends JFrame {
    private Graphics2D graph;
    private Platno platno;
    private static final long serialVersionUID = -4958460417875391688L;
    
    /** atribut pro použití v návrhovém vzoru jedináèek */
    private static Tabule _instance = null;

    /**
     * Kontruktor tabule
     */
    private Tabule() {
        super("Okno s malíøským plátnem");
        
        platno = new Platno(800,600);
        graph = (Graphics2D) platno.getImg().getGraphics();
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        add(new JScrollPane(platno));
        
        pack();
        setVisible(true);
    }
    
    /**
     * metoda pro získání instance jedináèka
     * @return
     */
    public static Tabule getInstance() {
        if (_instance==null) {
            _instance = new Tabule();
        } 
        return _instance;
    }
    
    /**
     * Smazání tabule
     */
    public void smazat() {
        graph.clearRect(0, 0, 800, 600);
        platno.repaint();
    }
    
    /**
     * Vrací objekt, který umí na základì našich pokynù malovat
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
