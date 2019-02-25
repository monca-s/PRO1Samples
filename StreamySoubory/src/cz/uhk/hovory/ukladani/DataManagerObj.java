package cz.uhk.hovory.ukladani;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cz.uhk.hovory.model.SeznamHovoru;


/**
 * Implementuje spr�vu trval�ch dat pomoc� bin�rn�ho objektov�ho
 * proudu (streamu)
 * @author Tom� Kozel
 *
 */
public class DataManagerObj implements DataManager {
	private String jmenoSouboru;

	/**
	 * Konstruktor
	 * @param jmenoSouboru
	 */
	public DataManagerObj(String jmenoSouboru) {
		this.jmenoSouboru = jmenoSouboru;
	}

	public SeznamHovoru nactiSeznamHovoru() {
		try {
			// Vytvo��me vstupn� objektov� stream napojen� na zadan� soubor
			ObjectInputStream vstup = new ObjectInputStream(new FileInputStream(jmenoSouboru));
			// na�teme cel� objekt najednou ze streamu
			SeznamHovoru seznam = (SeznamHovoru) vstup.readObject(); //pokud se nenajde t��da, generuje v�jimku
			return seznam;
		} catch (IOException e) {
			e.printStackTrace();
			// pokud se na�ten� nezda��, vr�t�me null
			return null;
		} catch (ClassNotFoundException e) {
			// nepoda5ilo se naj�t t��du objektu
			e.printStackTrace();
			return null;
		}
	}

	public void ulozSeznamHovoru(SeznamHovoru seznam) {
		try {
			// Vytvo��me v�stupn� objektov� stream napojen� na zadan� soubor
			ObjectOutputStream vystup = new ObjectOutputStream(new FileOutputStream(jmenoSouboru));
			// Zap�eme cel� objekt seznamu hovor� do streamu (souboru)
			vystup.writeObject(seznam);
			vystup.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
