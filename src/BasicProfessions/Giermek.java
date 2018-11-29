package BasicProfessions;

import GeneratorNPC.*;

public class Giermek extends Profession{
    public Giermek(){
        name = "Giermek";
        
        wW = "+10";
        uS = "+5";
        k = "+5";
        odp = "+5";
        zr = "+5";
        ogd = "+5";
        a = "+1";
        zyw = "+2";
        
        skills.add("jeździectwo");
        skills.add("nauka (genealogia / heraldyka) / wiedza (Bretonia)");
        skills.add("opieka nad zwierzętami");
        skills.add("przekonywanie/plotkowanie");
        skills.add("tresura");
        skills.add("unik");
        skills.add("znajomość języka (bretoński / staroświatowy)");
        
        abilities.add("broń specjalna (kawaleryjska)");
        abilities.add("etykieta");
        abilities.add("silny cios");
        
        armament.add("lanca");
        armament.add("tarcza");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("czepiec kolczy (głowa: 2)");
        
        equipment.add("koń z siodłem i uprzężą");
    }
}