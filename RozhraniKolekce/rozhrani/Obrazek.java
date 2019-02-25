import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * T��da zapouzd�uj�c� bitmapov� obr�zek
 * @author Tom� Kozel
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
	 * @param nazevSouboru  cesta k souboru s obr�zkem
	 */
	public Obrazek(int x, int y, String nazevSouboru) {
		this.x = x;
		this.y = y;
		
		/*
		 * na�teme obr�zek. Jeliko� to ale nemus� dopadnout v�dy dob�e,
		 * obal�me p��slu�n� k�d p��kazem try - catch, kter� n�s v p��pad�
		 * nouze zachr�n�
		 */
		try {
			img = ImageIO.read(new File(nazevSouboru));  //zkus na��st obr�zek
		} catch (IOException e) {
			e.printStackTrace();  //vypi� popis chyby / v�jimky
		}
	}
	
	
	
	/** Konstruktor s v�choz�m obr�zkem */
	public Obrazek(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			img = ImageIO.read(new File("diagram.jpg"));  //zkus na��st obr�zek
		} catch (IOException e) {
			e.printStackTrace();  //vypi� popis chyby / v�jimky
		}
	}




	public void nakresliSe() {
		// z�sk�me referenci na jedin��ka tabule
		Tabule t = Tabule.getInstance();
		// �ekneme si tabuli o objekt Graphics, kter� "um�" malovat
		Graphics2D g = t.getGraph();
		//vykreslen� obr�zku
		g.drawImage(img,x,y,null);
		// obcerstvit zobrazen� v okn�
		t.obcerstvit();
	}

}
