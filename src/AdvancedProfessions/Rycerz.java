package AdvancedProfessions;

import GeneratorNPC.*;

public class Rycerz extends Profession {
    public Rycerz() {
        name = "Rycerz";
        
        wW = "+25";
        k = "+15";
        odp = "+15";
        zr = "+15";
        inte = "+5";
        sW = "+15";
        ogd = "+5";
        
        skills.add("jeździectwo");
        skills.add("nauka (genealogia / heraldyka / teologia)");
        skills.add("nauka (strategia / taktyka)");
        skills.add("sekretny język (bitewny)");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("znajomość języka (dowolne dwa)");
        
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("broń specjalna (kawaleryjska)");
        abilities.add("broń specjalna (korbacze)");
        abilities.add("silny cios");
        
        armor.add("zbroja płytowa (wszystkie: 5)");
        
        armament.add("korbacz / morgensztern");
        armament.add("kopia");
        armament.add("tarcza");
        
        equipment.add("rumak z siodłem i uprzężą");
        equipment.add("symbol religijny");
        equipment.add("25 zk");
    }
}
