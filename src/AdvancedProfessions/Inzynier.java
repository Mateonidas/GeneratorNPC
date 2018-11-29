package AdvancedProfessions;

import GeneratorNPC.*;

public class Inzynier extends Profession {
    public Inzynier() {
        name = "Inżynier";
        
        wW = "+10";
        uS = "+15";
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+20";
        sW = "+10";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("nauka (inżynieria)");
        skills.add("nauka (mechanika)");
        skills.add("powożenie / jeździectwo");
        skills.add("rzemiosło (rusznikarstwo)");
        skills.add("spostrzegawczość");
        skills.add("wiedza (krasnoludy / Tilea)");
        skills.add("znajomość języka (khazalid / tileański)");
        
        abilities.add("artylerzysta");
        abilities.add("broń specjalna (mechaniczna / palna)");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        equipment.add("narzędzia (inżynieria)");
        equipment.add("6 długich gwoździ");
    }
}
