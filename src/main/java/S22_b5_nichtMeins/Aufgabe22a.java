package S22_b5_nichtMeins;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Aufgabe22a extends JFrame implements ActionListener{

	
	JTextArea txt;
	
	
	public Aufgabe22a() {
		super("Aufgabe22a");
		setLayout(new BorderLayout());
		
		JButton lb = new JButton("Left Button");
		JButton rb = new JButton("Right Button");
		rb.addActionListener(this);
		lb.addActionListener(this);
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
	
	public void actionPerformed(ActionEvent e) {
			txt.append("\n " + e.getActionCommand());
	}
	
	public static void main(String [] args) {
		new Aufgabe22a();
	}
}
