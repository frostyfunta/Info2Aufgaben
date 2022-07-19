package bibliothek;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class A19_main {
    public static void main(String[] args) {

        Bibliothek bib = new Bibliothek();
        bib.addBuch(new Buch("Christian Ullenboom", "Java ist auch eine Insel"));
        bib.addBuch(new Buch("Robert Sedgewick", "Einfuehrung in die Programmierung mit Java"));
        bib.addBuch(new Buch("Marc-Uwe Kling", "Qualityland"));
        bib.addBuch(new Buch("David Eddings", "Kind der Prophezeiung"));
        System.out.println("Hat die Bibliothek gerade geoeffnet: " + bib.isOpen());
        bib.forEach(b -> {
            if (b.getTitel().contains("Java")) {
                System.out.println(b);
            }
        });
        try {
            bib.ausleihen("Java ist auch eine Insel");
            bib.ausleihen("Qualityland");
            bib.zurueckgeben("Qualityland");
            bib.zurueckgeben("Kind der Prophezeiung");
        } catch (IllegalLoanException e) {
           System.out.println("Fehler:" + e.getMessage());
        }
    }
}
