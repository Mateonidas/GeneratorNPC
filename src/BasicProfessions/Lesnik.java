package BasicProfessions;

import GeneratorNPC.*;

public class Lesnik extends Profession{
    public Lesnik(){
        name = "Leśnik";
        
        wW = "+10";
        k = "+10";
        zr = "+5";
        sW = "+10";
        zyw = "+3";
        
        skills.add("sekretne znaki (łowców)");
        skills.add("sekretny język (łowców)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("tropienie / zastawianie pułapek");
        skills.add("ukrywanie się");
        skills.add("wspinaczka");
        
        abilities.add("bardzo szybki (+1 Sz) / niezwykle odporny (+5 Odp)");
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("wędrowiec");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("dwuręczny topór");
        
        equipment.add("odtrutki");
    }
}