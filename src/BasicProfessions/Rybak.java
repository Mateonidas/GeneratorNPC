package BasicProfessions;

import GeneratorNPC.*;

public class Rybak extends Profession {
    public Rybak(){
        name = "Rybak";
        
        uS = "+5";
        k = "+10";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        zyw = "+2";
        
        skills.add("mocna głowa / targowanie");
        skills.add("nawigacja / rzemiosło (handel)");
        skills.add("pływanie");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("wiedza (Imperium / Jałowa Kraina)");
        skills.add("wioślarstwo");
        skills.add("znajomość języka (staroświatowy / norski)");
        skills.add("żeglarstwo");
        
        abilities.add("twardziel (+1 Żyw) / błyskotliwość (+5 Int)");
        abilities.add("wyczucie kierunku / bijatyka");
        
        armament.add("włócznia");
        armament.add("sieć");
        
        equipment.add("lina z kotwiczką");
    }
}
