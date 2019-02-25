package cz.uhk.guicomp.btn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Ukazka prace s tlacitky JButton
 */
public class ColorBtnFrame extends JFrame {
	/**
	 * Centralni barevny panel
	 * Potrebujeme na nej referenci, protoze mu budeme menit barvy
	 */
	private JPanel pnlCenter;
	
	 public ColorBtnFrame() {
		super("Prace s tlacitky");
		initGui();
	}
	
	
	private void initGui() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//panel na sever
		JPanel pnlNorth = new JPanel();
		add(pnlNorth,BorderLayout.NORTH);
		
		//panel doprostred
		pnlCenter = new JPanel();
		add(pnlCenter,BorderLayout.CENTER);
		
		//prvni tlacitko / modra
		JButton btnBlue = new JButton("<html><font color=\"blue\">MODRA</font></html>");
		pnlNorth.add(btnBlue); //do panelu
		//vyrobime a zaregistrujeme listener
		btnBlue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlCenter.setBackground(Color.BLUE);
			}
		});
		
		//druhe tlacitko / cervena
				JButton btnRed = new JButton("<html><font color=\"red\">CERVENA</font></html>");
				pnlNorth.add(btnRed); //do panelu
				//vyrobime a zaregistrujeme listener
				btnRed.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						pnlCenter.setBackground(Color.RED);
					}
				});
		
		setSize(640, 480);
	}


	/**
	 * Spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ColorBtnFrame().setVisible(true);
			}
		});
	}

}
