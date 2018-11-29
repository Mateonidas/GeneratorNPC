package BasicProfessions;

import GeneratorNPC.*;

public class Rzezimieszek extends Profession {
    public Rzezimieszek(){
        name = "Rzezimieszek";
        
        wW = "+10";
        k = "+10";
        zr = "+10";
        sW = "+10";
        a = "+1";
        zyw = "+2";
        
        skills.add("jeździectwo");
        skills.add("plotkowanie / targowanie");
        skills.add("unik");
        skills.add("zastraszanie");
        
        abilities.add("bijatyka");
        abilities.add("groźny / charyzmatyczny (+5 Ogd)");
        abilities.add("morderczy atak");
        abilities.add("ogłuszanie");
        abilities.add("rozbrajanie / szybkie wyciągnięcie");
        abilities.add("silny cios");
        
        armor.add("kaftan kolczy (koprus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("tarcza");
        
        equipment.add("koń z siodłem i uprzężą");
    }
}
