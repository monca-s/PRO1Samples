package cz.uhk.anongui.frame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Ukázka jednoduchého Framu vytvořeného jako potomka JFrame
 */
public class FrameSample2 extends JFrame {
	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor
	 */
	public FrameSample2() {
		//vytoření komponent
		super("Muj druhy Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	/**
	 * spouštěcí metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new FrameSample2().setVisible(true);
			}
		});
	}

}
