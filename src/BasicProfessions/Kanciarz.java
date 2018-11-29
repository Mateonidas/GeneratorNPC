package BasicProfessions;

import GeneratorNPC.*;

public class Kanciarz extends Profession{
    public Kanciarz(){
        name = "Kanciarz";
        
        wW = "+5";
        uS = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+5";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("gadanina");
        skills.add("hazard / sekretne znaki (złodziei)");
        skills.add("kuglarstwo (aktorstwo / gawędziarstwo)");
        skills.add("plotkowanie / targowanie");
        skills.add("przekonywanie");
        skills.add("przeszukiwanie / sekretny język (złodziejski)");
        skills.add("spostrzegawczość");
        skills.add("wycena");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("chodu! / łotrzyk");
        abilities.add("przemawianie");
        abilities.add("szczęście / szósty zmysł");
        
        equipment.add("ubranie najlepszej jakości / zestaw do kości do gry / talia kart");
        equipment.add("1k10 zk");
    }
}