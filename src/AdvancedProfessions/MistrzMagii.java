package AdvancedProfessions;

import GeneratorNPC.*;

public class MistrzMagii extends Profession {
    public MistrzMagii() {
        name = "Mistrz magii";
        
        wW = "+10";
        uS = "+10";
        odp = "+10";
        zr = "+15";
        inte = "+30";
        sW = "+35";
        ogd = "+15";
        zyw = "+4";
        mag = "+3";
        
        skills.add("czytanie i pisanie");
        skills.add("język tajemny (demoniczny / tajemny elfi)");
        skills.add("język tajemny (magiczny)");
        skills.add("nauka (dowolne dwie)");
        skills.add("nauka (magia)");
        skills.add("plotkowanie / jeździectwo");
        skills.add("przekonywanie / zastraszanie");
        skills.add("splatanie magii");
        skills.add("wiedza (dowolne dwie)");
        skills.add("wykrywanie magii");
        skills.add("znajomość języka (dowolne trzy)");
        
        abilities.add("czarnoksięstwo / odporność psychiczna");
        abilities.add("dotyk mocy / morderczy pocisk");
        abilities.add("magia powszechna (dowolne dwie)");
        abilities.add("zmysł magii / medytacja");
        
        equipment.add("narzędzia (alchemiczne)");
        equipment.add("2 przedmioty magiczne");
    }
}
