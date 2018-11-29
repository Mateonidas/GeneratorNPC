package BasicProfessions;

import GeneratorNPC.*;

public class Zarzadca extends Profession {
    public Zarzadca(){
        name = "Zarządca";
        
        wW = "+5";
        uS = "+5";
        k = "+5";
        inte = "+10";
        sW = "+5";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("czytani i pisanie");
        skills.add("dowodzenie / nawigacja");
        skills.add("jeździectwo");
        skills.add("nauka (prawo)");
        skills.add("opieka nad zwierzętami / plotkowanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("zastraszanie / wiedza (Imperium)");
        
        abilities.add("etykieta / geniusz arytmetyczny");
        abilities.add("przemawianie");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        armor.add("skórzany hełm (głowa: 1)");
        
        equipment.add("ubranie dobrej jakości");
        equipment.add("koń z siodłem i uprzężą");
    }
}
