package AdvancedProfessions;

import GeneratorNPC.*;

public class Oficer extends Profession {
    public Oficer() {
        name = "Oficer";
        
        wW = "+30";
        uS = "+20";
        k = "+20";
        odp = "+20";
        zr = "+20";
        inte = "+15";
        sW = "+15";
        ogd = "+25";
        a = "+2";
        zyw = "+7";
        
        skills.add("czytanie i pisanie");
        skills.add("dowodzenie");
        skills.add("jeździectwo");
        skills.add("nauka (strategia / taktyka)");
        skills.add("opieka nad zwierzętami");
        skills.add("plotkowanie");
        skills.add("sekrenty język (bitewny)");
        skills.add("unik");
        skills.add("wiedza (dowolne trzy)");
        skills.add("znajomość języka (kislevski / tileański)");
        
        abilities.add("błyskawiczny blok");
        abilities.add("broń specjalna (kawaleryjska / dwuręczna)");
        abilities.add("broń specjalna (korbacz / parująca)");
        abilities.add("rozbrajanie / szybkie wyciągnięcie");
        
        armor.add("zbroja kolcza (wszystkie: 3)");
        
        armament.add("korbacz / łamacz mieczy");
        armament.add("kopia / broń dwuręczna");
        armament.add("tarcza");
        
        equipment.add("rumak z siodłem i uprzężą");
        equipment.add("oddział żołnierzy");
    }
}
