import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Tøída zapouzdøující bitmapový obrázek
 * @author Tomáš Kozel
 * 
 */
public class Obrazek implements Obrazec {
	private int x;
	private int y;
	private BufferedImage img = null;
	
	/**
	 * Konstruktor
	 * @param x
	 * @param y
	 * @param nazevSouboru  cesta k souboru s obrázkem
	 */
	public Obrazek(int x, int y, String nazevSouboru) {
		this.x = x;
		this.y = y;
		
		/*
		 * naèteme obrázek. Jelikož to ale nemusí dopadnout vždy dobøe,
		 * obalíme pøíslušný kód pøíkazem try - catch, který nás v pøípadì
		 * nouze zachrání
		 */
		try {
			img = ImageIO.read(new File(nazevSouboru));  //zkus naèíst obrázek
		} catch (IOException e) {
			e.printStackTrace();  //vypiš popis chyby / výjimky
		}
	}
	
	
	
	/** Konstruktor s výchozím obrázkem */
	public Obrazek(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			img = ImageIO.read(new File("diagram.jpg"));  //zkus naèíst obrázek
		} catch (IOException e) {
			e.printStackTrace();  //vypiš popis chyby / výjimky
		}
	}




	public void nakresliSe() {
		// získáme referenci na jedináèka tabule
		Tabule t = Tabule.getInstance();
		// øekneme si tabuli o objekt Graphics, který "umí" malovat
		Graphics2D g = t.getGraph();
		//vykreslení obrázku
		g.drawImage(img,x,y,null);
		// obcerstvit zobrazení v oknì
		t.obcerstvit();
	}

}
