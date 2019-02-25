package geom;

import java.awt.Point;

import tabule.Tabule;

public class Kruznice extends GeometrickyUtvar {

	private int polomer;

	/**
	 * Vychozi konstruktor 
	 */
	public Kruznice() {
		super();
	}
		
	/**
	 * Konstruktor nastavujici stred a polomer kruznice
	 * @param x
	 * @param y
	 * @param polomer
	 */
	public Kruznice(int x, int y, int polomer) {
		super(x, y);
		this.polomer = polomer;
	}

	/**
	 * Konstruktor nastavujici stred a polomer kruznice
	 * @param pozice
	 * @param polomer
	 */
	public Kruznice(Point pozice, int polomer) {
		super(pozice);
		this.polomer = polomer;
	}

	/* 
	 * redefinovana metoda predka
	 */
	@Override
	public void kresliTvar() {
		Tabule t = Tabule.getInstance();
		t.getGraph().drawOval(pozice.x-polomer, pozice.y-polomer, 2*polomer, 2*polomer);
		t.repaint();
	}

	public int getPolomer() {
		return polomer;
	}

	public void setPolomer(int polomer) {
		this.polomer = polomer;
	}

}
