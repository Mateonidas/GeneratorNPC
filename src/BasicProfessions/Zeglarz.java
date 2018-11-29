package BasicProfessions;

import GeneratorNPC.*;

public class Zeglarz extends Profession {
    public Zeglarz(){
        name = "Żeglarz";
        
        wW = "+10";
        uS = "+5";
        k = "+10";
        zr = "+10";
        a = "+1";
        zyw = "+2";
        
        skills.add("mocna głowa / spostrzegawczość");
        skills.add("pływanie");
        skills.add("unik");
        skills.add("wiedza (Bretonia / Norksa / Tilea / Jałowa Kraina)");
        skills.add("wioślarstwo");
        skills.add("wspinaczka");
        skills.add("znajomość języka (bretoński / norski / tileański)");
        skills.add("żeglarstwo");
        
        abilities.add("obieżyświat");
        abilities.add("silny cios / brawura");
        abilities.add("twardziel (+1 Żyw) / bijatyka");
        
        armor.add("skórzany kaftan (korpus: 1)");
        
        equipment.add("butelka gorzałki kiepskiej jakości");
    }
}
