package cz.uhk.streamy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ukazka cteni/ukladani pole do bin. souboru
 * pomoci DataStreamu
 */
public class BinFileArray {

	
	/**
	 * spousteci metoda
	 */
	public static void main(String[] args) {
		BinFileArray bfa = new BinFileArray();
		double[] pole = new double[10];
		
		bfa.generateArray(pole);
		System.out.print("Vygenerovano: ");
		bfa.printArray(pole);
		
		bfa.saveArray(pole);
		
		double[] pole2 = bfa.readArray();
		System.out.print("Nacteno: ");
		bfa.printArray(pole2);
	}

	/**
	 * Naplni pole nahodnym obsahem
	 * @param pole
	 */
	private void generateArray(double[] pole) {
		for (int i = 0; i < pole.length; i++) {
			pole[i] = Math.random()*100;
		}
	}

	/**
	 * Vypisuje obsah pole do standardniho vystupu
	 * @param pole
	 */
	private void printArray(double[] pole) {
		for (double d : pole) {
			System.out.format("%6.2f ", d);
		}
		System.out.println();
	}

	/**
	 * Nacita pole z binarniho datoveho souboru
	 * @return
	 */
	private double[] readArray() {
		double[] pole = null;
		DataInputStream inp = null;
		try {
			inp = new DataInputStream(new FileInputStream("pole.dat"));
			//precteme pocet prvku
			int len = inp.readInt();
			//alokujeme nove pole prislusne delky
			pole = new double[len];
			//nacitame tolikrat, kolik je yjistena delka
			for (int i = 0; i < pole.length; i++) {
				pole[i] = inp.readDouble();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//zavreme stream
			if (inp!=null) {
				try {
					inp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//vracime nove nactene pole
		return pole;
	}

	/**
	 * Uklada predane pole
	 * @param pole
	 */
	private void saveArray(double[] pole) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("pole.dat"));
			//zapiseme pocet prvku jako integer
			out.writeInt(pole.length);
			//zapisujeme prvky z pole, jako double
			for (int i = 0; i < pole.length; i++) {
				out.writeDouble(pole[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//zavirame stream
			if (out!=null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
