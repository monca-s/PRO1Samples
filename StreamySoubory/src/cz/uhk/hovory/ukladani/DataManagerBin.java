/**
 * 
 */
package cz.uhk.hovory.ukladani;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import cz.uhk.hovory.model.Hovor;
import cz.uhk.hovory.model.SeznamHovoru;


/**
 * Implementuje spr�vu trval�ch dat pomoc� bin�rn�ch stream�.
 * @author Tom� Kozel
 *
 */
public class DataManagerBin implements DataManager {
	private String jmenoSouboru;
	
	/**
	 * Konstruktor
	 * @param jmenoSouboru
	 */
	public DataManagerBin(String jmenoSouboru) {
		this.jmenoSouboru = jmenoSouboru;
	}

	/* (non-Javadoc)
	 * @see sooubor.ukladani.DataManager#nactiSeznamHovoru()
	 */
	public SeznamHovoru nactiSeznamHovoru() {
		try {
			//Otev�eme vstupn� bin�rn� stream
			DataInputStream vstup = new DataInputStream(new FileInputStream(jmenoSouboru));
			//Na�teme atributy seznamu
			String mesic = vstup.readUTF();
			int rok = vstup.readInt();
			//Vytvo��me instanci seznamu 
			SeznamHovoru seznam = new SeznamHovoru(mesic,rok);
			//zjist�me, kolik hovor� bude n�sledovat
			int pocet = vstup.readInt();
			//p�e�teme v�echny hovory a vlo��me je do seznamu
			for (int i  = 0; i < pocet; i++) {
				Hovor h = new Hovor(vstup.readInt(),vstup.readUTF(),vstup.readInt());
				seznam.getHovory().add(h);
			}
			//Zav�eme vstupn� proud (stream)
			vstup.close();
			return seznam;
		} catch (IOException e) {
			e.printStackTrace();
			//pokud se na�ten� nezda��, vr�t�me null
			return null;
		}
		
	}

	/* (non-Javadoc)
	 * @see sooubor.ukladani.DataManager#ulozSeznamHovoru(sooubor.model.SeznamHovoru)
	 */
	public void ulozSeznamHovoru(SeznamHovoru seznam) {
		try {
			DataOutputStream vystup = new DataOutputStream(new FileOutputStream(jmenoSouboru));
			//Zapsat atributy seznamu
			vystup.writeUTF(seznam.getMesic());
			vystup.writeInt(seznam.getRok());
			//zap�eme, kolik hovor� se bude ukl�dat
			vystup.writeInt(seznam.getHovory().size());
			//zapsat hovory
			for (Hovor h : seznam.getHovory()) {
				vystup.writeInt(h.getDen());
				vystup.writeUTF(h.getCislo());
				vystup.writeInt(h.getCas());
			}
			//Zav��t proud (stream)
			vystup.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
