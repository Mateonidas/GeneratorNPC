package AdvancedProfessions;

import GeneratorNPC.*;

public class Urzednik extends Profession {
    public Urzednik() {
        name = "Urzędnik";
        
        wW = "+5";
        uS = "+5";
        k = "+5";
        odp = "+10";
        inte = "+20";
        sW = "+10";
        ogd = "+20";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("dowodzenie");
        skills.add("gadanina");
        skills.add("kuglarstwo (aktorstwo)");
        skills.add("nauka (historia / genealogia / heraldyka)");
        skills.add("nauka (prawo)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("etykieta / łotrzyk");
        abilities.add("krasomóstwo");
        abilities.add("przemawianie");
        abilities.add("żyłka handlowa / intrygant");
        
        armor.add("skórzana kurta najlepszej jakości (korpus, ręce: 1)");
        
        armament.add("broń jednoręczna najlepszej jakości");
        
        equipment.add("ulotki i odezwy polityczne");
    }
}
