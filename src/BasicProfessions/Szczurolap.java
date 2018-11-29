package BasicProfessions;

import GeneratorNPC.*;

public class Szczurolap extends Profession {
    public Szczurolap(){
        name = "Szczurołap";
        
        wW = "+5";
        uS = "+10";
        odp = "+5";
        zr = "+10";
        sW = "+10";
        zyw = "+2";
        
        skills.add("opieka na zwierzętami");
        skills.add("przeszukiwanie");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("tresura");
        skills.add("ukrywanie się");
        skills.add("zastawianie pułapek");
        
        abilities.add("broń specjalna (proca)");
        abilities.add("grotołaz");
        abilities.add("odporność na choroby");
        abilities.add("odporność na trucizny");
        
        armament.add("proca z amunicją");
        
        equipment.add("4 pułapki na szczury");
        equipment.add("drąg z martwymi szczurami (1k10)");
        equipment.add("mały ale zajadły pies");
    }
}
