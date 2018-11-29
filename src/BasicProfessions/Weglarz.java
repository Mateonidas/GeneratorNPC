package BasicProfessions;

import GeneratorNPC.*;

public class Weglarz extends Profession {
    public Weglarz(){
        name = "Węglarz";
        
        wW = "+5";
        k = "+5";
        odp = "+5";
        zr = "+5";
        inte = "+5";
        sW = "+5";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("powożenie / plotkowanie");
        skills.add("przeszukiwanie");
        skills.add("sekretne znaki (łowców)");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("targowanie");
        skills.add("wiedza (Imperium) / ukrywanie się");
        skills.add("wspinaczka");
        
        abilities.add("błyskotliwość (+5 Int) / bardzo silny (+5 K)");
        abilities.add("chodu!");
        
        armament.add("topór / pałka");
        
        equipment.add("3 pochodnie");
        equipment.add("krzesiwo i hubka");
    }
}
