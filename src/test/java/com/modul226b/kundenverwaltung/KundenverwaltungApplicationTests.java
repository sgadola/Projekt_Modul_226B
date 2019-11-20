//package com.modul226b.kundenverwaltung;
//
//import com.modul226b.kundenverwaltung.repositories.KundenverwaltungRepository;
//import com.modul226b.kundenverwaltung.entities.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.*;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class KundenverwaltungApplicationTests {
//
//    @Autowired
//    private KundenverwaltungRepository kundenverwaltungRepository;
//    int tempId;
//
//
//    @Test
//    public void testCreateKunde() {
//
//        assertNotNull("\"kundenverwaltungRepository\" ist Null!", kundenverwaltungRepository);
//
//        // Kunde anlegen
//        Kunde kunde = new Kunde();
//        kunde.setVorname("Karsten");
//        kunde.setNachname("Samaschke");
//        kunde.setAnrede("Herr");
//        kunde.setAlter("30");
//        kunde.setGeschlecht("Maenlich");
//
//        Kunde result = kundenverwaltungRepository.save(kunde);
//        tempId = result.getId();
//
//        assertNotEquals("\"result\" ist nicht ungleich Null!", tempId, 0);
//    }
//
//
//    @Test
//    public void testDeleteKunde() {
//        kundenverwaltungRepository.deleteById(tempId);
//
//        Kunde result = kundenverwaltungRepository.findById(tempId).get();
//        assertNull(result);
//    }
//
//
//
///*    @Test
//    public void test() {
//        assertNotNull(KundenverwaltungRepository);
//
//        // Customer anlegen
//        Kunde kunde = new Kunde();
//        kunde.setVorname("Karsten");
//        kunde.setNachname("Samaschke");
////        kunde.setGeschlecht(Gender.Male);
//        kunde.setGeschlecht("Mänlich");
//
////        Calendar geburtstag = Calendar.getInstance();
////        geburtstag.set(Calendar.DAY_OF_MONTH, 1);
////        geburtstag.set(Calendar.MONTH, 1);
////        geburtstag.set(Calendar.YEAR, 1975);
////        kunde.setBirthday(geburtstag.getTime());
//
//        // Adresse definieren
//        Adresse adresse = new Adresse();
//        adresse.setOrt("Berlin");
//        adresse.setLand("Germany");
//        adresse.setStrasse("Warschauer Strasse 58a");
//        adresse.setPlz("10243");
////        adresse.setKind(Kind.Business);
////        kunde.getAddresses().add(adresse);
//
//        // E-Mail-Adresse definieren
////        Kontakt kontakt = new Communication();
////        kontakt.setName("Geschäft");
////        kontakt.setValue("info@samaschke.de");
////        kontakt.setCommunicationType(CommunicationType.Email);
////        kontakt.setKind(Kind.Business);
////        kunde.getCommunications().add(kontakt);
//
//        Kunde result = KundenverwaltungRepository.create(kunde);
//        assertNotEquals(result.getId(), 0);
//
//        // Kunden erneut abrufen
//        result = KundenverwaltungRepository.getCustomer(result.getId());
//
//        // Adresse überprüfen
//        assertTrue(result.getAddresses().size() == 1);
//        Adresse adresseFromServer = result.getAddresses().get(0);
//        assertEquals(adresse.getStrasse(), adresseFromServer.getStreet());
//
//        // E-Mail überprüfen
//        assertTrue(result.getCommunications().size() == 1);
//        Kontakt contaktFromServer = result.getCommunications().get(0);
//        assertEquals(kontakt.getValue(), contaktFromServer.getValue());
//    }*/
//
//}