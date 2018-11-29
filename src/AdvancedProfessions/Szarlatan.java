package AdvancedProfessions;

import GeneratorNPC.*;

public class Szarlatan extends Profession {
    public Szarlatan() {
        name = "Szarlatan";
        
        wW = "+10";
        uS = "+10";
        k = "+5";
        odp = "+10";
        zr = "+15";
        inte = "+15";
        sW = "+15";
        ogd = "+25";
        zyw = "+4";
        
        skills.add("charakteryzacja");
        skills.add("gadanina");
        skills.add("hazard");
        skills.add("plotkowanie");
        skills.add("przekonywanie");
        skills.add("sekretny język (złodziejski)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Bretonia / Tilea)");
        skills.add("wycena");
        skills.add("znajomość jęzka (bretoński / tileański)");
        skills.add("znajomość języka (staroświatowy)");
        skills.add("zwinne palce");
        
        abilities.add("chodu!");
        abilities.add("intrygant / łotrzyk");
        abilities.add("naśladowca");
        abilities.add("obieżyświat");
        abilities.add("przemawianie");
        
        equipment.add("6 kompletów ubrań dobrej jakości");
        equipment.add("4 komplety ubrań najlepszej jakości");
        equipment.add("podrobione dokumenty");
        equipment.add("4 butelki różnokolorowej wody");
        equipment.add("4 butelki róznokolorowego proszku");
    }
}
