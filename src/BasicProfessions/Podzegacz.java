
package BasicProfessions;

import GeneratorNPC.*;

public class Podzegacz extends Profession{
    public Podzegacz(){
        name = "Podżegacz";
        
        wW = "+5";
        uS = "+5";
        zr = "+5";
        inte = "+10";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("nauka (historia) / plotkowanie");
        skills.add("nauka (prawo) / wiedza (Imperium)");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("ukrywanie się");
        skills.add("znajomość języka (bretoński / tileański)");
        skills.add("znajomość języka(staroświatowy)");
        
        abilities.add("chodu");
        abilities.add("opanowanie (+5 SW) / bijatyka");
        abilities.add("przemawianie");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
        
        equipment.add("Ubranie dobrej jakości");
        equipment.add("2k10 ulotek różnej treści");
    }
}
