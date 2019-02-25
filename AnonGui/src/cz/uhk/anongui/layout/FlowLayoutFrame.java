package cz.uhk.anongui.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *  Ukazka FlowLayoutu
 */
public class FlowLayoutFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public FlowLayoutFrame() {
		initGui();
	}
	
	/**
	 * Rozvrzeni komponent
	 */
	private void initGui() {
		setTitle("FlowLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
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
				new FlowLayoutFrame().setVisible(true);
			}
		});
	}

}
