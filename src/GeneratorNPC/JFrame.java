/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneratorNPC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Mateonidas
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();

        ListOfProfessions listOfProfessions = new ListOfProfessions();
        String nameOfProfessions[] = new String[listOfProfessions.list.size()];

        for (int i = 0; i < listOfProfessions.list.size(); i++) {
            nameOfProfessions[i] = listOfProfessions.getListOfProfessions().get(i).getName();
        }

        ListOfRaces listOfRaces = new ListOfRaces();
        String nameOfRaces[] = new String[listOfRaces.list.size()];
        for (int i = 0; i < listOfRaces.list.size(); i++) {
            nameOfRaces[i] = listOfRaces.getLista().get(i).getName();
        }

        sexC.setModel(new DefaultComboBoxModel(new String[]{"Kobieta", "Mężczyzna"}));
        raceC.setModel(new DefaultComboBoxModel(nameOfRaces));
        basicProfessionC.setModel(new DefaultComboBoxModel(nameOfProfessions));
        advancedProfessionC.setModel(new DefaultComboBoxModel(nameOfProfessions));

        blockade();

        basicProfessionC.addActionListener(e -> {
            blockade();
        });

        nameRandom.addActionListener(e -> {
            ListOfNames listOfNames = new ListOfNames(raceC.getSelectedItem().toString(), sexC.getSelectedItem().toString());
            nameF.setText(listOfNames.randomName());
        });

        featuresRandom.addActionListener(e -> {
            Race race = new Race();

            for (Race r:listOfRaces.list) {
                if (r.getName() == raceC.getSelectedItem().toString()) {
                    race = r;
                    wWF.setText("" + (race.getWw() + race.randomFeature()));
                    uSF.setText("" + (race.getUs() + race.randomFeature()));
                    kF.setText("" + (race.getK() + race.randomFeature()));
                    odpF.setText("" + (race.getOdp() + race.randomFeature()));
                    zrF.setText("" + (race.getZr() + race.randomFeature()));
                    inteF.setText("" + (race.getInte() + race.randomFeature()));
                    sWF.setText("" + (race.getSw() + race.randomFeature()));
                    ogdF.setText("" + (race.getOgd() + race.randomFeature()));
                    aF.setText("" + race.getA());
                    zywF.setText("" + race.randomVitality());
                    sF.setText("" + (Integer.parseInt(kF.getText()) / 10));
                    wtF.setText("" + (Integer.parseInt(odpF.getText()) / 10));
                    szF.setText("" + race.getSz());
                    magF.setText("" + race.getMag());
                    pOF.setText("" + race.getPo());
                    pPF.setText("" + race.getPp());

                    break;
                }
            }
        });

        kF.addActionListener(e -> {
            sF.setText("" + (Integer.parseInt(kF.getText()) / 10));
        });
        
        odpF.addActionListener(e -> {
            wtF.setText("" + (Integer.parseInt(odpF.getText()) / 10));
        });
        
        appearanceRandom.addActionListener(e -> {
            Race race = new Race();

            for (Race r:listOfRaces.list) {
                if (r.getName() == raceC.getSelectedItem().toString()) {
                    race = r;

                    heightF.setText(race.randomHeight(sexC.getSelectedItem().toString()) + " cm");
                    ageF.setText(race.randomAge());
                    eyesF.setText(race.randomEyeColor());
                    hairF.setText(race.randomHairColor());
                    starSignF.setText(race.randomStarSign());
                    weightF.setText(race.randomWeight() + " kg");
                    specialCharactersF.setText(race.randomSpecialCharacter());

                    break;
                }
            }
        });

        personalityTraitsRandom.addActionListener(e -> {
            Race race = new Race();

            for (Race r:listOfRaces.list) {
                if (r.getName() == raceC.getSelectedItem().toString()) {
                    race = r;
                    personalityTraitsF.setText(race.randomPersonalityTraits());
                    
                    break;
                }
            }

        });

        random.addActionListener(e -> {
            Profession basicProfession = new Profession();
            Profession advancedProfession = new Profession();
            ArrayList<String> skills = new ArrayList<>();
            ArrayList<String> abilities = new ArrayList<>();
            ArrayList<String> armor = new ArrayList<>();
            ArrayList<String> armament = new ArrayList<>();
            ArrayList<String> equipment = new ArrayList<>();
            
            Race race = new Race();

            ListOfNames listOfNames = new ListOfNames(raceC.getSelectedItem().toString(), sexC.getSelectedItem().toString());
            nameF.setText(listOfNames.randomName());

            skillsA.setText("");
            abilitiesA.setText("");
            armorA.setText("");
            armamentA.setText("");
            equipmentA.setText("");

            for (Profession p:listOfProfessions.list) {
                if (p.getName() == basicProfessionC.getSelectedItem().toString()) {
                    basicProfession = p;
                    for (Profession pr:listOfProfessions.list) {
                        if (pr.getName() == advancedProfessionC.getSelectedItem().toString()) {
                            advancedProfession = pr;
                            wWU.setText(comparisonOfFeatureDevelopment(basicProfession.getWw(), advancedProfession.getWw()));
                            uSU.setText(comparisonOfFeatureDevelopment(basicProfession.getUs(), advancedProfession.getUs()));
                            kU.setText(comparisonOfFeatureDevelopment(basicProfession.getK(), advancedProfession.getK()));
                            odpU.setText(comparisonOfFeatureDevelopment(basicProfession.getOdp(), advancedProfession.getOdp()));
                            zrU.setText(comparisonOfFeatureDevelopment(basicProfession.getZr(), advancedProfession.getZr()));
                            inteU.setText(comparisonOfFeatureDevelopment(basicProfession.getInte(), advancedProfession.getInte()));
                            sWU.setText(comparisonOfFeatureDevelopment(basicProfession.getSw(), advancedProfession.getSw()));
                            ogdU.setText(comparisonOfFeatureDevelopment(basicProfession.getOdp(), advancedProfession.getOdp()));
                            aU.setText(comparisonOfFeatureDevelopment(basicProfession.getA(), advancedProfession.getA()));
                            zywU.setText(comparisonOfFeatureDevelopment(basicProfession.getZyw(), advancedProfession.getZyw()));
                            sU.setText(comparisonOfFeatureDevelopment(basicProfession.getS(), advancedProfession.getS()));
                            wtU.setText(comparisonOfFeatureDevelopment(basicProfession.getWt(), advancedProfession.getWt()));
                            szU.setText(comparisonOfFeatureDevelopment(basicProfession.getSz(), advancedProfession.getSz()));
                            magU.setText(comparisonOfFeatureDevelopment(basicProfession.getMag(), advancedProfession.getMag()));
                            pOU.setText(comparisonOfFeatureDevelopment(basicProfession.getPo(), advancedProfession.getPo()));
                            pPU.setText(comparisonOfFeatureDevelopment(basicProfession.getPp(), advancedProfession.getPp()));

                            pickingCharacteristics(basicProfession, skills, abilities, armor, armament, equipment);
                            pickingCharacteristics(advancedProfession, skills, abilities, armor, armament, equipment);
                            
                            armament.add("broń jednoręczna");
                            armament.add("sztylet");

                            equipment.add("ubranie podróżne");
                            equipment.add("plecak / sakwa");
                            equipment.add("drewniane sztućce");
                            equipment.add("2k10 zk");
                            
                            break;
                        }
                    }
                    break;
                }
            }
            for (Race r:listOfRaces.list) {
                if (r.getName() == raceC.getSelectedItem().toString()) {
                    race = r;

                    heightF.setText(race.randomHeight(sexC.getSelectedItem().toString()) + " cm");
                    ageF.setText(race.randomAge());
                    eyesF.setText(race.randomEyeColor());
                    hairF.setText(race.randomHairColor());
                    starSignF.setText(race.randomStarSign());
                    weightF.setText(race.randomWeight() + " kg");
                    specialCharactersF.setText(race.randomSpecialCharacter());
                    personalityTraitsF.setText(race.randomPersonalityTraits());

                    wWF.setText("" + (race.getWw() + race.randomFeature()));
                    uSF.setText("" + (race.getUs() + race.randomFeature()));
                    kF.setText("" + (race.getK() + race.randomFeature()));
                    odpF.setText("" + (race.getOdp() + race.randomFeature()));
                    zrF.setText("" + (race.getZr() + race.randomFeature()));
                    inteF.setText("" + (race.getInte() + race.randomFeature()));
                    sWF.setText("" + (race.getSw() + race.randomFeature()));
                    ogdF.setText("" + (race.getOgd() + race.randomFeature()));
                    aF.setText("" + race.getA());
                    zywF.setText("" + race.randomVitality());
                    sF.setText("" + (Integer.parseInt(kF.getText()) / 10));
                    wtF.setText("" + (Integer.parseInt(odpF.getText()) / 10));
                    szF.setText("" + race.getSz());
                    magF.setText("" + race.getMag());
                    pOF.setText("" + race.getPo());
                    pPF.setText("" + race.getPp());

                    for (String s:r.getSkills()) {
                        skills.add(s);
                    }
                    
                    Collections.sort(skills);

                    for (String s:skills) {       
                        skillsA.append(" - ");
                        skillsA.append(s);
                        skillsA.append("\n");
                    }

                    if (r.getName() == "Człowiek" || r.getName() == "Niziołek") {
                        r.randomAbilities();
                    }

                    for (String s:r.getAbilities()) {
                        abilities.add(s);
                    }
                    
                    Collections.sort(abilities);
                    
                    for (String s:abilities) {
                        abilitiesA.append(" - ");
                        abilitiesA.append(s);
                        abilitiesA.append("\n");
                    }
                    
                    if (r.getName() == "Człowiek") {
                        r.getAbilities().clear();
                    } else if (r.getName() == "Niziołek") {
                        r.getAbilities().remove(r.ability.size() - 1);
                    }
                    
                    Collections.sort(armor);
                    
                    for(String s:armor){
                        armorA.append(" - ");
                        armorA.append(s);
                        armorA.append("\n");
                    }
                    
                    Collections.sort(armament);
                    
                    for(String s:armament){
                        armamentA.append(" - ");
                        armamentA.append(s);
                        armamentA.append("\n");
                    }
                    
                    Collections.sort(equipment);
                    
                    for(String s:equipment){
                        equipmentA.append(" - ");
                        equipmentA.append(s);
                        equipmentA.append("\n");
                    }

                    break;
                }
            }
        });
    }

    private void blockade() {
        if (basicProfessionC.getSelectedItem().toString() != "-") {
            random.setEnabled(true);
            nameRandom.setEnabled(true);
            advancedProfessionC.setEnabled(true);
            appearanceRandom.setEnabled(true);
            personalityTraitsRandom.setEnabled(true);
            featuresRandom.setEnabled(true);
        } else {
            random.setEnabled(false);
            nameRandom.setEnabled(false);
            advancedProfessionC.setEnabled(false);
            appearanceRandom.setEnabled(false);
            personalityTraitsRandom.setEnabled(false);
            featuresRandom.setEnabled(false);
        }
    }

    private String comparisonOfFeatureDevelopment(String basic, String advanced) {
        if (Integer.parseInt(basic) <= Integer.parseInt(advanced)) {
            if(advanced == "0") return " - ";
            else return advanced;
        } else {
            if(basic == "0") return " - ";
            else return basic;
        }
    }

    private void pickingCharacteristics(Profession profession, ArrayList<String> skills, ArrayList<String> abilities, ArrayList<String> armor, ArrayList<String> armament, ArrayList<String> equipment) {
        for (String s: profession.getSkills()) {
            skills.add(s);
        }
        for (String s: profession.abilities) {
            abilities.add(s);
        }
        for (String s: profession.armor) {
            armor.add(s);
        }
        for (String s: profession.armament) {
            armament.add(s);
        }
        for (String s: profession.equipment) {
            equipment.add(s);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        profession = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        sexC = new javax.swing.JComboBox<>();
        sex = new javax.swing.JLabel();
        raceC = new javax.swing.JComboBox<>();
        race = new javax.swing.JLabel();
        basicProfessionC = new javax.swing.JComboBox<>();
        mainFeatures = new javax.swing.JLabel();
        wW = new javax.swing.JLabel();
        uS = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        odp = new javax.swing.JLabel();
        zr = new javax.swing.JLabel();
        Int = new javax.swing.JLabel();
        sW = new javax.swing.JLabel();
        ogd = new javax.swing.JLabel();
        wWF = new javax.swing.JTextField();
        kF = new javax.swing.JTextField();
        uSF = new javax.swing.JTextField();
        zrF = new javax.swing.JTextField();
        odpF = new javax.swing.JTextField();
        inteF = new javax.swing.JTextField();
        sWF = new javax.swing.JTextField();
        ogdF = new javax.swing.JTextField();
        wWU = new javax.swing.JTextField();
        uSU = new javax.swing.JTextField();
        kU = new javax.swing.JTextField();
        odpU = new javax.swing.JTextField();
        zrU = new javax.swing.JTextField();
        inteU = new javax.swing.JTextField();
        sWU = new javax.swing.JTextField();
        ogdU = new javax.swing.JTextField();
        sF = new javax.swing.JTextField();
        zywF = new javax.swing.JTextField();
        szF = new javax.swing.JTextField();
        wtF = new javax.swing.JTextField();
        magF = new javax.swing.JTextField();
        pOF = new javax.swing.JTextField();
        pPF = new javax.swing.JTextField();
        aU = new javax.swing.JTextField();
        zywU = new javax.swing.JTextField();
        sU = new javax.swing.JTextField();
        secondaryFeatures = new javax.swing.JLabel();
        wtU = new javax.swing.JTextField();
        a = new javax.swing.JLabel();
        szU = new javax.swing.JTextField();
        zyw = new javax.swing.JLabel();
        magU = new javax.swing.JTextField();
        s = new javax.swing.JLabel();
        pOU = new javax.swing.JTextField();
        wt = new javax.swing.JLabel();
        pPU = new javax.swing.JTextField();
        sz = new javax.swing.JLabel();
        mag = new javax.swing.JLabel();
        po = new javax.swing.JLabel();
        pp = new javax.swing.JLabel();
        aF = new javax.swing.JTextField();
        skills = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        skillsA = new javax.swing.JTextArea();
        abilities = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        abilitiesA = new javax.swing.JTextArea();
        armor = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        armorA = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        armamentA = new javax.swing.JTextArea();
        armament = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        equipmentA = new javax.swing.JTextArea();
        equipment = new javax.swing.JLabel();
        random = new javax.swing.JButton();
        nameRandom = new javax.swing.JButton();
        featuresRandom = new javax.swing.JButton();
        height = new javax.swing.JLabel();
        heightF = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        ageF = new javax.swing.JTextField();
        eyes = new javax.swing.JLabel();
        eyesF = new javax.swing.JTextField();
        hair = new javax.swing.JLabel();
        hairF = new javax.swing.JTextField();
        starSign = new javax.swing.JLabel();
        starSignF = new javax.swing.JTextField();
        weight = new javax.swing.JLabel();
        weightF = new javax.swing.JTextField();
        specialCharacters = new javax.swing.JLabel();
        specialCharactersF = new javax.swing.JTextField();
        appearanceRandom = new javax.swing.JButton();
        personalityTraits = new javax.swing.JLabel();
        personalityTraitsF = new javax.swing.JTextField();
        personalityTraitsRandom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        advancedProfessionC = new javax.swing.JComboBox<>();
        nextProfession = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator NPC");
        setPreferredSize(new java.awt.Dimension(1100, 900));
        setResizable(false);

        name.setText("Imię: ");
        name.setName("name"); // NOI18N

        profession.setText("Profesja:");

        nameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFActionPerformed(evt);
            }
        });

        sexC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sexC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexCActionPerformed(evt);
            }
        });

        sex.setText("Płeć: ");

        raceC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        raceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raceCActionPerformed(evt);
            }
        });

        race.setText("Rasa: ");

        basicProfessionC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        mainFeatures.setText("Cechy Główne");

        wW.setText("WW");

        uS.setText("US");

        k.setText("K");

        odp.setText("Odp");

        zr.setText("Zr");

        Int.setText("Int");

        sW.setText("SW");

        ogd.setText("Ogd");

        wWF.setToolTipText("");
        wWF.setMaximumSize(new java.awt.Dimension(1, 3));
        wWF.setMinimumSize(new java.awt.Dimension(1, 2));

        kF.setToolTipText("");
        kF.setMaximumSize(new java.awt.Dimension(1, 3));
        kF.setMinimumSize(new java.awt.Dimension(1, 2));

        uSF.setToolTipText("");
        uSF.setMaximumSize(new java.awt.Dimension(1, 3));
        uSF.setMinimumSize(new java.awt.Dimension(1, 2));

        zrF.setToolTipText("");
        zrF.setMaximumSize(new java.awt.Dimension(1, 3));
        zrF.setMinimumSize(new java.awt.Dimension(1, 2));
        zrF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrFActionPerformed(evt);
            }
        });

        odpF.setToolTipText("");
        odpF.setMaximumSize(new java.awt.Dimension(1, 3));
        odpF.setMinimumSize(new java.awt.Dimension(1, 2));

        inteF.setToolTipText("");
        inteF.setMaximumSize(new java.awt.Dimension(1, 3));
        inteF.setMinimumSize(new java.awt.Dimension(1, 2));
        inteF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inteFActionPerformed(evt);
            }
        });

        sWF.setToolTipText("");
        sWF.setMaximumSize(new java.awt.Dimension(1, 3));
        sWF.setMinimumSize(new java.awt.Dimension(1, 2));
        sWF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sWFActionPerformed(evt);
            }
        });

        ogdF.setToolTipText("");
        ogdF.setMaximumSize(new java.awt.Dimension(1, 3));
        ogdF.setMinimumSize(new java.awt.Dimension(1, 2));
        ogdF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogdFActionPerformed(evt);
            }
        });

        wWU.setToolTipText("");
        wWU.setMaximumSize(new java.awt.Dimension(1, 3));
        wWU.setMinimumSize(new java.awt.Dimension(1, 2));
        wWU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wWUActionPerformed(evt);
            }
        });

        uSU.setToolTipText("");
        uSU.setMaximumSize(new java.awt.Dimension(1, 3));
        uSU.setMinimumSize(new java.awt.Dimension(1, 2));

        kU.setToolTipText("");
        kU.setMaximumSize(new java.awt.Dimension(1, 3));
        kU.setMinimumSize(new java.awt.Dimension(1, 2));

        odpU.setToolTipText("");
        odpU.setMaximumSize(new java.awt.Dimension(1, 3));
        odpU.setMinimumSize(new java.awt.Dimension(1, 2));

        zrU.setToolTipText("");
        zrU.setMaximumSize(new java.awt.Dimension(1, 3));
        zrU.setMinimumSize(new java.awt.Dimension(1, 2));
        zrU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrUActionPerformed(evt);
            }
        });

        inteU.setToolTipText("");
        inteU.setMaximumSize(new java.awt.Dimension(1, 3));
        inteU.setMinimumSize(new java.awt.Dimension(1, 2));
        inteU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inteUActionPerformed(evt);
            }
        });

        sWU.setToolTipText("");
        sWU.setMaximumSize(new java.awt.Dimension(1, 3));
        sWU.setMinimumSize(new java.awt.Dimension(1, 2));
        sWU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sWUActionPerformed(evt);
            }
        });

        ogdU.setToolTipText("");
        ogdU.setMaximumSize(new java.awt.Dimension(1, 3));
        ogdU.setMinimumSize(new java.awt.Dimension(1, 2));
        ogdU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogdUActionPerformed(evt);
            }
        });

        sF.setToolTipText("");
        sF.setMaximumSize(new java.awt.Dimension(1, 3));
        sF.setMinimumSize(new java.awt.Dimension(1, 2));

        zywF.setToolTipText("");
        zywF.setMaximumSize(new java.awt.Dimension(1, 3));
        zywF.setMinimumSize(new java.awt.Dimension(1, 2));

        szF.setToolTipText("");
        szF.setMaximumSize(new java.awt.Dimension(1, 3));
        szF.setMinimumSize(new java.awt.Dimension(1, 2));
        szF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szFActionPerformed(evt);
            }
        });

        wtF.setToolTipText("");
        wtF.setMaximumSize(new java.awt.Dimension(1, 3));
        wtF.setMinimumSize(new java.awt.Dimension(1, 2));

        magF.setToolTipText("");
        magF.setMaximumSize(new java.awt.Dimension(1, 3));
        magF.setMinimumSize(new java.awt.Dimension(1, 2));
        magF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magFActionPerformed(evt);
            }
        });

        pOF.setToolTipText("");
        pOF.setMaximumSize(new java.awt.Dimension(1, 3));
        pOF.setMinimumSize(new java.awt.Dimension(1, 2));
        pOF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pOFActionPerformed(evt);
            }
        });

        pPF.setToolTipText("");
        pPF.setMaximumSize(new java.awt.Dimension(1, 3));
        pPF.setMinimumSize(new java.awt.Dimension(1, 2));
        pPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPFActionPerformed(evt);
            }
        });

        aU.setToolTipText("");
        aU.setMaximumSize(new java.awt.Dimension(1, 3));
        aU.setMinimumSize(new java.awt.Dimension(1, 2));

        zywU.setToolTipText("");
        zywU.setMaximumSize(new java.awt.Dimension(1, 3));
        zywU.setMinimumSize(new java.awt.Dimension(1, 2));

        sU.setToolTipText("");
        sU.setMaximumSize(new java.awt.Dimension(1, 3));
        sU.setMinimumSize(new java.awt.Dimension(1, 2));

        secondaryFeatures.setText("Cechy Drugorzędne");

        wtU.setToolTipText("");
        wtU.setMaximumSize(new java.awt.Dimension(1, 3));
        wtU.setMinimumSize(new java.awt.Dimension(1, 2));

        a.setText("A");

        szU.setToolTipText("");
        szU.setMaximumSize(new java.awt.Dimension(1, 3));
        szU.setMinimumSize(new java.awt.Dimension(1, 2));
        szU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szUActionPerformed(evt);
            }
        });

        zyw.setText("Żyw");

        magU.setToolTipText("");
        magU.setMaximumSize(new java.awt.Dimension(1, 3));
        magU.setMinimumSize(new java.awt.Dimension(1, 2));
        magU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magUActionPerformed(evt);
            }
        });

        s.setText("S");

        pOU.setToolTipText("");
        pOU.setMaximumSize(new java.awt.Dimension(1, 3));
        pOU.setMinimumSize(new java.awt.Dimension(1, 2));
        pOU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pOUActionPerformed(evt);
            }
        });

        wt.setText("Wt");

        pPU.setToolTipText("");
        pPU.setMaximumSize(new java.awt.Dimension(1, 3));
        pPU.setMinimumSize(new java.awt.Dimension(1, 2));
        pPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPUActionPerformed(evt);
            }
        });

        sz.setText("Sz");

        mag.setText("Mag");

        po.setText("PO");

        pp.setText("PP");

        aF.setToolTipText("");
        aF.setMaximumSize(new java.awt.Dimension(1, 3));
        aF.setMinimumSize(new java.awt.Dimension(1, 2));

        skills.setText("Umiejętności");

        skillsA.setColumns(20);
        skillsA.setRows(5);
        jScrollPane1.setViewportView(skillsA);

        abilities.setText("Zdolności");

        abilitiesA.setColumns(20);
        abilitiesA.setRows(5);
        jScrollPane2.setViewportView(abilitiesA);

        armor.setText("Pancerz");

        armorA.setColumns(20);
        armorA.setRows(5);
        jScrollPane3.setViewportView(armorA);

        armamentA.setColumns(20);
        armamentA.setRows(5);
        jScrollPane4.setViewportView(armamentA);

        armament.setText("Uzbrojenie");

        equipmentA.setColumns(20);
        equipmentA.setRows(5);
        jScrollPane5.setViewportView(equipmentA);

        equipment.setText("Wyposażenie");

        random.setText("Losuj postać");
        random.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randomMouseClicked(evt);
            }
        });
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });

        nameRandom.setText("Losuj imię");
        nameRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRandomActionPerformed(evt);
            }
        });

        featuresRandom.setText("Losuj cechy");
        featuresRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featuresRandomActionPerformed(evt);
            }
        });

        height.setText("Wzrost:");

        heightF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFActionPerformed(evt);
            }
        });

        age.setText("Wiek: ");

        ageF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFActionPerformed(evt);
            }
        });

        eyes.setText("Kolor oczu:");

        eyesF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyesFActionPerformed(evt);
            }
        });

        hair.setText("Kolor włosów:");

        starSign.setText("Znak gwiezdny:");

        weight.setText("Waga:");

        weightF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFActionPerformed(evt);
            }
        });

        specialCharacters.setText("Znaki szczególne:");

        appearanceRandom.setText("Losuj Wygląd");

        personalityTraits.setText("Cechy osobowości:");

        personalityTraitsRandom.setText("Losuj cechy osobowości");

        jLabel2.setText("© Mateusz Połeć");

        advancedProfessionC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nextProfession.setText("Kolejna profesja:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(random)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(463, 463, 463))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sex)
                            .addComponent(race)
                            .addComponent(profession)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nextProfession)
                                    .addComponent(name))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(raceC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(basicProfessionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(advancedProfessionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nameRandom))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wWF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wW, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uSF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(odp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(odpF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zrF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inteF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sWF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ogdF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Int, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sW, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ogd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(zyw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zywF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wtF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mag, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(po, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(szF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(magF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pOF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pPF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wWU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uSU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(odpU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zrU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inteU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sWU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ogdU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zywU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wtU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(szU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(magU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pOU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pPU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(secondaryFeatures)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(specialCharacters)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(starSignF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(hairF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(eyesF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ageF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(height)
                                                .addComponent(weight))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(weightF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(heightF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(appearanceRandom))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(personalityTraitsRandom)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(featuresRandom)
                                            .addComponent(specialCharactersF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(personalityTraitsF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(eyes)
                            .addComponent(hair)
                            .addComponent(starSign)
                            .addComponent(age)
                            .addComponent(mainFeatures)
                            .addComponent(personalityTraits))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(armament)
                                        .addGap(163, 163, 163))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(abilities)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(equipment)
                                        .addGap(147, 147, 147))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(skills)
                                .addGap(203, 203, 203)
                                .addComponent(armor)))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(random)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sex)
                            .addComponent(sexC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(race)
                            .addComponent(raceC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profession)
                            .addComponent(basicProfessionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(advancedProfessionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextProfession))
                        .addGap(18, 18, 18)
                        .addComponent(appearanceRandom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(height, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(age)
                                .addComponent(heightF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eyes)
                            .addComponent(eyesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hair)
                            .addComponent(hairF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(starSign)
                            .addComponent(starSignF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameRandom)
                            .addComponent(skills)
                            .addComponent(armor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(armament)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialCharactersF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialCharacters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personalityTraitsRandom)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personalityTraits)
                            .addComponent(personalityTraitsF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainFeatures)
                            .addComponent(featuresRandom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wW)
                            .addComponent(uS)
                            .addComponent(k)
                            .addComponent(odp)
                            .addComponent(zr)
                            .addComponent(Int)
                            .addComponent(sW)
                            .addComponent(ogd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wWF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odpF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zrF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inteF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sWF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wWU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odpU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zrU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inteU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sWU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogdU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(secondaryFeatures)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a)
                            .addComponent(zyw)
                            .addComponent(s)
                            .addComponent(wt)
                            .addComponent(sz)
                            .addComponent(mag)
                            .addComponent(po)
                            .addComponent(pp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zywF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(szF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(magF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pOF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zywU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(szU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(magU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pOU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abilities, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(equipment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(111, 111, 111))
        );

        sF.getAccessibleContext().setAccessibleName("");
        zywF.getAccessibleContext().setAccessibleName("");
        szF.getAccessibleContext().setAccessibleName("");
        wtF.getAccessibleContext().setAccessibleName("");
        magF.getAccessibleContext().setAccessibleName("");
        pOF.getAccessibleContext().setAccessibleName("");
        pPF.getAccessibleContext().setAccessibleName("");
        aU.getAccessibleContext().setAccessibleName("");
        zywU.getAccessibleContext().setAccessibleName("");
        sU.getAccessibleContext().setAccessibleName("");
        wtU.getAccessibleContext().setAccessibleName("");
        a.getAccessibleContext().setAccessibleName("");
        szU.getAccessibleContext().setAccessibleName("");
        zyw.getAccessibleContext().setAccessibleName("");
        magU.getAccessibleContext().setAccessibleName("");
        s.getAccessibleContext().setAccessibleName("");
        pOU.getAccessibleContext().setAccessibleName("");
        wt.getAccessibleContext().setAccessibleName("");
        pPU.getAccessibleContext().setAccessibleName("");
        sz.getAccessibleContext().setAccessibleName("");
        mag.getAccessibleContext().setAccessibleName("");
        po.getAccessibleContext().setAccessibleName("");
        pp.getAccessibleContext().setAccessibleName("");
        aF.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFActionPerformed

    private void sexCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexCActionPerformed

    private void raceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raceCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raceCActionPerformed

    private void zrFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zrFActionPerformed

    private void inteFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inteFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inteFActionPerformed

    private void sWFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sWFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sWFActionPerformed

    private void ogdFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogdFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogdFActionPerformed

    private void zrUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zrUActionPerformed

    private void inteUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inteUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inteUActionPerformed

    private void sWUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sWUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sWUActionPerformed

    private void ogdUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogdUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogdUActionPerformed

    private void szFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_szFActionPerformed

    private void magFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magFActionPerformed

    private void pOFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pOFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pOFActionPerformed

    private void pPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPFActionPerformed

    private void szUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_szUActionPerformed

    private void magUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magUActionPerformed

    private void pOUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pOUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pOUActionPerformed

    private void pPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPUActionPerformed

    private void wWUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wWUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wWUActionPerformed

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_randomActionPerformed

    private void randomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_randomMouseClicked

    private void nameRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRandomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameRandomActionPerformed

    private void featuresRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featuresRandomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_featuresRandomActionPerformed

    private void heightFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightFActionPerformed

    private void ageFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFActionPerformed

    private void weightFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightFActionPerformed

    private void eyesFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyesFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eyesFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Int;
    private javax.swing.JLabel a;
    private javax.swing.JTextField aF;
    private javax.swing.JTextField aU;
    private javax.swing.JLabel abilities;
    private javax.swing.JTextArea abilitiesA;
    private javax.swing.JComboBox<String> advancedProfessionC;
    private javax.swing.JLabel age;
    private javax.swing.JTextField ageF;
    private javax.swing.JButton appearanceRandom;
    private javax.swing.JLabel armament;
    private javax.swing.JTextArea armamentA;
    private javax.swing.JLabel armor;
    private javax.swing.JTextArea armorA;
    private javax.swing.JComboBox<String> basicProfessionC;
    private javax.swing.JLabel equipment;
    private javax.swing.JTextArea equipmentA;
    private javax.swing.JLabel eyes;
    private javax.swing.JTextField eyesF;
    private javax.swing.JButton featuresRandom;
    private javax.swing.JLabel hair;
    private javax.swing.JTextField hairF;
    private javax.swing.JLabel height;
    private javax.swing.JTextField heightF;
    private javax.swing.JTextField inteF;
    private javax.swing.JTextField inteU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel k;
    private javax.swing.JTextField kF;
    private javax.swing.JTextField kU;
    private javax.swing.JLabel mag;
    private javax.swing.JTextField magF;
    private javax.swing.JTextField magU;
    private javax.swing.JLabel mainFeatures;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameF;
    private javax.swing.JButton nameRandom;
    private javax.swing.JLabel nextProfession;
    private javax.swing.JLabel odp;
    private javax.swing.JTextField odpF;
    private javax.swing.JTextField odpU;
    private javax.swing.JLabel ogd;
    private javax.swing.JTextField ogdF;
    private javax.swing.JTextField ogdU;
    private javax.swing.JTextField pOF;
    private javax.swing.JTextField pOU;
    private javax.swing.JTextField pPF;
    private javax.swing.JTextField pPU;
    private javax.swing.JLabel personalityTraits;
    private javax.swing.JTextField personalityTraitsF;
    private javax.swing.JButton personalityTraitsRandom;
    private javax.swing.JLabel po;
    private javax.swing.JLabel pp;
    private javax.swing.JLabel profession;
    private javax.swing.JLabel race;
    private javax.swing.JComboBox<String> raceC;
    private javax.swing.JButton random;
    private javax.swing.JLabel s;
    private javax.swing.JTextField sF;
    private javax.swing.JTextField sU;
    private javax.swing.JLabel sW;
    private javax.swing.JTextField sWF;
    private javax.swing.JTextField sWU;
    private javax.swing.JLabel secondaryFeatures;
    private javax.swing.JLabel sex;
    private javax.swing.JComboBox<String> sexC;
    private javax.swing.JLabel skills;
    private javax.swing.JTextArea skillsA;
    private javax.swing.JLabel specialCharacters;
    private javax.swing.JTextField specialCharactersF;
    private javax.swing.JLabel starSign;
    private javax.swing.JTextField starSignF;
    private javax.swing.JLabel sz;
    private javax.swing.JTextField szF;
    private javax.swing.JTextField szU;
    private javax.swing.JLabel uS;
    private javax.swing.JTextField uSF;
    private javax.swing.JTextField uSU;
    private javax.swing.JLabel wW;
    private javax.swing.JTextField wWF;
    private javax.swing.JTextField wWU;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightF;
    private javax.swing.JLabel wt;
    private javax.swing.JTextField wtF;
    private javax.swing.JTextField wtU;
    private javax.swing.JLabel zr;
    private javax.swing.JTextField zrF;
    private javax.swing.JTextField zrU;
    private javax.swing.JLabel zyw;
    private javax.swing.JTextField zywF;
    private javax.swing.JTextField zywU;
    // End of variables declaration//GEN-END:variables
}
