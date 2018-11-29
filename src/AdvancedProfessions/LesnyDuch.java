package AdvancedProfessions;

import GeneratorNPC.*;

public class LesnyDuch extends Profession {
    public LesnyDuch() {
        name = "Leśny duch";
        
        wW = "+20";
        uS = "+30";
        k = "+15";
        odp = "+15";
        zr = "+25";
        inte = "+20";
        sW = "+20";
        a = "+2";
        zyw = "+6";
        
        skills.add("czytanie z warg");
        skills.add("nawigacja");
        skills.add("sekretne znaki (łowców)");
        skills.add("sekretny język (łowców)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("śledzenie");
        skills.add("tropienie");
        skills.add("ukrywanie się");
        skills.add("unik");
        skills.add("zastawianie pułapek");
        skills.add("zastraszanie");
        
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("błyskawiczny blok");
        abilities.add("strzał precyzyjny");
        abilities.add("strzał przebijający");
        abilities.add("szybkie wyciągnięcie");
        abilities.add("twardziel (+1 Żyw) / bardzo szybki (+1 Sz)");
        
        armor.add("skórznia najlepszej jakości (wszystkie: 1)");
        
        armament.add("elfi łuk i 10 strzał");
    }
}
