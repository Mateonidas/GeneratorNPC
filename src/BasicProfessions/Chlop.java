package BasicProfessions;

import GeneratorNPC.*;

public class Chlop extends Profession{
    public Chlop(){
        name = "Chłop";
        
        wW = "+5";
        uS = "+5";
        k = "+5";
        odp = "+10";
        zr = "+5";
        sW = "+5";
        zyw = "+2";
        
        skills.add("hazard / kuglarstwo (taniec) / kuglarstwo (śpiew)");
        skills.add("opieka nad zwierzętami / przekonywanie");
        skills.add("oswajanie / rzemiosło(gotowanie)");
        skills.add("powożenie / rzemiosło(wyrób łuków)");
        skills.add("sztuka przetrwania / rzemiosło(uprawa ziemi)");
        skills.add("tresura / pływanie");
        skills.add("ukrywanie się");
        skills.add("wioślarstwo / zastawianie pułapek");
        skills.add("wspinaczka / skradanie się");
        
        abilities.add("chodu! / broń specjalna (proca)");
        abilities.add("twardziel (+1 Żyw) / wędrowiec");
        
        equipment.add("proca / kij");
        equipment.add("skórzany bukłak");
    }
}