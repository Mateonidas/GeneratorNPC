package BasicProfessions;

import GeneratorNPC.*;

public class Gladiator extends Profession{
    public Gladiator(){
        name = "Gladiator";
        
        wW = "+15";
        odp = "+10";
        zr = "+10";
        sW = "+10";
        zyw = "+2";
        
        skills.add("unik");
        skills.add("zastraszanie");
        
        abilities.add("bardzo silny (+5 K) / odporność psychiczna");
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("broń specjalna (korbacze)");
        abilities.add("broń specjalna (parująca)");
        abilities.add("rozbrajanie / zapasy");
        abilities.add("silny cios");
        abilities.add("szybkie wyciągnięcie / morderczy atak");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1");
        
        armament.add("korbacz / broń dwuręczna");
        armament.add("kastet");
        armament.add("tarcza / puklerz");
        
       
    }
}