package BasicProfessions;

import GeneratorNPC.*;

public class Sluga extends Profession {
    public Sluga(){
        name = "Sługa";
        
        wW = "+5";
        k = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+10";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("czytanie i pisanie / zwinne palce");
        skills.add("gadanina");
        skills.add("opieka nad zwierzętami / rzemiosło (gotowanie)");
        skills.add("plotkowanie");
        skills.add("powożenie / przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie / wycena");
        skills.add("unik");
        
        abilities.add("czuły słuch / chodu!");
        abilities.add("etykieta / twardziel (+1 Żyw)");
        abilities.add("niezwykle odporny (+5 Odp) / szybki refleks (+5 Zr)");
        
        equipment.add("ubranie dobrej jakości");
        equipment.add("manierka");
        equipment.add("krzesiwo i hubka");
        equipment.add("latarnia sztormowa");
        equipment.add("olej do latarni");
    }
}
