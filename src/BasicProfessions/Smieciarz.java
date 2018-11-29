package BasicProfessions;

import GeneratorNPC.*;

public class Smieciarz extends Profession {
    public Smieciarz(){
        name = "Smieciarz";
        
        wW = "+5";
        k = "+5";
        odp = "+10";
        zr = "+5";
        sW = "+5";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("opieka nad zwierzętami");
        skills.add("powożenie");
        skills.add("przekonywanie / plotkowanie");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium)");
        skills.add("wycena");
        
        abilities.add("opanowanie (+5 SW) / łotrzyk");
        abilities.add("twardziel (+1 Żyw) / odporność na choroby");
        
        equipment.add("wózek");
        equipment.add("3 worki");
    }
}
