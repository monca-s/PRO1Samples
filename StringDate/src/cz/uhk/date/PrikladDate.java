package cz.uhk.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class PrikladDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date praveTed =  new Date();
		System.out.println("Kratky format data: "+DateFormat.getDateInstance(DateFormat.SHORT).format(praveTed));
		System.out.println("Dlouhy format data: "+DateFormat.getDateInstance(DateFormat.LONG).format(praveTed));
		System.out.println("Datum a cas format: "+DateFormat.getDateTimeInstance().format(praveTed));
		
		//vlastni format data 
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		//pouzijeme pro predvyplneni do inputdialogu
		String novyDatumStr = JOptionPane.showInputDialog("Zadejte datum",sdf.format(praveTed));
		//datum od uzivatele prevedeme na Date
		Date novyDatum;
		try {
			novyDatum = sdf.parse(novyDatumStr);
		} catch (ParseException e) {
			novyDatum = new Date(); //kdyby byla chyba, vezmeme aktualni
		}
		//zkusime pricist 56 dni pomoci kalendare
		Calendar cal = Calendar.getInstance();
		cal.setTime(novyDatum);
		cal.add(Calendar.DAY_OF_MONTH, 56);
		System.out.println("Posunuty datum: "+sdf.format(cal.getTime()));
	}

}
