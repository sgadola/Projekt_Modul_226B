package com.modul226b.kundenverwaltung.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.modul226b.kundenverwaltung.entities.Kunde;

import org.springframework.stereotype.Repository;


@Repository
public interface KundenverwaltungRepository extends JpaRepository<Kunde, Integer> {
}