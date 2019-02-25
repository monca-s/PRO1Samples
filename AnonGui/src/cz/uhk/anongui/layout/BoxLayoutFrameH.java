package cz.uhk.anongui.layout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *  Ukazka BoxLayoutu Horizonalniho
 */
public class BoxLayoutFrameH extends JFrame {
	private static final long serialVersionUID = -4455067443810909635L;

	public BoxLayoutFrameH() {
		initGui();
	}
	
	/**
	 * Rozvrzeni komponent
	 */
	private void initGui() {
		setTitle("BoxLayout X_AXIS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//konstruktor BoxLayoutu potrebuje referenci na kontejner,
		//u JFramu je to historicky contentPane
		setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
		
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
				new BoxLayoutFrameH().setVisible(true);
			}
		});
	}

}
