package bibliothek;

import java.time.LocalDate;

public class Buch {
    private String titel;
    private String autor;
    private boolean ausgeliehen = false;
    private LocalDate rueckgabeDatum = null;


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
            throw new IllegalLoanException("Objekt ist nicht ausgeliehen");
        }
    }

    public void ausleihen() throws IllegalLoanException {
        if (!ausgeliehen) {
            rueckgabeDatum = LocalDate.now().plusDays(14);
            ausgeliehen = !ausgeliehen;
        } else {
            throw new IllegalLoanException("Objekt ist bereits ausgeliehen");
        }
    }

    public void zurueckgeben() throws IllegalLoanException {
        if (ausgeliehen) {
            ausgeliehen = !ausgeliehen;
            rueckgabeDatum = null;
        } else {
            throw new IllegalLoanException("Objekt wurde nicht ausgeliehen");
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
