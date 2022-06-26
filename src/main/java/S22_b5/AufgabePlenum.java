package S22_b5;


import javax.swing.*;
import java.awt.*;

public class AufgabePlenum {


    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel links = new JLabel("testText");
        JLabel rechts = new JLabel("testText");
        rechts.setEnabled(false);
        JButton button = new JButton("->");

        button.addActionListener(e -> {rechts.setEnabled(true); links.setEnabled(false);});

        f.setLayout(new FlowLayout());
        f.add(links);
        f.add(button);
        f.add(rechts);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
