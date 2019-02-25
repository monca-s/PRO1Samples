package cz.uhk.rprikazy;

/**
 * Ukazka prace s cyklem s podminkou na zacatku
 * Dekadicky rozklad celeho cisla
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class PrikladWhile {

	/**
	 * Startovaci metoda tridy
	 * @param args
	 */
	public static void main(String[] args) {
		int cislo = 23456;  //zvolte si
		int zbytek;
		int mocninaDeseti = 1;
		
		System.out.printf("Dekadicky rozvoj cisla %d je ",cislo);
		
		while (cislo!=0) {
			zbytek = cislo - (cislo / 10) * 10;  //cislo / 10 je zde celociselne deleni
			cislo = cislo / 10;
			System.out.printf("%d*%d",zbytek,mocninaDeseti);
			if (cislo!=0) {
				//plus jen kdyz nejsme na konci
				System.out.print(" + ");
			}
			mocninaDeseti = mocninaDeseti * 10;
		}
		System.out.println();  //odradkujeme ... ln = line
	}

}
