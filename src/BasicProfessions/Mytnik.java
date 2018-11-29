package BasicProfessions;

import GeneratorNPC.*;

public class Mytnik extends Profession{
    public Mytnik(){
        name = "Mytnik";
        
        wW = "+10";
        uS = "+5";
        k = "+5";
        odp = "+10";
        zr = "+5";
        sW = "+5";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("plotkowanie / targowanie");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("wycena");
        skills.add("znajomość języka (bretoński / kislevski / tileański)");
        
        abilities.add("szybki refleks (+5 Zr) / strzelec wyborowy (+5 US)");
        
        armor.add("kaftan kolczy (korpus: 2)");
        armor.add("skórzany kaftan (korpus: 1)");
        
        armament.add("kusza i 10 bełtów");
        armament.add("tarcza");
        
        equipment.add("zamykana na kłódkę skrzynia");
        equipment.add("1k10 zk");
    }
}