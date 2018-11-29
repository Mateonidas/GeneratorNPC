package AdvancedProfessions;

import GeneratorNPC.*;

public class Biczownik extends Profession {
    public Biczownik() {
        name = "Biczownik";
        
        wW = "+15";
        k = "+10";
        odp = "+15";
        zr = "+5";
        sW = "+20";
        ogd = "+10";
        a = "+1";
        zyw = "+6";
        
        skills.add("leczenie");
        skills.add("nauka (teologia)");
        skills.add("przekonywanie");
        skills.add("zastraszanie");
        skills.add("znajomość języka (klasyczny)");
        
        abilities.add("broń specjalna (korbacze / dwuręczna)");
        abilities.add("nieustraszony");
        abilities.add("silny cios");
        
        armament.add("korbacz / broń dwuręczna");
        
        equipment.add("butelka spirytusu / gorzałka dobrej jakości");
        equipment.add("symbol religijny");
        equipment.add("relikwia");
    }
}
