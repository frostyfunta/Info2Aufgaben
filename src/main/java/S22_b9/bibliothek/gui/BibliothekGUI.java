package S22_b9.bibliothek.gui;

import S22_b9.bibliothek.data.Bibliothek;
import S22_b9.bibliothek.data.Buch;
import S22_b9.bibliothek.data.IllegalLoanException;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;

@SuppressWarnings("serial")
public class BibliothekGUI extends JFrame implements PropertyChangeListener {
    private Bibliothek bib;
    private JTextArea taDisplay;

    public BibliothekGUI(Bibliothek bib) {
        super("Universitaetsbibliothek");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.bib = bib;

        //hinzugefügt
        this.bib.addBibliothekChangeListener(this);
        this.bib.iterator().forEachRemaining(e -> e.addBuchChangeListener(this));
        //

        taDisplay = new JTextArea(5, 50);
        taDisplay.setEnabled(false);
        add(new JScrollPane(taDisplay), BorderLayout.NORTH);
        JButton btnIsOpen = new JButton("Geoeffnet?");
        btnIsOpen.addActionListener(e -> {
            String message;
            if (this.bib.isOpen()) {
                message = "Die Bibliothek hat geoeffnet";
            } else {
                message = "Die Bibliothek hat nicht geoeffnet";
            }
            JOptionPane.showMessageDialog(this, message);
        });
        add(btnIsOpen, BorderLayout.WEST);

        JButton btnAddBuch = new JButton("Buch hinzufuegen");
        btnAddBuch.addActionListener(e -> {
            new AddBook(this, this.bib);
        });
        add(btnAddBuch, BorderLayout.CENTER);

        JButton btnShowBooks = new JButton("Zeige alle Buecher");
        btnShowBooks.addActionListener(e -> {
            new ShowBooks(this, this.bib);
        });
        add(btnShowBooks, BorderLayout.EAST);
        JButton btnReturnBook = new JButton("Buch zurueckgeben");
        btnReturnBook.addActionListener(e -> {
            try {
                returnBook();
            } catch (IllegalLoanException exception) {
                String msg = "Fehler beim Zurueckgeben: " + exception.getMessage();
                JOptionPane.showMessageDialog(this, msg);
            }
        });
        add(btnReturnBook, BorderLayout.SOUTH);

        pack();
        setVisible(true);


    }

    public void appendText(String s) {
        taDisplay.append(s);
    }

    private void returnBook() throws IllegalLoanException {
        String title = JOptionPane.showInputDialog(this, "Geben Sie den Titel des Buchs ein," +
                "das sie zurückgeben wollen:");
        if (bib.zurueckgeben(title)) {
            String msg = title + " rechtzeitig zurueckgegeben.";
            JOptionPane.showMessageDialog(this, msg);
        } else {
            String msg = title + " NICHT rechtzeitig zurueckgegeben.";
            JOptionPane.showMessageDialog(this, msg);
        }
    }

    public static void main(String[] args) {
        Bibliothek bib = new Bibliothek();
        new BibliothekGUI(bib);
        bib.linkBuch(new Buch("Christian Ullenboom", "Java ist auch eine Insel"));
        bib.linkBuch(new Buch("Robert Sedgewick", "Einfuehrung in die Programmierung mit Java"));
        bib.linkBuch(new Buch("Marc-Uwe Kling", "Qualityland"));
        bib.linkBuch(new Buch("David Eddings", "Kind der Prophezeiung"));
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String change = evt.getPropertyName();
        if (change.equals("buch")) {
            appendText("Neues Buch: " + evt.getNewValue().toString() + "\n");
        } else if(change.equals("ausleihen")){
            appendText("test");
        }
    }
}
