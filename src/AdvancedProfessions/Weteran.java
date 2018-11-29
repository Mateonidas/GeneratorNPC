package AdvancedProfessions;

import GeneratorNPC.*;

public class Weteran extends Profession {
    public Weteran() {
        name = "Weteran";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+10";
        zr = "+15";
        sW = "+15";
        a = "+1";
        zyw = "+6";
        
        skills.add("hazard");
        skills.add("mocna głowa");
        skills.add("plotkowanie");
        skills.add("sekretny język (bitewny)");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("wiedza (Imperium)");
        skills.add("zastraszanie");
        
        abilities.add("błyskawiczne przeładowanie / morderczy atak");
        abilities.add("broń specjalna (dowolne dwie)");
        abilities.add("niezwykle odporny (+5 Odp) / bardzo silny (+5 K)");
        abilities.add("strzał precyzyjny / silny cios");
        
        armor.add("zbroja kolcza (wszystkie: 3)");
        
        armament.add("dwie sztuki broni");
        
        equipment.add("butelka spirytusu najlepszej jakości / gorzałka najlepszej jakości");
    }
}
