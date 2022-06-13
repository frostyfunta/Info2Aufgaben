package S22_b4;

public class Aufgabe19b {
    public static void main(String[] args) {
        Bibliothek bib = new Bibliothek();
        bib.addBook(new Buch("Christian Ullenboom","Java ist auch eine Insel"));
        bib.addBook(new Buch("Robert Sedgewick", "Einfuhrung in die Programmierung mit Java"));
        bib.addBook(new Buch("Marc-Uwe Kling", "Qualityland"));
        bib.addBook(new Buch("David Eddings", "Kind der Prophezeiung"));

        if(bib.istGeoeffnet()){
            System.out.println("Die Bibliothek ist geöffnet!");
        }

        /*Teilaufgabe 4(von aufgabe 19b): Wie soll ich auf einzelne Elemente einer Liste zugreifen, auf die ich keinen Zugriff habe?

        Beim Erstellen der Klasse(in der Aufgabe 19a), soll man laut Angabe nicht auf die Liste zugreifen können
         */

        try {

            System.out.println("test " + bib.buchAusleihen("Java ist auch eine Insel"));
        } catch (IllegalLoanException e) {
            e.printStackTrace();
        }

        try {
            bib.buchAusleihen("Qualityland");
        } catch (IllegalLoanException e) {
            e.printStackTrace();
        }

        try {
            bib.buchZurueckgeben("Qualityland");
        } catch (IllegalLoanException e) {
            e.printStackTrace();
        }

        try {
            bib.buchZurueckgeben("Kind der Prophezeiung");
        } catch (IllegalLoanException e) {
            e.printStackTrace();
        }


    }
}
