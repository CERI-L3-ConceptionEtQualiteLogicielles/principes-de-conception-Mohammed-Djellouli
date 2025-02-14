package exo1;

import java.awt.*;

public class SendPhotoAdapter implements SendService{
    private SendPhoto sendPhoto;
    private Image image;

    public void sendPhotoAdapter(SendPhoto sendPhoto, Image image) {
        this.sendPhoto = sendPhoto;
        this.image = image;
    }

    @Override
    public void send(Contact contact, String message) {
        sendPhoto.envoiPhoto(contact,image);

    }
}
