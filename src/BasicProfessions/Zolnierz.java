package BasicProfessions;

import GeneratorNPC.*;

public class Zolnierz extends Profession {
    public Zolnierz(){
        name = "Żołnierz";
        
        wW = "+10";
        uS = "+10";
        zr = "+10";
        sW = "+5";
        a = "+1";
        zyw = "+2";
        
        skills.add("hazard / plotkowanie");
        skills.add("opieka nad zwierzętami / leczenie");
        skills.add("powożenie / jeździectwo");
        skills.add("unik");
        skills.add("wiedza (Imperium) / spostrzegawczość");
        skills.add("zastraszanie");
        
        abilities.add("broń specjalna (palna / dwuręczna)");
        abilities.add("morderczy atak / błyskawiczne przeładowanie");
        abilities.add("ogłuszanie / strzał precyzyjny");
        abilities.add("rozbrajanie / szybkie wyciągnięcie");
        abilities.add("strzał mierzony / silny cios");
        
        armor.add("skórznia (wszystko: 1)");
        
        armament.add("halabarda / rusznica z amunicją na 10 strzałów");
        armament.add("tarcza");
        
        equipment.add("mundur");
    }
}
