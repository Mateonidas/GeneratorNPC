package AdvancedProfessions;

import GeneratorNPC.*;

public class Medyk extends Profession {
    public Medyk() {
        name = "Medyk";
        
        k = "+10";
        odp = "+10";
        zr = "+15";
        inte = "+30";
        sW = "+20";
        ogd = "+15";
        zyw = "+4";
        
        skills.add("czytanie i pisanie");
        skills.add("leczenie");
        skills.add("nauka (anatomia)");
        skills.add("plotkowanie");
        skills.add("rzemiosło (aptekarstwo)");
        skills.add("spostrzegawczość");
        skills.add("warzenie trucizn");
        skills.add("znajomość języka (klasyczny)");
        
        abilities.add("chirurgia");
        abilities.add("odporność na choroby");
        abilities.add("ogłuszanie");
        
        equipment.add("4 mikstury lecznicze");
        equipment.add("narzędzia (instrumenty lecznicze)");
    }
}
