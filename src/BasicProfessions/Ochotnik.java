package BasicProfessions;

import GeneratorNPC.*;

public class Ochotnik extends Profession{
    public Ochotnik(){
        name = "Ochotnik";
        
        wW = "+10";
        uS = "+5";
        k = "+5";
        odp = "+5";
        zr = "+10";
        zyw = "+2";
        
        skills.add("hazard / plotkowanie");
        skills.add("opieka nad zwierzętami");
        skills.add("powożenie / pływanie");
        skills.add("przeszukiwanie");
        skills.add("rzemiosło (dowolne)");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("unik");
        
        abilities.add("broń specjalna (drzewcowa) / błyskawiczne przeładowanie");
        abilities.add("silny cios");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        armor.add("skórzany hełm (głowa: 1)");
        
        armament.add("halabarda / łuk i 10 strzał");
        
        equipment.add("mundur");
    }
}