package S22_b9.bibliothek.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalDate;

public class Buch {
    private String titel;
    private String autor;
    private boolean ausgeliehen = false;
    private LocalDate rueckgabeDatum = null;

    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    public void addBuchChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removeBuchChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }

    public Buch(String autor, String titel) {
        setTitel(titel);
        setAutor(autor);
    }

    private void setTitel(String titel) {
        if (titel.equals("")) {
            throw new IllegalArgumentException("Titel darf nicht leer sein");
        }
        this.titel = titel;
    }

    private void setAutor(String autor) {
        if (autor.equals("")) {
            throw new IllegalArgumentException("Autor darf nicht leer sein");
        }
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    public boolean istAusgeliehen() {
        return ausgeliehen;
    }

    public LocalDate getRueckgabeDatum() throws IllegalLoanException {
        if (ausgeliehen) {
            return rueckgabeDatum;
        } else {
            throw new IllegalLoanException(titel + " ist nicht ausgeliehen");
        }
    }

    public void ausleihen() throws IllegalLoanException {
        if (!ausgeliehen) {
            rueckgabeDatum = LocalDate.now().plusDays(14);
            ausgeliehen = !ausgeliehen;
            changes.firePropertyChange("ausleihen", !ausgeliehen, ausgeliehen);
        } else {
            throw new IllegalLoanException(titel + " ist bereits ausgeliehen");
        }
    }

    public void zurueckgeben() throws IllegalLoanException {
        if (ausgeliehen) {
            ausgeliehen = !ausgeliehen;
            rueckgabeDatum = null;
            changes.firePropertyChange("zurueckgeben", ausgeliehen, !ausgeliehen);
        } else {
            throw new IllegalLoanException(titel + " ist nicht ausgeliehen");
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (anObject.getClass().equals(Buch.class)) {
            Buch b = (Buch) anObject;
            return this.getTitel().equals(b.getTitel());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return autor + ": " + titel;
    }


}
