package AdvancedProfessions;

import GeneratorNPC.*;

public class Zakonnik extends Profession {
    public Zakonnik() {
        name = "Zakonnik";
        
        wW = "+10";
        k = "+5";
        odp = "+10";
        inte = "+15";
        sW = "+15";
        ogd = "+15";
        zyw = "+4";
        
        skills.add("leczenie");
        skills.add("nauka (teologia)");
        skills.add("opieka nad zwierzętami");
        skills.add("spostrzegawczość");
        skills.add("sztuka przetrwania");
        skills.add("wiedza (dowolne dwie)");
        skills.add("znajomość języka (bretoński / estalijski / kislevski / tileański)");
        skills.add("znajomość języka (klasyczny)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("obieżyświat");
        
        equipment.add("habit (szaty kapłańskie)");
        equipment.add("mikstura lecznicza");
        equipment.add("symbol religijny");
        equipment.add("relikwia");
    }
}
