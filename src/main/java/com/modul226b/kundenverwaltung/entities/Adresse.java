package com.modul226b.kundenverwaltung.entities;

import javax.persistence.*;


@Entity
//@Access(AccessType.PROPERTY)
public class Adresse {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ad_id")
    private int id;

    // Foreign key
    //@JoinColumn
    @Column(name = "ad_fk_kundeId")
    private int kundeId;

    @Column(name = "ad_strasse")
    private String strasse;
    @Column(name = "ad_hausnummer")
    private int hausnummer;
    @Column(name = "ad_plz")
    private String plz;
    @Column(name = "ad_ort")
    private String ort;
    @Column(name = "ad_land")
    private String land;


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

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }


    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", kundeId=" + kundeId +
                ", strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                ", plz=" + plz +
                ", ort='" + ort + '\'' +
                ", land='" + land + '\'' +
                '}';
    }
}