package S22_b5;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

public class Aufgabe21b extends JFrame {


    public static void main(String[] args) {
        new Aufgabe21b();
    }
    public Aufgabe21b(){
        super("Aufgabe21b");
        JLabel alter = new JLabel("Alter:");
        JComboBox<String> box = new JComboBox();
        box.addItem("select your age");
        for(int i = 0; i < 111; i++){
            box.addItem("" + i);
        }
        box.setSelectedItem("select your age");
        setLayout(new FlowLayout());
        add(alter);
        add(box);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
