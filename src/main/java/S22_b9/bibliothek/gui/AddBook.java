package S22_b9.bibliothek.gui;

import S22_b9.bibliothek.data.Buch;
import S22_b9.bibliothek.data.Bibliothek;

import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AddBook extends JDialog {
    public AddBook(JFrame parent, Bibliothek bib) {
        super(parent, "Buch hinzufuegen", true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLayout(new GridLayout(0, 2));

        add(new JLabel("Autor"));
        JTextField tfAutor = new JTextField();
        add(tfAutor);
        add(new JLabel("Titel"));
        JTextField tfTitel = new JTextField();
        add(tfTitel);

        JButton btnAddBuch = new JButton("Buch hinzufuegen");
        btnAddBuch.addActionListener(e -> {
           String autor = tfAutor.getText();
           String titel = tfTitel.getText();
           if (autor.equals("") || titel.equals("")) {
               JOptionPane.showMessageDialog(this, "Titel und Autor duerfen nicht leer sein!");
           } else {
               Buch b = new Buch(autor, titel);
               bib.linkBuch(b);
               dispose();
           }
        });
        add(btnAddBuch);

        JButton btnCancel = new JButton("Abbrechen");
        btnCancel.addActionListener(e -> {
            dispose();
        });
        add(btnCancel);

        pack();
        setVisible(true);
    }
}
