package BasicProfessions;

import GeneratorNPC.*;

public class Guslarz extends Profession{
    public Guslarz(){
        name = "Guślarz";
        
        odp = "+5";
        zr = "+5";
        inte = "+5";
        sW = "+10";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("leczenie / hipnoza");
        skills.add("opieka nad zwierzętami / targowanie");
        skills.add("oswajanie / rzemiosło (aptekarstwo)");
        skills.add("przekonywanie / zastraszanie");
        skills.add("przeszukiwanie");
        skills.add("splatanie magii");
        skills.add("spostrzegawczość");
        skills.add("wykrywanie magii");
        
        abilities.add("gusła");
        abilities.add("magia prosta (gusła)");
        
        equipment.add("mikstura lecznicza");
        equipment.add("płaszcz z kapturem");
    }
}