package S22_b7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contact {
    private String firstName;
    private String lastName;
    private ArrayList<String> telephone;
    private Ringtone ringtone;
    private LocalDate birthday;

    public Contact(String firstName, String lastName) {
        if (firstName == "" || firstName == null || lastName == "" || lastName == null) {
            throw new IllegalArgumentException("Vor- und nachname muss mindestens 1 Zeichen haben");
        }
        if (Character.isLowerCase(firstName.charAt(0)) || Character.isLowerCase(lastName.charAt(0))) {
            throw new IllegalArgumentException("Vor- und Nachname müssen mit einem Großbuchstaben beginnen");
        }
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == "" || firstName == null) throw new IllegalArgumentException("Vorname darf nicht leer sein");
        if (Character.isLowerCase(firstName.charAt(0)))
            throw new IllegalArgumentException("Vorname muss mit einem Großbuchstaben beginnen");
        this.firstName = firstName;
    }

    private boolean checkFirstName(String firstName) {
        if (firstName == "" || firstName == null || Character.isLowerCase(firstName.charAt(0))) {
            return false;
        } else {
            return true;
        }

    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        if (lastName == "" || lastName == null) throw new IllegalArgumentException("Nachname darf nicht leer sein");
        if (Character.isLowerCase(lastName.charAt(0)))
            throw new IllegalArgumentException("Nachname muss mit einem Großbuchstaben beginnen");
        this.lastName = lastName;
    }

    private boolean checkLastName(String lastName){
        if (lastName == "" || lastName == null || Character.isLowerCase(lastName.charAt(0))) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<String> getTelephone(){
        return this.telephone;
    }

    public void addTelephone(String telephoneNumber){
        if (telephoneNumber.matches("[0-9]+") && !this.telephone.contains(telephoneNumber)){
            this.telephone.add(telephoneNumber);
        } else{
            throw new IllegalArgumentException("Diese Nummer ist ungültig oder ist bereits in diesem Kontakt enthalten");
        }
    }

    private void deleteTelephone(String telephoneNumber){
        if(this.telephone.contains(telephoneNumber)){
            this.telephone.remove(telephoneNumber);
        }
    }

    private boolean checkTelephone(String telephoneNumber){
        if(telephoneNumber.matches("[0-9]+") && !this.telephone.contains(telephoneNumber)) return true;
        else{
            return false;
        }
    }

    public Ringtone getRingtone() {
        return ringtone;
    }

    public void setRingtone(Ringtone ringtone){
        this.ringtone = ringtone;
    }

    public LocalDate getBirthday(){
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Contact contact = (Contact) o;
        return firstName.equals(contact.firstName) && lastName.equals(contact.lastName);
    }


    enum Ringtone {
        SIGNAL,
        NOTE,
        COINTOSS,
        CHIRP
    }
}
