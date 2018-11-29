package BasicProfessions;

import GeneratorNPC.*;

public class Straznik extends Profession {
    public Straznik(){
        name = "Strażnik";
        
        wW = "+10";
        uS = "+5";
        k = "+5";
        zr = "+5";
        inte = "+10";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("nauka (prawo)");
        skills.add("plotkowanie");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("tropienie");
        skills.add("unik");
        skills.add("zastraszanie");
        
        abilities.add("ogłuszenie");
        abilities.add("opanowanie (+5 SW) / błyskotliwość (+5 Int)");
        abilities.add("rozbrajanie / bijatyka");
        abilities.add("silny cios");
        
        armor.add("skórzana kurta (korpus, ręce: 2)");
        
        equipment.add("mundur");
        equipment.add("latarnia na drągu");
        equipment.add("olej do latarni");
    }
}
