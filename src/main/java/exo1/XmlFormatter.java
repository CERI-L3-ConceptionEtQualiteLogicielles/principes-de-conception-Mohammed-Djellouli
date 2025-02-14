package exo1;

public class XmlFormatter implements ContactFormatterService {
    @Override
    public String format(Contact contact) {
        return "<contact>\n" +
                "  <nom>" + contact.getNom() + "</nom>\n" +
                "  <numero>" + contact.getNumero() + "</numero>\n" +
                "</contact>";
    }
}
