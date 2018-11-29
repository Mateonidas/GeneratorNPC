package AdvancedProfessions;

import GeneratorNPC.*;

public class Kaplan extends Profession {
    public Kaplan() {
        name = "Kapłan";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        odp = "+10";
        zr = "+5";
        inte = "+10";
        sW = "+20";
        ogd = "+15";
        zyw = "+4";
        mag = "+1";
        
        skills.add("czytanie i pisanie");
        skills.add("jeździectwo / pływanie");
        skills.add("język tajemny (magiczny)");
        skills.add("leczenie");
        skills.add("nauka (dowolna)");
        skills.add("nauka (teologia)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("splatanie magii");
        skills.add("spostrzegawczość");
        skills.add("wiedza (dowolne dwie)");
        skills.add("wykrywanie magii");
        skills.add("znajomość języka (dowolne dwa)");
        
        abilities.add("magia prosta (kapłańska)");
        abilities.add("morderczy atak / ogłuszanie");
        abilities.add("pancerz wiary / krasnomóstwo");
        
        equipment.add("modlitewnik");
        equipment.add("przybory do pisania");
    }
}
