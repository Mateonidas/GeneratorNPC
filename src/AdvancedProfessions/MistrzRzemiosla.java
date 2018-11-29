package AdvancedProfessions;

import GeneratorNPC.*;

public class MistrzRzemiosla extends Profession {
    public MistrzRzemiosla() {
        name = "Mistrz Rzemiosla";
        
        k = "+10";
        odp = "+10";
        zr = "+20";
        inte = "+10";
        sW = "+10";
        ogd = "+10";
        zyw = "+3";
        
        skills.add("plotkowanie");
        skills.add("powożenie");
        skills.add("rzemiosło (dowolne trzy)");
        skills.add("sekretny język (gildii)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / khazalid / tileański)");
        
        abilities.add("talent artystyczny / etykieta");
        
        equipment.add("narzędzia (rzemieślnika) najlepszej jakości");
        equipment.add("15 zk");
    }
}
