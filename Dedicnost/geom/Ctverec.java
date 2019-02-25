package geom;

import java.awt.Point;

import tabule.Tabule;

public class Ctverec extends GeometrickyUtvar {
	private int a = 0;
	
	
	/**
	 * Vyzchozi konstruktor bez parametru
	 */
	public Ctverec() {
		super();
		setPozice(0,0);
		a=50;
	}

	/**
	 * Konstruktor nastavujici pozici leveho horniho rohu ctverce
	 * a delku strany
	 * @param x
	 * @param y
	 * @param a
	 */
	public Ctverec(int x, int y, int a) {
		super(x, y); //o inicializaci zdedenych atributu
							//se postara konstruktor predka -> super(...)
		this.a = a;			//My se postarame jen o pridane atribut a
	}


	/**
	 * Konstruktor nastavujici pozici leveho horniho rohu ctverce
	 * a delku strany
	 * @param pozice
	 * @param a
	 */
	public Ctverec(Point pozice, int a) {
		super(pozice);	//o inicializaci zdedenych atributu
								//se postara konstruktor predka -> super(...)
		this.a = a;				//My se postarame jen o pridany atribut a
	}


	/* 
	 * redefinice metody zdedene od predka
	 */
	@Override
	public void kresliTvar() {
		Tabule t = Tabule.getInstance(); 
		t.getGraph().drawRect(pozice.x, pozice.y, a, a);
		t.repaint();
	}
	
	

}
