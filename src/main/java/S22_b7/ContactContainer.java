package S22_b7;

import java.util.ArrayList;

public class ContactContainer {
    private ArrayList<Contact> contacts;

    public ContactContainer() {

    }

    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }

    public void addContact(Contact contact) {
        if (!this.contacts.contains(contact)) this.contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        this.contacts.remove(contact);
    }

    public boolean containsContact(Contact contact) {
        if (this.contacts.contains(contact)) return true;
        else return false;
    }
}
