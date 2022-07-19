package S22_b5;

import javax.swing.*;
import java.awt.*;

public class AddBook extends JDialog {
    public AddBook(JFrame father, bibliothek.Bibliothek bib){
        setTitle("Buch Hinzufügen");
        setLayout(new GridLayout(3, 2));
        setVisible(true);
        setSize(500,500);
        JTextField autor = new JTextField(10);


        add(new JLabel("Autor"));
    }


}
