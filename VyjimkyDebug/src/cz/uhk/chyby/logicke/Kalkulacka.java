package cz.uhk.chyby.logicke;

/**
 * Trida Kalkulacka pro provadeni jednoduchych vypoctu se dvema 
 * celociselnymi operandy
 * @author Tomas KOZEL
 *
 */
public class Kalkulacka {
	private int a, b;
	
	/**
	 * Vychozi konstruktor 
	 */
	public Kalkulacka() {}
	/**
	 * Konstruktor nastavujici oba operandy
	 * @param a
	 * @param b
	 */
	public Kalkulacka(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	/**
	 * Soucet operandu
	 * @return
	 */
	public int getSoucet() {
		return a+b;
	}
	/**
	 * Soucin operandu
	 * @return
	 */
	public int getSoucin() {
		return a+b;
	}
	/**
	 * Rozdil operandu
	 * @return
	 */
	public int getRozdil() {
		return a-b;
	}
	/**
	 * Celociselny podil operandu
	 * @return
	 */
	public int getPodilInt() {
		return a/b;
	}
	
	/**
	 * Realny podil operandu
	 * @return
	 */
	public double getPodilReal() {
		return a/b;
	}
}
