package BasicProfessions;

import GeneratorNPC.*;

public class ZabojcaTrolli extends Profession {
    public ZabojcaTrolli(){
        name = "Zabójca trolli";
        
        wW = "+10";
        k = "+5";
        odp = "+5";
        zr = "+5";
        sW = "+10";
        a = "+1";
        zyw = "+3";
        
        skills.add("mocna głowa");
        skills.add("unik");
        skills.add("zastraszanie");
        
        abilities.add("bijatyka");
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("rozbrajanie / szybkie wyciągnięcie");
        abilities.add("silny cios");
        abilities.add("szybkie refleks (+5 Zr) / niezwykle odporny (+5 Odp)");
        abilities.add("twardziel (+1 Żyw)");
        
        armor.add("skórzany kaftan (korpus: 1)");
        
        armament.add("broń dwuręczna");
        
        equipment.add("butelka spirytusu / gorzałka kiepskiej jakości");
    }
}
