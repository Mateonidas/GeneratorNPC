package BasicProfessions;

import GeneratorNPC.*;

public class Najemnik extends Profession{
    public Najemnik(){
        name = "Najemnik";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        odp = "+5";
        zr = "+5";
        sW = "+5";
        a = "+1";
        zyw = "+2";
        
        skills.add("opieka nad zwierzętami / hazard");
        skills.add("plotkowanie / targowanie");
        skills.add("powożenie / jeździectwo");
        skills.add("sekretny język (bitewny)");
        skills.add("spostrzegawczość / przeszukiwanie");
        skills.add("unik");
        skills.add("wiedza (Bretonia / Kislev / Tilea)");
        skills.add("język (tileański) / pływanie");
        
        abilities.add("błyskawiczny przeładowanie / silny cios");
        abilities.add("rozbrajanie / szybkie wyciągnięcie");
        abilities.add("strzał mierzony / ogłuszanie");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("kusza i 10 bełtów");
        armament.add("tarcza");
        
        equipment.add("mikstura lecznica");
    }
}