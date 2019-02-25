package cz.uhk.guicomp.toggle;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;

/**
 *  Ukazka prace se zaskrtavacimi tlacitky
 *  JCheckBox a JRadioButton
 */
public class ToggleFrame extends JFrame {
	private JCheckBox chbActive = new JCheckBox("Aktivni skupina",true);//zaskrtnuto
	private JPanel pnlCenter;
	//radio buttony
	private JRadioButton rbBlue;
	private JRadioButton rbRed;
	//tlacitkova skupina
	private ButtonGroup bgRadio = new ButtonGroup();
	
	public ToggleFrame() {
		super("Zaskrtavatka");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGui();
	}
	
	private void initGui() {
		add(chbActive,BorderLayout.NORTH);
		chbActive.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//nastavime stav skupiny radiobuttonu, nase metoda
				setGroupState(chbActive.isSelected());
			}
		});
		//panel s radio buttony
		pnlCenter = new JPanel(new GridLayout(1, 2));
		rbRed = new JRadioButton("Cervena");
		pnlCenter.add(rbRed);
		rbBlue = new JRadioButton("Modra");
		pnlCenter.add(rbBlue);
		
		add(pnlCenter,BorderLayout.CENTER);
		
		bgRadio.add(rbRed);
		bgRadio.add(rbBlue);
		
		//spolecny listener obou radio buttonu
		ActionListener lsn = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//zjistime zdroj udalosti
				JRadioButton rb = (JRadioButton) e.getSource();
				//kdo to byl?
				if (rb==rbRed) {
					pnlCenter.setBackground(Color.RED);
				} else if (rb==rbBlue) {
					pnlCenter.setBackground(Color.CYAN);
				}
			}
		};
		rbRed.addActionListener(lsn);
		rbBlue.addActionListener(lsn);
		
		setSize(400, 300);
	}

	/**
	 * Nastavuje stav radio buttonu
	 * @param selected zapnout/vypnout
	 */
	protected void setGroupState(boolean active) {
		//probehneme vsechna tlacitka ve skupine a nastavime jejich stav
		Enumeration<AbstractButton> en = bgRadio.getElements();
		while (en.hasMoreElements()) {
			JRadioButton rb = (JRadioButton) en.nextElement();
			rb.setEnabled(active);
		}
	}

	/**
	 * spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ToggleFrame().setVisible(true);
			}
		});
	}

}
