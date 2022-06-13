package S22_b5;

import javax.swing.*;
import java.awt.*;


public class Aufgabe21a extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Aufgabe21a");
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField input = new JTextField(20);

        northPanel.add(name);
        northPanel.add(input);
        northPanel.setBackground(Color.gray);

        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");

        southPanel.add(ok);
        southPanel.add(cancel);
        southPanel.setBackground(Color.lightGray);

        f.add(northPanel, BorderLayout.NORTH);
        f.add(southPanel, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}