package BasicProfessions;

import GeneratorNPC.*;

public class RzecznikRodu extends Profession {
    public RzecznikRodu(){
        name = "Rzecznik Rodu";
        
        wW = "+5";
        uS = "+5";
        zr = "+5";
        inte = "+10";
        sW = "+5";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("plotkowanie");
        skills.add("pływanie");
        skills.add("przekonywanie");
        skills.add("rzemiosło (handel)");
        skills.add("sekretny język (gildii)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium / Jałowa Kraina)");
        skills.add("wycena");
        
        abilities.add("obieżyświat / żyłka handlowa");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        equipment.add("2 komplety ubrań dobrej jakości");
        equipment.add("przybory do pisania");
    }
}
