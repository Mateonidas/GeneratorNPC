package AdvancedProfessions;

import GeneratorNPC.*;

public class Arystokrata extends Profession {
    public Arystokrata() {
        name = "Arystokrata";
        
        wW = "+25";
        uS = "+15";
        k = "+10";
        odp = "+10";
        zr = "+10";
        inte = "+20";
        sW = "+20";
        ogd = "+30";
        a = "+1";
        zyw = "+6";
        
        skills.add("czytanie i pisanie");
        skills.add("dowodzenie");
        skills.add("jeździectwo");
        skills.add("nauka (genealogia / heraldyka)");
        skills.add("nauka (historia / strategia / taktyka)");
        skills.add("plotkwonie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("znajomość języka (klasyczny)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("broń specjalna (szermiercza)");
        abilities.add("krasomówstwo");
        abilities.add("przemawianie");
        
        armament.add("rapier najlepszej jakości / szpada najlepszej jakości");
        
        equipment.add("stój arystokraty");
        equipment.add("rumak z siodłem i uprzężą");
        equipment.add("500 zk");
        equipment.add("biżuteria o wartości 500 zk");
    }
}
