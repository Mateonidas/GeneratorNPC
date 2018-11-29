package BasicProfessions;

import GeneratorNPC.*;

public class ZolnierzOkretowy extends Profession {
    public ZolnierzOkretowy(){
        name = "Żołnierz okrętowy";
        
        wW = "+10";
        uS = "+10";
        k = "+10";
        zr = "+5";
        sW = "+5";
        a = "+1";
        zyw = "+3";
        
        skills.add("mocna głowa");
        skills.add("plotkowanie / sekretny język (bitewny)");
        skills.add("pływanie");
        skills.add("unik");
        skills.add("wiedza (Jałowa Kraina) / hazard");
        skills.add("wioślarstwo");
        skills.add("zastraszanie");
        
        abilities.add("ogłuszanie");
        abilities.add("rozbrajania / szybkie wyciągnięcie");
        abilities.add("silny cios");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("łuk i 10 strzał / kusza i 10 beltów");
        armament.add("tarcza");
        
        equipment.add("10 metrów liny z kotwiczką");
    }
}
