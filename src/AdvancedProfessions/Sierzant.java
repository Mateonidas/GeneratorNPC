package AdvancedProfessions;

import GeneratorNPC.*;

public class Sierzant extends Profession {
    public Sierzant() {
        name = "Sierżant";
        
        wW = "+20";
        uS = "+15";
        k = "+10";
        odp = "+10";
        zr = "+10";
        inte = "+10";
        sW = "+10";
        ogd = "+20";
        a = "+1";
        zyw = "+4";
        
        skills.add("dowodzenie");
        skills.add("jeździectwo / pływanie");
        skills.add("nauka (strategia / taktyka)");
        skills.add("plotkowanie");
        skills.add("sekretny język (bitewny)");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("wiedza (dowolne dwie)");
        skills.add("zastraszanie");
        skills.add("znajomość języka (tileański)");
        
        abilities.add("bijatyka / zapasy");
        abilities.add("groźny / obieżyświat");
        abilities.add("ogłuszanie");
        abilities.add("silny cios");
        
        armor.add("zbroja kolcza (wszystkie: 3)");
        
        armament.add("tarcza");
        
    }
}
