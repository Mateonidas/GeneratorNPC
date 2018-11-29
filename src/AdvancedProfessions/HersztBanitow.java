package AdvancedProfessions;

import GeneratorNPC.*;

public class HersztBanitow extends Profession {
    public HersztBanitow() {
        name = "Herszt banitów";
        
        wW = "+20";
        uS = "+30";
        k = "+10";
        odp = "+20";
        zr = "+10";
        inte = "+10";
        sW = "+10";
        ogd = "+20";
        a = "+2";
        zyw = "+6";
        
        skills.add("dowodzenie");
        skills.add("jeździectwo");
        skills.add("nauka (strategia / taktyka)");
        skills.add("sekretne znaki (zwiadowców / złodziei)");
        skills.add("sekretny język (bitewny)");
        skills.add("sekretny język (złodziejski)");
        skills.add("skradani się");
        skills.add("spostrzegawczość");
        skills.add("tropienie");
        skills.add("ukrywanie się");
        skills.add("wiedza (Imperium)");
        skills.add("wspinaczka");
        
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("błyskawiczny blok");
        abilities.add("strzła precyzyjny");
        abilities.add("szybkie wyciągnięcie");
        
        armor.add("koszulka kolcza (korpus, ręce: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("łuk i 10 strzał / kusza i 10 bełtów)");
        
        equipment.add("koń z siodłem i uprzężą");
        equipment.add("grupa banitów");
    }
}
