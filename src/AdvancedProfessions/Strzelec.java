package AdvancedProfessions;

import GeneratorNPC.*;

public class Strzelec extends Profession {
    public Strzelec() {
        name = "Strzelec";
        
        uS = "+35";
        k = "+10";
        odp = "+10";
        zr = "+25";
        inte = "+10";
        sW = "+20";
        ogd = "+15";
        a = "+1";
        zyw = "+4";
        
        skills.add("plotkowanie");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("wiedza (Imperium)");
        skills.add("zwinne palce");
        
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("broń specjalna (długi łuk)");
        abilities.add("broń specjalna (kusze / rzucana)");
        abilities.add("strzał mierzony");
        abilities.add("strzał precyzyjny");
        abilities.add("strzał przebijający");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("długi łuk i 10 strzał / kusza i 10 bełtów");
    }
}
