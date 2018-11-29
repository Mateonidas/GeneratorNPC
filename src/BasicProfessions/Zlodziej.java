package BasicProfessions;

import GeneratorNPC.*;

public class Zlodziej extends Profession {
    public Zlodziej(){
        name = "Złodziej";
        
        wW = "+5";
        uS = "+5";
        zr = "+15";
        inte = "+5";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("czytanie i pisanie / zwinne palce");
        skills.add("hazard / otwieranie zamków");
        skills.add("przekonywanie / wspinaczka");
        skills.add("przeszukiwanie");
        skills.add("sekretny język (złodziejski) / sekretne znaki (złodziei)");
        skills.add("skradanie się");
        skills.add("spostrzegawczość");
        skills.add("ukrywanie się");
        skills.add("wycena / charakteryzacja");
        
        abilities.add("geniusz arytemtyczny / wykrywanie pułapek");
        abilities.add("ulicznik / łotrzyk");
        
        armor.add("skórzany kaftan (korpus: 1)");
        
        equipment.add("worek");
        equipment.add("wytrychy");
        equipment.add("10 metrów liny");
    }
}
