package AdvancedProfessions;

import GeneratorNPC.*;

public class Majordomus extends Profession {
    public Majordomus() {
        name = "Majordomus";
        
        wW = "+10";
        uS = "+10";
        k = "+10";
        odp = "+10";
        inte = "+30";
        sW = "+20";
        ogd = "+25";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("dowodzenie");
        skills.add("jeździectwo");
        skills.add("nauka (prawo)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("przeszukiwanie");
        skills.add("rzemiosło (handel)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("zastraszanie");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("geniusz arytmetyczny");
        abilities.add("przemawianie");
        
        equipment.add("2 stroje szlacheckie najlepszej jakości");
        equipment.add("przybory do pisania");
    }
}
