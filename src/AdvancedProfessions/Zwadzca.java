package AdvancedProfessions;

import GeneratorNPC.*;

public class Zwadzca extends Profession {
    public Zwadzca() {
        name = "Zwadźca";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+20";
        zr = "+20";
        inte = "+15";
        sW = "+15";
        ogd = "+10";
        a = "+1";
        zyw = "+4";
        
        skills.add("hazard");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("zastraszanie");
        skills.add("zwinne palce");
        
        abilities.add("artylerzysta");
        abilities.add("brawura");
        abilities.add("broń specjalna (palna)");
        abilities.add("broń specjalna (parujaca)");
        abilities.add("broń specjalna (szermiercza)");
        abilities.add("etykieta");
        abilities.add("morderczy atak");
        abilities.add("oburęczność / rozbrajanie");
        abilities.add("silny cios");
        abilities.add("strzał mierzony");
        abilities.add("strzał precyzyjny");
        abilities.add("szybkie wyciągnięcie");
        
        armament.add("lewak");
        armament.add("pistolet z amunicją i zapasem prochu na 10 strzałów");
        armament.add("rapier");
    }
}
