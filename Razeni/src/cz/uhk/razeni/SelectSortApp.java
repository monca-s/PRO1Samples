package cz.uhk.razeni;

/**
 * Priklad trideni pole algoritmem SelectSort
 * @author Tomas Kozel
 *
 */
public class SelectSortApp extends ZakladniPoleApp {

	/**
	 * Predefinovana abstraktni metoda predka
	 * Algoritmus: SELECTSORT/primym vyberem
	 * @see ZakladniPoleApp#zpracujPole()
	 */
	public void zpracujPole() {
		int i, j;	//Indexy
		int pom;	//pomocna promenna pro vymenu hodnot
		int imin;	//aktualni index minimilniho prvku
		
		for(i=0;i<pole.length-1;i++) {
			imin = i;
			for(j=i+1;j<pole.length;j++) {
				if (pole[imin]>pole[j]) {
					imin = j;
				} //if
			}//for j
			if (imin!=i) { //Vymena
				pom = pole[imin];
				pole[imin] = pole[i];
				pole[i] = pom;				
			}//if
		}//for i
	}

	public static void main(String[] args) {
		new SelectSortApp().start();
	}

}
