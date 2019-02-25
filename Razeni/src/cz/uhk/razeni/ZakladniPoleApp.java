package cz.uhk.razeni;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Zakladni trida implementujici obvykle operace s polem
 * 
 * @author  Tomas Kozel
 */
public abstract class ZakladniPoleApp {
    protected int[] pole = null;	//atribut typu pole celych cisel
    protected Scanner sc = new Scanner(System.in);
    
    public void start() {
        int velikost;
        
        System.out.println("Jednorozmerne pole - " + getClass().getName().toUpperCase());
        System.out.print("Zadejte velikost pole [cele cislo]: ");
        try {
        	velikost = sc.nextInt();
        } catch (InputMismatchException ex) {
        	velikost = 10;
        	System.out.printf("Velikost pole nastavena na %d\n",velikost);
        }
        //sc.close();
        
        pole = new int[velikost];   //alokace pole v pam�ti
        
        //naplneni pole nahodnymi hodnotami od 0 do velikost -1
        generuj(velikost);
        
        System.out.println("Nesetridena posloupnost");
        vypisPole();
        zpracujPole();
		System.out.println("Setridena posloupnost");
        vypisPole();
    }
    
     
    /**
     * Generuje nahodne hodnoty a uklada je do pole
	 * @param h
	 */
	public void generuj(int h) {
		Random generator;
		int i;
		
		//Vytvori objekt generatoru nahodnych cisel. Inicializacni hodnota bude cas v milisekundach.
		generator = new Random(System.currentTimeMillis());
		for(i=0;i<pole.length;i++) {
			pole[i] = generator.nextInt(h+1); //vygeneruj cele cislo z intervalu 0..h a uloz do pole
		}
	}

    /** 
     * Metoda vypisujici obsah celeho pole.
     */    
    public void vypisPole() {
        int i;
        
        for(i=0; i<pole.length; i++) {
            System.out.print(pole[i]);
            if (i<pole.length-1) {
                System.out.print(",");
            }
        }    
        System.out.println("");
    }
		
	/**
	 * Abstraktni metoda, ktera bude v potomcich manipulovat s polem
	 * (zpravidla radit prvky)
	 *
	 */
	public abstract void zpracujPole();

}
