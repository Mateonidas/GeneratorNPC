package BasicProfessions;

import GeneratorNPC.*;

public class StraznikWiezienny extends Profession {
    public StraznikWiezienny(){
        name = "Strażnik więzienny";
        
        wW = "+10";
        k = "+10";
        odp = "+10";
        sW = "+5";
        zyw = "+3";
        
        skills.add("dowodzenie");
        skills.add("leczenie / zwinne palce");
        skills.add("mocna głowa");
        skills.add("przeszukiwanie");
        skills.add("spostrzegawczość");
        skills.add("unik");
        skills.add("zastraszanie");
        
        abilities.add("broń specjalna (unieruchamiająca)");
        abilities.add("odporność na choroby");
        abilities.add("odporność na trucizny");
        abilities.add("zapasy");
        
        armament.add("bolas / sieć / arkan");
        
        equipment.add("butelka podłego wina");
        equipment.add("manierka");
    }
}
