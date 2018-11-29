package AdvancedProfessions;

import GeneratorNPC.*;

public class Zwiadowca extends Profession {
    public Zwiadowca() {
        name = "Zwiadowca";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+10";
        zr = "+15";
        inte = "+20";
        sW = "+15";
        a = "+1";
        zyw = "+6";
        
        skills.add("jeździectwo");
        skills.add("nawigacja");
        skills.add("opieka nad zwierzętami");
        skills.add("oswajanie");
        skills.add("sekretne znaki (zwiadowców)");
        skills.add("sekretny język (łowców)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("tropienie");
        skills.add("ukrywanie się");
        skills.add("unik");
        skills.add("wiedza (dowolne dwie)");
        skills.add("znajomość języka (dowolne dwa)");
        
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("broń specjalna (długi łuk / kusze)");
        abilities.add("strzał precyzyjny / strzał przebijający");
        abilities.add("wyczucie kierunku");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("tarcza");
        
        equipment.add("koń z siodłem i uprzężą");
        equipment.add("10 metrów liny");
    }
}
