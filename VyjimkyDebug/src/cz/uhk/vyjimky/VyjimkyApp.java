package cz.uhk.vyjimky;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/******************************************
 * <b>Ukazka zpracovani vyjimek</b><hr>
 * Budete dotazani na 3 datumy. Zkousejte stornovat okno, zadavat nesmyslna data
 * a sledujte, jak se program chova. V metode main si muzete pomoci komentaru //
 * docasne zablokovat spusteni nekterych variant. Nasledne prostudujte kod.
 * 
 * @author Tomas Kozel (FIM UHK)
 * 
 */
public class VyjimkyApp {
	private static  DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	/**
	 * Metoda s pohlcenou kontrolovanou/checked vyjimkou (VELMI OSKLIVE)
	 * Nikdo se nic nedozvi, zbytek programu muze havarovat
	 * 
	 * @param prompt
	 * @return
	 */
	public Date readDatePohlceno(String prompt) {
		/*
		 * Chceme nacist datum, knihovni metoda objektu JOptionPane ale vraci
		 * String, proto budeme prevadet ze Stringu na Date, coz muze nekdy
		 * zpusobit chybu - tj. vyvolat vyjimku typu ParseException
		 */
		Date d = null;
		String odpoved = JOptionPane.showInputDialog(prompt);
		try {
			d = dateFormat.parse(odpoved);
		} catch (ParseException e) {} // nic se nedovime!!!
		return d;
	}

	/**
	 * Metoda s pohlcenou kontrolovanou/checked vyjimkou
	 * 
	 * @param prompt
	 * @return
	 */
	public Date readDateZachyceno(String prompt) {
		/*
		 * Chceme nacist datum, knihovni metoda objektu JOptionPane ale vraci
		 * String, proto budeme prevadet ze Stringu na Date, coz muze nekdy
		 * zpusobit chybu - tj. vyvolat vyjimku typu ParseException
		 */
		Date d = null;
		boolean nacteno; //priznak spravneho nacteni
		do {
			String odpoved = JOptionPane.showInputDialog(prompt);
			try {
				d = dateFormat.parse(odpoved);
				nacteno = true;
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "Chybny format data (vyzadovano: dd.mm.rrrr). Zadejte znovu");
				nacteno  = false;
			}
		} while (!nacteno);
		return d;
	}

	/**
	 * Metoda s propagovanou kontrolovanou/checked vyjimkou
	 * 
	 * @param prompt
	 * @return
	 * @throws ParseException
	 *             typ vyhazovane/propagovane vyjimky
	 */
	public Date readDatePropagovano(String prompt) throws ParseException {
		Date d = null;
		String odpoved = JOptionPane.showInputDialog(prompt);
		d = dateFormat.parse(odpoved);
		return d;
	}
	
	/**
	 * Metoda se zachycenou kontrolovanou i nekontrolovane vyjimky.
	 * Pri stornu dialogu dojde ke generovani NullPointerException
	 * 
	 * @param prompt
	 * @return
	 * @throws ParseException
	 *             typ vyhazovane/propagovane vyjimky
	 */
	public Date readDate2Vyjimky(String prompt) {
		Date d = null;
		String odpoved = JOptionPane.showInputDialog(prompt);
		try {
			d = dateFormat.parse(odpoved);
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Stornovano (resp. NullPointer)");
			e.printStackTrace();
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Chybny format data");
			e.printStackTrace();
		}
		return d;
	}
	
	/**
	 * Metoda se zachycenou kontrolovanou i nekontrolovane vyjimky
	 * Zachyceno pomoci vyjimky typu Exception (TAKE NEVHODNE, nerozlisime, k cemu doslo)
	 * Pri stornu dialogu dojde ke generovani NullPointerException
	 * 
	 * @param prompt
	 * @return
	 * @throws ParseException
	 *             typ vyhazovane/propagovane vyjimky
	 */
	public Date readDate2VyjimkyPredek(String prompt) {
		Date d = null;
		String odpoved = JOptionPane.showInputDialog(prompt);
		try {
			d = dateFormat.parse(odpoved);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Neco se stalo, ale nevim co :)");
			e.printStackTrace();
		}
		return d;
	}
	
	/**
	 * Metoda se zachycenou kontrolovanou i nekontrolovane vyjimky.
	 * Pri stornu dialogu dojde ke generovani NullPointerException
	 * 
	 * @param prompt
	 * @return
	 * @throws ReadDateException
	 *             typ vlastni vyhazovane vyjimky
	 */
	public Date readDateVlastniVyjimka(String prompt) throws ReadDateException {
		Date d = null;
		String odpoved = JOptionPane.showInputDialog(prompt);
		try {
			d = dateFormat.parse(odpoved);
		} catch (NullPointerException e) {
			//do nove vyjimky predame i tu puvodni, zretezime
			throw new ReadDateException("Chyba pri cteni data. Stornovano", e);
		} catch (ParseException e) {
			throw new ReadDateException("Chyba pro cteni data. Spatny format [dd.mm.rrrr].",e);
		}
		return d;
	}
	
	/**
	 * Startovaci metoda
	 */
	public static void main(String[] args) {
		VyjimkyApp app = new VyjimkyApp();
		
		Date d = null;
		//z nize uvedenych variant si vzdy nechte odkomentovanou jen jednu
		//v Eclipsu oznacte, co chcete zakomentovat/odkomentovat a volbou ctrl+7, nebo CMD+7 (mac)
		//se cely blok zakomentuje
		
//		d = app.readDatePohlceno("Zadejte datum [pohlceni vyjimky]");
//		//zachycujeme propagovanou vyjimku z metody
//		try {
//			d = app.readDatePropagovano("Zadejte datum [propagace vyjimky]");
//		} catch (ParseException e) {
//			JOptionPane.showMessageDialog(null, "CHYBA: "+e.getLocalizedMessage());
//			e.printStackTrace();//zaznam zasobniku volani metod - stopa vyjimky
//		}
//		d = app.readDateZachyceno("Zadejte datum [zachyceni vyjimky]");
//		d = app.readDate2Vyjimky("Zadejte datum [2 vyjimky]");	
//		d = app.readDate2VyjimkyPredek("Zadejte datum [2 vyjimky zachycene jako predek]");
		try {
			d = app.readDateVlastniVyjimka("Zadejte datum [s vlastni vyjimkou]");
		} catch (ReadDateException e) {
			JOptionPane.showMessageDialog(null, "CHYBA: "+e.getLocalizedMessage());
			e.printStackTrace();//zaznam zasobniku volani metod - stopa vyjimky
		}
		//Vypiseme alespon neco
		if (d!=null) {
			JOptionPane.showMessageDialog(null, dateFormat.format(d));
		}
	}

}
