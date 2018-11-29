package GeneratorNPC;

import java.util.Random;

public class ListOfNames {
    
    String race = "", sex = "";
    
    String[][] humanNames = {
        {"Abbie","Abighild","Abigund","Abigunda","Ada","Adel","Adelind","Adeline","Adelyn","Adelle","Agathe","Agnete","Aldreda",
        "Alica","Allane","Althea","Amalie","Amalinde","Amalyn","Anhilda","Annabella","Anna","Anthea","Arabella","Aver","Bechilda",
        "Bella","Bellane","Benedicta","Berlinda","Berlyn","Bertha","Berthilda","Bess","Beth","Broncea","Brunhilda","Camilla",
        "Carla","Carlinda","Carlotta","Cilicia","Cilie","Clora","Clothilda","Connie","Constance","Constanza","Cordelia","Dema",
        "Demona","Desdemona","Dorthilda","Drachena","Drachilda","Edhilda","Edith","Edyth","Edythe","Eleanor","Elinor","Elisinda",
        "Elsina","Ella","Ellene","Ellinde","Eloise","Elsa","Elsbeth","Elspeth","Elyn","Emagunda","Emelia","Emme","Emmalyn",
        "Emmanuel","Emerlinde","Emerlyn","Erica","Ermina","Erminlind","Ermintrude","Esmaralda","Estelle","Etheldreda","Ethelind",
        "Ethelreda","Fay","Frieda","Friedhilda","Friedrun","Friedriva","Gabby","Gabriele","Galina","Gena","Genevieve","Genoveva",
        "Gerberga","Gerda","Gerlinde","Gertie","Gertrud","Greta","Gretchen","Grizelda","Grunhilda","Gudrun","Gudryn","Hanna",
        "Hedwig","Heidi","Heidrun","Helga","Herlinde","Herwig","Hilda","Hildegart","Hildegund","Honoria","Ida","Ingrid","Ingrun",
        "Ingrund","Irmella","Irmine","Isabella","Isadora","Isolde","Jocelin","Johanna","Josie","Karin","Katarine","Katheryn",
        "Katharina","Keterlind","Keterlyn","Kitty","Kristen","Kristena","Kristyn","Kirsten","Kirstyn","Lavina","Lavinia","Leanor",
        "Leanora","Leticia","Letty","Lena","Lenora","Lisa","Lisbeth","Lizzie","Lorinda","Lorna","Lucinda","Lucretia","Lucie",
        "Ludmila","Mabel","Madge","Magdalyn","Maggie","Maghilda","Maglind","Magalyn","Magunda","Magreta","Maida","Marien","Marietta",
        "Margaret","Marget","Margreta","Marline","Marlyn","Mathilda","Maude","May","Meg","Melicent","Miranda","Moll","Nathilda",
        "Nelie","Nora","Olga","Ophelia","Osterhild","Ostelle","Ostia","Ottagunda","Ottaline","Ottilda","Ottilyn","Pertida","Pergale",
        "Pergunda","Petronella","Philomelia","Reikhilda","Renata","Rosabel","Rosabella","Rosale","Rosalia","Rosalin","Rosalinde",
        "Rosamunde","Rosanne","Rose","Roz","Rozhlida","Salina","Saltza","Sigismunda","Sigrid","Sigunda","Solla","Styrine",
        "Talima","Theodora","Therese","Tilea","Ursula","Ulrica","Valeria","Verena","Wilfrieda","Wilhelmina","Winifred","Wolfhilde",
        "Zemelda","Zena"},
        
        {"Abelhard","Abelhelm","Admund","Adred","Adric","Agis","Alaric","Alberic","Albrecht","Aldebrand","Aldred","Aldric","Alfreid",
        "Altmar","Alric","Andre","Andred","Andric","Anshelm","Anton","Arne","Arnulf","Axel","Axelbrand","Baldred","Baldric","Baldwin",
        "Balthasar","Barnabas","Bart","Bartolf","Bartomar","Bernolt","Bertold","Bertolf","Boris","Bruno","Burgolf","Calvin","Casimir",
        "Caspar","Cedred","Conrad","Corvin","Dagmar","Dankmar","Dankred","Dekmar","Detlef","Diebold","Diel","Dietfried","Dieter",
        "Dietmar","Dietmund","Dietrich","Dirk","Donat","Durnhelm","Eber","Eckel","Eckhart","Edgar","Edmund","Edwin","Ehrhart","Ehrl",
        "Ehrwing","Eldred","Elmeric","Emil","Engel","Engelbert","Engelbrecht","Engelhart","Eodred","Eomund","Erdman","Edred",
        "Erkenbrand","Erasmus","Erich","Erman","Ernst","Erwin","Eugen","Eustasius","Ewald","Fabian","Faustus","Felix","Ferdinand",
        "Fleugwerner","Fosten","Franz","Frediger","Fredric","Firebald","Fredrich","Fulko","Gawin","Gerber","Gerhart","Gerlach","Gernar",
        "Gerolf","Gilbrecht","Gisbert","Giselbrecht","Gismar","Goran","Gosbert","Goswin","Gotfried","Gothard","Gottolf","Gotwin",
        "Gregor","Greimold","Grimwold","Griswold","Guido","Gundolf","Gundred","Gunnar","Gunter","Gunther","Gustaf","Hadred","Hadwin",
        "Hagar","Hagen","Halderd","Halman","Hamlyn","Hans","Harbrand","Harman","Hartmann","Haug","Heidric","Heimar","Heinfried",
        "Heinman","Heinrich","Heinz","Helmut","Henlyn","Hermann","Herwin","Hieronymus","Hildebart","Hildebrand","Hildermar","Hildemund",
        "Hildred","Hildric","Horst","Hugo","Igor","Ingwald","Jander","Jekil","Jodokus","Johann","Jonas","Jorg","Jorn","Josef","Jost",
        "Jurgen","Karl","Kaspar","Klaus","Kleber","Konrad","Konradin","Kurt","Lamprecht","Lanfried","Lanric","Lanwin","Leo","Leopold",
        "Levin","Liebert","Liebrecht","Liebwin","Lienhart","Linus","Lodwig","Lothar","Lucius","Ludwig","Luitpold","Lukas","Lupold",
        "Lupus","Luther","Lutolf","Madred","Magnus","Manfred","Mathias","Max","Maximillian","Meiner","Meinhart","Meinolf","Mekel","Merkel",
        "Nat","Nathandar","Nicodemus","Odamar","Odriv","Odwin","Olbrecht","Oldred","Oldric","Ortlieb","Ortolf","Orwin","Oswald","Osric",
        "Oswin","Otfried","Otto","Otwin","Paulus","Prospero","Ragen","Ralf","Rambrecht","Randulf","Ranulf","Ranald","Reikhard","Rein",
        "Reiner","Reinhard","Reinolt","Reuban","Rigo","Roderic","Rolf","Ruben","Rudel","Rudgar","Rudolf","Rufus","Ruprecht","Sebatian",
        "Semund","Sepp","Sieger","Siegfried","Siegmund","Sigismund","Sigric","Steffan","Tankred","Theoderic","Tilmann","Tomas","Trubald",
        "Trubert","Udo","Ulli","Ulfred","Ulfman","Ulman","Uto","Valdred","Valdric","Varl","Viggo","Viktor","Vilmar","Volker","Volkhard",
        "Volkrad","Volkin","Voltz","Walbrecht","Waldor","Waldred","Walther","Warmund","Werner","Wilbert","Wilfried","Wilhelm","Wolderd",
        "Wolfram","Wolfhart","Wolfgang","Wulf","Xavier"}
    };
    
