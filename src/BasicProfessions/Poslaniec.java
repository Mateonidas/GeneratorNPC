package BasicProfessions;

import GeneratorNPC.*;

public class Poslaniec extends Profession{
    public Poslaniec(){
        name = "Posłaniec";
        
        wW = "+5";
        uS = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+5";
        zyw = "+2";
        
        skills.add("jeździectwo");
        skills.add("nawigacja");
        skills.add("opieka nad zwierzętamia");
        skills.add("pływanie");
        skills.add("sekretne znaki (zwiadowców)");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("wiedza (Imeprium / Jałowa Kraina) / plotkowanie");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("obieżyświat");
        abilities.add("wyczucie kierunku");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("tarcza");
        
        equipment.add("koń z siodłem i uprzężą (albo kuc dla niziołków)");
        equipment.add("tuba na mapy");
    }
}
