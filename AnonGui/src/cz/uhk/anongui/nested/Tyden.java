package cz.uhk.anongui.nested;

import java.util.Iterator;

/**
 * Tyden tvoreny jednotlivymi nazvy dnu. Diky tomu, ze implementuje rozhrani
 * Iterable, lze jej prochazet pomoci for each cyklu.
 * Pozadovana metoda iterator() je implementovana pomoci anonymni vnitrni tridy
 */
public class Tyden implements Iterable<String> {
	private String[] dny = {"pondeli","utery","streda","ctvrtek",
			"patek","sobota","nedele"};

	/* 
	 * pomoci anonymni vnitrni tridy odvozene od rozhrani Iterator<String>
	 */
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() { //vracime instanci anonymni vnitrni tridy
			int index = 0;
			@Override
			public boolean hasNext() {
				return (index<dny.length);
			}

			@Override
			public String next() {
				return dny[index++];
			}

			@Override
			public void remove() {
				//neimplementovano
			}
		};
	}
	
}
