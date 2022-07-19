package S22_b5;

import bibliothek.Bibliothek;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;

public class BibliothekGUI extends JFrame {
    private Bibliothek bib;
    public BibliothekGUI(Bibliothek bib) {
        super("Universitaetsbibliothek");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnIsOpen = new JButton("Geoeffnet?");
        btnIsOpen.addActionListener(e -> {
            String message;
            if (bib.isOpen()) {
                message = "Die Bibliothek hat geoeffnet";
            } else {
                message = "Die Bibliothek hat nicht geoeffnet";
            }
           JOptionPane.showMessageDialog(this, message);
        });
        add(btnIsOpen, BorderLayout.WEST);

        JButton btnAddBuch = new JButton("Buch hinzufuegen");
        btnAddBuch.addActionListener(e -> {
            new AddBook(this, bib);
        });
        add(btnAddBuch, BorderLayout.CENTER);

        JButton btnShowBooks = new JButton("Zeige alle Buecher");
        btnShowBooks.addActionListener(e -> {
            new ShowBooks(this, bib);
        });
        add(btnShowBooks, BorderLayout.EAST);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BibliothekGUI(new Bibliothek());
    }
}
