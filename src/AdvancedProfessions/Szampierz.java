package AdvancedProfessions;

import GeneratorNPC.*;

public class Szampierz extends Profession {
    public Szampierz() {
        name = "Szampierz";
        
        wW = "+35";
        k = "+15";
        odp = "+15";
        zr = "+20";
        inte = "+10";
        sW = "+15";
        a = "+2";
        zyw = "+6";
        
        skills.add("spostrzegawczość");
        skills.add("unik");
        
        abilities.add("błyskawiczny blok");
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("broń specjalna (korbacze)");
        abilities.add("broń specjalna (parująca)");
        abilities.add("broń specjalna (szermiercza)");
        
        armament.add("broń dwuręczna");
        armament.add("korbacz / morgernsztern");
        armament.add("rapier / szpada");
        armament.add("puklerz / lewak");
        
        equipment.add("10 metrów liny");
    }
}
