package AdvancedProfessions;

import GeneratorNPC.*;

public class Rajtar extends Profession {
    public Rajtar() {
        name = "Rajtar";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+10";
        zr = "+15";
        sW = "+15";
        ogd = "+15";
        a = "+1";
        zyw = "+4";
        
        skills.add("jeździectwo");
        skills.add("opieka nad zwierzętami");
        skills.add("sekretne znaki (zwiadowców)");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("wycena / plotkowanie");
        
        abilities.add("artylerzysta");
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("broń specjalna (palna)");
        abilities.add("silny cios");
        abilities.add("strzał mierzony");
        abilities.add("strzał przebijający");
        abilities.add("szybkie wyciągnięcie");
        
        armament.add("2 pistolety z amunicją i zapasem prochu na 20 strzałów");
        
        equipment.add("ubranie najlepszej jakości");
        equipment.add("lekki koń bojowy z siodłem i uprzężą");
    }
}
