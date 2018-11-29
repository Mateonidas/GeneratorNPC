package BasicProfessions;

import GeneratorNPC.*;

public class Oprych extends Profession{
    public Oprych(){
        name = "Oprych";
        
        wW = "+10";
        k = "+5";
        odp = "+5";
        sW = "+5";
        ogd = "+5";
        a = "+1";
        zyw = "+2";
        
        skills.add("hazard");
        skills.add("mocna głowa");
        skills.add("sekretny jęyk (złodziejski)");
        skills.add("unik");
        skills.add("zastraszanie");
        
        abilities.add("morderczy atak / zapasy");
        abilities.add("szybkie wyciągnięcie / odporność na truzicny");
        abilities.add("ogłuszanie");
        abilities.add("opanowanie (+5 SW) / szybkie refleks (+5 Zr)");
        abilities.add("Rozbrajanie");
        
        armor.add("kaftan kolczy (koprus: 2)");
        armor.add("skórzany kaftan (korpus: 1");
        
        armament.add("kastety");
    }
}