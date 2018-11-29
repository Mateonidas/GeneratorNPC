
package BasicProfessions;

import GeneratorNPC.*;

public class Paz extends Profession{
    public Paz(){
        name = "Paź";
        
        zr = "+10";
        inte = "+10";
        sW = "+5";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("gadanina");
        skills.add("nauka (genealogia / heraldyka)");
        skills.add("plotkowanie / znajomość języka (bretoński / staroświatowy)");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("wycena");
        
        abilities.add("etykieta");
        abilities.add("opanowanie (+5 SW) / charyzmatyczny (+5 Ogd)");
        abilities.add("żyłka handlowa / obieżyświat");
        
        equipment.add("2 komplety ubrań najlepszej jakości");
        equipment.add("liberia");
        equipment.add("perfumy");
        equipment.add("mieszek");
    }
}
