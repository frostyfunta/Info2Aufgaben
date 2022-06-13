package S22_b5_nichtMeins;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Aufgabe23 extends JFrame {
	
	

	public Aufgabe23() {
		
		super("Aufgabe23");
		
		
		JTextArea txt = new JTextArea();
		JScrollPane scroll = new JScrollPane(txt);
		JOptionPane mDialog = new JOptionPane();
		add(scroll, BorderLayout.CENTER);
		
		txt.setColumns(50);
		txt.setRows(5);
		
		this.addWindowListener(new WindowAdapter () {
			
			public void windowClosing(WindowEvent e) {
				String inputValue = JOptionPane.showInputDialog(mDialog, "Hit the X Key to close the Application");
				if(inputValue.equalsIgnoreCase("X")) {
					closeIt();
				}
			}
			public void windowIconified(WindowEvent e) {
				txt.append("\n " + "Zeit: " + java.time.LocalTime.now() + " & Beschriftung: Iconified ");
			}
			public void windowOpened(WindowEvent e) {
				txt.append("\n " + "Zeit: " + java.time.LocalTime.now() + " & Beschriftung: Deiconified ");
			}
			public void windowActivated(WindowEvent e) {
				txt.append("\n " + "Zeit: " + java.time.LocalTime.now() + " & Beschriftung: Activated ");
			}
			public void windowDeactivated(WindowEvent e) {
				txt.append("\n " + "Zeit: " + java.time.LocalTime.now() + " & Beschriftung: Deactivated ");
			}
			
		});
		
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	   private void closeIt(){

	        this.getContentPane().setVisible(false);
	        this.dispose();

	    }
	
	
	public static void main(String []args) {
		new Aufgabe23();
	}
}
