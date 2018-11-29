package BasicProfessions;

import GeneratorNPC.*;

public class StraznikDrog extends Profession {
    public StraznikDrog(){
        name = "Strażnik dróg";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+5";
        zyw = "+2";
        
        skills.add("jeździectwo");
        skills.add("nawigacja");
        skills.add("opieka nad zwierzętami");
        skills.add("powożenie");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("tropienie / sekretne znaki (zwiadowców)");
        skills.add("wiedza (Imperium) / plotkowanie");
        
        abilities.add("broń specjalna (palna)");
        abilities.add("szybkie wyciągnięcie / błyskawiczne przeładowanie");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("pistolet z 10 kulami i zapasem prochu");
        armament.add("tarcza");
        
        equipment.add("lekki koń bojowy z siodłem i uprzężą");
        equipment.add("10 metrów liny");
    }
}
