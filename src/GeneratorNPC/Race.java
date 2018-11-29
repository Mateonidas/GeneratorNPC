package GeneratorNPC;

import java.util.ArrayList;
import java.util.Random;

public class Race {

    protected String name;
    protected int ww, us, k, odp, zr, inte, sw, ogd, a, zyw, sz, mag, po, pp;
    protected ArrayList<String> skills = new ArrayList();
    protected ArrayList<String> ability = new ArrayList();
    Random generator = new Random();

    String[] listOfAbilities = {"bardzo silny (+5 K)", "bardzo szybki (+1 Sz)", "błyskotliwość (+5 Int)", "bystry wzrok", "charyzmatyczny (+5 Ogd)", "czuły słuch", "geniusz arytmetyczny",
        "krzepki", "naśladowca", "niezwykle odporny (+5 Odp)", "oburęczność", "odporność na choroby", "odporność na magię", "odporność na trucizny",
        "odporność psychiczna", "opanowanie (+5 SW)", "strzelec wyborowy (+5 US)", "szczęście", "szósty zmysł", "szybki refleks (+5 Zr)", "twardziel (+1 Żyw)", "urodzony wojownik (+5 WW)",
        "widzenie w ciemności"};
    
    String[] eyeColorHuman = {"Szary","Ciemnoniebieski","Niebieski","Zielony","Piwny","Jasnobrązowy","Brązowy","Ciemnobrązowy","Fioletowy","Czarny"};
    
    String[] eyeColorElf = {"Szaroniebieski","Niebieski","Zielony","Orzechowy","Kasztanowy","Brązowy","Ciemnobrązowy","Srebrny","Fioletowy","Czarny"};
    
    String[] eyeColorDwarf = {"Szary","Ciemnoniebieski","Piwny","Jasnobrązowy","Jasnobrązowy","Brązowy","Brązowy","Ciemnobrązowy","Ciemnobrązowy","Filetowy"};
    
    String[] eyeColorHalfling = {"Niebieski","Orzechowy","Orzechowy","Jasnobrązowy","Jasnobrązowy","Brązowy","Brązowy","Ciemnobrązowy","Ciemnobrązowy","Ciemnobrązowy"};
    
    String[] hairColorHuman = {"Popielaty","Ciemny blond","Blond","Rudy","Ciemno rudy","Jasnobrązowy","Brązowy","Brązowy","Ciemnobrązowy","Czarny"};
    
    String[] hairColorElf = {"Srebrny","Biały","Jasny blond","Ciemny blond","Miedziany","Jasnobrązowy","Kasztanowy","Brązowy","Ciemnobrązowy","Czarny"};
    
    String[] hairColorDwarf = {"Popielaty","Blond","Ciemny rudy","Czerwony","Rudy","Brązowy","Brązowy","Ciemnobrązowy","Czarny","Kruczoczarny"};
    
    String[] hairColorHalfling = {"Popielaty","Ciemny blond","Blond","Blond","Rudy","Ciemny rudy","Jasnobrązowy","Brązowy","Ciemnobrązowy","Czarny"};
    
    String[] starSigns = {"Bębniarz - zabawa i radość","Dudy - oszustwo","Dwa Byki - płodność i rzemiosło","Głupiec Mummit - instynkt","Gwiazda Uroku - magia","Gwiazda Wieczorna - tajemnica i iluzja","Kocioł Rhyi - łaska, śmierć i tworzenie",
        "Lancet - nauka i talent","Mędrzec Mammit - mądrość","Pas Grungniego - sprawność wojenna","Rozbity Wóz - duma","Smok Dragomas - odwaga","Sznur Limnera - dokładność","Tancerka - miłość i porządanie",
        "Tłusty Kozioł - ukryta namiętność","Vobist Ulotny - ciemność i niepewność","Wielki Krzyż - czystość","Wół Gnuthus - wierna służba","Wymund Pustelnik - wytrzymałość", "Złoty Kogut - kupcy i bogactwo"};
   
    String[] specialCharacters = {"Bielmo na oku","Blizna","Brak brwi","Brak palca","Brak zęba","Brodawki","Blada cera","Duży nos","Duży pieprzyk","Dziwny zapach ciała",
        "Kolczyk w nosie","Kolczyk w uchu","Niewielka łysina","Oczy różnego koloru","Piegi","Poszarpane ucho","Ślady po ospie","Tatuaż","Wystające zęby","Wytrzeszczone oczy",
        "Złamany nos"};
    
