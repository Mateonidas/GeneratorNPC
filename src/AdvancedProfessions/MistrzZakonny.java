package AdvancedProfessions;

import GeneratorNPC.*;

public class MistrzZakonny extends Profession {
    public MistrzZakonny() {
        name = "Mistrz Zakonny";
        
        wW = "+35";
        uS = "+10";
        k = "+20";
        odp = "+20";
        zr = "+20";
        inte = "+15";
        sW = "+25";
        ogd = "+15";
        a = "+2";
        zyw = "+8";
        
        skills.add("czytanie i pisanie");
        skills.add("dowodzenie");
        skills.add("jeździectwo");
        skills.add("nauka (genealogia / heraldyka / teologia)");
        skills.add("nauka (strategia / taktyka");
        skills.add("przekonywanie");
        skills.add("sekretne znaki (zwiadowców / rycerzy zakonnych)");
        skills.add("sekretny język (bitewny)");
        skills.add("spostrzegawczość");
        skills.add("tresura");
        skills.add("unik");
        skills.add("wiedza (dowolne trzy)");
        skills.add("znajomość języka (bretoński / estalijski / kislevski / tileański)");
        
        abilities.add("błyskawiczny blok");
        abilities.add("broń specjalna (parująca)");
        abilities.add("broń specjalna (szermiercza)");
        abilities.add("etykieta");
        abilities.add("morderczy atak");
        abilities.add("obieżyświat");
        abilities.add("odwaga");
        abilities.add("ogłuszanie");
        
        armor.add("zbroja płytowa najlepszej jakości (wszystkie: 5)");
        
        armament.add("rapier / szpada");
        armament.add("puklerz / lewak");
        
        equipment.add("symbol religijny");
        equipment.add("50 zk");
    }
}
