package AdvancedProfessions;

import GeneratorNPC.*;

public class ZabojcaOlbrzymow extends Profession {
    public ZabojcaOlbrzymow() {
        name = "Zabójca olbrzymów";
        
        wW = "+25";
        k = "+15";
        odp = "+15";
        zr = "+10";
        sW = "+20";
        a = "+1";
        zyw = "+6";
        
        skills.add("mocna głowa");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("wiedza (dowolna)");
        skills.add("zastraszanie");
        
        abilities.add("broń specjalna (korbacze)");
        abilities.add("morderczy atak");
        abilities.add("nieustraszony");
        abilities.add("odporność na trucizny");
        
        armament.add("broń dwuręczna");
    }
}
