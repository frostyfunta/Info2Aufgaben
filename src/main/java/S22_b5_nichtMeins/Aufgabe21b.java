package S22_b5_nichtMeins;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Aufgabe21b extends JFrame {

	public static void main(String[] args) {
		new Aufgabe21b();

	}
	public Aufgabe21b() {
		super("Aufgabe21b");
		JLabel x = new JLabel("Alter");
		add(x);
		
		JComboBox<String> a = new JComboBox<String>();
		add(a);
		for(int i = 0; i < 111; i++) {
		a.addItem("" + i);
		}
		a.addItem("(select your age)");
		a.setSelectedItem("(select your age)");
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
