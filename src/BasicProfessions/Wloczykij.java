package BasicProfessions;

import GeneratorNPC.*;

public class Wloczykij extends Profession {
    public Wloczykij(){
        name = "Włóczykij";
        
        wW = "+5";
        uS = "+10";
        zr = "+10";
        inte = "+5";
        ogd = "+5";
        zyw = "+2";
        
        skills.add("kuglarstwo (gawędziarstwo / śpiew / taniec) / sekretne znaki (łowców / złodziei)");
        skills.add("leczenie / spostrzegawczość");
        skills.add("nawigacja");
        skills.add("plotkowanie / sekretne język (łowców / złodziejski)");
        skills.add("skradanie się");
        skills.add("sztuka przetrwania");
        skills.add("targowanie / pływanie");
        skills.add("wiedza (Bretonia / Estalia / Kislev / Tilea");
        
        abilities.add("bardzo szybki (+1 Sz) / wędrowiec");
        abilities.add("obieżyświat");
        abilities.add("strzelec wyborowy (+5 US) / wyczucie kierunku");
        
        equipment.add("plecak");
        equipment.add("prowiant (1 tydzień)");
        equipment.add("namiot");
        equipment.add("bukłak z wodą");
    }
}
