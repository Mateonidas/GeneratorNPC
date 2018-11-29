package BasicProfessions;

import GeneratorNPC.*;

public class Szlachcic extends Profession {
    public Szlachcic(){
        name = "Szlachcic";
        
        wW = "+10";
        uS = "+5";
        zr = "+5";
        inte = "+5";
        sW = "+5";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("gadanina / dowodzenie");
        skills.add("hazard / plotkowanie");
        skills.add("jeździectwo");
        skills.add("mocna głowa / kuglarstwo (muzykalność)");
        skills.add("przekonywanie");
        skills.add("wiedza (Imperium)");
        skills.add("znajomość języka (staroświatowy)");
        
        abilities.add("błyskotliwość (+5 Int) / broń specjalna (szermiercza)");
        abilities.add("broń specjalna (parująca) / intrygant");
        abilities.add("etykieta");
        abilities.add("szczęście / przemawianie");
        
        armament.add("szpada");
        armament.add("lewak");
        
        equipment.add("strój szlachecki z herbem rodu");
        equipment.add("koń z siodłem i uprzężą");
        equipment.add("1k10 zk. biżuteria o wartości 6k10 zk");
    }
}
