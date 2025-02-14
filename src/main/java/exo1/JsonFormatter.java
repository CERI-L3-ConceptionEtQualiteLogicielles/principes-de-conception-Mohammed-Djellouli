package exo1;

public class JsonFormatter implements ContactFormatterService{
    @Override
    public String format(Contact contact) {
        return "{\n"+
                "\"nom\": \""+contact.getNom()+"\",\n"
                + "\"numero\": \""+contact.getNumero()+"\"\n"+
                "}";
    }
}
