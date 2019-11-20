package com.modul226b.kundenverwaltung.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "kunde")
public class Kunde {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ku_id")
    private int id;

    @Column(name = "ku_vorname")
    private String vorname;
    @Column(name = "ku_nachname")
    private String nachname;
    @Column(name = "ku_anrede")
    private String anrede;
    @Column(name = "ku_alter")
    private String alter;
    @Column(name = "ku_geschlecht")
    private String geschlecht;

/*    // Foreign keys
    @OneToMany(targetEntity = Adresse.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Adresse> adresse;

    //@JoinColumn
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Kontakt> kontakt;*/


    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

/*    public List<Adresse> getAdresse() {
        return adresse;
    }

    public void setAdresse(List<Adresse> adresse) {
        this.adresse = adresse;
    }

    public List<Kontakt> getKontakt() {
        return kontakt;
    }

    public void setKontakt(List<Kontakt> kontakt) {
        this.kontakt = kontakt;
    }*/


    @Override
    public String toString() {
        return "Kunde{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", anrede='" + anrede + '\'' +
                ", alter=" + alter +
                ", geschlecht='" + geschlecht + '\'' +
//                ", adresse=" + adresse +
//                ", kontakt=" + kontakt +
                '}';
    }
}