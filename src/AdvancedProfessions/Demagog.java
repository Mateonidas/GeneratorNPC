package AdvancedProfessions;

import GeneratorNPC.*;

public class Demagog extends Profession {
    public Demagog() {
        name = "Demagog";
        
        wW = "+10";
        uS = "+10";
        odp = "+10";
        zr = "+15";
        inte = "+20";
        sW = "+15";
        ogd = "+30";
        a = "+1";
        zyw = "+4";
        
        skills.add("charakteryzacja");
        skills.add("dowodzenie");
        skills.add("gadanina");
        skills.add("nauka (historia)");
        skills.add("nauka (prawo)");
        skills.add("plotkowanie");
        skills.add("przkonywanie");
        skills.add("spostrzegawczość");
        skills.add("ukrywanie się");
        skills.add("unik");
        skills.add("wiedza (Imperium)");
        skills.add("zastraszanie");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("bijatyka");
        abilities.add("etykieta / łotrzyk");
        abilities.add("krasomóstwo");
        abilities.add("przemawianie");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        armor.add("skórzany hełm (głowa: 1)");
    }
}
