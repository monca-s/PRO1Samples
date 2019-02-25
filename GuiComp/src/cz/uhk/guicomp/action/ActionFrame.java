package cz.uhk.guicomp.action;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

/**
 * Ukazka pouziti akci Swing
 *
 */
public class ActionFrame extends JFrame {
	//reference na akci, ktera bude menit pozadi panelu
	//typ Action, ale instance bude potomkem AbstractAction
	private Action actBgColor;
	//barevny panel
	private JPanel pnlColor;
	
	public ActionFrame() {
		super("Ukazka prace s akcemi");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGui();
	}
	
	private void initGui() {
		//nacteme ikonu z "balicku"/slozky img
		Icon icoBrush = new ImageIcon(getClass().getResource("/img/Brush.png"));
		//implementujeme a vytvorime akci s popiskem a ikonou ->
		//konstruktor AbstractAction se 2 parametry
		actBgColor = new AbstractAction("Obarvi",icoBrush) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//zavolame metodu, ktera je nize implementovana
				//at to tady neni moc dlouhe
				changeBackgroundRandomly();
			}
		};
		//akci jeste trochu vysperkujeme
		//1. tooltip (bublina)
		actBgColor.putValue(Action.SHORT_DESCRIPTION, "Klikni na to a uvidis!!!");
		//2. mnemonika - podtrzene pismeno popisku / Alt+k
		actBgColor.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_O);
		actBgColor.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_9,KeyEvent.CTRL_DOWN_MASK));
		//pouzijeme akci pro definici tlacitka na severu okno
		add(new JButton(actBgColor),BorderLayout.NORTH);
		
		//panel, ktery budeme obarvovat
		pnlColor = new JPanel();
		add(pnlColor,BorderLayout.CENTER);
		
		setSize(640,480);
	}

	/**
	 * nahodna zmena barvy panelu
	 */
	protected void changeBackgroundRandomly() {
		//vzgenerujeme slozky RGB
		int r = (int) (Math.random()*256);
		int g = (int) (Math.random()*256);
		int b = (int) (Math.random()*256);
		Color barva = new Color(r,g,b);
		//obarvime panel
		pnlColor.setBackground(barva);
	}

	/**
	 * spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ActionFrame().setVisible(true);
			}
		});
	}

}
