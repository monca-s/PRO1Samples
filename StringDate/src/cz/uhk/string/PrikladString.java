package cz.uhk.string;

import javax.swing.JOptionPane;

/**
 * Priklad prace s textovymi promennymi a hodnotami - String
 * @author Tomas Kozel
 *
 */
public class PrikladString {

	/* 
	 * Startovaci metoda
	 */
	public static void main(String[] args) {
		String jmpr,s1,s2;
		int pos;
		
		s1 = JOptionPane.showInputDialog("Zadejte sve prijmeni");
		s2 = JOptionPane.showInputDialog("Zadejte krestni jmeno");
		
		//Spojeni retezcu
		jmpr = s2 + " " + s1;
		
		System.out.print("Zadane prijmeni: ");
		System.out.println(s1);
		System.out.print("Zadane jmeno: ");
		System.out.println(s2);
		System.out.print("Dohromady: ");
		System.out.println(jmpr);
		//Prevod na mala pismena
		System.out.println(jmpr.toLowerCase());
		//Prevod na VELKA pismena
		System.out.println(jmpr.toUpperCase());
		//Nahrazeni znaku mezera carkou
		System.out.println(jmpr.replace(' ',','));
		
		//Budeme hledat podretezec
		s1 = JOptionPane.showInputDialog("Koho hledate?");
		
		/*
		 * Vsimnete si prirazeni v podmince ! - neboli 2v1 (dva v jednom)
		 */
		if ((pos = jmpr.indexOf(s1)) != -1) {
			System.out.println("Nalezeno na pozici "+pos);
		} else {
			System.out.println("Nenalezeno!");
		}
		
	}

}
