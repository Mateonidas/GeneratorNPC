package BasicProfessions;

import GeneratorNPC.*;

public class Zak extends Profession {
    public Zak(){
        name = "Żak";
        
        zr = "+10";
        inte = "+10";
        sW = "+5";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("leczenie / przeszukiwanie");
        skills.add("nauka (dowolna)");
        skills.add("nauka (dowolna) / plotkowanie");
        skills.add("przekonywanie / mocna głowa");
        skills.add("spostrzegawczość");
        skills.add("znajomość języka (klasyczny)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("błyskotliwość (+5 Int) / charyzmatyczny (+5 Ogd)");
        abilities.add("etykieta / poliglota");
        abilities.add("obieżyświat / geniusz arytmetyczny");
        
        equipment.add("dwie księgi związane z wybraną dziedziną nauki");
        equipment.add("przybory do pisania");
    }
}
