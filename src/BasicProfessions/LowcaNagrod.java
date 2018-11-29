package BasicProfessions;

import GeneratorNPC.*;

public class LowcaNagrod extends Profession{
    public LowcaNagrod(){
        name = "Łowca Nagród";
        
        wW = "+5";
        uS = "+10";
        k = "+5";
        zr = "+10";
        sW = "+5";
        zyw = "+2";
        
        skills.add("przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("śledzenie");
        skills.add("tropienie");
        skills.add("zastraszanie");
        
        abilities.add("broń specjalna (unieruchamiająca)");
        abilities.add("strzał mierzony / silny cios");
        abilities.add("strzelec wyborowy / ogłuszanie");
        abilities.add("wędrowiec");
        
        armor.add("skórzany kaftan (korpus: 1)");
        armor.add("skórzany hełm (głowa: 1)");
        
        armament.add("kusza i 10 bełtów");
        armament.add("sieć");
        
        equipment.add("kajdany");
        equipment.add("10 metrów liny");
        
    }
}