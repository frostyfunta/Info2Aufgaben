package bibliothek;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Bibliothek implements Iterable<Buch> {

    private ArrayList<Buch> list = new ArrayList<>();

    public Bibliothek() {
        addBuch(new Buch("Christian Ullenboom", "Java ist auch eine Insel"));
        addBuch(new Buch("Robert Sedgewick", "Einfuehrung in die Programmierung mit Java"));
        addBuch(new Buch("Marc-Uwe Kling", "Qualityland"));
        addBuch(new Buch("David Eddings", "Kind der Prophezeiung"));
    }

    public Bibliothek(ArrayList<Buch> list) {
        this.list = list;
    }

    public void addBuch(Buch b) {
        list.add(b);
    }

    public void addBuecher(ArrayList<Buch> buecherListe) {
        list.addAll(buecherListe);
    }

    public void ausleihen(String titel) throws IllegalLoanException{
        for (Buch b : list) {
            if (b.getTitel().equals(titel)) {
                b.ausleihen();
                System.out.println("Rueckgabedatum: " + b.getRueckgabeDatum());
            }
        }
    }

    public void zurueckgeben(String titel) throws IllegalLoanException {
        for (Buch b : list) {
            if (b.getTitel().equals(titel)) {
                if (LocalDate.now().isAfter(b.getRueckgabeDatum())) {
                    System.out.println("Buch wurde nach Rueckgabefrist zurueckgegeben.");
                } else {
                    System.out.println("Buch wurde fristgerecht zurueckgegeben.");
                }
                b.zurueckgeben();
                return;
            }
        }
        throw new IllegalLoanException("Das Buch ist in der Bibliothek nicht vorhanden.");
    }

    public Iterator<Buch> iterator() {
        return list.iterator();
    }

    public boolean isOpen() {
        return !LocalTime.now().isBefore(LocalTime.of(8, 30)) && !LocalTime.now().isAfter(LocalTime.of(22, 0));
    }


}
