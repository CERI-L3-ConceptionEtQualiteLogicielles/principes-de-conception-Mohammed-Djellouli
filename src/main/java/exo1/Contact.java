package exo1;

import java.util.ArrayList;
import java.util.List;

public class Contact  {
    private final String nom;
    private final String numero;
    private final String prenom;
    private final String civilite;
    private final String adressePostal;
    private final String adresseMail;
    private final String dateAnniversaire;
    private final String lieuTravail;
    private final String ville;

    public Contact(ContactBuilder builder) {
        this.nom = builder.nom;
        this.numero = builder.numero;
        this.prenom = builder.prenom;
        this.civilite = builder.civilite;
        this.adressePostal = builder.adressePostal;
        this.adresseMail = builder.adresseMail;
        this.dateAnniversaire = builder.dateAnniversaire;
        this.lieuTravail = builder.lieuTravail;
        this.ville = builder.ville;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getPrenom() {
        return prenom;
    }
    public String getCivilite() {
        return civilite;
    }
    public String getAdressePostal() {
        return adressePostal;
    }
    public String getAdresseMail() {
        return adresseMail;
    }
    public String getDateAnniversaire() {
        return dateAnniversaire;
    }
    public String getLieuTravail() {
        return lieuTravail;
    }
    public String getVille() {
        return ville;
    }

    public String getInfoContact() {
        return this.toString();
    }


    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Numéro: " + getNumero();
    }


    public static class ContactBuilder {
        private final String nom;
        private final String numero;
        private  String prenom;
        private  String civilite;
        private  String adressePostal;
        private  String adresseMail;
        private  String dateAnniversaire;
        private  String lieuTravail;
        private  String ville;


        public ContactBuilder(String nom, String numero) {
            this.nom = nom;
            this.numero = numero;
        }

        public ContactBuilder addPrenom(String prenom) {
            if(this.prenom == null) {
                this.prenom = prenom;
            }
            return this;
        }

        public ContactBuilder addCivilite(String civilite) {
            if(this.civilite == null) {
                this.civilite = civilite;
            }
            return this;
        }

        public ContactBuilder addAdressePostal(String adressePostal) {
            if(this.adressePostal == null) {
                this.adressePostal = adressePostal;
            }
            return this;
        }

        public ContactBuilder addAdresseMail(String adresseMail) {
            if(this.adresseMail == null) {
                this.adresseMail = adresseMail;
            }
            return this;
        }

        public ContactBuilder addDateAnniversaire(String dateAnniversaire) {
            if(this.dateAnniversaire == null) {
                this.dateAnniversaire = dateAnniversaire;
            }
            return this;
        }

        public ContactBuilder addLieuTravail(String lieuTravail) {
            if(this.lieuTravail == null) {
                this.lieuTravail = lieuTravail;
            }
            return this;
        }
        public ContactBuilder addVille(String ville) {
            if(this.ville == null) {
                this.ville = ville;
            }
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }

    }
}

