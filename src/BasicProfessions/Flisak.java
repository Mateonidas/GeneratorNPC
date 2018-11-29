package BasicProfessions;

import GeneratorNPC.*;

public class Flisak extends Profession{
    public Flisak(){
        name = "Flisak";
        
        wW = "+10";
        uS = "+5";
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        zyw = "+2";
        
        skills.add("mocna głowa / plotkowanie");
        skills.add("nawigacja");
        skills.add("pływanie");
        skills.add("sekretny język (łowców) / znajomość języka (kislevski)");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("wiedza (Imperium / Kislev)");
        skills.add("wioślarstwo");
        skills.add("żeglarstwo");
        
        abilities.add("obieżyświat");
        abilities.add("wyczucie kierunku");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        equipment.add("łódź wiosłowa");
    }
}