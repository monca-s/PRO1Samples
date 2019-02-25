package cz.uhk.streamy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.format("Aktualni adresar: %s\n",System.getProperty("user.dir"));
		
		System.out.print("Zadej cestu k souboru, ktery chces kopirovat :");
		String inpName = sc.nextLine();
		System.out.print("Zadej cestu k souboru, do nejz bude soubor zkopirovan:");
		String outpName = sc.nextLine();
		
		System.out.format("Bude se kopirovat z %s do %s\n", inpName,outpName);
		sc.close();
		
		fileCopy(inpName,outpName);
		
		System.out.println("Hotovo!");
	}

	/**
	 * Kopirovani bajt po bajtu
	 * @param inpName cesta ke vstupnimu souboru
	 * @param outpName cesta k vystupnimu souboru
	 */
	private static void fileCopy(String inpName, String outpName) {
		FileOutputStream fOut = null;
		FileInputStream fIn = null;
		try {
			//otevreme streamy
			fOut = new FileOutputStream(outpName);
			fIn = new FileInputStream(inpName);
			//cteme, zapisujeme
			int b;
			while ((b=fIn.read())!=-1) {
				fOut.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//zavirame, pokud to jde
			try {
				if (fIn!=null) fIn.close();
				if (fOut!=null) fOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
