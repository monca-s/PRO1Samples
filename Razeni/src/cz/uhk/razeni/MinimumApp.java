package cz.uhk.razeni;

/**
 * Hledani pozice minima v posloupnosti (poli)
 * @author Tomas Kozel
 *
 */
public class MinimumApp extends ZakladniPoleApp {

	/* Zde neradime. Jen zkusime vyhledat minimum
	 * @see ZakladniPole#setrid()
	 */
	public void zpracujPole() {
		int i =	hledejMinimum();
		
		System.out.println("Minimum ma hodnotu "+pole[i]+" a je na pozici "
			+i+" v poli");
	}

	/**
	 * Vyhleda pozici minimalniho prvku v poli
	 * 
	 * @return pozice minima
	 */
	public int hledejMinimum() {
		int i,imin;
		
		imin = 1;
		for(i=1;i<pole.length;i++) {
			if (pole[i]<pole[imin]) {
				imin = i;
			}
		}
		return imin;
	}

	public static void main(String[] args) {
		new MinimumApp().start();
	}
}
