package cz.uhk.anongui.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *  Ukazka BorderLayoutu
 */
public class BorderLayoutFrame extends JFrame {
	private static final long serialVersionUID = 3364664007266935938L;

	public BorderLayoutFrame() {
		initGui();
	}
	
	/**
	 * Rozvrzeni komponent
	 */
	private void initGui() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//layout je vychozi pro JFrame, neni nutno nastavovat
		add(new JButton("NORTH"),BorderLayout.NORTH);
		add(new JButton("SOUTH"),BorderLayout.SOUTH);
		add(new JButton("EAST"),BorderLayout.EAST);
		add(new JButton("WEST"),BorderLayout.WEST);
		add(new JButton("CENTER"),BorderLayout.CENTER);
		
		pack();
	}

	/**
	 * spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new BorderLayoutFrame().setVisible(true);
			}
		});
	}

}
