package S22_b5;

import javax.swing.*;
import java.awt.*;

public class Aufgabe21d extends JFrame {
    Aufgabe21d(){
        super("Rechner");
        JTextField topBar = new JTextField("");
        JPanel numPad = new JPanel();
        numPad.setLayout(new GridLayout(5,3));
        for(int i = 0; i < 9;i++){
            numPad.add(new JButton("" + i));
        }
        numPad.add(new JButton("0"));
        numPad.add(new JButton("."));
        numPad.add(new JButton("C"));
        numPad.add(new JButton("+"));
        numPad.add(new JButton("-"));
        numPad.add(new JButton("="));

        setSize(200, 200);
        add(topBar, BorderLayout.NORTH);
        add(numPad);
        setVisible(true);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new Aufgabe21d();
    }

}
