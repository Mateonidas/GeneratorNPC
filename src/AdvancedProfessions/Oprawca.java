package AdvancedProfessions;

import GeneratorNPC.*;

public class Oprawca extends Profession {
    public Oprawca() {
        name = "Oprawca";
        
        wW = "+15";
        k = "+20";
        odp = "+10";
        zr = "+10";
        inte = "+10";
        sW = "+20";
        ogd = "+15";
        zyw = "+4";
        
        skills.add("leczenie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("torturowanie");
        skills.add("zastraszanie");
        
        abilities.add("broń specjalna (korbacze)");
        abilities.add("groźny");
        abilities.add("zapasy");
        
        armament.add("5 noży do rzucania");
        armament.add("korbacz");
        
        equipment.add("3 pary kajdan");
    }
}
