package BasicProfessions;

import GeneratorNPC.*;

public class Fanatyk extends Profession{
    public Fanatyk(){
        name = "Fanatyk";
        
        wW = "+10";
        k = "+5";
        odp = "+10";
        sW = "+10";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("nauka (teologia)");
        skills.add("przekonywanie");
        skills.add("wiedza (Imperium)");
        skills.add("zastraszanie");
        
        abilities.add("broń specjalna (korbacze)");
        abilities.add("opanowanie (+5 SW) / bardzo silny (+5 K)");
        abilities.add("przemawianie");
        abilities.add("twardziel (+1 Żyw) / charyzmatyczny (+5 Ogd)");
        
        armament.add("korbacz / morgensztern");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        equipment.add("butelka spirytusu / gorzałka dobrej jakości");
        
    }
}