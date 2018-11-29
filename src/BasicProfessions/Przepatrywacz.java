package BasicProfessions;

import GeneratorNPC.*;

public class Przepatrywacz extends Profession {
    public Przepatrywacz(){
        name = "Przepatrywacz";
        
        wW = "+5";
        uS = "+10";
        zr = "+10";
        inte = "+10";
        sW = "+10";
        zyw = "+2";
        
        skills.add("jeździectwo");
        skills.add("nawigacja");
        skills.add("opieka nad zwierzętami");
        skills.add("przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("tropienie");
        
        abilities.add("broń specjalna (unieruchamiająca)");
        abilities.add("opanowanie (+5 SW) / bardzo silny (+5 K)");
        abilities.add("wyczucie kierunku");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("łuk i 10 strzał / kusza i 10 bełtów");
        armament.add("bicz / arkan");
        armament.add("sieć");
        armament.add("tarcza");
        
        equipment.add("koń z siodłem i uprzężą");
        equipment.add("10 metrów liny");
    }
}
