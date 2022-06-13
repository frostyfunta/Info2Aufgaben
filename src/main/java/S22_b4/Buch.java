package S22_b4;


import java.time.LocalDate;


public class Buch {
    private String autor;
    private String title;
    private LocalDate rueckgabedatum = null;
    private boolean verliehen = false;

    public Buch(String autor, String title) {
        if (autor == null || autor.isEmpty() || title == null || title.isEmpty()) {
            throw new IllegalArgumentException("empty string");
        } else {
            this.autor = autor;
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isVerliehen() {
        return verliehen;
    }

    public void leihen() throws IllegalLoanException {
        if (verliehen == true) {
            throw new IllegalLoanException("Das Buch ist bereits verliehen.");
        } else {
            this.verliehen = true;
            this.rueckgabedatum = LocalDate.now().plusDays(14);
        }
    }

    public void zurueckGeben() throws IllegalLoanException {
        if (verliehen == false) {
            throw new IllegalLoanException("Das Buch ist garnicht verliehen.");
        } else {
            this.verliehen = false;
            this.rueckgabedatum = null;
        }
    }

    public LocalDate getRueckgabedatum() throws IllegalLoanException {
        if (verliehen == false) {
            throw new IllegalLoanException("Das Buch ist im Moment nicht verliehen.");
        } else {
            return this.rueckgabedatum;
        }
    }

    public boolean bookEquals(String title) {
        if (title.equals(this.title)) {
            return true;
        } else {
            return false;
        }
    }

    public void printBuch() {
        System.out.println(this.autor + ": " + this.title);
    }
}
