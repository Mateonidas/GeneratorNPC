package BasicProfessions;

import GeneratorNPC.*;

public class Rzemieslnik extends Profession {
    public Rzemieslnik(){
        name = "Rzemieślnik";
        
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+10";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("opieka nad zwierzętami / plotkowanie");
        skills.add("powożenie");
        skills.add("rzemiosło (dowolne dwa)");
        skills.add("sekretny język (gildii)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wycena");
        
        abilities.add("żyłka handlowa / błystkotliwość (+5 Int)");
        
        armor.add("skórzany kaftan (korpus :1)");
        
        equipment.add("1k10 zk");
    }
}
