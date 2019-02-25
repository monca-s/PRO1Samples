package tabule;


import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 * Tøída reprezentující èernou tabuli na obrazovce
 */
public class Tabule extends JFrame {
	private Graphics2D graph;
	private Platno platno;
	private static Tabule instance = null;
	
	public static Tabule getInstance() {
		if (instance == null) {
			instance = new Tabule();
		}
		return instance;
	}
	
	/**
	 * Kontruktor tabule
	 */
	protected Tabule() {
		super("Okno s malíøským plátnem");
		
		platno = new Platno(800,600);
		graph = (Graphics2D) platno.getImg().getGraphics();
		//graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		add(new JScrollPane(platno));
		
		pack();
		setVisible(true);
	}
	
	/**
	 * Smazání tabule
	 */
	public void smazat() {
		graph.clearRect(0, 0, 800, 600);
		platno.repaint();
	}

	public Graphics2D getGraph() {
		return graph;
	}

	public void setGraph(Graphics2D graph) {
		this.graph = graph;
	}

	public Platno getPlatno() {
		return platno;
	}

	public void setPlatno(Platno platno) {
		this.platno = platno;
	}
	
	
	
}
