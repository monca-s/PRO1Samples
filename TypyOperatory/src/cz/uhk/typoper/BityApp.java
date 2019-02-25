package cz.uhk.typoper;

/**
 * Ukazka pouziti butovych operatoru
 * prevod cisla na binarni reprezantaci
 * 
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class BityApp {

	/**
	 * Spousteci metoda
	 */
	public static void main(String[] args) {
		//cislo nastavene na hexadecimalni hodnotu - veslo by se do bajtu
		int b =  0xc7; //musi byt maximalne 8-bitove, tj <255 (0xFF)
		
		//Zjistime, jak jsou nastaveny jednotlive bity v cisle 
		// - vyrobime binarni reprezantaci
	
		// - pomocny pocatecni byte s jednim nastavenym bitem vlevo
		int pomocnik = 0x80; //nastaven nejvyssi / 8.bit - 10000000bin = 128 
		
		System.out.printf("%d = 0x%X = ",b,b);
		
		for(int i = 8; i > 0; i--) { //zajima nas jen jeden byte - tj. 8 bitu
			if ((b & pomocnik) == pomocnik) { //bitovy and
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			pomocnik >>= 1; //posuneme bity doprava
		}
		System.out.println();
	}

}
