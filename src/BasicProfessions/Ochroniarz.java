package BasicProfessions;

import GeneratorNPC.*;

public class Ochroniarz extends Profession{
    public Ochroniarz(){
        name = "Ochroniarz";
        
        wW = "+10";
        k = "+5";
        odp = "+5";
        zr = "+5";
        a = "+1";
        zyw = "+3";
        
        skills.add("leczenie");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("zastraszanie");
        
        abilities.add("bardzo silny (+5 K) / niezywkle odporny (+5 Odp)");
        abilities.add("bijatyka");
        abilities.add("broń specjalna (parująca)");
        abilities.add("broń specjalna (rzucana)");
        abilities.add("ogłuszanie");
        abilities.add("robrajanie / szubkie wyciągnięcie");
        
        armament.add("dwa topory do rzucania / dwa noże do rzucania");
        armament.add("kastety");
        armament.add("puklerz");
        
        armor.add("skórzana kurta (korpus, ręce: 1)");
    }
}