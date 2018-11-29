package AdvancedProfessions;

import GeneratorNPC.*;

public class Arcykaplan extends Profession {
    public Arcykaplan() {
        name = "Arcykapłan";
        
        wW = "+20";
        uS = "+20";
        k = "+15";
        odp = "+15";
        zr = "+15";
        inte = "+15";
        sW = "+30";
        ogd = "+25";
        a = "+1";
        zyw = "+6";
        mag = "+3";
        
        skills.add("jeździectwo / pływanie");
        skills.add("język tajemny (magiczny)");
        skills.add("leczenie");
        skills.add("nauka (dowolne trzy)");
        skills.add("nauka (teologia)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("splatanie magii");
        skills.add("wiedza (dowolne dwa)");
        skills.add("wykrywanie magii");
        skills.add("zastraszanie");
        skills.add("znajomość języka (dowolne trzy)");
        
        abilities.add("dotyk mocy / odporność psychiczna");
        abilities.add("etykieta");
        abilities.add("magia powszechna (dowolne dwie)");
        abilities.add("pancerz wiary / morderczy pocisk");
        abilities.add("zmysł magii / medytacja");
        
        equipment.add("relikwia");
    }
}
