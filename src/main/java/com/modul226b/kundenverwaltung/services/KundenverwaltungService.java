package com.modul226b.kundenverwaltung.services;

import com.modul226b.kundenverwaltung.entities.Kunde;

import java.util.List;


public interface KundenverwaltungService {

    Kunde createKunde();

    Kunde saveKunde(Kunde kunde);

    Kunde updateKunde(Kunde kunde);

    void deleteKunde(Kunde kunde);

    Kunde getKundeById(int id);

    List<Kunde> getAllKunden();
}