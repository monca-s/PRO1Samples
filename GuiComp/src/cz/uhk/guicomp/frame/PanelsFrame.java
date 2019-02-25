package cz.uhk.guicomp.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

/**
 * Ukazka prace s ramecky a JPanely
 *
 */
public class PanelsFrame extends JFrame {

	public PanelsFrame() {
		super("Panely & Ramecky");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGui();
	}
	
	private void initGui() {
		JPanel pnlCenterEtched = new JPanel();
		add(pnlCenterEtched,BorderLayout.CENTER);
		pnlCenterEtched.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		
		JPanel pnlNorthTitled = new JPanel();
		add(pnlNorthTitled,BorderLayout.NORTH);
		pnlNorthTitled.setBorder(BorderFactory.createTitledBorder("Titulek"));
		
		JPanel pnlSouthBevel = new JPanel();
		add(pnlSouthBevel,BorderLayout.SOUTH);
		pnlSouthBevel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		pnlSouthBevel.setPreferredSize(new Dimension(100, 50)); //upravime velikost
		
		JPanel pnlEastLine = new JPanel();
		add(pnlEastLine,BorderLayout.EAST);
		pnlEastLine.setBorder(BorderFactory.createLineBorder(Color.RED));
		pnlEastLine.setPreferredSize(new Dimension(50, 100));
		
		JPanel pnlWestEmpty = new JPanel(new GridLayout(1,1));
		add(pnlWestEmpty,BorderLayout.WEST);
		pnlWestEmpty.setBorder(BorderFactory.createEmptyBorder(10,20,30,40));
		//vlozim tlacitko, aby byly jasne videt okraje
		pnlWestEmpty.add(new JButton("West"));
		
		setSize(640, 480);
	}

	/**
	 * spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new PanelsFrame().setVisible(true);
			}
		});
	}

}
