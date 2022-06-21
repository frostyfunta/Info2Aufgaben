package S22_b5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe22b extends JFrame implements ActionListener {
    JTextArea txt;
    public static void main(String[] args) {

    }

    Aufgabe22b() {
        JButton left = new JButton("Left Button");
        JButton right = new JButton("Right Button");
        JScrollPane scrollPane = new JScrollPane();
        txt = new JTextArea(20, 5);
        scrollPane.add(txt);

        add(left, BorderLayout.EAST);
        add(right, BorderLayout.WEST);
        add(scrollPane, BorderLayout.SOUTH);


    }

    public void actionPerformed(ActionEvent e) {
        txt.append("" + e.getActionCommand());
    }
}
