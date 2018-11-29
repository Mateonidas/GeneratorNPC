package AdvancedProfessions;

import GeneratorNPC.*;

public class Uczony extends Profession {
    public Uczony() {
        name = "Uczony";
        
        wW = "+5";
        uS = "+5";
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+30";
        sW = "+15";
        ogd = "+15";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("nauka (dowolne trzy)");
        skills.add("spostrzegawczość");
        skills.add("wiedza (dowolne trzy)");
        skills.add("wycena / rzemiosło (kartografia)");
        skills.add("znajomość języka (dowolne trzy)");
        skills.add("znajomość języka (klasyczny)");
        
        abilities.add("poliglota");
        
        equipment.add("przybory do pisania");
    }
}
