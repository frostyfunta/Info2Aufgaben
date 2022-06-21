package S22_b5;

import javax.swing.*;

public class Aufgabe21c extends JFrame{

    public static void main(String[] args) {
        new Aufgabe21c();

    }

    public Aufgabe21c(){
        super("Aufgabe21c");
        setSize(200,200);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu();
        menuBar.add(menu);
        add(menuBar);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
