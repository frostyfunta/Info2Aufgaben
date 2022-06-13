package S22_b4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Buch> books;

    public Bibliothek() {
        this.books = new ArrayList<>();
    }

    public Bibliothek(List<Buch> library) {
        this.books = library;
    }

    public void addBook(Buch buch) {
        books.add(buch);
    }

    public void addLibrary(List<Buch> library) {
        books.addAll(library);
    }

    public LocalDate buchAusleihen(String title) throws IllegalLoanException {
        /*
        geht iterativ jedes Element der Liste durch & vergleicht ob ein Buch mit dem gesuchten Titel vorhanden ist und verleiht dieses sobald es gefunden wurde
         */
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).bookEquals(title)) {
                Buch zuVerleihen = books.get(i);
                zuVerleihen.leihen();
                return zuVerleihen.getRueckgabedatum();
            }
        }
        return null;
    }

    public void buchZurueckgeben(String title) throws IllegalLoanException {
        int i = 0;
        while (i < books.size()) {
            if (books.get(i).bookEquals(title)) {
                Buch verliehen = books.get(i);
                if (!LocalDate.now().isAfter(verliehen.getRueckgabedatum())) {
                    System.out.println("Das Buch wurde rechtzeitig zurückgegegeben!");
                }
                books.get(i).zurueckGeben();
                return;
            }
            i++;
        }
        throw new IllegalLoanException("Das Buch ist nicht in der Liste enthalten!");
    }

    public boolean istGeoeffnet() {
        if (LocalTime.now().isBefore(LocalTime.of(8, 30)) || LocalTime.now().isAfter(LocalTime.of(22, 0))) {
            return false;
        } else {
            return true;
        }
    }
}
