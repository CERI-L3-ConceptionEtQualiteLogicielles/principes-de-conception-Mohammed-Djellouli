package exo1;

import java.awt.*;

public class SendPhotoAdapter implements SendService{
    private ServiceEnvoiPhoto serviceEnvoiPhoto;
    private Image image;

    public void sendPhotoAdapter(ServiceEnvoiPhoto serviceEnvoiPhoto,Image image) {
        this.serviceEnvoiPhoto = serviceEnvoiPhoto;
        this.image = image;
    }

    @Override
    public void send(Contact contact, String message) {
        serviceEnvoiPhoto.envoiPhoto(contact,image);

    }
}
