package AdvancedProfessions;

import GeneratorNPC.*;

public class Kupiec extends Profession {
    public Kupiec() {
        name = "Kupiec";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+25";
        sW = "+20";
        ogd = "+20";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("jeździectwo");
        skills.add("plotkowanie");
        skills.add("powożenie");
        skills.add("przekonywanie");
        skills.add("rzemiosło (handel)");
        skills.add("sekretny język (gildii)");
        skills.add("targowanie");
        skills.add("wiedza (dowolne dwie)");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / estalijski / kislevski / norski)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("geniusz arytemtyczny");
        abilities.add("żyłka handlowa / łotrzyk");
        
        equipment.add("dom w mieście");
        equipment.add("1000 zk w monecie lub w towarach");
    }
}
