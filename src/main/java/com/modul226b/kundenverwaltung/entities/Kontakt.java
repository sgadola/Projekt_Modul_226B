package com.modul226b.kundenverwaltung.entities;

import javax.persistence.*;
import javax.persistence.Access;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;


@Entity
//@Access(AccessType.PROPERTY)
public class Kontakt {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ko_id")
    private int id;

    // Foreign key
    //@JoinColumn
    @Column(name = "ko_fk_kundeId")
    private int kundeId;

    @Column(name = "ko_email_adresse")
    private String emailAdresse;
    @Column(name = "ko_telefon_handy")
    private int telefonHandy;
    @Column(name = "ko_telefon_privat")
    private int telefonPrivat;
    @Column(name = "ko_telefon_geschaeft")
    private int telefonGeschaeft;
    @Column(name = "ko_social_network1")
    private String socialNetwork1;
    @Column(name = "ko_social_network2")
    private String socialNetwork2;


    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKundeId() {
        return kundeId;
    }

    public void setKundeId(int kundeId) {
        this.kundeId = kundeId;
    }

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public void setEmailAdresse(String emailAdresse) {
        this.emailAdresse = emailAdresse;
    }

    public int getTelefonHandy() {
        return telefonHandy;
    }

    public void setTelefonHandy(int telefonHandy) {
        this.telefonHandy = telefonHandy;
    }

    public int getTelefonPrivat() {
        return telefonPrivat;
    }

    public void setTelefonPrivat(int telefonPrivat) {
        this.telefonPrivat = telefonPrivat;
    }

    public int getTelefonGeschaeft() {
        return telefonGeschaeft;
    }

    public void setTelefonGeschaeft(int telefonGeschaeft) {
        this.telefonGeschaeft = telefonGeschaeft;
    }

    public String getSocialNetwork1() {
        return socialNetwork1;
    }

    public void setSocialNetwork1(String socialNetwork1) {
        this.socialNetwork1 = socialNetwork1;
    }

    public String getSocialNetwork2() {
        return socialNetwork2;
    }

    public void setSocialNetwork2(String socialNetwork2) {
        this.socialNetwork2 = socialNetwork2;
    }


    @Override
    public String toString() {
        return "Kontakt{" +
                "id=" + id +
                ", kundeId=" + kundeId +
                ", emailAdresse='" + emailAdresse + '\'' +
                ", telefonHandy=" + telefonHandy +
                ", telefonPrivat=" + telefonPrivat +
                ", telefonGeschaeft=" + telefonGeschaeft +
                ", socialNetwork1='" + socialNetwork1 + '\'' +
                ", socialNetwork2='" + socialNetwork2 + '\'' +
                '}';
    }
}