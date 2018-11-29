package BasicProfessions;

import GeneratorNPC.*;

public class Przewoznik extends Profession {
    public Przewoznik(){
        name = "Przewoźnik";
        
        wW = "+5";
        uS = "+5";
        k = "+10";
        odp = "+5";
        zr = "+5";
        inte = "+5";
        zyw = "+2";
        
        skills.add("plotkowanie / zastraszanie");
        skills.add("pływanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wiedza (Imperium)");
        skills.add("wioślarstwo");
        skills.add("wycena / sekretny język (łowców)");
        
        abilities.add("broń specjalna (palna) / bijatyka");
        abilities.add("strzelecc wyborowy (+5 US) / charyzmatyczny (+5 Ogd)");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("kusza i 10 bełtów / garłacz z zapasem amunicji na 10 strzałów");
    }
}
