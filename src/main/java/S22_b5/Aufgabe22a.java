package S22_b5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe22a extends JFrame implements ActionListener {
    Aufgabe22a() {
        super("Aufgabe22a");
        JButton left = new JButton("Left Button");
        JButton right = new JButton("Right Button");
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scroll = new JScrollPane(textArea);
        textArea.setEnabled(false);
        left.addActionListener(e -> {
            textArea.append("Left Button\n");
        });
        right.addActionListener(e -> {
            textArea.append("Right Button\n");
        });
        setDefaultCloseOperation(3);

        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(scroll, BorderLayout.SOUTH);

        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new Aufgabe22a();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
