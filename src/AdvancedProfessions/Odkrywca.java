package AdvancedProfessions;

import GeneratorNPC.*;

public class Odkrywca extends Profession {
    public Odkrywca() {
        name = "Odkrywca";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+15";
        zr = "+15";
        inte = "+25";
        sW = "+20";
        ogd = "+15";
        a = "+1";
        zyw = "+6";
        
        skills.add("czytanie i pisanie");
        skills.add("dowodzenie");
        skills.add("jeździectwo");
        skills.add("nauka (historia / prawo)");
        skills.add("nawigacja");
        skills.add("pływanie");
        skills.add("powożenie");
        skills.add("rzemiosło (kartografia)");
        skills.add("sekretne znaki (zwiadowców)");
        skills.add("sekretny język (łowców)");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("tropienie");
        skills.add("wiedza (dowolne trzy)");
        skills.add("wspinaczka");
        skills.add("wycena");
        skills.add("znajomość języka (dowolne trzy)");
        
        abilities.add("obieżyświat");
        abilities.add("wyczucie kierunku / poliglota");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("łuk i 10 strzał / kusza i 10 bełtów");
        armament.add("broń jednoręczna");
        armament.add("tarcza");
        
        equipment.add("koń z siodłem i uprzężą");
        equipment.add("6 map");
        equipment.add("tysiąc zk w monecie i towarach na wymianę");
    }
}
