package cz.uhk.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class RozdeleniRetezce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String textData = "Babicka sla do lekarny, aby si koupila neco na nervy.";
		
		String[] slova = sekejSplit(textData);
		vypisSlova("SPLIT", slova);
		slova = sekejTokenizer(textData);
		vypisSlova("TOKEN", slova);
		slova = sekejManualne(textData);
		vypisSlova("RUCNE", slova);
	}

	private static String[] sekejManualne(String textData) {
		//Pouzijeme list, jelikoz nevime predem pocet prvku
		List<String> vysledek = new ArrayList<>(10);
		int i,j;
		int strLen = textData.length();
		for(i = 0; i<strLen; i++) {
			//hledame oddelovac
			for(j=i; i<strLen && !jeOddelovac(textData.charAt(j)); j++) {}
			vysledek.add(textData.substring(i, j));
			i=j;
		}
		//prevedeme na pole a vratime
		return vysledek.toArray(new String[vysledek.size()]);
	}

	private static boolean jeOddelovac(char ch) {
		return ch==' ' || ch=='.' || ch=='.';
	}

	private static String[] sekejTokenizer(String textData) {
		//Pouzijeme list, jelikoz nevime predem pocet prvku
		List<String> vysledek = new ArrayList<>(10);
		StringTokenizer st = new StringTokenizer(textData," ,.");
		while (st.hasMoreTokens()) {
			vysledek.add(st.nextToken());
		}
		//prevedeme na pole a vratime
		return vysledek.toArray(new String[vysledek.size()]);
	}

	private static void vypisSlova(String label,String[] slova) {
		System.out.print(label+":");
		for (String s : slova) {
			System.out.print(s+",");
		}
		System.out.println();
	}

	private static String[] sekejSplit(String textData) {
		String[] vysledek = textData.split("[ .,]");
		return vysledek;
	}

}
