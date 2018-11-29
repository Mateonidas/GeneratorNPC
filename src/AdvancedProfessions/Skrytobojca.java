package AdvancedProfessions;

import GeneratorNPC.*;

public class Skrytobojca extends Profession {
    public Skrytobojca() {
        name = "Skrytobójca";
        
        wW = "+25";
        uS = "+25";
        k = "+10";
        odp = "+10";
        zr = "+30";
        inte = "+20";
        sW = "+10";
        ogd = "+20";
        a = "+2";
        zyw = "+4";
        
        skills.add("charakteryzacja");
        skills.add("plotkowanie");
        skills.add("sekretne znaki (złodziei)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("śledzenie");
        skills.add("ukrywanie się");
        skills.add("warzenie trucizn");
        skills.add("wspinaczka");
        
        abilities.add("bijatyka");
        abilities.add("błyskawiczny blok");
        abilities.add("brawura");
        abilities.add("broń specjalna (parująca)");
        abilities.add("broń specjalna (rzucana)");
        abilities.add("broń specjalna (unieruchamiająca)");
        abilities.add("łotrzyk");
        abilities.add("strzał mierzony");
        abilities.add("szybkie wyciągnięcie");
        
        armament.add("sieć");
        armament.add("4 noże do rzucania");
        
        equipment.add("kotwiczka do wspianania");
        equipment.add("10 metrów liny");
        equipment.add("porcja trucizny (dowolnej)");
    }
}
