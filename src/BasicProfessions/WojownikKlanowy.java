package BasicProfessions;

import GeneratorNPC.*;

public class WojownikKlanowy extends Profession {
    public WojownikKlanowy(){
        name = "Wojownik klanowy";
        
        wW = "+5";
        uS = "+5";
        zr = "+10";
        inte = "+10";
        sW = "+5";
        zyw = "+2";
        
        skills.add("leczenie / przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("tropienie");
        skills.add("ukrywanie się");
        skills.add("unik");
        skills.add("wspinaczka");
        
        abilities.add("błyskawiczne przeładowanie / urodzony wojownik (+5 WW)");
        abilities.add("strzelec wyborowy (+5 US) / wędrowiec");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("elfi łuk i 10 strzał");
    }
}
