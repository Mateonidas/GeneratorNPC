package BasicProfessions;

import GeneratorNPC.*;

public class StraznikPol extends Profession {
    public StraznikPol(){
        name = "Strażnik pól";
        
        wW = "+5";
        uS = "+10";
        odp = "+5";
        zr = "+10";
        sW = "+10";
        zyw = "+2";
        
        skills.add("nauka (nekromancja) / wiedza (Imperium)");
        skills.add("przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("tropienie");
        skills.add("ukrywanie się");
        
        abilities.add("bardzo szybki (+1 Sz) / błyskotliwość (+5 Int)");
        abilities.add("strzał precyzyjny / błyskawiczne przeładowanie");
        abilities.add("wędrowiec / szybkie wyciągnięcie");
        
        armament.add("proca z amunicją");
        
        equipment.add("kuc z siodłem i uprzężą");
        equipment.add("latarnia");
        equipment.add("olej do latarni");
        equipment.add("łopata");
    }
}
