package cz.uhk.anongui.layout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *  Ukazka BoxLayoutu vertikalniho
 */
public class BoxLayoutFrameV extends JFrame {
	private static final long serialVersionUID = 1L;

	public BoxLayoutFrameV() {
		initGui();
	}
	
	/**
	 * Rozvrzeni komponent
	 */
	private void initGui() {
		setTitle("BoxLayout Y_AXIS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//konstruktor BoxLayoutu potrebuje referenci na kontejner,
		//u JFramu je to historicky contentPane
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		
		add(new JButton("PRVNI"));
		add(new JButton("DRUHY"));
		add(new JButton("TRETI"));
		add(new JButton("CTVRTY"));
		add(new JButton("PATY"));
		add(new JButton("SESTY"));
		
		pack();
	}

	/**
	 * spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new BoxLayoutFrameV().setVisible(true);
			}
		});
	}

}
