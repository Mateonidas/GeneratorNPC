package AdvancedProfessions;

import GeneratorNPC.*;

public class Paser extends Profession {
    public Paser() {
        name = "Paser";
        
        wW = "+15";
        uS = "+10";
        k = "+10";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+10";
        ogd = "+10";
        a = "+1";
        zyw = "+4";
        
        skills.add("hazard");
        skills.add("plotkowanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wycena");
        skills.add("zastraszanie");
        skills.add("zwinne palce");
        
        abilities.add("geniusz arytemtyczny");
        abilities.add("ogłuszanie");
        abilities.add("żyłka handlowa / łotrzyk");
        
        equipment.add("narzędzia (grawera)");
        equipment.add("przybory do pisania");
    }
}
