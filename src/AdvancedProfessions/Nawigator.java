package AdvancedProfessions;

import GeneratorNPC.*;

public class Nawigator extends Profession {
    public Nawigator() {
        name = "Nawigator";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+25";
        sW = "+10";
        ogd = "+5";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("nauka (astronomia)");
        skills.add("nawigacja");
        skills.add("pływanie");
        skills.add("rzemiosło (kartografia)");
        skills.add("spostrzegawczość");
        skills.add("wiedza (dowolne dwie)");
        skills.add("znajomość języka (klasyczny)");
        
        abilities.add("wyczucie kierunku");
        
        equipment.add("6 map i kartuszy");
        equipment.add("narzędzia (instrumenty nawigacyjne)");
    }
}
