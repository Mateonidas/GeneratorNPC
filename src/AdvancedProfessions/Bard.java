package AdvancedProfessions;

import GeneratorNPC.*;

public class Bard extends Profession {
    public Bard() {
        name = "Bard";
        
        wW = "+10";
        uS = "+10";
        zr = "+15";
        inte = "+10";
        sW = "+5";
        ogd = "+25";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("kuglarstwo (muzykalność)");
        skills.add("kuglarstwo (śpiew)");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczośc");
        skills.add("wiedza (dowolne dwie)");
        skills.add("znajomość języka (bretoński / eltharin / tileański)");
        
        abilities.add("etykieta");
        abilities.add("przemawianie");
        
        equipment.add("kostium");
        equipment.add("instrument muzyczny (lutnia / mandolina)");
    }
}
