package BasicProfessions;

import GeneratorNPC.*;

public class Woznica extends Profession {
    public Woznica(){
        name = "Woźnica";
        
        wW = "+5";
        uS = "+10";
        zr = "+10";
        sW = "+5";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("leczenie / jeździectwo");
        skills.add("nawigacja");
        skills.add("opieka nad zwierzętami");
        skills.add("plotkowanie / targowanie");
        skills.add("powożenie");
        skills.add("sekretne znaki (łowców)");
        skills.add("spostrzegawczość");
        skills.add("znajomość języka (bretoński / kislevski / tileański");
        
        abilities.add("broń specjalna (palna)");
        abilities.add("szybkie wyciągnięcie / obieżyświat");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("garłacz z zapasem amunicji na 10 strzałów");
        
        equipment.add("róg woźnicy");
    }
}
