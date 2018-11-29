package BasicProfessions;

import GeneratorNPC.*;

public class CiuraObozowa extends Profession{
    public CiuraObozowa(){
        name = "Ciura Obozowa";
        
        odp = "+5";
        zr = "+10";
        inte = "+5";
        sW = "+5";
        ogd = "+10";
        zyw = "+2";
        
        
        skills.add("opieka na zwierzętami/powożenie");
        skills.add("plotkowanie");
        skills.add("przekonywanie / wycena");
        skills.add("przeszukiwanie");
        skills.add("rzemiosło (gotowanie / handel / kartografia / kowalstwo / krawiectwo / płatnerstwo / rusznikarstwo / wyrób łuków / zielarstwo)");
        skills.add("spostrzegawczość");
        skills.add("targowanie");
        skills.add("znajomość języka (bretoński / kislevski / tileański)");
        skills.add("zwinne palce");
        
        abilities.add("chodu!");
        abilities.add("odporność na choroby / obieżyświat");
        abilities.add("twardziel (+1 Żyw) / charyzmatyczny (+5 Ogd)");
        abilities.add("żyłka handlowa / bijatyka");
        
        equipment.add("talizman szczęścia / narzędzia (rzemieślnika)");
        equipment.add("sakiewka");
        equipment.add("namiot");
    }
}