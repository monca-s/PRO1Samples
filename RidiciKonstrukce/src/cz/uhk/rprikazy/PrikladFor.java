package cz.uhk.rprikazy;


/**
 * Ukazka pouziti cyklu for (s ridici promennou)
 * Soucet vsech celych cisel od 1 do 100
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class PrikladFor {

	/**
	 * Startovaci metoda
	 * @param args
	 */
	public static void main(String[] args) {
		int soucet = 0;  //do teto promenne budeme "nascitavat"
		
		for(int i = 1; i<=100; i++) {
			soucet = soucet + i;
		}
	
		System.out.printf("Soucet cisel je %d\n", soucet);
	}

}
