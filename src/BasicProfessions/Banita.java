package BasicProfessions;

import GeneratorNPC.*;

public class Banita extends Profession{
    public Banita(){
        name = "Banita";
        
        wW = "+10";
        uS = "+10";
        zr = "+10";
        inte = "+5";
        a = "+1";
        zyw = "+2";
        
        skills.add("opieka nad zwierzętami / wiedza (Imperium)");
        skills.add("plotkowanie / sekretne znak (złodziei)");
        skills.add("powożenie / jeździectwo");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("ukrywanie się");
        skills.add("unik");
        skills.add("wspinaczka");
        skills.add("zastawianie pułapek / pływanie");
        
        abilities.add("strzał mierzony / ogłuszanie");
        abilities.add("wędrowiec / łotrzyk");
        
        armor.add("skórzany kaftan (korpus: 1)");
        
        armament.add("łuk i 10 strzał");
        armament.add("tarcza");
    }
}