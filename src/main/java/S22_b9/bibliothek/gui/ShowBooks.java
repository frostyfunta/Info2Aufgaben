package S22_b9.bibliothek.gui;

import S22_b9.bibliothek.data.Bibliothek;
import S22_b9.bibliothek.data.Buch;
import S22_b9.bibliothek.data.IllegalLoanException;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.time.LocalDate;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ShowBooks extends JDialog {
    public ShowBooks(JFrame parent, Bibliothek bib) {
		super(parent, "Buecherliste", true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JComboBox<Buch> cbBooks = new JComboBox<>();
		for (Buch b : bib) {
			if (!b.istAusgeliehen()) {
				cbBooks.addItem(b);
			}
		}
		add(cbBooks, BorderLayout.CENTER);

		JPanel pSouth = new JPanel();
		pSouth.setLayout(new GridLayout(0, 2));
		add(pSouth, BorderLayout.SOUTH);
		JButton btnLoanBook = new JButton("Buch ausleihen");
		btnLoanBook.addActionListener(event -> {
			Buch book = (Buch) cbBooks.getSelectedItem();
			try {
				LocalDate rueckgabeDatum = bib.ausleihen(book.getTitel());
				JOptionPane.showMessageDialog(this, book +
						" erfolgreich ausgeliehen. Rückgabedatum: " + rueckgabeDatum);
				dispose();
			} catch (IllegalLoanException e) {
				JOptionPane.showMessageDialog(this, book + " ist bereits ausgeliehen!",
						"Fehler beim Ausleihen des Buchs", JOptionPane.ERROR_MESSAGE);
			}
		});
		pSouth.add(btnLoanBook);
		JButton btnCancel = new JButton("Abbrechen");
		btnCancel.addActionListener(e -> dispose());
		pSouth.add(btnCancel);

		pack();
		setVisible(true);
    }

}
