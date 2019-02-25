package cz.uhk.guicomp.notepad;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

/**
 * Aplikace Notepad
 * ukazka prace s JToolBarem, JMenuBarem, akcemi a textovymi 
 * komponentami
 * @author Tomas Kozel
 *
 */
public class NotepadFrame extends JFrame {
	Action	  actNew,    	//seznam referenci na akce
			  actLoad,
			  actSave,
			  actClose,
			  actAbout;
	JTextArea taDoc;		//textova komponenta
	
	/**
	 * Konstruktor
	 */
	public NotepadFrame() {
		super("Notepad");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initGui();
	}

	/**
	 * Sestaveni GUI
	 */
	private void initGui() {
		createActions();  //vytvoreni akci
		
		setJMenuBar(createMenu());  //sestaveni menu + jeho umisteni
		
		//Vytvoreni nastrojove listy a jeji pridani na sever BorderLayoutu
		add(createToolbar(),BorderLayout.NORTH);  
		
		//Vytvoreni textove viceradkove komponenty
		taDoc = new JTextArea(40,80);
		//zabalit do rolovaci plochy + pridani do centralni casti
		add(new JScrollPane(taDoc),BorderLayout.CENTER);
		
		pack();
	}

	/**
	 * Vytvoreni toolbaru a vraceni jeho hotove instance zpet
	 */
	private JToolBar createToolbar() {
		JToolBar tb = new JToolBar("Nastroje",JToolBar.HORIZONTAL);
		tb.setRollover(true);
		
		//vyrobime z akci, kdyz uz je mame
		tb.add(actNew);
		tb.addSeparator();
		tb.add(actLoad);
		tb.add(actSave);
		
		return tb;
	}

	/**
	 * Vytvoreni akci
	 */
	private void createActions() {
		//Vytvoreni instance akce pomoci anonymni vnitrni tridy odvozene
		//od predka AbstractAction.
		actAbout = new AbstractAction("O programu") {
			public void actionPerformed(ActionEvent e) {
				//Co se stane pri vyvolan teto akce
				showInfo();
			}
		};
		
		actClose = new AbstractAction("Konec") {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		//Nastavime akcelerator (klavesovou zkratku) akce - Alt+F4
		actClose.putValue(AbstractAction.ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_F4,InputEvent.ALT_MASK));
		
		actNew = new AbstractAction("Novy",
				new ImageIcon(getClass().getResource("/img/icoNew.png"))) {
			public void actionPerformed(ActionEvent e) {
				taDoc.setText("");
				setTitle("JNotepad");
			}
		};
		//Nastavime bublinovou napovedu akce - tooltip
		actNew.putValue(AbstractAction.SHORT_DESCRIPTION,"Novy dokument");
		
		actLoad = new AbstractAction("Otevrit",
				new ImageIcon(getClass().getResource("/img/icoLoad.png"))) {
			public void actionPerformed(ActionEvent e) {
				readFile();
			}
		};
		actLoad.putValue(AbstractAction.ACCELERATOR_KEY,
				KeyStroke.getKeyStroke('O',InputEvent.CTRL_MASK));
		//Nastavime bubl. nepovedu s pouzitim HTML znacek
		actLoad.putValue(AbstractAction.SHORT_DESCRIPTION,
				"<html><font color=\"red\">Nacteni</font> souboru z disku</html>");

		
		actSave = new AbstractAction("Ulozit",
				new ImageIcon(getClass().getResource("/img/icoSave.png"))) {
			public void actionPerformed(ActionEvent e) {
				writeFile();
			}
		};
		actSave.putValue(AbstractAction.ACCELERATOR_KEY,
				KeyStroke.getKeyStroke('S',InputEvent.CTRL_MASK));
		actSave.putValue(AbstractAction.SHORT_DESCRIPTION,
				"Ulozeni souboru na disk");
	}

	/**
	 * Vytvoreni listy menu a vratime zpet
	 * @return JMenuBar lista menu
	 */
	private JMenuBar createMenu() {
		JMenuBar mb = new JMenuBar(); //lista menu		
		
		JMenu mnFile = new JMenu("Soubor"); //Roleta Soubor
		mnFile.add(actNew); //pouzijeme akce misto JMenuItem
		mnFile.addSeparator();
		mnFile.add(actLoad);
		mnFile.add(new JMenuItem(actSave));
		mnFile.addSeparator();
		mnFile.add(new JMenuItem(actClose));
		mb.add(mnFile); //Pridani rolety do listy
				
		JMenu mnHelp = new JMenu("Napoveda"); //Roleta Napoveda
		mnHelp.add(new JMenuItem(actAbout));
		mb.add(mnHelp); //Pridani rolety do listy
		
		return mb;
	}
	
	/**
	 * Nacist soubor do okna
	 */
	private void readFile() {
		//Pro vyber souboru pouzijeme standardni tridu JFileChooser
		JFileChooser fch = new JFileChooser();
		if (fch.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			//Uzivatel potvrdil volbu (nestornoval)
			try {
				//Otevreme vstupni znakovy stream (Reader)
				FileReader in = new FileReader(fch.getSelectedFile().getAbsolutePath());
				//Nacteme data ze streamu do JTextArea komponenty taDoc
				taDoc.read(in,null);
				in.close();
				setTitle("Notepad - "+fch.getSelectedFile().getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Ulozeno souboru z okna
	 */
	private void writeFile() {
//		Pro vyber souboru pouzijeme standardni tridu JFileChooser
		JFileChooser fch = new JFileChooser();
		if (fch.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			//Uzivatel potvrdil volbu (nestornoval)
			try {
				//Otevreme vystupni znakovy stream (Writer)
				FileWriter out = new FileWriter(fch.getSelectedFile().getAbsolutePath());
				taDoc.write(out);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	/**
	 * Zobrazeni okna s informacemi o programu
	 */
	private void showInfo() {
		//Pouzijeme tridu poskytujici standardni dialogova okna (MessageBoxy)
		JOptionPane.showMessageDialog(this,
				"Notepad\nTextovy editor\n\n(C) Tomas Kozel, FIM UHK",
				"Informace",JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Spousteci metoda
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new NotepadFrame().setVisible(true);
			}
		});
	}

} //End of Frame
