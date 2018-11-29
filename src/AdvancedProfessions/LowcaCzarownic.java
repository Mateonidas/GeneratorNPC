package AdvancedProfessions;

import GeneratorNPC.*;

public class LowcaCzarownic extends Profession {
    public LowcaCzarownic() {
        name = "Łowca czarownic";
        
        wW = "+30";
        uS = "+30";
        k = "+15";
        odp = "+15";
        zr = "+15";
        inte = "+15";
        sW = "+35";
        ogd = "+20";
        a = "+2";
        zyw = "+6";
        
        skills.add("dowodzenie");
        skills.add("jeździectwo");
        skills.add("nauka (magia)");
        skills.add("nauka (nekromancja)");
        skills.add("nauka (teologia)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("wiedza (Imperium)");
        skills.add("zastraszanie");
        skills.add("znajomość języka (dowolny)");
        
        abilities.add("błyskawiczny blok");
        abilities.add("broń specjalna (kusze)");
        abilities.add("broń specjalna (rzucana)");
        abilities.add("broń specjalna (unieruchamiająca)");
        abilities.add("groźny");
        abilities.add("odwaga");
        abilities.add("przemawianie");
        abilities.add("silny cios");
        abilities.add("szósty zmysł");
        abilities.add("szybki refleks (+5 Zr) / strzelec wyborowy (+5 US)");
        
        armor.add("zbroja płytowa (wszystkie: 5)");
        
        armament.add("kusz pistoletowa i 10 bełtów");
        armament.add("broń jednoręczna najlepszej jakości");
        armament.add("4 noże do rzucania / 4 gwiazdki do rzucania");
        
        equipment.add("10 metrów liny");
    }
}