    String[][] elvishNames = {
        {"Aed","Ael","Aelf","Aen","Aeth","Alth","An","And","Ar","Arg","Ast","Ath","Av","Ban","Bel","Beth","Cad","Cael","Caem","Caeth",
        "Cal","Cam","Cel","Cir","El","Eld","Elth","En","End","Er","Ers","Fand","Fer","Ferg","Fim","Fin","Gal","Gald","Gaen","Gaes",
        "Ged","Gen","Ges","Geth","Glor","Has","Hath","Hel","Heth","Hith","Ill","Ind","Ist","Ith","Iy","Kor","Ky","Kry","La","Lan","Lil",
        "Lim","Lith","Loth","Mal","Mar","Mas","Mah","Me","Mes","Meth","Men","Mor","Mort","Nal","Nar","Nen","Nor","Norl","Ri","Riabb",
        "Riann","Rid","Riell","Rien","Ruth","Ryn","Tab","Tal","Tan","Tar","Teth","Tel","Tor","Ty","Ul","Um","Ur","Yr","Yv"},
        
        {"a","al","an","ar","as","e","el","en","er","es","fan","fen","fin","i","il","in","ir","is","o","ol","on","or","os","ra","ral",
        "ran","re","rel","ren","ri","ril","rin","ro","rol","ron","ry","sa","sal","san","se","sel","sen","si","sil","sin","so","sol",
        "son","u","ul"},
        
        {"a","aine","am","ann","arma","arna","arth","ath","beann","bet","beth","brim","brys","deann","det","deth","dys","drian",
        "driel","drys","eann","eanna","earna","earth","elle","eth","eys","eyth","felle","fionn","flys","fyll","fynn","fyr","fys",
        "i","ille","ina","ira","isa","ithi","itt","la","lam","lana","larna","lath","leann","leath","lel","lelle","leth","let",
        "lielle","lieth","lyann","nelle","nem","neth","ni","niell","niella","nith","ras","reann","rell","relle","rielle","ris",
        "rith","rys","sar","sath","ser","seth","sir","sith","sor","soth","shar","sher","shir","sys","tar","teal","teann",
        "ter","thea","ther","thi","thryn","thyn","tir","tor","tos","tryan","trys","yll","yrs","ys"},
            
        {"bean","baine","baire","bar","bhir","brier","brior","brin","daen","daine","daire","dar","dhil","dhir","drel","drir","dror",
        "eorl","eos","eoth","fil","fin","fir","hil","hin","hir","hor","il","in","ion","ir","is","ith","lael", "laen","laer","laine",
        "laire","lan","las","len","les","lil","lin","lir","lis","lor","los","mael","maen","mair","main","mal","mar","mil","min",
        "mir","nael","naen","naer","nail","nair","nal","nan","nar","neal","nean","near","nil","nin","nir","nis","ran","rea","rel",
        "ril","riol","rion","rior","riorl","riorn","rir","ryel","taen","tair","tain","than","thar","thel","thil","thir","thin","thril",
        "thrin","thwe","til","tin","tis","we","yan"}
    };
    
