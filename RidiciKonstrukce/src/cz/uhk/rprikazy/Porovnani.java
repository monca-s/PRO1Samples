//toto je deklarace prislusnosti tridy k balicku
package cz.uhk.rprikazy;  

/**
 * Ukazka pouziti podminky
 * @author Tomas Kozel
 *
 */
public class Porovnani {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//lokalni (docasne) promenne
		int cislo1 = 200; //zkuste si menit hodnoty
		int cislo2 = 150;
		
		if (cislo2>cislo1) {
			//tzv. formatovany vypis do vystupni konzole systemu
			//   %d - je zastupcem dekadickeho cisla v textu (bude dosazeno z parametru)
			//   \n - znak pro ukonceni radku na obrazovce - skok na novy radek
			System.out.printf("Cislo %d je vetsi nez %d\n",cislo2,cislo1);
		} else {
			System.out.printf("Cislo %d je vetsi nebo rovno nez %d\n",cislo1,cislo2);
		}
	}

}