    String personalityTraits[] = {"Agresywny","Arogancki","Bezczelny","Bezlitosny","Bezinteresowany","Bezpośredni","Bezstronny","Beztroski","Bohaterski",
        "Buntowniczy","Brawurowy","Brutalny","Bystry","Chamski","Chciwy","Chełpliwy","Cichy","Ciekawski","Cierpliwy","Czarujący","Cyniczny","Dociekliwy",
        "Dobrze wychowany","Dokładny","Dowcipny","Drażliwy","Dumny","Dwulicowy","Dzielny","Dziwak","Egoista","Energiczny","Fanatyk","Gaduła","Godny zaufania",
        "Głupi","Guzdrała","Gwałtowny","Hojny","Histeryk","Honorowy","Humorzasty","Impulsywny","Inteligentny","Irytujący","Kapryśny","Kłotliwy","Lekkoduch",
        "Leniwy","Lojalny","Lubieżny","Łagodny","Łakomy","Łatwowierny","Mądry","Malkontent","Małomówny","Małostkowy","Marudny","Mężny","Miły","Miłosierny",
        "Mściwy","Nadgorliwy","Nadopiekuńczy","Naiwny","Narwany","Nerwowy","Niecierpliwy","Niedbały","Niedojrzały","Nielojalny","Nieobliczalny","Nieodpowiedzialny",
        "Nieposłuszny","Nieśmiały","Niesforny","Niesolidny","Nietolerancyjny","Nieuczciwy","Nieuprzejmy","Nieustraszony","Niewrażliwy","Niewzruszony","Niezależny",
        "Niezawodny","Niezdarny","Nonszalancki","Nudny","Obowiązkowy","Obleśny","Obłudny","Obojętny","Obrotny","Oddany","Odpowiedzialny","Odważny","Okrutny",
        "Opanowany","Opiekuńczy","Opryskliwy","Optymista","Ospały","Ostrożny","Paranoik","Pesymista","Pewny siebie","Pobłażliwy","Podejrzliwy","Podstępny",
        "Pogodny","Pokojowy","Pomysłowy","Ponury","Porywczy","Posłuszny","Potulny","Poważny","Powolny","Powściągliwy","Pracowity","Pragmatyczny","Prawdomówny",
        "Praworządny","Prostak","Próżny","Przebiegły","Przesądny","Przezorny","Przyjacielski","Radosny","Rozpustny","Rozrzutny","Rozsądny","Roztargniony",
        "Rozważny","Sadysta","Samolubny","Samotnik","Samowolny","Sknera","Skryty","Skupiony","Smutny","Snob","Solidny","Spokojny","Sprawiedliwy","Sprytny",
        "Srogi","Stanowczy","Staranny","Sumienny","Surowy","Szalony","Szlachetny","Szczery","Szczęściarz","Szczodry","Szorstki","Śmiały","Śmiszny","Tajemniczy",
        "Tępy","Tchórzliwy","Tolerancyjny","Towarzyski","Troskliwy","Uczciwy","Uczynny","Ufny","Uległy","Uparty","Uprzejmy","Uważny","Waleczny","Wesoły",
        "Wierny","Władczy","Wojowniczy","Wrażliwy","Wstrzemięźliwy","Wścibski","Wulgarny","Wylewny","Wymagający","Wyrozumiały","Zabawny","Zapominalski",
        "Zarozumiały","Zawistny","Zawzięty","Zazdrosny","Zdecydowany","Zdradziecki","Zgryźliwy","Złośliwy","Zmienny","Zuchwały","Żwawy"};
    
    public int randomFeature() {
        return generator.nextInt(10) + 1 + generator.nextInt(10) + 1;
    }

    public int randomVitality() {
        int rand = generator.nextInt(10) + 1;

        if (name == "Człowiek") {
            if (rand < 4) {
                return 10;
            } else if (rand > 3 && rand < 7) {
                return 11;
            } else if (rand > 6 && rand < 10) {
                return 12;
            } else {
                return 13;
            }
        } else if (name == "Elf") {
            if (rand < 4) {
                return 9;
            } else if (rand > 3 && rand < 7) {
                return 10;
            } else if (rand > 6 && rand < 10) {
                return 11;
            } else {
                return 12;
            }
        } else if (name == "Krasnolud") {
            if (rand < 4) {
                return 11;
            } else if (rand > 3 && rand < 7) {
                return 12;
            } else if (rand > 6 && rand < 10) {
                return 13;
            } else {
                return 14;
            }
        } else if (name == "Niziołek") {
            if (rand < 4) {
                return 8;
            } else if (rand > 3 && rand < 7) {
                return 9;
            } else if (rand > 6 && rand < 10) {
                return 10;
            } else {
                return 11;
            }
        } else {
            return 0;
        }
    }

    public int randomPP() {
        int rand = generator.nextInt(10) + 1;

        if (name == "Człowiek") {
            if (rand < 5) {
                return 2;
            } else if (rand > 4 && rand < 8) {
                return 3;
            } else {
                return 3;
            }
        } else if (name == "Elf") {
            if (rand < 5) {
                return 1;
            } else if (rand > 4 && rand < 8) {
                return 2;
            } else {
                return 2;
            }
        } else if (name == "Krasnolud") {
            if (rand < 5) {
                return 1;
            } else if (rand > 4 && rand < 8) {
                return 2;
            } else {
                return 3;
            }
        } else if (name == "Niziołek") {
            if (rand < 5) {
                return 2;
            } else if (rand > 4 && rand < 8) {
                return 2;
            } else {
                return 3;
            }
        } else {
            return 0;
        }
    }

