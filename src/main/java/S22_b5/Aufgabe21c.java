package S22_b5;

import javax.swing.*;

public class Aufgabe21c extends JFrame {
    Aufgabe21c(){
        super("Aufgabe21c");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("A Menuitem");
        JMenu submenu = new JMenu("A Submenu");
        JMenuItem menuItem = new JMenuItem("A Menuitem");
        JCheckBox checkBox = new JCheckBox("A Checkbox Menuitem");
        menuBar.add(menu);
        menu.add(submenu);
        submenu.add(menuItem);
        submenu.add(checkBox);

        setSize(200,200);
        add(menuBar);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new Aufgabe21c();
    }
}
