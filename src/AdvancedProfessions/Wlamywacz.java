package AdvancedProfessions;

import GeneratorNPC.*;

public class Wlamywacz extends Profession {
    public Wlamywacz() {
        name = "Włamywacz";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        odp = "+5";
        zr = "+25";
        inte = "+10";
        sW = "+10";
        zyw = "+4";
        
        skills.add("otwieranie zamków");
        skills.add("plotkowanie");
        skills.add("przeszukiwanie");
        skills.add("sekretne znaki (złodziei)");
        skills.add("sekretny język (złodziejski)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("ukrywanie się");
        skills.add("wspinaczka");
        skills.add("wycena");
        
        abilities.add("bijatyka");
        abilities.add("łotrzyk");
        abilities.add("ulicznik");
        abilities.add("wykrywanie pułapek");
        
        equipment.add("wytrychy");
        equipment.add("10 metrów liny");
        equipment.add("kotwiczka do wspinaczki");
    }
}
