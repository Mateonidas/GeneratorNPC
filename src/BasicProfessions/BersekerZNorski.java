package BasicProfessions;

import GeneratorNPC.*;

public class BersekerZNorski extends Profession{
    public BersekerZNorski(){
        name = "Berseker z Norski";
        
        wW = "+15";
        k = "+10";
        odp = "+10";
        sW = "+10";
        zyw = "+2";
        
        skills.add("kuglarstwo (gawędziarstwo)");
        skills.add("mocna głowa");
        skills.add("pływanie");
        skills.add("wiedza (Norska)");
        skills.add("zastraszanie");
        skills.add("znajomość języka (norski)");
        
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("groźny");
        abilities.add("szał bojowy");
        abilities.add("szybkie wyciągnięcie");
        
        armor.add("skórzany kaftan (korpus: 1)");
        
        armament.add("broń dwuręczna / tarcza");
        
        equipment.add("butelka gorzałki");
    }
}