    String[][] dwarvishNames = {
        {"Al","Ath","Athran","Bal","Bala","Bara","Bel","Bela","Ber","Bok","Bur","Da","Dam","Dora","Drok","Drong","Dur","Dwal","El",
        "Ela","Elan","Elda","Fa","Far","Fara","Fim","Fima","Firen","Fur","Fura","Ga","Gim","Gol","Gollen","Got","Gota","Grim","Gro",
        "Grun","Hak","Haka","Har","Hega","Hur","Kad","Kar","Kata","Kaz","Kaza","Krag","Logaz","Lok","Lun","Mo","Mola","Mor","Mora",
        "No","Nola","Nor","Noran","Nun","Oda","Oka","Olla","Olf","Oth","Othra","Ro","Ror","Roran","Ska","Skalla","Skalf","Skar","Skor",
        "Skora","Snor","Snora","Sven","Thar","Thor","Thora","Thron","Thrun","Thura","Un","Utha","Ulla","Vala","Var","Vara","Zak","Zaka",
        "Zakan","Zar","Zara","Zam","Zama"},
        
        {"bina","bora","dila","dina","dokina","dora","drinella","fina","fya","gana","gara","gella","gina","groma","grondella","grotha",
        "gruma","grunda","gruntina","gona","gora","grimella","grina","gromina","gula","gunella","gundina","kina","kragella","krina",
        "kya","lina","likina","loka","luna","mina","mira","nina","nira","nya","ragina","riga","rika","rina","runa","runella","sina",
        "skinella","tina","toka","trekella","trekina","troka","zina","zora"},
            
        {"bin","bor","dil","din","dok","dor","drin","fin","gan","gar","gil","gin","gni","grom","grond","groth","grum","grund","grunt",
        "gon","gor","grim","grin","grom","gul","gun","gund","ki","kin","krag","kri","krin","li","lin","lik","lok","lun","min","mir",
        "nin","nir","rag","ri","rig","rik","rin","run","skin","tin","tok","trek","trok","zin","zor"}
    };
    
