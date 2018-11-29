package BasicProfessions;

import GeneratorNPC.*;

public class Lowca extends Profession{
    public Lowca(){
        name = "Łowca";
        
        uS = "+15";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        zyw = "+3";
        
        skills.add("przeszukiwanie / pływanie");
        skills.add("sekretne znaki (łowców)");
        skills.add("skradanie się / zastawianie pułapek");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("tropienie");
        skills.add("ukrywanie się");
        
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("strzelec wyborowy / wędrowiec");
        abilities.add("szybki refleks (+5 Zr) / niezwykle odporny (+5 Odp)");
        abilities.add("twardziel (+1 Żyw) / broń specjalna (długi łuk)");
        
        armament.add("długi łuk i 10 strzał");
        
        equipment.add("2 potrzaski / wnyki na zwierzęta");
        equipment.add("odtrutki");
    }
}