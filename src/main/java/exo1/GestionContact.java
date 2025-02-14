package exo1;

import java.util.ArrayList;
import java.util.List;

public class GestionContact implements ContactService {
    private static GestionContact instance;  // Unique instance
    private static List<Contact> lesContacts;

    private GestionContact() {
        this.lesContacts = new ArrayList<>();
    }

    public static GestionContact getInstance() {
        if (instance == null) {
            instance = new GestionContact();
        }
        return instance;
    }


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
