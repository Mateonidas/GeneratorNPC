package GeneratorNPC;

import java.util.ArrayList;

public class Profession {

    protected String name;
    protected String wW = "0", uS = "0", k = "0", odp = "0", zr = "0", inte = "0", sW = "0", ogd = "0", a = "0", zyw = "0", s = "0", wt = "0", sz = "0", mag = "0", pO = "0", pP = "0";  
    protected ArrayList<String> skills = new ArrayList();
    protected ArrayList<String> abilities = new ArrayList();
    protected ArrayList<String> armor = new ArrayList();
    protected ArrayList<String> armament = new ArrayList();
    protected ArrayList<String> equipment = new ArrayList();

    public String getName() {
        return name;
    }

    public String getWw() {
        return wW;
    }

    public String getUs() {
        return uS;
    }

    public String getK() {
        return k;
    }

    public String getOdp() {
        return odp;
    }

    public String getZr() {
        return zr;
    }

    public String getInte() {
        return inte;
    }

    public String getSw() {
        return sW;
    }

    public String getOgd() {
        return ogd;
    }

    public String getA() {
        return a;
    }

    public String getZyw() {
        return zyw;
    }

    public String getS() {
        return s;
    }

    public String getWt() {
        return wt;
    }

    public String getSz() {
        return sz;
    }

    public String getMag() {
        return mag;
    }

    public String getPo() {
        return pO;
    }

    public String getPp() {
        return pP;
    }
    
    public ArrayList<String> getSkills() {
        return skills;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public ArrayList<String> getArmor() {
        return armor;
    }

    public ArrayList<String> getArmament() {
        return armament;
    }
    
    public ArrayList<String> getEquipment() {
        return equipment;
    }
}
