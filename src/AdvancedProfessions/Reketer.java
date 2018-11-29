package AdvancedProfessions;

import GeneratorNPC.*;

public class Reketer extends Profession {
    public Reketer() {
        name = "Rekter";
        
        wW = "+20";
        uS = "+15";
        k = "+15";
        odp = "+10";
        zr = "+10";
        sW = "+15";
        ogd = "+10";
        a = "+1";
        zyw = "+5";
        
        skills.add("dowodzenie");
        skills.add("plotkowanie");
        skills.add("spostrzegawczość");
        skills.add("śledzenie");
        skills.add("targowanie");
        skills.add("unik");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("zastraszanie");
        
        abilities.add("bijatyka");
        abilities.add("groźny");
        abilities.add("łotrzyk");
        abilities.add("ogłuszanie");
        abilities.add("silny cios");
        
        armament.add("kastety");
        
        equipment.add("ubranie dobrej jakości");
        equipment.add("kapelusz");
    }
}
