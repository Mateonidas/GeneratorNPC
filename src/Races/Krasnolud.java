package Races;

import GeneratorNPC.Race;

public class Krasnolud extends Race{
    
    public Krasnolud(){
        name = "Krasnolud";
        ww = 30;
        us = 20;
        k = 20;
        odp = 30;
        zr = 10;
        inte = 20;
        sw = 20;
        ogd = 10;
        
        a = 1;
        sz = 3;
        
        skills.add("rzemiosło (górnictwo / kamieniarstwo / kowalstwo)");
        skills.add("wiedza (krasnoludy)");
        skills.add("znajomość języka (staroświatowy)");
        skills.add("znajomość języka (khazalid)");
        
        ability.add("krasnoludzki fach");
        ability.add("krzepki");
        ability.add("odporność na magię");
        ability.add("odwaga");
        ability.add("widzenie w ciemności");
        ability.add("zapiekła nienawiść");
    }
    
    
}