    String[][] halflingsNames = {
        {"Bag","Balf","Berc","Bill","Bobb","Bodg","Bog","Bom","Bonn","Brog","Bulc","Bull","Bust","Cam","Cap","Ced","Chund","Clog",
        "Clof","Cob","Cog","Crum","Crump","Curl","Dod","Dog","Dott","Dram","Drub","Drog","Dron","Durc","Elm","Enn","Ermin","Ethan",
        "Falc","Fald","Falm","Far","Fild","Flac","Fogg","Frit","Ful","Func","Galff","Galb","Gamm","Gert","Giff","Gild","Gon","Grop",
        "Gudd","Gump","Ham","Hal","Hart","Harp","Jac","Jas","Jasp","Joc","Lac","Lil","Lob","Lott","Lud","Lurc","Mad","Mag","Man",
        "May","Mer","Mul","Murc","Murd","Nag","Nell","Nobb","Od","Og","Old","Pipp","Podd","Porc","Riff","Rip","Rob","Sam","Supp",
        "Taff","Talb","Talc","Tay","Tom","Wald","Watt","Will"},
        
        {"a","adell","alot","apple","bell","berry","eena","ella","era","et","ia","flower","lotta","peta","riella","sweet","trude",
        "rose","willow","y"},
        
        {"belly","er","fast","in","it","mutch","o","odoc","riadoc","regar","wick","wise","wit","y"}
    };
    
    public ListOfNames(String race, String sex){
        this.race = race;
        this.sex = sex;
    }
    
    public String randomName(){
        switch(race){
            case "Człowiek": {
                if(sex == "Kobieta"){
                    return random(humanNames[0]);
                }
                else {
                    return random(humanNames[1]);
                }
            }
            
            case "Elf":{
                if(sex == "Kobieta"){
                    return random(elvishNames[0]) + random(elvishNames[1]) + random(elvishNames[2]);
                }
                else {
                    return random(elvishNames[0]) + random(elvishNames[1]) + random(elvishNames[3]);
                }
            }
            
            case "Krasnolud":{
                if(sex == "Kobieta"){
                    return random(dwarvishNames[0]) + random(dwarvishNames[1]);
                }
                else {
                    return random(dwarvishNames[0]) + random(dwarvishNames[2]);
                }
            }
            
            case "Niziołek":{
                if(sex == "Kobieta"){
                    return random(halflingsNames[0]) + random(halflingsNames[1]);
                }
                else {
                    return random(halflingsNames[0]) + random(halflingsNames[2]);
                }
            }
            
            default: {
                return "0";
            }
        }
    }
    
    String random(String[] tab){
        Random generator = new Random();
        return  tab[generator.nextInt(tab.length)];
    }
}
