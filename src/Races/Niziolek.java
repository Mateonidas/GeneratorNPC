package Races;

import GeneratorNPC.Race;

public class Niziolek extends Race{
    
    public Niziolek(){
        name = "Niziołek";
        ww = 10;
        us = 30;
        k = 10;
        odp = 10;
        zr = 30;
        inte = 20;
        sw = 20;
        ogd = 30;
        
        a = 1;
        sz = 4;
        
        skills.add("nauka (genealogia / heraldyka)");
        skills.add("plotkowanie");
        skills.add("gotowanie / uprawa ziemi");
        skills.add("wiedza (niziołki)");
        skills.add("znajomość języka (niziołków)");
        skills.add("znajomość języka (staroświatowy)");
        
        ability.add("broń specjalna (proca)");
        ability.add("odporność na Chaos");
        ability.add("widzenie w ciemności");
    }
    
    
}
