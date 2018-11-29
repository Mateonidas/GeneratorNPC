package AdvancedProfessions;

import GeneratorNPC.*;

public class Karczmarz extends Profession {
    public Karczmarz() {
        name = "Karczmarz";
        
        wW = "+10";
        uS = "+5";
        k = "+5";
        odp = "+10";
        zr = "+20";
        inte = "+10";
        sW = "+10";
        ogd = "+20";
        zyw = "+4";
        
        skills.add("czytanie i pisanie / zwinne palce");
        skills.add("gadanina / czytanie z warg");
        skills.add("mocna głowa");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("rzemiosło (gotowanie)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / kislevski / staroświatowy / tileański)");
        
        abilities.add("etykieta / łotrzyk");
        abilities.add("ogłuszanie");
        abilities.add("żyłka handlowa / bijatyka");
        
        equipment.add("karczma");
        equipment.add("jeden albo więcej służących");
    }
}
