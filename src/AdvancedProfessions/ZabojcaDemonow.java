package AdvancedProfessions;

import GeneratorNPC.*;

public class ZabojcaDemonow extends Profession {
    public ZabojcaDemonow() {
        name = "Zabójca demonów";
        
        wW = "+40";
        k = "+30";
        odp = "+30";
        zr = "+20";
        sW = "+30";
        a = "+2";
        zyw = "+8";
        
        skills.add("mocna głowa");
        skills.add("unik");
        skills.add("wiedza (dowolne dwie)");
        skills.add("wspinaczka");
        skills.add("zastraszanie");
        
        abilities.add("błyskawiczny blok");
        abilities.add("niepokojący");
        
        armament.add("broń dwuręczna");
    }
}
