package AdvancedProfessions;

import GeneratorNPC.*;

public class Rozbojnik extends Profession {
    public Rozbojnik() {
        name = "Rozbojnik";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+10";
        zr = "+30";
        inte = "+20";
        sW = "+15";
        ogd = "+25";
        a = "+1";
        zyw = "+4";
        
        skills.add("jeździectwo");
        skills.add("opieka nad zwierzętami");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("skradanie się");
        skills.add("tresura");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        
        abilities.add("artylerzysta");
        abilities.add("brawura");
        abilities.add("broń specjalna (palna)");
        abilities.add("broń specjalna (szermiercza)");
        abilities.add("etykieta");
        abilities.add("oburęczność");
        abilities.add("strzał mierzony");
        abilities.add("strzał precyzyjny");
        abilities.add("woltyżerka");
        
        armament.add("2 pistolety z amunicją i zapasem prochy na 20 strzałów");
        
        equipment.add("strój szlachecki");
        equipment.add("kaptur / maska");
        equipment.add("koń z siodłem i uprzężą");
    }
}
