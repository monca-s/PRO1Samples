package geom;

import java.awt.Color;
import java.awt.Point;

import tabule.Tabule;

/**
 * P�edek v�ech geometrick�ch �tvar� se zadanou pozic�
 * @author Tom� Kozel
 *
 */
public abstract class GeometrickyUtvar {
	protected Point pozice = null;
	
	/**
	 * Konstruktor bez parametr�
	 */
	public GeometrickyUtvar() {}
	
	/**
	 * Konstruktor nastavuj�c� v�choz� pozici �tvaru [x,y] a zobrazi utvar
	 */
	public GeometrickyUtvar(int x, int y) {
		this.pozice = new Point(x,y);
	}
	
	/**
	 * Konstruktor nastavuj�c� v�choz� pozici �tvaru
	 */
	public GeometrickyUtvar(Point pozice) {
		this.pozice = pozice;
	}
	
	/**
	 * Abstraktn� metoda, kter� bude v potomkovi p�edefinov�na tak, 
	 * aby se vykreslil konkr�tn� tvar 
	 */
	public abstract void kresliTvar();
	
	/**
	 * Vykresli utvar bilou barvou
	 */
	public void zobrazit() {
		Tabule.getInstance().getGraph().setColor(Color.WHITE);
		kresliTvar();
	}
	
	/**
	 * Posune utvar na obrazovce o zadany vektor
	 * @param x
	 * @param y
	 */
	public void posunout(int x, int y) {
		smazat();
		pozice.x += x;
		pozice.y += y;
		zobrazit();
	}
	
	/**
	 * Animuje pomalu posun utvaru na obrazovce o zadany vektor
	 * @param x
	 * @param y
	 */
	public void posunoutPomalu(int x, int y) {
		int a;
		double d;
		int oldx, oldy;
		
		oldx = pozice.x; oldy = pozice.y;
		
		if (x>y) {
			a = x;
			d = (double)y/x;
		} else {
			a = y;
			d = (double)x/y;
		}
		
		for(int i=1;i<=a;i++) {
			smazat();
			if (x>y) {
				pozice.x=oldx+i;
				pozice.y=oldy+(int)(d*i);
			} else {
				pozice.y=oldy+i;
				pozice.x=oldx+(int)(d*i);
			}
			zobrazit();
			//pockame 20 ms
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {}
		}
		
		zobrazit();
	}
	
	
	/**
	 * Vykresli utvar barvou pozadi (cernou), takze jej "smaze"
	 */
	public void smazat() {
		Tabule.getInstance().getGraph().setColor(Color.BLACK);
		kresliTvar();
	}
	
	/**
	 * Getr pozice
	 * @return
	 */
	public Point getPozice() {
		return pozice;
	}
	
	/**
	 * Getr x-ove sou�adnice pozice
	 * @return
	 */
	public int getX() {
		return pozice.x;
	}

	/**
	 * Getr y-ove sou�adnice pozice
	 * @return
	 */
	public int getY() {
		return pozice.y;
	}

	/**
	 * Setr pozice
	 * @param pozice
	 */
	public void setPozice(Point pozice) {
		this.pozice = pozice;
	}

	/**
	 * P�et�en� setr pozice
	 * @param x
	 * @param y
	 */
	public void setPozice(int x, int y) {
		this.pozice = new Point(x,y);
	}
	
}
