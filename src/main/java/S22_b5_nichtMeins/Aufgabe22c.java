package S22_b5_nichtMeins;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Aufgabe22c extends JFrame {

		
		JTextArea txt;
		
		
		public Aufgabe22c() {
			
			super("Aufgabe22c");
			setLayout(new BorderLayout());
			
			JButton lb = new JButton("Left Button");
			JButton rb = new JButton("Right Button");
			txt = new JTextArea();
			JScrollPane scroll = new JScrollPane(txt);
			
			lb.addActionListener(new MyActionListener(txt));
			rb.addActionListener(new MyActionListener(txt));
			
			add(lb, BorderLayout.WEST);
			add(rb, BorderLayout.EAST);
			add(scroll, BorderLayout.SOUTH);
		
			
		
			
			txt.setColumns(20);
			txt.setRows(5);
			
			pack();
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		public static void main(String [] args) {
			new Aufgabe22c();
		}
}
