package cz.uhk.vyjimky;

/**
 * Vastni trida vyjimky pri nacitani datumu z klavesnice.
 * 
 * Jsou definovany jen nektere konstruktory z predka
 * 
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class ReadDateException extends Exception {
	private static final long serialVersionUID = 8759651159409629949L;

	public ReadDateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ReadDateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
