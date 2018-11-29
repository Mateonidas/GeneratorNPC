package AdvancedProfessions;

import GeneratorNPC.*;

public class WybraniecBozy extends Profession {
    public WybraniecBozy() {
        name = "Wybraniec boży";
        
        wW = "+15";
        uS = "+15";
        k = "+10";
        odp = "+10";
        zr = "+10";
        inte = "+15";
        sW = "+25";
        ogd = "+20";
        a = "+1";
        zyw = "+5";
        mag = "+2";
        
        skills.add("jeździectwo / pływanie");
        skills.add("język tajemny (magiczny)");
        skills.add("leczenie");
        skills.add("nauka (dowolne dwie)");
        skills.add("nauka (teologia)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("splatanie magii");
        skills.add("wiedza (dowolne dwie)");
        skills.add("wykrywanie magii");
        skills.add("znajomość języka (dowolne dwa)");
        
        abilities.add("magia kapłańska (dowolna)");
        abilities.add("magia powszechna (dowolne dwie)");
        abilities.add("obieżyświat / silny cios");
        abilities.add("pancerz wiary / dotyk mocy");
        abilities.add("zmysł magii / medytacja");
        
        equipment.add("szaty kapłańskie najlepszej jakości / strój szlachecki");
    }
}
