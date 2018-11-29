package BasicProfessions;

import GeneratorNPC.*;

public class UczenCzarodzieja extends Profession {
    public UczenCzarodzieja(){
        name = "Uczeń czarodzieja";
        
        zr = "+5";
        inte = "+10";
        sW = "+15";
        ogd = "+5";
        zyw = "+2";
        mag = "+1";
        
        skills.add("czytani i pisanie");
        skills.add("język tajemny (magiczny)");
        skills.add("nauka (magia)");
        skills.add("przeszukiwanie");
        skills.add("splatanie magii");
        skills.add("spostrzegawczość");
        skills.add("wykrywanie magii");
        skills.add("znajomość języka (klasyczny)");
        
        abilities.add("błyskotliwość (+5 Int) / niezwykle odporny (+5 Odp)");
        abilities.add("magia prosta (tajemna)");
        abilities.add("zmysł magii / dotyk mocy");
        
        armament.add("kij");
        
        equipment.add("plecak");
        equipment.add("księga wiedzy tajemnej");
    }
}
