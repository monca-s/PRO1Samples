package cz.uhk.hovory.app;

import java.awt.Font;

import javax.swing.SwingUtilities;

import cz.uhk.hovory.model.Hovor;
import cz.uhk.hovory.model.SeznamHovoru;
import cz.uhk.hovory.ukladani.DataManager;
import cz.uhk.hovory.ukladani.DataManagerBin;
import cz.uhk.hovory.ukladani.DataManagerObj;
import cz.uhk.hovory.ukladani.DataManagerText;


import fim.utils.Application;
/**
 * Aplikacni trida - pouziva knihovnu FIMUtils (ve slozce lib) - fimutils.jar
 * 
 * Pomoci tlacitek v okne vyberete format ukladani/nacitani, pomoci Vypsat vypisete 
 * aktualni sadu dat.
 * @author Tomas Kozel (FIM UHK)
 *
 */
@SuppressWarnings("serial")
public class SouborTestApp extends Application {
	private SeznamHovoru seznamHovoru;
	private DataManager manager;
	
	/**
	 * Konstruktor
	 */
	public SouborTestApp() {
		//Nejaka data do zacatku
		vytvorVzorovaData();
		// Prednastavime jedenu z variant ukladani
		manager = new DataManagerText("hovory.txt");
		out.setTitle("TEXTOVY SOUBOR");
	}
	
	/**
	 * Vytvori a naplni seznam hovoru nejakymi daty
	 */
	private void vytvorVzorovaData() {
		seznamHovoru = new SeznamHovoru("duben",2007);
		
		seznamHovoru.getHovory().add(new Hovor(1,"493 331 111",100));
		seznamHovoru.getHovory().add(new Hovor(2,"603 123 456",30));
		seznamHovoru.getHovory().add(new Hovor(5,"603 111 111",12));
		seznamHovoru.getHovory().add(new Hovor(8,"604 222 222",267));
		seznamHovoru.getHovory().add(new Hovor(10,"493 333 333",45));
		seznamHovoru.getHovory().add(new Hovor(10,"493 444 444",32));
		seznamHovoru.getHovory().add(new Hovor(11,"777 555 555",88));
		seznamHovoru.getHovory().add(new Hovor(12,"772 666 666",90));
		seznamHovoru.getHovory().add(new Hovor(13,"602 777 777",110));
		seznamHovoru.getHovory().add(new Hovor(14,"493 888 888",190));
		
	}

	@Override
	public void start() {
		out.setFont(new Font("Monospaced",Font.PLAIN,16));
		buttons.add("Vybrat TXT", 1000);
		buttons.add("Vybrat OBJ", 1001);
		buttons.add("Vybrat BIN", 1002);
		buttons.add("Ulozit", 1003);
		buttons.add("Nacist", 1004);
		buttons.add("Vypsat", 1005);
		buttons.add("Vymazat hovory", 1006);
	}
	
	@Override
	public void handleMenu(int zkratka) {
		switch (zkratka) {
			case 1000:
				out.setTitle("TEXTOVY SOUBOR");
				manager = new DataManagerText("hovory.txt");
				break;
			case 1001:
				out.setTitle("OBJEKTOVY SOUBOR");
				manager = new DataManagerObj("hovory.obj");
				break;
			case 1002:
				out.setTitle("BINARNI SOUBOR");
				manager = new DataManagerBin("hovory.bin");
				break;
			case 1003:
				manager.ulozSeznamHovoru(seznamHovoru);
				break;
			case 1004:
				seznamHovoru = manager.nactiSeznamHovoru();
				break;
			case 1005:
				vypsatHovory();
				break;
			case 1006:
				seznamHovoru.getHovory().clear();
				break;
		}
	}

	private void vypsatHovory() {
		out.clearScreen();
		out.println("<<<<<=====================SEZNAM HOVORU=====================>>>>>");
		for (Hovor h : seznamHovoru.getHovory()) {
			//out.println(h.getDen()+" - "+h.getCislo()+" : "+h.getCas()+" s");
			//nebo take:
			out.println(String.format("%2d - %15s  : %4d s", h.getDen(), h.getCislo(), h.getCas()));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SouborTestApp().start();
			}
		});
	}

}
