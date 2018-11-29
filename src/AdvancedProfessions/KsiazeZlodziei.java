package AdvancedProfessions;

import GeneratorNPC.*;

public class KsiazeZlodziei extends Profession {
    public KsiazeZlodziei() {
        name = "Książę złodziei";
        
        wW = "+20";
        uS = "+20";
        k = "+15";
        odp = "+15";
        zr = "+20";
        inte = "+25";
        sW = "+20";
        ogd = "+30";
        a = "+1";
        zyw = "+6";
        
        skills.add("dowodzenie");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("sekretne znaki (złodziei)");
        skills.add("sekretny język (złodziejski)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("torturowanie");
        skills.add("unik");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("zastraszanie");
        
        abilities.add("broń specjalna (kusze / parująca)");
        abilities.add("groźny");
        abilities.add("łotrzyk");
        abilities.add("odporność na trucizny");
        abilities.add("przemawianie");
        abilities.add("szósty zmysł");
        abilities.add("żyłka handlowa / intrygant");
        
        armament.add("kusza pistoletowa i 10 bełtów / łamacz mieczy");
        
        equipment.add("ubranie najlepszej jakości");
        equipment.add("odtrutki");
        equipment.add("100 zk");
        equipment.add("organizacja przestępcza");
    }
}
