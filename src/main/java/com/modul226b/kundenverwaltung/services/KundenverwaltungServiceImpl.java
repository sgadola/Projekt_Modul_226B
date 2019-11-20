package com.modul226b.kundenverwaltung.services;

import com.modul226b.kundenverwaltung.entities.Kunde;
import com.modul226b.kundenverwaltung.repositories.KundenverwaltungRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KundenverwaltungServiceImpl implements KundenverwaltungService {

    @Autowired
    KundenverwaltungRepository repository;


    @Override
    public Kunde createKunde() {
        return new Kunde();
    }

    @Override
    public Kunde saveKunde(Kunde kunde) {
        return repository.save(kunde);
    }

    @Override
    public Kunde updateKunde(Kunde kunde) {
        return repository.save(kunde);
    }

    @Override
    public void deleteKunde(Kunde kunde) {
        repository.delete(kunde);
    }

    @Override
    public Kunde getKundeById(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<Kunde> getAllKunden() {
        return repository.findAll();
    }
}