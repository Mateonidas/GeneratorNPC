package BasicProfessions;

import GeneratorNPC.*;

public class Goniec extends Profession{
    public Goniec(){
        name = "Goniec";
        
        wW = "+10";
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+5";
        zyw = "+2";
        sz = "+1";
        
        skills.add("nawigacja");
        skills.add("pływanie");
        skills.add("sekretne znaki (zwiadowców)");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("unik");
        
        abilities.add("bardzo szybki (+1 Sz) / szósty zmysł");
        abilities.add("błyskawiczne przeładowanie");
        abilities.add("chodu!");
        abilities.add("niezwykle odporny (+5 Odp) / bardzo silny (+5 K)");
        abilities.add("wyczucie kierunku");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        armament.add("kusza i 10 bełtów");
        
        equipment.add("mikstura lecznicza");
        equipment.add("talizman szczęścia");
    }
}