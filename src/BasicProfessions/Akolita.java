package BasicProfessions;

import GeneratorNPC.*;

public class Akolita extends Profession {

    public Akolita() {
        name = "Akolita";
        
        wW = "+5";
        uS = "+5";
        odp = "+5";
        zr = "+10";
        sW = "+10";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("leczenie");
        skills.add("nauka (astronomia) / nauka (historia)");
        skills.add("nauka (teologia)");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("znajomość języka (klasyczny)");
        skills.add("znajomość języka (staroświatowy)");

        abilities.add("bardzo silny (+5 K) / szybki refleks (+5 Zr)");
        abilities.add("charyzmatyczny (+5 Ogd) / urodzony wojownik (+5 WW)");
        abilities.add("przemawianie");

        equipment.add("szaty kapłańskie");
        equipment.add("symbol boga");
    }
}
