package BasicProfessions;

import GeneratorNPC.*;

public class PorywaczZwlok extends Profession{
    public PorywaczZwlok(){
        name = "Porywacz Zwłok";
        
        wW = "+5";
        uS = "+5";
        k = "+5";
        zr = "+10";
        sW = "+10";
        zyw = "+2";
        
        skills.add("plotkowawnie / targowanie");
        skills.add("powożenie");
        skills.add("przeszukiwanie");
        skills.add("sekretne znaki (złodziei)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("wspinaczka");
        
        abilities.add("chodu!");
        abilities.add("łotrzyk / odporność psychiczna");
        abilities.add("odporność na choroby");
        
        equipment.add("latarnia");
        equipment.add("olej do latarni");
        equipment.add("kilof");
        equipment.add("łopata");
        equipment.add("worek");
    }
}
    
