package BasicProfessions;

import GeneratorNPC.*;

public class SzermierzEstalijski extends Profession {
    public SzermierzEstalijski(){
        name = "Szermierz estalijski";
        
        wW = "+15";
        k = "+5";
        odp = "+5";
        zr = "+10";
        inte = "+5";
        a = "+1";
        zyw = "+2";
        
        skills.add("czytanie i pisanie");
        skills.add("nauka (anatomia)");
        skills.add("unik");
        skills.add("wiedza (Estalia)");
        skills.add("język (estalijski)");
        
        abilities.add("brawura / szybkie refleks (+5 Zr)");
        abilities.add("broń specjalna (szermiercza)");
        abilities.add("silny cios");
        abilities.add("szybkie wyciągnięcie / morderczy atak");
        
        armament.add("szpada / rapier");
        
        equipment.add("ubranie najlepszej jakości");
        equipment.add("perfumy");
        equipment.add("mikstura lecznicza");
    }
}
