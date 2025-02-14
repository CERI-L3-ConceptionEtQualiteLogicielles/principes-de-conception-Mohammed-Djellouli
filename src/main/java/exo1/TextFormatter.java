package exo1;

public class TextFormatter implements ContactFormatterService{
    @Override

    public String format(Contact contact) {
        return contact.getInfoContact();
    }
}