    public void randomAbilities() {
        int a = 0, b = 0;
        if (name == "Człowiek") {
            a = generator.nextInt(23);
            b = generator.nextInt(23);
        } else if (name == "Niziołek") {
            a = generator.nextInt(22);
        }

        for (;;) {
            if (a == b) {
                b = generator.nextInt(23);
            } else {
                break;
            }
        }

        if (name == "Człowiek") {
            ability.add(listOfAbilities[a]);
            ability.add(listOfAbilities[b]);
        } else if (name == "Niziołek") {
            ability.add(listOfAbilities[a]);
        }

    }

    public String randomHeight(String sex){
        switch(name){
            case "Człowiek":{
                if(sex == "Kobieta") return Integer.toString(150 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
                else return Integer.toString(160 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
            }
            case "Elf":{
                if(sex == "Kobieta") return Integer.toString(160 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
                else return Integer.toString(170 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
            }
            case "Krasnolud":{
                if(sex == "Kobieta") return Integer.toString(130 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
                else return Integer.toString(145 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
            }
            case "Niziołek":{
                if(sex == "Kobieta") return Integer.toString(100 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
                else return Integer.toString(110 + generator.nextInt(10) + 1 + generator.nextInt(10) + 1);
            }
        }
        
        return "0";
    }
    
    public String randomAge(){
        switch(name){
            case "Człowiek":{
                return Integer.toString(generator.nextInt(20)+16);
            }
            case "Elf":{
                return Integer.toString(generator.nextInt(96)+30);
            }
            case "Krasnolud":{
                return Integer.toString(generator.nextInt(96)+20);
            }
            case "Niziołek":{
                return Integer.toString(generator.nextInt(41)+20);
            }
        }
        
        return "0";
    }
    
    public String randomWeight(){
        switch(name){
            case "Człowiek":{
                return Integer.toString(generator.nextInt(61)+50);
            }
            case "Elf":{
                return Integer.toString(generator.nextInt(56)+40);
            }
            case "Krasnolud":{
                return Integer.toString(generator.nextInt(56)+45);
            }
            case "Niziołek":{
                return Integer.toString(generator.nextInt(36)+35);
            }
        }
        
        return "0";
    }
    
    public String randomEyeColor(){
        switch(name){
            case "Człowiek":{
                return eyeColorHuman[generator.nextInt(10)];
            }
            case "Elf":{
                return eyeColorElf[generator.nextInt(10)];
            }
            case "Krasnolud":{
                return eyeColorDwarf[generator.nextInt(10)];
            }
            case "Niziołek":{
                return eyeColorHalfling[generator.nextInt(10)];
            }
        }
        
        return "0";
    }
    
    public String randomHairColor(){
        switch(name){
            case "Człowiek":{
                return hairColorHuman[generator.nextInt(10)];
            }
            case "Elf":{
                return hairColorElf[generator.nextInt(10)];
            }
            case "Krasnolud":{
                return hairColorDwarf[generator.nextInt(10)];
            }
            case "Niziołek":{
                return hairColorHalfling[generator.nextInt(10)];
            }
        }
        
        return "0";
    }
    
    public String randomStarSign(){
        return starSigns[generator.nextInt(starSigns.length)];
    }
    
    public String randomSpecialCharacter(){
        return specialCharacters[generator.nextInt(specialCharacters.length)];
    }
    
    public String randomPersonalityTraits(){
        String tab[] = new String[3];
        tab[0] = personalityTraits[generator.nextInt(personalityTraits.length)];
        tab[1] = personalityTraits[generator.nextInt(personalityTraits.length)];
        tab[2] = personalityTraits[generator.nextInt(personalityTraits.length)];
        for(;;){
            if(tab[1] == tab[0]) tab[1] = personalityTraits[generator.nextInt(personalityTraits.length)];
            else if(tab [2] == tab[1]) tab[2] = personalityTraits[generator.nextInt(personalityTraits.length)];
            else if(tab[2] == tab[0]) tab[2] = personalityTraits[generator.nextInt(personalityTraits.length)];
            else break;
        }
        
        return tab[0] + " | " + tab[1] + " | " + tab[2];
    }
    
    public String getName() {
        return name;
    }

    public int getWw() {
        return ww;
    }

    public int getUs() {
        return us;
    }

    public int getK() {
        return k;
    }

    public int getOdp() {
        return odp;
    }

    public int getZr() {
        return zr;
    }

    public int getInte() {
        return inte;
    }

    public int getSw() {
        return sw;
    }

    public int getOgd() {
        return ogd;
    }

    public int getA() {
        return a;
    }

    public int getZyw() {
        return zyw;
    }

    public int getSz() {
        return sz;
    }

    public int getMag() {
        return mag;
    }

    public int getPo() {
        return po;
    }

    public int getPp() {
        return pp;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public ArrayList<String> getAbilities() {
        return ability;
    }

    public String[] getListOfAbilities() {
        return listOfAbilities;
    }

}
