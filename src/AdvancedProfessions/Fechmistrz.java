package AdvancedProfessions;

import GeneratorNPC.*;

public class Fechmistrz extends Profession {
    public Fechmistrz() {
        name = "Fechmistrz";
        
        wW = "+40";
        uS = "+40";
        k = "+25";
        odp = "+25";
        zr = "+30";
        sW = "+20";
        a = "+2";
        zyw = "+8";
        
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("wycena");
        skills.add("zastraszanie");
        
        abilities.add("artylerzysta");
        abilities.add("bardzo szybki (+1 Sz) / szybki refleks (+5 Zr)");
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("błyskawiczny blok");
        abilities.add("broń specjalna (dowolne trzy)");
        abilities.add("strzał precyzyjny");
        abilities.add("szybkie wyciągnięcie");
        abilities.add("zapasy");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("dowolne sześć sztuk broni najlepszej jakości");
    }
}
