package BasicProfessions;

import GeneratorNPC.*;

public class  Cyrkowiec extends Profession{
    public Cyrkowiec(){
        name = "Cyrkowiec";
        
        wW = "+5";
        uS = "+10";
        zr = "+10";
        sW = "+5";
        ogd = "+10";
        zyw = "+2";
        
        skills.add("kuglarstwo (dowolne dwa)");
        skills.add("opieka nad zwierzętami / pływanie");
        skills.add("przekonywanie");
        skills.add("spostrzegawczość");
        skills.add("wiedza (Imperium)");
        skills.add("wycena / plotkowanie");
        skills.add("znajomość języka (staroświatowy)");
        skills.add("brzuchomóstwo / gadanina / hipnoza / jeździectwo / oswajanie / tresura / wspinaczka / zwinne palce");
        
        abilities.add("dwie zdolności z:");
        abilities.add("bardzo silny (+5 K)");
        abilities.add("broń specjalna (rzucana)");
        abilities.add("naśladowca");
        abilities.add("przemawianie");
        abilities.add("strzał mierzony");
        abilities.add("szybki refleks (+5 Zr)");
        abilities.add("szybkie wyciągnięcie");
        abilities.add("woltyżerka");
        abilities.add("zapasy");
        
        armor.add("skórzany kaftan (korpus: 1)");
        equipment.add("3 noże do rzucania / 2 topory do rzucania / instrument muzyczny (dowolny) / narzędzia (kuglarz)");
        equipment.add("kostium cyrkowca (dowolny) / ubranie dobrej jakości");
    }
}