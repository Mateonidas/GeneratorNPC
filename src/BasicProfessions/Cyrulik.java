package BasicProfessions;

import GeneratorNPC.*;

public class Cyrulik extends Profession{
    public Cyrulik(){
        name = "Cyrulik";
        
        wW = "+5";
        zr = "+10";
        inte = "+10";
        sW = "+10";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("leczenie");
        skills.add("powożenie / pływanie");
        skills.add("przekonywanie");
        skills.add("rzemiosło (aptekarstwo)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("znajomość języka (bretoński / staroświatowy / tileański)");
        
        abilities.add("charyzmatyczny (+5 Ogd) / niezwykle odporny (+5 Odp)");
        abilities.add("chirurgia");
        abilities.add("odporność na choroby / błyskotliwość (+5 Int)");
        
        equipment.add("narzędzia (cyrulik)");
    }
}