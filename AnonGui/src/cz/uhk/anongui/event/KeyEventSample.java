package cz.uhk.anongui.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * Ukazka zpracovani udalosti klavesnice
 */
public class KeyEventSample extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//komponenta pro zobrazeni textu
	private JLabel labKey = new JLabel("-");

	public KeyEventSample() {
		super("KeyEvent sample - události klávesnice");
		
		initGui();
	}
	
	private void initGui() {
		//vstupni pole
		JTextField tf = new JTextField();
		//vlozime na sever v border layoutu
		add(tf,BorderLayout.NORTH);
		//label labKey dame doprostred
		add(labKey,BorderLayout.CENTER);
		//trochu poladime styl...
		labKey.setFont(new Font("Monospaced", Font.PLAIN, 72));
		labKey.setForeground(Color.RED);
		labKey.setHorizontalAlignment(SwingConstants.CENTER);
		
		//zaregistrujeme KeyListener pro stisk klavesy 
		//ve vstupnim poli. Chce to tri metody, to je otrava
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//prokliknuti - ano, to je ono
				labKey.setText(String.valueOf(e.getKeyChar()));
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//pri stisku - nechci
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//pri uvolneni - taky nechci
			}
		});
		
		setSize(640,480);
	}

	/**
	 * spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new KeyEventSample().setVisible(true);
			}
		});
	}

}
