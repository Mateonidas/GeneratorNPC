package AdvancedProfessions;

import GeneratorNPC.*;

public class Dworzanin extends Profession {
    public Dworzanin() {
        name = "Dworzanin";
        
        wW = "+5";
        uS = "+5";
        zr = "+10";
        inte = "+20";
        sW = "+20";
        ogd = "+20";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("dowodzenie / kuglarstwo (dowolne)");
        skills.add("gadanina");
        skills.add("jeździectwo");
        skills.add("nauka (sztuka / historia) / hazard");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("wiedza (Bretonia / Tilea)");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / tileański)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("błyskotliwość (+5 Int) / charyzmatyczny (+5 Ogd)");
        abilities.add("intrygant / broń specjalna (szermiercza)");
        abilities.add("przemawianie");
        abilities.add("żyłka handlowa / etykieta");
        
        equipment.add("4 stroje szlacheckie");
        equipment.add("100 zk");
        equipment.add("paź");
    }
}
