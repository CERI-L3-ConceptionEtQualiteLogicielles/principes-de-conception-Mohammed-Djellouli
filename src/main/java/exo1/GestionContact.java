package exo1;

import java.util.ArrayList;
import java.util.List;

public class GestionContact implements ContactService {
    final private static List<Contact> lesContacts = new ArrayList<>();


    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            contact.getInfoContact();
        }
    }
}
