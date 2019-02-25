package cz.uhk.razeni;

/**
 * Priklad trideni pole algoritmem InsertSort
 * @author Tomas Kozel
 *
 */
public class InsertSortApp extends ZakladniPoleApp {

	/**
	 * Predefinovana abstraktni metoda predka
	 * Algoritmus: INSERTSORT/primym vkladanim
	 * @see ZakladniPoleApp#zpracujPole()
	 */
	public void zpracujPole() {
		int x;
		int i,j;
		
		for(i=1;i<pole.length;i++) { //posouvani konce setridene casti
			x = pole[i];
			j = i - 1;
			while (j>=0 && pole[j]>x) { //zatridovani prvniho prvku nesetridene casti do setridene
				pole[j+1] = pole[j];
				j--;
			}
			pole[j+1] = x; 
		}
		
	}

	public static void main(String[] args) {
		new InsertSortApp().start();
	}
}
