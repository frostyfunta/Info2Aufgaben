package S22_b5_nichtMeins;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Aufgabe21a extends JFrame {
 
	public static void main(String[] args) {
	new Aufgabe21a();
 }
 public Aufgabe21a() {
		super("Aufgabe21a");
		
		JLabel x = new JLabel("Name");
		JTextField c = new JTextField(20);
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		Font g = new Font("Arial", Font.ITALIC, 20);	
		JButton b = new JButton("Ok");
		JButton s = new JButton("Cancel");
		
		panel.add(x);
		panel.add(c);
		
		x.setFont(g);
		setSize(330, 330);
		
		add(panel, BorderLayout.NORTH);
	
		panel1.add(b);
		panel1.add(s);
		
		add(panel1, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
