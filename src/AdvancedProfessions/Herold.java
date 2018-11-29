package AdvancedProfessions;

import GeneratorNPC.*;

public class Herold extends Profession {
    public Herold() {
        name = "Herold";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        odp = "+5";
        zr = "+15";
        inte = "+15";
        sW = "+10";
        ogd = "+20";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("gadanina");
        skills.add("jeździectwo");
        skills.add("nauka (genealogia / heraldyka)");
        skills.add("nauka (historia)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Bretonia / Kislev / Tilea)");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / kislevski / tileański)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("etykieta");
        abilities.add("krasomóstwo");
        abilities.add("przemawianie");
        
        equipment.add("perfumy");
        equipment.add("mieszek");
        equipment.add("2 komplety ubrań najlepszej jakości");
        equipment.add("liberia");
    }
}
