package AdvancedProfessions;

import GeneratorNPC.*;

public class LowcaWampirow extends Profession {
    public LowcaWampirow() {
        name = "Łowca wampierów";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+20";
        zr = "+15";
        inte = "+15";
        sW = "+20";
        a = "+1";
        zyw = "+4";
        
        skills.add("nauka (historia / nekromancja)");
        skills.add("przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("śledzenie");
        skills.add("tropienie");
        skills.add("ukrywanie się");
        skills.add("unik");
        skills.add("wiedza (Imperium)");
        skills.add("wspinaczka");
        skills.add("znajomość języka (klasyczny)");
        
        abilities.add("broń specjalna (kusze)");
        abilities.add("grotołaz");
        abilities.add("morderczy atak");
        abilities.add("odwaga");
        abilities.add("silny cios");
        abilities.add("strzał precyzyjny / błyskawiczne przeładowanie");
        
        armor.add("kolcza zbroja (wszystkie: 2)");
        
        armament.add("kusza samopowtarzalna i 10 bełtów");
        
        equipment.add("woda święcona");
        equipment.add("4 kołki");
        
    }
}
