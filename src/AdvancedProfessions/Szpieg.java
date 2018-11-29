package AdvancedProfessions;

import GeneratorNPC.*;

public class Szpieg extends Profession {
    public Szpieg() {
        name = "Szpieg";
        
        wW = "+15";
        uS = "+15";
        k = "+5";
        odp = "+10";
        zr = "+20";
        inte = "+20";
        sW = "+35";
        ogd = "+20";
        a = "+1";
        zyw = "+4";
        
        skills.add("charakteryzacja");
        skills.add("czytanie z warg");
        skills.add("kuglarstwo (aktorstwo)");
        skills.add("otwieranie zamków");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("sekretny język (dowolny)");
        skills.add("skradanie się");
        skills.add("śledzenie");
        skills.add("ukrywanie się");
        skills.add("wiedza (dowolne dwie)");
        skills.add("znajomość języka (dowolne trzy)");
        skills.add("zwinne palce");
        
        abilities.add("charyzmatyczny (+5 Ogd) / szósty zmysł");
        abilities.add("chodu!");
        abilities.add("intrygant");
        abilities.add("poliglota");
    }
}
