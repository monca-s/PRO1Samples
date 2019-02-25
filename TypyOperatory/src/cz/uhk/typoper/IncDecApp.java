package cz.uhk.typoper;

/**
 * Ukazka prace s unarnimi operatory inkrementace a dekrementace
 * ++/--
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class IncDecApp {

	/**
	 * Startovaci metoda
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		//postfixova forma
		int c = a++ * b--;
		
		System.out.printf("Vysledek 1 :\n\tc = %d\n\ta = %d\n\tb = %d\n",c,a,b);
		
		//a znovu s drobnou zmenou - tzv. prefixova forma
		a = 10;
		b = 5;
		c = ++a * --b;
		
		System.out.printf("Vysledek 2 :\n\tc = %d\n\ta = %d\n\tb = %d\n",c,a,b);
		
	}

}
