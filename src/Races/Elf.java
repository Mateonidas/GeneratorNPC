package Races;

import GeneratorNPC.Race;

public class Elf extends Race{
    
    public Elf(){
        name = "Elf";
        ww = 20;
        us = 30;
        k = 20;
        odp = 20;
        zr = 30;
        inte = 20;
        sw = 20;
        ogd = 20;
        
        a = 1;
        sz = 5;
        
        skills.add("wiedza (elfy)");
        skills.add("znajomość języka (staroświatowy)");
        skills.add("znajomość języka (eltharin)");
        
        ability.add("broń specjalna (długi łuk) / zmysł magii");
        ability.add("bystry wzrok");
        ability.add("opanowanie(+5 SW)/błyskotliwość(+5 Int)");
        ability.add("widzenie w ciemności");
    }
    
    
}
