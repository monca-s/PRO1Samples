package cz.uhk.hovory.ukladani;

import cz.uhk.hovory.model.SeznamHovoru;

/**
 * Rozhran� pro spr�vu dat - trval� na��t�n� a ukl�d�n�.
 * Umo��uje p�istupovat k trval�m dat�m jednotn�m zp�sobem bez 
 * ohledu na konkr�tn� implementaci spr�vy souborov�ch dat.
 * @author Tom� Kozel
 *
 */
public interface DataManager {
	/**
	 * Na��t� data ze souboru a vrac� p��mo instanci seznamu hovor�
	 * @param jmenoSouboru cest k souboru s daty
	 * @return na�ten� seznam
	 */
	public SeznamHovoru nactiSeznamHovoru();
	
	/**
	 * Ukl�d� instanci seznamu hovor� do souboru
	 * @param seznam
	 */
	public void ulozSeznamHovoru(SeznamHovoru seznam);
}
