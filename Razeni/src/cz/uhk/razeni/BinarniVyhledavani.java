package cz.uhk.razeni;

/**
 * Ukazka binarniho vyhledavani v serazenem poli
 * POZOR - trida je potomkem SelesctSortApp, aby uz umela tridit
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class BinarniVyhledavani extends SelectSortApp {

	@Override
	public void start() {
		super.start(); //volame zdedenou metodu start
		binarniVyhledavani();
	}
	

	/**
	 * Binarni vyhledavani v serazenem poli celych cisel
	 */
	public void binarniVyhledavani() {
		System.out.print("Zadejte hledanou hodnotu: ");
		int hodnota = sc.nextInt();
		sc.close();
		int a=0,b=pole.length-1; //meze intervalu indexu
		int c; 	//prostredek intervalu
		do {
			c = (a+b)/2;
			if (pole[c]>hodnota) {
				b = c;
			} else {
				a = c;
			}
		} while (pole[c]!=hodnota && b-a>0);
		if (pole[c] == hodnota) {
			//nalezeno
			System.out.printf("Nalezeno na pozici %d - hodnota %d\n",c,pole[c]);
		} else {
			System.out.println("Nenalezeno.");
		}
	}

	/**
	 * Startovaci metoda tridy
	 */
	public static void main(String[] args) {
		new BinarniVyhledavani().start();
	}

}
