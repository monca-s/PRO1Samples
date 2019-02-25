package cz.uhk.razeni;

/**
 * Priklad trideni pole algoritmem BubbleSort
 * @author Tomas Kozel
 *
 */
public class BubbleSortApp extends ZakladniPoleApp {

	/**
	 * Predefinovana abstraktni metoda predka
	 * Algoritmus: BUBBLESORT/primou vymenou
	 * @see ZakladniPoleApp#zpracujPole()
	 */
	public void zpracujPole() {
		int i;	//index
		boolean vymena;		//indikuje vymenu dvou sousednich prvku
		int pom;	//pomocna promenna pro vymenu
		
		do {
			vymena = false;   //Zatim jsme nic nevymenovali
			for(i=0;i<pole.length-1;i++) {
				if (pole[i]>pole[i+1]) {
					pom = pole[i];
					pole[i] = pole[i+1];
					pole[i+1] = pom;
					vymena = true;   //prave jsme provedli vymenu
				}
			}
			
		} while (vymena);
	}

	public static void main(String[] args) {
		new BubbleSortApp().start();
	}
}
