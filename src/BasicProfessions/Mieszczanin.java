package BasicProfessions;

import GeneratorNPC.*;

public class Mieszczanin extends Profession{
    public Mieszczanin(){
        name = "Mieszczanin";
        
        wW = "+5";
        zr = "+5";
        inte = "+10";
        sW = "+5";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("plotkowanie / czytanie i pisanie");
        skills.add("powożenie");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium) / mocna głowa");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / kislevski / tileański)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("błyskotliwość (+5 Int) / charyzmatyczny (+5 Ogd)");
        abilities.add("żyłka handlowa");
        
        equipment.add("ubranie dobrej jakości");
        equipment.add("liczydło");
        equipment.add("latarnia");
    }
}