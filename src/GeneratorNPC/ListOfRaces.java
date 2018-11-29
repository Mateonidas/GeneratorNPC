package GeneratorNPC;

import Races.Niziolek;
import Races.Czlowiek;
import Races.Elf;
import Races.Krasnolud;
import java.util.ArrayList;

public class ListOfRaces {
     ArrayList<Race> list = new ArrayList();
    
    public ListOfRaces(){  
        Czlowiek czlowiek = new Czlowiek();
        Krasnolud krasnolud = new Krasnolud();
        Elf elf = new Elf();
        Niziolek niziolek = new Niziolek();
        
        list.add(czlowiek);
        list.add(elf);
        list.add(krasnolud);
        list.add(niziolek);
    }

    public ArrayList<Race> getLista() {
        return list;
    }
}
