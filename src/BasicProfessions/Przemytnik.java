package BasicProfessions;

import GeneratorNPC.*;

public class Przemytnik extends Profession {
    public Przemytnik(){
        name = "Przemytnik";
        
        wW = "+5";
        uS = "+5";
        zr = "+10";
        inte = "+10";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("plotkowanie / sekretny język (złodziejski)");
        skills.add("pływanie");
        skills.add("powożenie");
        skills.add("przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wioślarstwo");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / kislevski) / sekretne znaki (złodziei)");
        
        abilities.add("żyłka handlowa / łotrzyk");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        equipment.add("koń pociągowy i wóz / łódź wiosłowa");
        equipment.add("2 pochodnie");
        
    }
}
