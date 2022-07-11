package S22_b9.bibliothek.data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Bibliothek implements Iterable<Buch>{

    private ArrayList<Buch> buecher = new ArrayList<>();

    public Bibliothek() {
    }

    public Bibliothek(ArrayList<Buch> buecher) {
        this.buecher = buecher;
    }

    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    public void addBibliothekChangeListener(PropertyChangeListener l) {

        changes.addPropertyChangeListener(l);
    }

    public void removeBibliothekChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }



    public void linkBuch(Buch b) {
        buecher.add(b);
        changes.firePropertyChange("buch", null, b);
    }

    public LocalDate ausleihen(String titel) throws IllegalLoanException{
        for (Buch b : buecher) {
            if (b.getTitel().equals(titel)) {
                b.ausleihen();
                return b.getRueckgabeDatum();
            }
        }
        throw new IllegalLoanException("Das Buch" + titel + " ist in der Bibliothek nicht vorhanden.");
    }

    public boolean zurueckgeben(String titel) throws IllegalLoanException {
        for (Buch b : buecher) {
            if (b.getTitel().equals(titel)) {
                LocalDate rueckgabeDatum = b.getRueckgabeDatum();
                b.zurueckgeben();
                return !LocalDate.now().isAfter(rueckgabeDatum);
            }
        }
        throw new IllegalLoanException("Das Buch " + titel + " ist in der Bibliothek nicht vorhanden.");
    }

    public Iterator<Buch> iterator() {
        return buecher.iterator();
    }

    public boolean isOpen() {
        return !LocalTime.now().isBefore(LocalTime.of(8, 30)) && !LocalTime.now().isAfter(LocalTime.of(22, 0));
    }

}
