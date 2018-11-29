package AdvancedProfessions;

import GeneratorNPC.*;

public class Bosman extends Profession {
    public Bosman() {
        name = "Bosman";
        
        wW = "+15";
        uS = "+15";
        k = "+10";
        odp = "+15";
        zr = "+10";
        inte = "+10";
        sW = "+10";
        ogd = "+10";
        a = "+1";
        zyw = "+4";
        
        skills.add("dowodzenie");
        skills.add("hazard");
        skills.add("mocna głowa");
        skills.add("plotkowanie");
        skills.add("pływanie");
        skills.add("rzemiosło (szkutnictwo)");
        skills.add("unik");
        skills.add("wiedza (dowolne dwie)");
        skills.add("wioślarstwo");
        skills.add("zastraszanie");
        skills.add("znajomość języka (bretoński / kislevski / norski)");
        skills.add("żeglarstwo");
        
        abilities.add("bijatyka");
        abilities.add("obieżyświat");
        abilities.add("odporność na choroby");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
    }
}
