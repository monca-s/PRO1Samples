package cz.uhk.pole;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Ukazka prace s primitivnim polem celych cisel
 * @author Tomas Kozel (FIM UHK)
 *
 */
public class PrimitivniPoleApp {
	//generator (pseudo)nahodnych cisel
	private static Random generator = new Random(System.currentTimeMillis());
	
	/**
	 * Metoda demonstrujici postupne operace s polem
	 */
	private void provedOperace() {
		//deklarujeme promennou a pomoci metody alokujeme a naplnime pole daty
		int[] poleCelychCisel = vygenerujPole(10);  //parametr urcuje velikost pole
		//vypiseme obsah celeho pole na obrazovku
		vypisPole(poleCelychCisel);
		//od uzivatele si precteme index prvku v poli
		int index = nactiCislo("Zadej index v poli");
		//vypiseme prvek na zadane pozici
		System.out.printf("Na zadane pozici je ulozena hodnota %d\n",poleCelychCisel[index]);
		//zadany prvek odstranime
		odstranPrvek(poleCelychCisel,index);
		// a vypiseme pole znovu pro kontrolu 
		vypisPole(poleCelychCisel);
		//nacteme cislo z klavesnice a zkusime jej vyhledat v poli
		int cislo = nactiCislo("Zadej nejake cele cislo");
		int pozice = najdiCislo(poleCelychCisel,cislo);
		//pokud najdeme
		if (pozice != -1) {
			System.out.printf("Prvek %d nalezen na pozici %d\n",cislo, pozice);
		} else {
			//kdyz nenajdeme vraci nactiCislo hodnotu -1
			System.out.printf("Prvek %d nenalezen\n",cislo);
		}
	}

	
	/**
	 * Hleda sekvencne prvni vyskyt cisla v poli
	 * @param pole pole, v kterem budeme hledat
	 * @param cislo cislo, ktere hledame
	 * @return pozice nalezeneho cisla, -1 pokud nic nenajde
	 */
	private int najdiCislo(int[] pole,int cislo) {
		for(int i=0; i<pole.length; i++) {
			if (pole[i] == cislo) {
				//nasli jsme, vracime pozici a tim koncime
				return i; 
			}
		}
		//ani jednou jsme nevstoupili do podminky ->nic jsme nenasli, vracime -1
		return -1;
	}


	/**
	 * Nacteni jednoho celeho cisla z klavesnice prostrednictvim okenka
	 * @param textVyzvy text zobrazeny uzivateli
	 * @return zadane cele cislo
	 */
	private int nactiCislo(String textVyzvy) {
		//pouzijeme standardni okenko pro vstup 1 radku textu
		String str = JOptionPane.showInputDialog(textVyzvy);
		return Integer.valueOf(str);  //vracime po prevodu z textu na cislo
	}


	/**
	 * Z pole predaneho jako parametr metody odstrani prvek na zadane pozici
	 * POZOR: nezkracuje pole, tj. na konci budou zustavat posledni cisla
	 * @param pole pole, v nemz budeme mazat
	 * @param index pozice prvku k odstraneni
	 */
	private void odstranPrvek(int[] pole, int index) {
		for(int i = index; i<pole.length-1; i++) {
			pole[i]=pole[i+1]; //prepiseme sousedem
		}
	}


	/**
	 * Vypisuje cele pole prvku, vcetne indexu
	 * Trochu pracnejsi varianta, slo by i jednoduseji, kdybychom
	 * to nechteli mit krasne ;)
	 * @param pole pole, ktere chceme vypisovat
	 */
	private void vypisPole(int[] pole) {
		//vyrobime z pole znaku string k podtrzeni vypisu
		char podtrzeni[] = new char[pole.length*6+4];
		Arrays.fill(podtrzeni, '-'); //sikovna funkce, naplni pole samymi znaky '-'
		String strPodtrzeni = new String(podtrzeni);
		//radek indexu
		System.out.println(strPodtrzeni);
		System.out.print(" i |");//popisek prvniho radku
		for(int i = 0; i<pole.length; i++) {
			System.out.printf("%4d |",i); //vypisujeme indexy
		}
		System.out.println();
		System.out.println(strPodtrzeni);
		//radek hodnot, foreach cyklus
		System.out.print("[i]|");//popisek druheho radku
		for(int prvek : pole) {
			System.out.printf("%4d |",prvek); //vypisujeme hodnoty pole dle indexu
		}
		System.out.println();
		System.out.println(strPodtrzeni);
	}


	/**
	 * Alokuje a naplni pole, ktere vrati jako navratovou adresu
	 * @param delka delka pole
	 * @return alokovane a naplnene pole
	 */
	private int[] vygenerujPole(int delka) {
		//alokace
		int[] pole = new int[delka];
		
		for(int i=0; i<pole.length; i++) {
			//i-ty prvek se nastavi na nahodnou hodnotu z intervalu <-50,50>
			pole[i] = generator.nextInt(101)-50; 
		}
		
		return pole; //vratim vyrobene pole
	}


	/**
	 * Startovaci metoda tridy/aplikace
	 * @param args
	 */
	public static void main(String[] args) {
		new PrimitivniPoleApp().provedOperace();
	}


}
