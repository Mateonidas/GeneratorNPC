package BasicProfessions;

import GeneratorNPC.*;

public class Gornik extends Profession{
    public Gornik(){
        name = "Górnik";
        
        wW = "+5";
        uS = "+5";
        k = "+10";
        odp = "+5";
        inte = "+5";
        sW = "+5";
        zyw = "+2";
        
        skills.add("nawigacja");
        skills.add("opieka nad zwierzętami");
        skills.add("rzemiosło (górnictwo / górnictwo odkrywkowe)");
        skills.add("spostrzegawczość");
        skills.add("ukrywanie się / powożenie");
        skills.add("wspinaczka");
        skills.add("wycena / sztuka przetrwania");
        
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("niezwykle odporny (+5 Odp) / urodzony wojownik (+5 WW)");
        abilities.add("wyczucie kierunku");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("dwuręczny kilof");
        
        equipment.add("kilof");
        equipment.add("łopata");
        equipment.add("latarnia sztormowa");
        equipment.add("olej do latarni");
        
    }
}