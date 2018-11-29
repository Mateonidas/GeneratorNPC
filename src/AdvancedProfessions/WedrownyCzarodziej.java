package AdvancedProfessions;

import GeneratorNPC.*;

public class WedrownyCzarodziej extends Profession {
    public WedrownyCzarodziej() {
        name = "Wędrowny czarodziej";
        
        wW = "+5";
        uS = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+20";
        sW = "+25";
        ogd = "+10";
        zyw = "+3";
        mag = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("jeździectwo / pływanie");
        skills.add("język tajemny (magiczny)");
        skills.add("nauka (dowolna)");
        skills.add("nauka (magia)");
        skills.add("plotkowanie");
        skills.add("przekonywanie / zastraszanie");
        skills.add("splatanie magii");
        skills.add("wiedza (dowolne dwie)");
        skills.add("wykrywanie magii");
        skills.add("znajomość języka (dowolne dwa)");
        
        abilities.add("dotyk mocy / niezwykle odporny (+5 Odp)");
        abilities.add("magia tajemna (dowolna) / magia czarnoksięska (dowolna)");
        abilities.add("magia powszechna (dowolne dwie)");
        abilities.add("medytacja / morderczy pocisk");
        abilities.add("zmysł magii / czarnoksięstwo");
        
        equipment.add("ksiega wiedzy tajemnej");
        equipment.add("przybory do pisania");
    }
}
