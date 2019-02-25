package cz.uhk.guicomp.browser;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;

import javax.swing.*;
import javax.swing.event.*;

/**
 * Ukázka pouziti textovych komponent v jednoduchem internetovem prohlizeci
 * 
 * @author Tomas Kozel
 */
public class BrowserFrame extends JFrame {
	/**
	 * Vstupni pole pro URL adresu stranky
	 */
	private JTextField tfAddress;
	/**
	 * TextPane pro zobrazeni primitivni zobrazeni stranky
	 */
	private JEditorPane tpPage;
	
	public BrowserFrame() {
		super("FIM Internet Browser");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGui();
	}
	
	
	/**
	 * Sestaveni GUI
	 */
	private void initGui() {
		//na sever BorderLayoutu vlozime panel s adresou a tlacitkem
		JPanel pnlNorth = new JPanel();
		add(pnlNorth,BorderLayout.NORTH);
		//textfield pro adresu
		tfAddress = new JTextField("http://",80);
		//pri ENTER provede totez jako nize uvedene tlacitko
		//implementovat cely KeyListener je otrava. Radeji vyjdu 
		//z KeyAdapteru a redefinuju jenom jednu z metod - keyPressed
		tfAddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//je to ENTER?
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					loadPage();
				}
			}
		});
		pnlNorth.add(tfAddress); //dame do panelu
		//tlacitko pro nacteni stanky
		JButton btnOpen = new JButton("Nacist");
		pnlNorth.add(btnOpen);//do panelu
		//listener
		btnOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loadPage(); //nase metoda, viz nize
			}
		});
		
		//vyrobime JTextPane, dame do CENTER
		tpPage = new JEditorPane();
		add(new JScrollPane(tpPage),BorderLayout.CENTER);
		//zaridime, aby fungovaly odkazy
		tpPage.addHyperlinkListener(new HyperlinkListener() {
			
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				tfAddress.setText(e.getURL().toString());
				loadPage();
			}
		});
		tpPage.setEditable(false);//zakazeme editaci
		
		//nastavit velikost okna - maximalizovat
		setExtendedState(MAXIMIZED_BOTH);
		//...a je to!
	}


	/**
	 * Metoda pro nacteni stranky ze zadane adresy v textfieldu
	 * do texpane (tpPage)
	 */
	protected void loadPage() {
		try {
			tpPage.setPage(new URL(tfAddress.getText()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new BrowserFrame().setVisible(true);
			}
		});
	}

}
