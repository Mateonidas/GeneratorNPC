package BasicProfessions;

import GeneratorNPC.*;

public class Skryba extends Profession {
    public Skryba(){
        name = "Skryba";
        
        zr = "+10";
        inte = "+10";
        sW = "+10";
        ogd = "+5";
        
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("nauka (dowolna)");
        skills.add("rzemiosło (kaligrafia)");
        skills.add("sekretny język (gildii)");
        skills.add("spostrzegawczość");
        skills.add("wiedza (Imperium) / plotkowanie");
        skills.add("znajomość języka (bretońsk)");
        skills.add("znajomość języka (klasyczny)");
        skills.add("znajomość języka (staroświatowy / tileański)");
        
        abilities.add("poliglota");
        
        equipment.add("noż");
        equipment.add("2 świece woskowe");
        equipment.add("5 zapałek");
        equipment.add("ilustrowana księga");
        equipment.add("przybory do pisania");
        equipment.add("wosk do pieczęci");
    }
}
