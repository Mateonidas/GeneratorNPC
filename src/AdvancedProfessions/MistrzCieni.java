package AdvancedProfessions;

import GeneratorNPC.*;

public class MistrzCieni extends Profession {
    public MistrzCieni() {
        name = "Mistrz cieni";
        
        wW = "+20";
        uS = "+20";
        k = "+10";
        odp = "+10";
        zr = "+40";
        inte = "+25";
        sW = "+20";
        ogd = "+25";
        a = "+1";
        zyw = "+6";
        
        skills.add("charakteryzacja");
        skills.add("czytanie i pisanie");
        skills.add("hazard / czytanie z warg");
        skills.add("otwieranie zamków");
        skills.add("plotkowanie");
        skills.add("pływanie");
        skills.add("przekonywanie");
        skills.add("przeszukiwanie");
        skills.add("sekretne znaki (złodziei)");
        skills.add("sekretny język (złodziejski)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("ukrywanie się");
        skills.add("unik");
        skills.add("wspinaczka");
        skills.add("wycena");
        skills.add("zwinne palce");
        
        abilities.add("bijatyka / brawura");
        abilities.add("broń specjalna (kusze)");
        abilities.add("broń specjalna (rzucana)");
        abilities.add("łotrzyk");
        abilities.add("wykrywanie pułapek");
        
        armament.add("kusza pistoletowa i 10 bełtów");
        armament.add("2 topory do rzucania / 2 młoty do rzucania / 3 noże do rzucania / 3 gwiazdki do rzucania");
        
        equipment.add("wytrychy najlepszej jakości");
        equipment.add("płaszcz z kapturem");
        equipment.add("worek");
        equipment.add("10 metrów liny najlepszej jakości");
    }
}
