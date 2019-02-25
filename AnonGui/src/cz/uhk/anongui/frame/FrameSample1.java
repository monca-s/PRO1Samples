package cz.uhk.anongui.frame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Ukázka vytvoření Framu přímo pomojí JFrame
 */
public class FrameSample1 {

	/**
	 * spouštěcí metoda
	 */
	public static void main(String[] args) {
		//takto správně spouštíme Swingovou aplikaci
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new JFrame("Moje prvni okno");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(640, 480); //Zkuste místo toho frame.pack();
				frame.setVisible(true);
			}
		});
		
	}

}
