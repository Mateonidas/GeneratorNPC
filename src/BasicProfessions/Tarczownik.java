package BasicProfessions;

import GeneratorNPC.*;

public class Tarczownik extends Profession {
    public Tarczownik(){
        name = "Tarczownik";
        
        wW = "+10";
        k = "+5";
        odp = "+5";
        zr = "+10";
        sW = "+5";
        a = "+1";
        zyw = "+2";
        
        skills.add("nawigacja");
        skills.add("spostrzegawczość");
        skills.add("śledzenie");
        skills.add("unik");
        skills.add("wspinaczka");
        
        abilities.add("czuły słuch / opanowanie (+5 SW)");
        abilities.add("morderczy atak");
        abilities.add("ogłuszanie");
        abilities.add("silny cios");
        abilities.add("wyczucie kierunku");
        
        armor.add("kolczuga (korpus, nogi: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        armor.add("skórzane nogawice (nogi: 1)");
        
        armament.add("kusza i 10 bełtów");
        armament.add("tarcza");
        
        equipment.add("10 metrów liny z kotwiczką");
        equipment.add("bukłak z wodą");
    }
}
