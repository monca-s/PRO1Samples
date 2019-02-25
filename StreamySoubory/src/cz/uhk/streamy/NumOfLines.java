package cz.uhk.streamy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Spocita pocet radku v textovem souboru
 * pocet radku
 */
public class NumOfLines {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.format("Aktualni adresar: %s\n",System.getProperty("user.dir"));
		
		System.out.print("Zadej cestu k souboru, ktery chces kopirovat :");
		String fname = sc.nextLine();
		
		sc.close();
		
		int lines = countLines(fname);
		
		System.out.format("V souboru je %d radku.\n", lines);
	}

	private static int countLines(String fname) {
		int count = 0;
		
		BufferedReader inp = null;
		try {
			inp = new BufferedReader(new FileReader(fname));
			while (inp.readLine()!=null) {
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inp!=null) {
				try {
					inp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return count;
	}

}
