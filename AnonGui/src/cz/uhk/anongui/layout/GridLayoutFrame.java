package cz.uhk.anongui.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *  Ukazka FlowLayoutu
 */
public class GridLayoutFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public GridLayoutFrame() {
		initGui();
	}
	
	/**
	 * Rozvrzeni komponent
	 */
	private void initGui() {
		setTitle("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3,4));
		
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
				new GridLayoutFrame().setVisible(true);
			}
		});
	}

}
