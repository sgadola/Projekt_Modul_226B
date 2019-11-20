package com.modul226b.kundenverwaltung.controllers;

import com.modul226b.kundenverwaltung.entities.Kunde;
import com.modul226b.kundenverwaltung.services.KundenverwaltungService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class KundenverwaltungController {

    @Autowired
    KundenverwaltungService service;


    @RequestMapping("/")
    public String index() {
        return "createKunde";
    }

    @RequestMapping("/displayKunden")                // Path??
    public String displayLocations(ModelMap modelMap) {
        List<Kunde> kunden = service.getAllKunden();

        modelMap.addAttribute("kunden", kunden);

        return "displayKunden";
    }

    @RequestMapping("/createKunde")
    public String createKunde(@ModelAttribute("kunde") Kunde kunde, ModelMap modelMap) {
        //service.createKunde();
        Kunde kundeCreated = service.saveKunde(kunde);

        String msg = "Kunde wurde mit folgender ID erstellt: " + kundeCreated.getId();

        modelMap.addAttribute("msg", kundeCreated);
        modelMap.addAttribute("kunden", service.getAllKunden());

        return "displayKunden";
    }

    @RequestMapping("/saveKunde")
    public String saveKunde(@ModelAttribute("kunde") Kunde kunde, ModelMap modelMap) {
        Kunde kundeSaved = service.saveKunde(kunde);

        String msg = "Kunde wurde mit folgender ID gespeichert / upgedated: " + kundeSaved.getId();
        modelMap.addAttribute("msg", msg);
        modelMap.addAttribute("kunden", service.getAllKunden());

        return "displayKunden";
    }

    @RequestMapping("/saveAdresse")
    public String saveAdresse(@ModelAttribute("kunde") Kunde kunde, ModelMap modelMap) {
        Kunde kundeSaved = service.saveKunde(kunde);

        String msg = "Adresse wurde mit folgender ID gespeichert / upgedated: " + kundeSaved.getId();
        modelMap.addAttribute("msg", msg);

        return "displayKunden";
    }

    @RequestMapping("/saveKontakt")
    public String saveKontakt(@ModelAttribute("kunde") Kunde kunde, ModelMap modelMap) {
        Kunde kundeSaved = service.saveKunde(kunde);

        String msg = "Kontakt wurde mit folgender ID gespeichert / upgedated: " + kundeSaved.getId();
        modelMap.addAttribute("msg", msg);

        return "displayKunden";
    }

    @RequestMapping("/deleteKunde")
    public String deleteKunde(@RequestParam("id") int id, ModelMap modelMap) {
        Kunde kunde = service.getKundeById(id);
        service.deleteKunde(kunde);

        String msg = "Kunde mit folgender ID würde gelöscht: " + id;
        modelMap.addAttribute("msg", msg);
        modelMap.addAttribute("kunden", service.getAllKunden());

        return "displayKunden";
    }
}