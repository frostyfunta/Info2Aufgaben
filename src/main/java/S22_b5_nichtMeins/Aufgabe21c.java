package S22_b5_nichtMeins;



import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


@SuppressWarnings("serial")
public class Aufgabe21c extends JFrame{
	
	public static void main(String [] args) {
		new Aufgabe21c();
	}
	
	public Aufgabe21c() {
		
		super("Aufgabe21c");
		
		JFrame f = new JFrame("Example");
		JMenu menu = new JMenu("A Menu");
		JMenu subMenu = new JMenu("A Submenu");
		JMenuBar s = new JMenuBar();
		JMenuItem item = new JMenuItem("A Menuitem");
		JComboBox<String> a = new JComboBox<String>();
		a.addItem("A Checkbox");
		
		menu.add(subMenu);
		subMenu.add(item);
		subMenu.add(a);
		s.add(menu);
		f.setJMenuBar(s);
		f.setSize(200, 200);
		f.setLayout(null);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
