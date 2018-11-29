package BasicProfessions;

import GeneratorNPC.*;

public class KozakKislevski extends Profession{
    public KozakKislevski(){
        name = "Kozak Kislevski";
        
        wW = "+10";
        uS = "+10";
        odp = "+10";
        sW = "+10";
        zyw = "+2";
        
        skills.add("hazard / targowanie");
        skills.add("mocna głowa");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("unik");
        skills.add("wiedza (Kislev)");
        skills.add("znajomość języka (kislevski)");
        
        abilities.add("broń specjalna (dwuręczna)");
        abilities.add("morderczy atak");
        
        armor.add("kolczuga (korpus, nogi: 2)");
        armor.add("skórzana kurta (korpus ręce: 1)");
        armor.add("skórzane nogawice (nogi: 1)");
        
        armament.add("łuk i 10 strzał");
        armament.add("dwuręczny topór");
        
    }
}