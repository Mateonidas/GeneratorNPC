package AdvancedProfessions;

import GeneratorNPC.*;

public class MistrzGildii extends Profession {
    public MistrzGildii() {
        name = "Mistrz Gildii";
        
        wW = "+10";
        uS = "+10";
        odp = "+10";
        zr = "+15";
        inte = "+30";
        sW = "+20";
        ogd = "+35";
        a = "+1";
        zyw = "+5";
        
        skills.add("dowodzenie");
        skills.add("nauka (historia)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("rzemiosło (dowolne dwa)");
        skills.add("sekretny język (gildii)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / estalijski / kislevski / norski)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("etykieta");
        abilities.add("poliglota");
        abilities.add("żyłka handlowa");
        
        equipment.add("przybory do pisania");
        equipment.add("100 zk");
        equipment.add("gildia kupiecka / złodziei");
    }
}
