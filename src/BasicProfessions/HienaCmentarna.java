package BasicProfessions;

import GeneratorNPC.*;

public class HienaCmentarna extends Profession{
    public HienaCmentarna(){
        name = "Hiena Cmentarna";
        
        wW = "+10";
        zr = "+10";
        inte = "+10";
        sW = "+10";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("otwieranie zamków / skradanie się");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("ukrywanie się / sztuka przetrwania");
        skills.add("wiedza (Imperium) / sekretne znaki (złodziei)");
        skills.add("wspinaczka");
        skills.add("wycena");
        skills.add("znajomość języka (eltharin / khazalid / klasyczny)");
        
        abilities.add("szczęście / szósty zmysł");
        abilities.add("wykrywanie pułapek / grotołaz");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        equipment.add("łom");
        equipment.add("latarnia");
        equipment.add("olej do latarni");
        equipment.add("10 metrów liny");
        equipment.add("2 worki");
    }
}