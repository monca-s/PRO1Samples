package cz.uhk.hovory.ukladani;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import cz.uhk.hovory.model.Hovor;
import cz.uhk.hovory.model.SeznamHovoru;


/**
 * Implementuje spr�vu trval�ch dat pomoc� textov�ho souboru 
 * CSV - jeden ��dek = jeden hovor, hodnoty atribut� jsou na ��dku
 * odd�leny st�edn�kem. Na prvn�m ��dku v souboru jsou informace
 * o m�s�ci a roce.
 * @author Tom� Kozel
 *
 */
public class DataManagerText implements DataManager {
	private String jmenoSouboru;
	
	/**
	 * Konstruktor
	 * @param nazevSouboru
	 */
	public DataManagerText(String jmenoSouboru) {
		this.jmenoSouboru = jmenoSouboru;
	}

	/* (non-Javadoc)
	 * @see sooubor.ukladani.DataManager#nactiSeznamHovoru(java.lang.String)
	 */
	public SeznamHovoru nactiSeznamHovoru() {
		try {
			//vytvo�en� znakov�ho vstupn�ho streamu 
			BufferedReader vstup = new BufferedReader(new FileReader(jmenoSouboru));
			//P�e��st 1. ��dek
			String radek = vstup.readLine();
			//rozd�lit ho na m�s�c a rok
			StringTokenizer st = new StringTokenizer(radek,";");
			String mesic = st.nextToken();
			int rok = Integer.parseInt(st.nextToken());
			//Vytvo�it instanci seznamu
			SeznamHovoru seznam = new SeznamHovoru(mesic,rok);
			
			//zpracov�n� ostatn�ch ��dk�
			while ((radek = vstup.readLine())!=null) { //dokud to jde, na��tej ��dek
				zpracujRadek(radek, seznam);
			}
			//Uzav�en� vstupn�ho proudu (streamu)
			vstup.close();
			return seznam;
		} catch (IOException ex) {
			ex.printStackTrace();
			//Nastane-li chyba, vr�t�me null.
			return null;
		}
	}

	/**
	 * Ze zadan�ho ��dku "vydoluje" hodnoty atribut� a vytvo�� instanci Hovoru,
	 * kterou ulo�� do seznamu
	 * @param radek
	 * @param seznam
	 */
	private void zpracujRadek(String radek, SeznamHovoru seznam) {
		//Rozsek�me ��dek
		StringTokenizer st = new StringTokenizer(radek,";");
		int den = Integer.parseInt(st.nextToken());
		String cislo = st.nextToken();
		int cas = Integer.parseInt(st.nextToken());
		//Vytvo��me hovor
		Hovor h = new Hovor(den,cislo,cas);
		//p�id�me do seznamu
		seznam.getHovory().add(h);
	}

	/* (non-Javadoc)
	 * @see sooubor.ukladani.DataManager#ulozSeznamHovoru(sooubor.model.SeznamHovoru)
	 */
	public void ulozSeznamHovoru(SeznamHovoru seznam) {
		try {
			//Vytvo�en� znakov�ho v�stupn�ho proudu (streamu)
			PrintWriter vystup = new PrintWriter(new FileWriter(jmenoSouboru));
			//1. ��dek - m�s�c a rok
			vystup.println(seznam.getMesic()+";"+seznam.getRok());
			//dal�� ��dky p�edstavuj� jednotliv� hovory
			for (Hovor h : seznam.getHovory()) {
				vystup.println(h.getDen()+";"+h.getCislo()+";"+h.getCas());
			}
			// Zav��t stream
			vystup.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
