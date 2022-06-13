package S22_b5_nichtMeins;

import javax.swing.JFrame;

import java.awt.BorderLayout;



import javax.swing.JButton;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Aufgabe22b extends JFrame {

	
	JTextArea txt;
	
	
	public Aufgabe22b() {
		super("Aufgabe22b");
		setLayout(new BorderLayout());
		
		JButton lb = new JButton("Left Button");
		JButton rb = new JButton("Right Button");
		
		rb.addActionListener(e -> txt.append(e.getActionCommand() + "\n"));
		lb.addActionListener(e -> txt.append(e.getActionCommand() + "\n"));
		
		txt = new JTextArea();
		JScrollPane scroll = new JScrollPane(txt);
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
		new Aufgabe22b();
	}
}
