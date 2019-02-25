package cz.uhk.streamy;
import java.io.File;


/**
 * Zjisteni informaci o souborech v aktualnim adresari
 * starsi pristup pomoci java.io.File (JDK<7)
 * 
 */
public class FileInfoApp {

	public static final void main(String[] args) {
		//aktualni adresar, slozka src
		String adr = System.getProperty("user.home");
		
		vypisSoubory(adr);
		
	}

	/**
	 * Vypise vsechny soubory v zadanem adresari
	 * @param adr cesta k adresari
	 */
	private static void vypisSoubory(String adr) {
		File aktAdr = new File(adr);
		
		System.out.println(aktAdr.getAbsolutePath());
		System.out.println("===========================================");
		
		File[] soubory = aktAdr.listFiles();
		
		for(int i = 0; i < soubory.length; i++) {
			detailSouboru(soubory[i]);
		}
	}

	/**
	 * Zobrazeni popisu vlastnosti souboru
	 * @param file
	 */
	private static void detailSouboru(File soub) {
		String typ=null;
		if (soub.isFile()) {
			typ = "file"; 
		} else if (soub.isDirectory()) {
			typ = "DIR";
		}
		
		String perm="";
		perm+=(soub.canRead())?"r":"-";
		perm+=(soub.canWrite())?"w":"-";
		perm+=(soub.canExecute())?"x":"-";
		
		System.out.format("%-30.30s %5s %15d %5s\n",soub.getName(),
				typ,soub.length(),perm);
	}

}
