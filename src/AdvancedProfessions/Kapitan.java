package AdvancedProfessions;

import GeneratorNPC.*;

public class Kapitan extends Profession {
    public Kapitan() {
        name = "Kapitan";
        
        wW = "+25";
        uS = "+20";
        k = "+15";
        odp = "+20";
        zr = "+20";
        inte = "+20";
        sW = "+25";
        ogd = "+30";
        a = "+2";
        zyw = "+6";
        
        skills.add("dowodzenie");
        skills.add("nauka (strategia / taktyka)");
        skills.add("pływanie");
        skills.add("rzemiosło (kartografia / szkutnictwo)");
        skills.add("spostrzegawczość");
        skills.add("tresura");
        skills.add("unik");
        skills.add("wiedza (dowolne trzy)");
        skills.add("znajomość języka (dowolne trzy)");
        skills.add("żeglarstwo");
        
        abilities.add("błyskawiczny blok / brawura");
        abilities.add("broń specjalna (szermiercza)");
        abilities.add("obieżyświat");
        abilities.add("rozbrajanie");
        abilities.add("silny cios");
        
        armor.add("skórzana kurta (korpus, ręce: 2)");
        
        armament.add("rapier");
        
        equipment.add("luneta");
        equipment.add("żaglowiec");
    }
}
