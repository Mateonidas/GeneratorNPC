package AdvancedProfessions;

import GeneratorNPC.*;

public class Arcymag extends Profession {
    public Arcymag() {
        name = "Arcymag";
        
        wW = "+15";
        uS = "+15";
        k = "+5";
        odp = "+15";
        zr = "+20";
        inte = "+35";
        sW = "+40";
        ogd = "+20";
        zyw = "+5";
        mag = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("język tajemny (demoniczny / tajemny elfi)");
        skills.add("język tajemny (magiczny)");
        skills.add("nauka (dowolne trzy)");
        skills.add("nauka (magia)");
        skills.add("przekonywanie / zastraszanie");
        skills.add("splatanie magii");
        skills.add("wiedza (dowolne trzy)");
        skills.add("wykrywanie magii");
        skills.add("znajomość języka (dowolne cztery)");
        
        abilities.add("czarnoksięstwo / medytacja");
        abilities.add("dotyk mocy / twardziel (+1 Żyw)");
        abilities.add("magia powszechna (dowolne dwie)");
        abilities.add("zmysł magii / morderczy atak");
        
        equipment.add("3 magiczne przedmioty");
        equipment.add("12 ksiąg magii tajemnej");
    }
}
