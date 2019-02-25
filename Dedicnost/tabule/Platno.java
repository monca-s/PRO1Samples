package tabule;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

/**
 * Komponenta pro vykreslování obrázkù
 */
public class Platno extends JComponent {

	private static final long serialVersionUID = 6120181589237742455L;
	BufferedImage img = null;
	
	public Platno() {
		img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
		setPreferredSize(new Dimension(800,600));
	}
	
	public Platno(int sirka, int vyska) {
		img = new BufferedImage(sirka,vyska,BufferedImage.TYPE_INT_RGB);
		setPreferredSize(new Dimension(sirka,vyska));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img,0,0,this);
	}

	public BufferedImage getImg() {
		return img;
	}

}
