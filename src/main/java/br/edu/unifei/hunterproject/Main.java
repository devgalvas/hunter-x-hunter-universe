package br.edu.unifei.hunterproject;

import br.edu.unifei.hunterproject.Hunters.Hunter;
import br.edu.unifei.hunterproject.Hunters.NenTraining;
import br.edu.unifei.hunterproject.Hunters.PhysicalTraining;
import br.edu.unifei.hunterproject.Hunters.President;
import br.edu.unifei.hunterproject.Hunters.VicePresident;
import br.edu.unifei.hunterproject.Hunters.Zodiacs;
import br.edu.unifei.hunterproject.Terrain.City;
import br.edu.unifei.hunterproject.Terrain.Continent;
import br.edu.unifei.hunterproject.Terrain.GeographicalFeature;
import br.edu.unifei.hunterproject.Terrain.HuntingSite;
import br.edu.unifei.hunterproject.Terrain.Region;
import br.edu.unifei.hunterproject.Terrain.TerrainTypeEnum;
import br.edu.unifei.hunterproject.Terrain.cityEnum;
import br.edu.unifei.hunterproject.animals.Mamal;
import br.edu.unifei.hunterproject.animals.Reptile;
import br.edu.unifei.hunterproject.ChimeraAnts.AntsHierarchyEnum;
import br.edu.unifei.hunterproject.ChimeraAnts.ChimeraAnt;
import br.edu.unifei.hunterproject.ChimeraAnts.Queen;
import br.edu.unifei.hunterproject.Hunters.CommonWorker;
import br.edu.unifei.hunterproject.Hunters.Family;
import br.edu.unifei.hunterproject.Hunters.Human;
import br.edu.unifei.hunterproject.groups.Event;
import br.edu.unifei.hunterproject.groups.Exam;
import br.edu.unifei.hunterproject.groups.HunterAssociation;
import br.edu.unifei.hunterproject.groups.PhantomTroupe;
import br.edu.unifei.hunterproject.groups.Test;
import br.edu.unifei.hunterproject.nen.Gyo;
import br.edu.unifei.hunterproject.nen.Hatsu;
import br.edu.unifei.hunterproject.nen.Nen;
import br.edu.unifei.hunterproject.nen.NenUserTypeEnum;
import br.edu.unifei.hunterproject.nen.Ren;
import br.edu.unifei.hunterproject.nen.Ten;
import br.edu.unifei.hunterproject.plants.Tree;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Terrible monsters, exotic creatures, enourmous treasures, hidden treasures, mistic places, unexplored frontiers, the misterious unknown, there is magic in which words...");
        System.out.println("Those who are fascinated by that magic, are called Hunters...");
        Thread.sleep(4000);
        System.out.println("\n");

        City whale_island = new City();
        whale_island.setName("Whale Island");
        whale_island.setType(cityEnum.ISLAND);  

        System.out.println("Welcome to " + whale_island.getName() + ", a small island located in the middle of the ocean, known for its lush forests, crystal-clear waters, and friendly inhabitants.");
        Thread.sleep(2000);
        System.out.println("\n");

        Human gon = new Human();
        gon.setName("Gon");
        gon.setAge(12);
        gon.setSex("Male");
        Family freecs = new Family();
        freecs.setSurname("Freecs");
        gon.setFamily(freecs);
        System.out.println(gon.getName() + " " + gon.getFamily().getSurname() + " is " + gon.getAge() + " years old and is a " + gon.getSex() + 
            " with a strong sense of adventure, determination, and a heart of gold.");
        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("He is the son of Ging Freecs, a legendary Hunter, and is on a quest to find his father and become a Hunter himself.");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("To achieve his dream, he caught a legendary fish and as it promised by his aunt, he can apply to the Hunter Exam, a series of grueling tests that will push him to his limits.");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("Will Gon be able to overcome the challenges that await him and become a Hunter?");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("Gon embark on a ship, where he meets other aspiring Hunters, each with their own unique abilities and motivations.");
        Thread.sleep(2000);
        System.out.println("\n");

        Human leorio = new Human();
        Family paradinight = new Family();  
        paradinight.setSurname("Paradinight");
        leorio.setName("Leorio");
        leorio.setAge(20);
        leorio.setSex("Male");
        leorio.setFamily(paradinight);

        Human kurapika = new Human();
        Family kurta = new Family();
        kurta.setSurname("Kurta");
        kurapika.setName("Kurapika");
        kurapika.setAge(17);
        kurapika.setSex("Male");
        kurapika.setFamily(kurta);

        System.out.println( gon.getName() + " meets " + leorio.getName() + " " + leorio.getFamily().getSurname() + ", a medical student with a heart of gold and a desire to become a doctor.");
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("He also meets " + kurapika.getName() + " " + kurapika.getFamily().getSurname() + ", the last surviving member of the Kurta Clan, who seeks to avenge his people and recover their stolen eyes.");
        System.out.println("\n");
        Thread.sleep(1000);

        HunterAssociation hunter_association = HunterAssociation.getHunter_association();
        hunter_association.setPurpose("Be the association of the hunters, managing the exams and the hunters.");
        Exam hunter_exam = new Exam();
        hunter_association.setHunter_exam(hunter_exam);
        hunter_association.getHunter_exam().setName("Hunter Exam");
        hunter_association.setPurpose("To test the skills, abilities, and determination of aspiring Hunters.");
        
        System.out.println("The " + hunter_association.getHunter_exam().getName() + " is about to begin. Good luck to all the participants!" + 
            "But first, our particpants must pass the pre-exam, containing 3 tests.");
            System.out.println("\n");

        Thread.sleep(1000);
        
        Test t1 = new Test();
        t1.setDescription("Ship Test: Survive to a storm in a ship.");
        Test t2 = new Test();
        t2.setDescription("Quiz Test: Answer correctly to a quiz.");
        Test t3 = new Test();
        t3.setDescription("Kiriko's Test: Find the Kiriko in the forest, disguised as humans.");
        
        System.out.println("The first test is the " + t1.getDescription());
        Thread.sleep(2000);
        System.out.println("\n");
        
        System.out.println("The second test is the " + t2.getDescription());
        Thread.sleep(2000);
        System.out.println("\n");
        
        System.out.println("The third test is the " + t3.getDescription());
        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("After passing the pre-exam, the participants are now ready to take the " + hunter_association.getHunter_exam().getName() + ".");
        Thread.sleep(2000);
        System.out.println("\n");

        Human satotz = new Human();
        satotz.setName("Satotz");
        System.out.println("The first part of the exam is the " + hunter_association.getHunter_exam().getName() + " is to run with the judge" + satotz.getName() + " without knowing the destination or the time that it takes to reach it.");
        System.out.println("\n");

        Thread.sleep(2000);

        Human killua = new Human();
        killua.setName("Killua");
        killua.setAge(12);
        killua.setSex("Male");
        Family zoldyck = new Family();
        zoldyck.setSurname("Zoldyck");
        killua.setFamily(zoldyck);

        System.out.println("Gon meets " + killua.getName() + " " + killua.getFamily().getSurname() + ", a former assassin from the Zoldyck family who seeks to break free from his family's control and live life on his own terms.");
        Thread.sleep(2000);
        System.out.println("\n");
        
        System.out.println("Together, Gon, Leorio, Kurapika, and Killua face the challenges of the " + hunter_association.getHunter_exam().getName() + ", forming a bond that will last a lifetime.");
        Thread.sleep(2000);
        System.out.println("\n");
        
        Test t21 = new Test();
        HuntingSite milsy_wetlands = new HuntingSite();
        milsy_wetlands.setName("Milsy Wetlands");
        milsy_wetlands.setTerrain(TerrainTypeEnum.WETLANDS);
        t21.setDescription("Come along with the judge " + satotz.getName() + " to the " + milsy_wetlands.getName() + " .");
        Thread.sleep(2000);
        
        Human hisoka = new Human();
        hisoka.setName("Hisoka");
        hisoka.setAge(28);
        
        System.out.println("Suddenly, a card kills the judge " + satotz.getName() + " and the participants are now in the middle of the " + milsy_wetlands.getName() + " with no idea of what to do.");
        satotz.setLive(false);
        System.out.println("\n");
        Thread.sleep(2000);
        System.out.println("When the participants look around, they see that the judge was a creature disguised and they become surprised with " + hisoka.getName());
        System.out.println("\n");
        Thread.sleep(2000);
        System.out.println("The four friends separate and " + kurapika.getName() + " and " + leorio.getName() + " face " + hisoka.getName());
        System.out.println("\n");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("Kurapika could scape but Leorio was defeated by Hisoka. But is saved by gon. Hisoka is impressed by Gon's determination and decides to let them go.");
        System.out.println("\n");
        
        Thread.sleep(2000);

        System.out.println("Now, we initiate the second part of the " + hunter_association.getHunter_exam().getName() + ".");
        System.out.println("\n");
        
        Thread.sleep(2000);
        Test t22 = new Test();
        Mamal great_stamp = new Mamal();
        great_stamp.setSpecie("Great Stamp");
        great_stamp.setWeight(1000f);
        great_stamp.setHeight(2f);

        Human menchi = new Human();
        Human buhara = new Human();

        menchi.setName("Menchi");
        buhara.setName("Buhara");

        Hunter menchi_h = new Hunter();
        menchi.setOccupation(menchi_h);

        Hunter buhara_h = new Hunter();
        buhara.setOccupation(buhara_h);

        t22.setDescription("Hunt a " + great_stamp.getSpecie() + " and cook it for the Judges: " + menchi.getName() + " and " + buhara.getName());
        Thread.sleep(2000);
        System.out.println("However, none of the participants were able to cook a dish that make the judges happy.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human netero = new Human();
        netero.setName("Isaac Netero");
        netero.setAge(125);
        netero.setSex("Male");
        
        President netero_h = President.getPresident();
        netero.setOccupation(netero_h);
        System.out.println("The president " + netero.getName() + " asks to Menchi to create another test. ");
        Thread.sleep(2000);
        System.out.println("\n");

        Test t23 = new Test();
        t23.setDescription("Hunt a spider eagle and bring it for the Judges: " + menchi.getName() + " and " + buhara.getName() + " in a deep abissal cave.");
        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("The participants are now in the cave and they face the spider eagle. Gon, Leorio, Kurapika, and Killua work together and bring the eggs to the judges.");
        Thread.sleep(2000);
        System.out.println("Now they need to use the airship to go to the next test.");
        System.out.println("\n");
        Thread.sleep(2000);
        System.out.println("Killua and Gon start to talk about the next test and Killua reveals that he is a former assassin of the family " + killua.getFamily().getSurname());
        System.out.println("\n");
        Thread.sleep(2000);
        System.out.println("Gon is surprised but he says that he doesn't care about Killua's past and that he considers him a friend.");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println( netero.getName() + " listens to the dialogue and proposes a game that consist in take the ball of his hand for the two youngsters.");
        System.out.println("If one of them could take the ball, they will pass the exam and become hunters without needing to end the exam.");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("Killua try a few times, but give it up, because Netero is in a whole different level");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("Gon, however, try for all the night long until he finally becomes asleep, but Netero's admire his determination.");
        Thread.sleep(2000);
        System.out.println("\n");

        Test t24 = new Test();
        t24.setDescription("Reach the bottom of Trick Tower in 72h.");
        
        System.out.println("For the third part of the exam the participants need to " + t24.getDescription());
        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("The participants need to face a few enemies, and they discovered that the enemies are prisioners from the tower, who will have 1 year of sentence reduced for every hour delayed for the participants.");
        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("Gon, Leorio, Kurapika, and Killua face the challenges of the Trick Tower, and they manage to reach the bottom in time.");
        Thread.sleep(2000);
        System.out.println("\n");

        Test t25 = new Test();
        t25.setDescription("Reach the Zevil Island and make 6 pts to be able to succeed: " + 
        "\n1. Take the badge from your prey - 3pts\n" +
        "2. Take the badge from another participant - 1pts\n" +
        "3- Your own tag value - 3pts\n");
        System.out.println("For the fourth part of the exam the participants need to " + t25.getDescription());
        Thread.sleep(2000);
        System.out.println("Knowing that, the participants were entering in the Island, 1 by 1, with 2 minutes of delay from one another.");
        System.out.println("\n");

        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("The prey of Gon is Hisoka, he takes the badge from him using his fishing rod, but suddenly is attacked by a paralisant dard.");
        System.out.println("Hisoka saw all the situation, kill the participant that trhew the dard and give the badges back to Gon.");
        System.out.println("\n");
        Thread.sleep(2000);
        System.out.println("Gon rewfuses to let Hisoka go without his tag, but Hisoka reveals the true reason to keep Gon alive: he wants to fight him when he becomes stronger.");
        System.out.println("\n");
        Thread.sleep(2000); 
        System.out.println("Hisoka punches Gon, that becomes unconscious. When he woke up, he encounter Kurapika and Leorio.");
        System.out.println("The trio decide to find Ponzo, the prey of Leorio.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon smell a strange smell from a cave and concludes that it is Ponzo because she is a chemical specialist.");
        System.out.println("\n");

        Thread.sleep(2000);
        System.out.println("Leorio enters in the cave");
        System.out.println("\n");

        Thread.sleep(5000);
        System.out.println("It's been a while since Leorio entered the cave, Gon and Kurapika are worried about him and decide to enter too.");
        System.out.println("\n");

        Thread.sleep(2000);
        System.out.println("They find Leorio, but he is in a bad shape, he was attacked by snakes and is poisoned.");
        System.out.println("\n");

        Thread.sleep(2000);

        System.out.println("They find Ponzo too, and she explains the situation for them. Gon and Leorio were bitten by the snakes, and they need to find the antidote.");
        System.out.println("\n");

        Thread.sleep(2000);
        System.out.println("They make a plan and leave the cave, with the antidote for Leorio and Gon.");
        System.out.println("\n");

        Thread.sleep(2000);
        System.out.println("The plan was a sucess. Gon and Leorio are cured and they leave for the final test.");
        System.out.println("Nine candidates were approved to the final stage. ");
        Thread.sleep(2000);
        System.out.println("\n");


        Test final_of_exam = new Test();
        final_of_exam.setDescription("1v1 Battles beetwen the participants.\n" + 
        "It's not allowed to kill\n" + "Your oponent must admit the loss.\n");
        
        System.out.println("The final stage of the " + hunter_association.getHunter_exam().getName() + " is about to begin. " + final_of_exam.getDescription());
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("The first battle is between Gon and Hanzo. Gon refuses to give up, even after being severely beaten by Hanzo.");
        Thread.sleep(2000);
        System.out.println("\n");
        System.out.println("Gon's determination and refusal to admit defeat impresses Hanzo, who surrenders and admits defeat.");
        Thread.sleep(2000);
        System.out.println("\n");

        Hunter gon_hunter = new Hunter();
        gon.setOccupation(gon_hunter);
        gon_hunter.setStars(0);

        Human illumi = new Human();
        illumi.setName("Illumi");
        illumi.setAge(28);
        illumi.setFamily(zoldyck);
        System.out.println("The examiner, Satotz, explains that Killua doesn't classified because Gittarackur, were actually his brother" + illumi.getName() + " " + illumi.getFamily() + " in disguise.");
        Thread.sleep(2000);
        System.out.println("Illumi says to Killua that he must not be a hunter, because he is an assassin.");
        Thread.sleep(2000);
        System.out.println("Killua says that he doesn't care about being a hunter, he just want to hang out with Gon. ");
        Thread.sleep(2000);
        System.out.println("Illumi says that he will kill Gon if Killua doesn't come back home and follow the family's orders.");
        Thread.sleep(2000);
        System.out.println("Killua surrenders. But after a while, he kills the oponent of Leorio and is disclassified.");
        Thread.sleep(2000);
        System.out.println("All the remaining candidates receives their Hunter licenses.");
        Thread.sleep(2000);

        Hunter hisoka_h = new Hunter();
        hisoka.setOccupation(hisoka_h);

        Hunter kurapika_h = new Hunter();
        kurapika.setOccupation(kurapika_h);

        Hunter leorio_h = new Hunter();
        leorio.setOccupation(leorio_h);

        Hunter illumi_h = new Hunter();
        illumi.setOccupation(illumi_h);

        System.out.println("When Gon discovered everything, he decides to talk to Illumi to know where Killua is. He broke Illumi's arm and Illumi reveals that Killua is in the Zoldyck's house.");
        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("Gon, Kurapika, and Leorio decide to go to the Zoldyck's house to rescue Killua.");
        Thread.sleep(2000);
        System.out.println("\n");

        Continent africa = new Continent();
        GeographicalFeature africa_geo = new GeographicalFeature();
        africa.setName("Africa");
        africa_geo.setClimate("Tropical");
        africa_geo.setTerrain(TerrainTypeEnum.SAVANNAH);
        africa.setGeography(africa_geo);

        Region republic_of_padokia = new Region();
        City mountain_kokuroo = new City();
        mountain_kokuroo.setName("Mountain Kokuroo");
        mountain_kokuroo.setType(cityEnum.MOUNTAIN);
        republic_of_padokia.setName("Republic of Padokia");

        System.out.println("The zoldyck's house is located in the " + mountain_kokuroo.getName() + ", a mountain in the " + republic_of_padokia.getName() + ", in the continent of " + africa.getName() + ".");
        System.out.println("\n");

        System.out.println("They reach the Zoldyck's house, in the verefication gate, they face the doorkeeper, Zebro.");
        System.out.println("To advance, they need to open the door, but has the weight of 2 tons.");
        Thread.sleep(2000);
        System.out.println("\n");
        
        PhysicalTraining gon_pt = new PhysicalTraining();
        gon_pt.trainingSession();

        PhysicalTraining kurapika_pt = new PhysicalTraining();
        kurapika_pt.trainingSession();

        PhysicalTraining leorio_pt = new PhysicalTraining();
        leorio_pt.trainingSession();

        System.out.println("After a few days of training, they are able to open the door and advance to the next stage.");
        Thread.sleep(2000);
        System.out.println("\n");

        System.out.println("In the path to the mansion, they found Canary, a servant of the Zoldyck family.");
        System.out.println("\n");
        Human canary = new Human();
        canary.setName("Canary");
        canary.setAge(14);
        canary.setSex("Female");
        Thread.sleep(2000);

        Human milluki = new Human();
        milluki.setName("Milluki");
        milluki.setFamily(zoldyck);
        milluki.setAge(17);

        Human kykio = new Human();
        kykio.setName("Kikyo");
        kykio.setFamily(zoldyck);
        kykio.setAge(35);
    
        Human zeno = new Human();
        zeno.setName("Zeno");
        zeno.setFamily(zoldyck);
        zeno.setAge(67);

        Human silva = new Human();
        silva.setName("Silva");
        silva.setFamily(zoldyck);
        silva.setAge(45);

        System.out.println("Meanwhile, Killua is being tortured by his brother, " + milluki.getName() + " as a punishment to stab him and his mother" + kykio.getName() + "to go to Hunter Exam.");
        System.out.println("\n");
        

        Thread.sleep(2000);

        System.out.println("After a while " + zeno.getName() + " arrives and stops the torture by the order of the father of the family " + silva.getName() + " " + silva.getFamily() );
        System.out.println("\n");
        
        Thread.sleep(2000);

        System.out.println("When Killua receives this message, he easily brakes the chains.");
        System.out.println("\n");
        System.out.println("Canary now is escorting Gon, Kurapika, and Leorio to the mansion. For a test.");
        System.out.println("\n");
        Thread.sleep(2000);
        
        Human gotoh = new Human();
        gotoh.setName("Gotoh");
        CommonWorker butler = new CommonWorker();
        butler.setType("Butler");
        canary.setOccupation(butler);
        gotoh.setOccupation(butler);

        Test coin_test = new Test();
        coin_test.setDescription("Find the hand where this coin is. If you find, you can see Killua, nonetheless if doesn't you guys will need to leave.");
        System.out.println("The test is " + coin_test.getDescription());
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon make the right guess without any struggles. The friends are reunited again.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("However, Leorio needs to leave for a while to focus on his studies to medical career.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Kurapika leaves too, to find a proper job as a Hunter.");
        System.out.println("\n");
        Thread.sleep(2000);
        
        City yorkshin = new City();
        yorkshin.setName("Yorkshin City");
        yorkshin.setType(cityEnum.METROPOLITAN);

        System.out.println("We will find each other again on the September 1st in " + yorkshin.getName() + "! Say the four friends. ");
        Thread.sleep(2000);
        System.out.println("\n");
        
        System.out.println("Gon and Killua are now in the Heavens Arena, a place where they can train and fight to become stronger.");
        System.out.println("They also can earn money to pay for the trip to " + yorkshin.getName() + ".");
        System.out.println("\n");
        Thread.sleep(2000);


        City heavens_arena = new City();
        heavens_arena.setName("Heavens Arena");
        heavens_arena.setType(cityEnum.ARENA);

        System.out.println("The " + heavens_arena.getName() + " is a place where fighters from all over the world come to test their skills and compete for fame and fortune. Where the participants can climb some floors as they win more battles." );
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon and Killua start to climb the floors, facing stronger and stronger opponents. But they didn`t faced any difficulties until the 50th floor, where they meet to new friends.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human wing = new Human();
        wing.setName("Wing");
        wing.setAge(30);
        wing.setSex("Male");

        Human zushi = new Human();
        zushi.setName("Zushi");
        zushi.setAge(12);
        zushi.setSex("Male");

        System.out.println(killua.getName() + " faces " + zushi.getName() + " in a battle, knocking him out a few times, but he always gets up and start emaning a strange aura.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Stop!! " + zushi.getName() + " says " + wing.getName() + " and Killua punches him out of the ring.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("After the fight, Wing explains that Zushi is a student of him and that he is learning Nen, a mysterious power for the boys.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Wing take the boys to his bedroom, and explains the concept of Nen, a technique that allows the user to manipulate their life energy.");
        System.out.println("\n");
        Thread.sleep(2000); 

        System.out.println("This ability is divided in 4 principles: Ten, Zetsu, Ren, Hatsu, and Gyo.");
        System.out.println("\n");
        System.out.println("Ten is the ability to keep the aura around the body, Zetsu is the ability to close the aura, Ren is the ability to increase the aura, Hatsu is the ability to use the aura, and Gyo is the ability to focus the aura in one part of the body.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon and Killua kept climbing the tower, until they reached the 240th floor, where they face Hisoka again.");
        System.out.println("\n");
        Thread.sleep(2000);
        System.out.println("He was emaning a strong aura, and doesn't let the boys to advance, saying that that floor isn't for them.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Wing appears and tell the boys that he are going to teach them how to use Nen.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("So the master makes an explosion of aura in Killua and Gon, and they start to learn the principles of Nen. Mastering the Ten first.");
        System.out.println("\n");
        Thread.sleep(2000);

        Ten ten = new Ten();
        ten.setTenLevel(10);

        NenTraining nen_training = new NenTraining();

        for(int i = 0; i < 10; i++){
            nen_training.setIntensity(10);
            nen_training.setDuration(1000);
            nen_training.trainingSession();
        }

        Ren ren = new Ren();
        ren.setRenLevel(10);



        ren.useNen();
        ren.useNen();

        System.out.println("They boys return to face Hisoka, and they are able to tresspass him revesting their bodys in ren, and reach the 250th floor.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon challanges Hisoka to a fight, but Hisoka says that he will only fight with him when Gon achieve at least 1 win in this floor.");
        System.out.println("\n");
        Thread.sleep(2000); 

        System.out.println("To his first Battle, Gon faces Gido, a fighter that uses Nen to use and manipulate tops to fight.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human gido = new Human();
        gido.setName("Gido");
        gido.setAge(25);

        System.out.println("Gon has been defeated by Gido, he will need to train more. ");
        System.out.println("\n");
        Thread.sleep(2000);

        for(int i = 0; i < 4; i++) {
            nen_training.setIntensity(10);
            nen_training.setDuration(1000);
            nen_training.trainingSession();
        }

        System.out.println("After a month, Gon faces Gido again and wins the battle.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human richvelt = new Human();
        richvelt.setName("Richvelt");
        richvelt.setAge(30);
        richvelt.setSex("Male");

        System.out.println("Killua faces" + richvelt.getName() +  ", a fighter that uses Nen to manipulate electricity.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Killua wins, because he is immune to electricity.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon faces Richvelt too and win withoui any struggles.");
        System.out.println("\n");
        Thread.sleep(2000); 
        System.out.println("When he is leaving the arena, he faces Hisoka that says: ' Choose a date and a place, and I will fight you.'");
        System.out.println("\n");
        Thread.sleep(2000);
        
        System.out.println("Waiting for the day of the fight, Wing teaches the 6 types of Nen to the boys.");
        System.out.println("\n");
        System.out.println("The 6 types are: Enhancement, Emission, Manipulation, Conjuration, Transmutation, and Specialization.");
        System.out.println("\n");
        System.out.println("Enhancement is the ability to increase the natural abilities of the body, Emission is the ability to separate the aura from the body, Manipulation is the ability to control objects with the aura, Conjuration is the ability to create objects with the aura, Transmutation is the ability to change the properties of the aura, and Specialization is the ability to use the aura in a unique way.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("After the explanation they make a test with a bottle of water, and they discover their types of Nen.");
        System.out.println("\n");
        

        Nen gon_nen = new Nen(null, null, NenUserTypeEnum.ENHANCEMENT);
        Nen killua_nen = new Nen(null, null, NenUserTypeEnum.TRANSMUTATION);
        Nen zushi_nen = new Nen(null, null, NenUserTypeEnum.MANIPULATION);

        System.out.println("Gon is a: " + gon_nen.getUserType());
        System.out.println("Killua is a: " + killua_nen.getUserType());
        System.out.println("Zushi is a: " + zushi_nen.getUserType());
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Now, Wing says Gon and Killua are graduated, because they were approved in a secret test of " + hunter_association.getHunter_exam().getName() + " that consists in masterize Nen.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon is facing Hisoka in a fight, and he is able to land a punch in Hisoka's face. And give the tag back to him");     
        System.out.println("\n");
        
        Nen hisoka_nen = new Nen("Bungee Gun", null, NenUserTypeEnum.TRANSMUTATION);
        System.out.println("Hisoka uses his Nen ability " + hisoka_nen.getName() + " and defeat Gon.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("After a while, Gon and Killua have enough money and experience to go to " + yorkshin.getName() + " and meet their friends. But first, they come back to Whale Island to say goodbye to Mito-san.");
        System.out.println("\n");
        Thread.sleep(2000);
        
        System.out.println("Mito-san delivers to Gon a box, that his father Ging left to open wen he becomes a hunter.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("At a first glance, they struggled to open the box, but they discovered that the box only opens when Gon uses his Nen.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("The box cointains a ring, a cassette tape, and a memory card.\n" + "When they played the cassette tape, they discovered that Ging left a message for Gon and after they listened the message, the tape auto deletes itself.\n" +
        "The memory card contains a save in a game called Greed Island, worth 100 billion jennies.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Killua calls his nerd brother " + milluki.getName() + " to talk about the game, and he informs that will be a live auction in " + yorkshin.getName() + " to sell the game.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("They went back to " + yorkshin.getName() + " and they meet their friends, Kurapika and Leorio.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println(kurapika.getName() + " is working on a company to investigate the Phantom Troupe, a group of thieves that killed his clan.");
        System.out.println("\n");
        Thread.sleep(2000);

        PhantomTroupe phantom_troupe = PhantomTroupe.getPhantomTroupe();
        phantom_troupe.setPurpose(" ");

        System.out.println("After a bodyguard trainment, Kurapika is working to the family Nostrade. Their goal on the auction is to pick up 3 items:\n" +
                    " 1. A tissue of a famous actor.\n" +
                    " 2. The mumified body of Princess Corco.\n" +
                    " 3. A pair of Scarlet Eyes.\n");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("When the auction starts, the Phantom Troupe appears and kill everyone in the building, but when they arrive to open the safe, they discover that is nothing there and leave in a hot air baloon.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human uvogin = new Human();
        uvogin.setName("Uvogin");
        uvogin.setGroup(phantom_troupe);

        System.out.println("When Kurapika awaken his Scarlet Eyes, his Nen type becomes SPECIALIZATION.");
        Nen kurapika_nen = new Nen("Chain Jail", null, NenUserTypeEnum.SPECIALIZATION);
        System.out.println("Now he can use ALL types of Nen.");
        System.out.println("Kurapika uses his Nen ability " + kurapika_nen.getName() + " to capture " + uvogin.getName() + " from the Phantom Troupe and kill him.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human chrollo = new Human();
        chrollo.setName("Chrollo Lucifer");
        chrollo.setGroup(phantom_troupe);
        phantom_troupe.setSpider_number(9);

        System.out.println("Gon, Killua and Leorio decides to capture members of the Phantom Troupe because they have a big bounty and Greed Island is expensive as hell.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human macchi = new Human();
        macchi.setName("Macchi");
        macchi.setGroup(phantom_troupe);

        Human nobunaga = new Human();
        nobunaga.setName("Nobunaga");
        nobunaga.setGroup(phantom_troupe);

        Human phinks = new Human();
        phinks.setName("Phinks");
        phinks.setGroup(phantom_troupe);

        Human pakunoda = new Human();
        pakunoda.setName("Pakunoda");
        pakunoda.setGroup(phantom_troupe);

        System.out.println("They follow " + macchi.getName() + " and " + nobunaga.getName() + " to a hotel, but they end captured by those two and " + phinks.getName() + " and " + pakunoda.getName() + " appears.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("They made a few questions about a chain user, but they don't know anything about it, because they don't know Kurapika's Nen ability.");
        System.out.println("\n");
        Thread.sleep(2000);
        
        System.out.println("Gon and Killua escape from the Phantom Troupe.");
        System.out.println("\n");
        Thread.sleep(2000);

        Nen chrollo_nen = new Nen("Skill Hunter", null, NenUserTypeEnum.SPECIALIZATION);
        System.out.println(chrollo.getName() + " uses his ability " + chrollo_nen.getName() + " to steal the abilities of Neon Nostrade that can preview the future.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("He make an order to the members of the Phantom Troupe to make a slaughter in the city in the path to the auction.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Parallel to this, the Mafia contracts " + silva.getName() + " and " + zeno.getName() + " to work on the auction. They face chrollo but the fight is interrupted by a call " + illumi.getName() + ".");
        System.out.println("\n");
        Thread.sleep(2000);

        Human kortopi = new Human();
        kortopi.setName("Kortopi");
        kortopi.setGroup(phantom_troupe);

        Nen kortopi_nen = new Nen("Gallery Fake", null, NenUserTypeEnum.CONJURATION);

        System.out.println("Suddenly, all the members of the Phantom Troupe are killed. But in fact, they were forging their death with the ability of " +
            kortopi_nen.getName() + " of " + kortopi.getName() + ", that can create copies of objects.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("They create a dead body copy of each Phantom Troupe member and escape from the city.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Kurapika doesn't know about the fake bodies and when he discover that the Phantom Troupe is dead, he enters into a depressive state, because now, his life doesn't have a purpose.");
        System.out.println("\n");
        Thread.sleep(2000);
        
        System.out.println("After this impact, Kurapika's boss calls him to buy the last relic of the auction, the Scarlet Eyes, and Kurapika accepts.");
        System.out.println("\n");
        Thread.sleep(2000);
        
        System.out.println("Kurapika is immersive in a imeasurable emptiness.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println(hisoka.getName() + " calls " + kurapika.getName() + " to tell him that the Phantom Troupe is alive.");
        System.out.println("Gon and Killua offers to help Kurapika to capture the Phantom Troupe.");
        
        Nen pakunoda_nen = new Nen("Memory Bomb", null, NenUserTypeEnum.SPECIALIZATION);
        System.out.println("They want to capture " + pakunoda.getName() + " because of her ability " + pakunoda_nen.getName() + " that can transfer memories to another person.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("The troupe is making their plan too, and after a few movements the both groups face the specific situation:\n" + 
            "Gon and Killua are hostages of the Phantom Troupe and Chrollo is hostage of Kurapika.");
        System.out.println("Pakunoda uses her ability to see the memories of Gon and Killua and discover where Kurapika is, but he has left a message in their memories to not teel the troupe, because if she did that, Chrollo would die.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Kurapika makes a call with the Phantom Troupe and tells a few restrictions to them, as they wanna see Chrollo alive. They accpet those conditions and the hostages swap will be made.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Kurapika uses his ability in Pakunoda and retire the Nen usability from Chrollo.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println(pakunoda.getName() + " uses " + pakunoda_nen.getName() + " to transfer her memories to the troupe and dies for the counter effects of " + kurapika_nen.getName() + ".");
        System.out.println("\n");
        Thread.sleep(2000);


        // resume the arc of Greed Island - It's becoming too big to write everything, so i'm gonna to resume this arc. 
        // I highly recommend to watch the anime or read the manga to understand better the story. Don't skip this arc!!!!

        System.out.println("Gon and Killua enter the game Greed Island, a game created by Nen users that allows players to physically enter the game world.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("They meet Biscuit Krueger, a veteran Hunter who becomes their mentor and helps them train their Nen abilities.");
        
        nen_training.setIntensity(100);
        nen_training.setDuration(5000);
        nen_training.trainingSession();

        gon_nen.setName("Jajanken - 1st Phase");
        killua_nen.setName("Thunderbolt - 1st Phase");

        System.out.println("Gon creates a new Nen ability called " + gon_nen.getName() + " that allows him to charge and release a powerful attack.");
        System.out.println("Killua also develops a new Nen ability called " + killua_nen.getName() + " that allows him to generate electricity and enhance his physical abilities.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human biscuit = new Human();
        biscuit.setName("Biscuit Krueger");
        biscuit.setAge(57);
        biscuit.setSex("Female");

        System.out.println("Biscuit, despite her youthful appearance, is a 57-year-old master of Nen and teaches Gon and Killua advanced techniques.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon and Killua train rigorously under Biscuit's guidance, improving their Nen abilities and learning new techniques.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Killua, in the middle of training, needs to go back to make the Hunter Exam again, because he was disclassified.");
        System.out.println("He was approved. And now he is a Hunter " + killua.getOccupation());
        
        Hunter killua_hunter = new Hunter();
        killua.setOccupation(killua_hunter);
        killua_hunter.setStars(0);
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("They encounter various challenges and enemies within the game, including the Bomber, a dangerous player who uses explosive Nen abilities.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon, Killua, and Biscuit work together to defeat the Bomber and his allies, using their combined Nen abilities and strategies.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("After defeating the Bomber, Gon and Killua continue their quest to find clues about Gon's father, Ging.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("They discover that Ging was one of the creators of Greed Island and left behind clues for Gon to follow.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon and Killua collect the necessary cards to complete the game and are able to select 3 cards to take to the real world.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Biscuit chooses a card that gives a blue jewel to her, and she leaves the game.");
        System.out.println("Gon and Killua choose the card that allows to accompany a player to the real world, and they went after a player called 'Nigg' a possible anagram to 'Ging'. ");
    
        // Chimera Ant Arc
        Human kaito = new Human();
        kaito.setName("Kaito");
        kaito.setAge(0);
        kaito.setSex("Male");

        Mamal foxbear = new Mamal();
        foxbear.setSpecie("FoxBear");

        System.out.println("Gon and Killua meet Kaito, a old known of Gon, that helped him in the past to escape from a " + foxbear.getSpecie() + "\n");
        Thread.sleep(2000);

        Queen queen = Queen.getQueen();
        ChimeraAnt example = queen.createChimeraAnt();
        example.setSpecie("Chimera Ant");
        example.setTraits("Ant");

        Continent black_continent = new Continent();
        black_continent.setName("Black Continent");

        System.out.println(kaito.getName() + " is studying a specific type of animal called: " + example.getSpecie());
        System.out.println("They are a animal from the " + black_continent.getName() + " and they are considered a calamity");
        System.out.println("The queen is the generator of the colony, and she has a reproductive system called phagogenesis, which the new ants have the traits of the animals that the queen ate.");
        System.out.println("\n");
        Thread.sleep(2000);

        Continent ngl = new Continent();
        ngl.setName("NGL - Neo Green Life");

        System.out.println("The team of Kaito found a Ant claw weirdly large, and they decided to investigate in the " + ngl.getName() + 
                " a place where tecnology is forbidden and people live in a extremely natural way.");
        System.out.println("\n");
        Thread.sleep(2000);

        queen.phagogenesis();
        System.out.println("The worry of " + kaito.getName() + " is justified. The queen ate a human and the new ant has the traits of a human");
        
        ChimeraAnt colt = queen.createChimeraAnt();
        colt.setName("Colt");
        colt.setTraits("Human, eagle, ant");
        colt.setHierarchy(AntsHierarchyEnum.SQUADRON_LEADER);

        System.out.println("The new ant is called " + colt.getName() + " and he is a " + colt.getTraits() + " and he is a " + colt.getHierarchy());
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("There are a lot of new ants, and they are creating a colony in the NGL, and they are attacking the humans.");
        System.out.println("\n");
        Thread.sleep(2000);

        for(int i = 0; i < 10; i++){
            queen.phagogenesis();
        }

        System.out.println("Now, the queen is generating the royal guards, the most powerful ants of the colony.");
        System.out.println("\n");
        Thread.sleep(2000);

        ChimeraAnt rammot = queen.createChimeraAnt();
        rammot.setName("Rammot");
        rammot.setTraits("Human, rabbit, shrike, ant");

        System.out.println("Gon and Killua are designated to battle with a Ant called " + rammot.getName() + " that has the traits of " + rammot.getTraits());
        Hatsu gon_hatsu = new Hatsu();
        Hatsu killua_hatsu = new Hatsu();

        gon_hatsu.setHatsuLevel(40);
        killua_hatsu.setHatsuLevel(30);

        gon_hatsu.useNen();
        killua_hatsu.useNen();

        System.out.println("They won, but Rammot escapes with Colt's help.\n");
        Thread.sleep(2000);

        System.out.println("After the battle, Rammot has his pores opened and he can use Nen now.\n" + 
        "Colt asks to take a punch like this, and now can use Nen too.");

        Nen rammot_nen = new Nen("Feather Blades", null, NenUserTypeEnum.ENHANCEMENT);
        Nen colt_nen = new Nen(null, null, null);
        
        ChimeraAnt neferpitou = queen.createChimeraAnt();
        neferpitou.setName("Neferpitou");
        neferpitou.setTraits("Cat, ant");
        neferpitou.setHierarchy(AntsHierarchyEnum.ROYAL_GUARD);

        System.out.println("Now the ants can use Nen, and the first royal guard is born, " + neferpitou.getName() + " that has the traits of " + neferpitou.getTraits() + " and is a " + neferpitou.getHierarchy());
        System.out.println("\n");
        Thread.sleep(2000);

        Human pokkle = new Human();
        pokkle.setName("Pokkle");
        Hunter pokkle_hunter = new Hunter();
        pokkle.setOccupation(pokkle_hunter);

        System.out.println("Pokkle is a Hunter that is investigating the ants, and he is captured by the royal guard " + neferpitou.getName() + ".");
        System.out.println("She kill and tortures him to get information about the humans and Nen.");
        pokkle.setLive(false);

        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("The sons of Queen make a line to have a chance to get a punch from Rammot to awaken their Nen.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Parallel to this, Kaito delivers the Ging's hunter license to Gon, and tell him to deliver back to Ging.");
        System.out.println("Unfortunately, he feels an terrifying presence, and order to Gon and Killua to run. " + 
        " But, it's too late. In silence, and in a tremendous speed, Pitou take off Kaito's arm. " 
        + " Shocked and full of rage, Gon instintively uses his tries to enhance his Nen, but Killua stops him, making him unconscious."); 
        System.out.println("\n");
        Thread.sleep(2000);

        Nen kaito_nen = new Nen("Crazy Slots", null, NenUserTypeEnum.CONJURATION);

        System.out.println("Killua scapes with Gon and contact the teammates of Kaito, tell the story and demands the strongest Hunters of Hunter Association to help them.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human knov = new Human();
        knov.setName("Knov");
        Hunter knov_hunter = new Hunter();
        knov.setOccupation(knov_hunter);

        Human morel = new Human();
        morel.setName("Morel");
        Hunter morel_hunter = new Hunter();
        morel.setOccupation(morel_hunter);

        System.out.println("The Hunter Association send reforces: " + knov.getName() + " , " + morel.getName() + " and " + netero.getName() + " to help in NGL.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Gon wake up and is grateful that Killua stopped him, furthermore, he is convicted that Kaito is alive.");
        System.out.println("Kaito is killed by the royal guard " + neferpitou.getName() + ". That starts transforming him, in her own toy.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human palm = new Human();
        palm.setName("Palm");
        Hunter palm_hunter = new Hunter();
        palm.setOccupation(palm_hunter);

        System.out.println("While the boys walk through the city, they meet " + palm.getName() + " student of Knov, that is investigating the ants too.");
        System.out.println("She says that they need to face the students of Morel, Knucke and Shoot, in 30 days, and win, to be able to go for the mission of the palace to defeat the Chimera Ants.");
        System.out.println("\n");
        Thread.sleep(2000);


        System.out.println("To have more chances, she call back " + biscuit.getName() + " and she trains the boys back again.");
        System.out.println("The training is simple, they must maintain their Ren for 3 hours. After they face Knuckle or Shoot." + 
        " If it seems they are losing, they must run away and try again on next day.");
        System.out.println("\n");
        Thread.sleep(2000);

        Human knuckle = new Human();
        knuckle.setName("Knuckle");
        Hunter knuckle_hunter = new Hunter();
        knuckle.setOccupation(knuckle_hunter);
        Nen knucle_nen = new Nen("APR", null, NenUserTypeEnum.ENHANCEMENT);
        System.out.println(knuckle.getName() + " become a friend of the boys and tries to help them to improve. ");
        System.out.println("\n");
        Thread.sleep(2000);

        // GYRO ARC
        Human gyro = new Human();
        gyro.setName("Gyro");
        System.out.println("While they were in the city, they walk past a man called " + gyro.getName() );
        System.out.println("Gyro teve uma infância trágica, marcada por abusos de seu pai, que era alcoólatra e cruel.");
        System.out.println("Gyro acreditava que o mundo era um lugar frio e sem valor, algo que seu pai reforçou com sua indiferença.");
        System.out.println("\"Eu nunca quis ser humano.\" Essa frase de Gyro reflete seu desprezo pela humanidade, moldado pela sua infância.");
        System.out.println("Apesar de toda dor, Gyro construiu o Reino de NGL como um símbolo de sua independência e rejeição aos valores do mundo humano.");
        System.out.println("Após ser morto pelas formigas Chimera, ele reencarnou com todas as memórias intactas.");
        System.out.println("Gyro manteve sua determinação em seguir seus próprios princípios, recusando qualquer ideia de submissão ou arrependimento.");
        System.out.println("\"Meu pai me destruiu, mas eu me reconstruí do jeito que eu quis.\" Essa frase ilustra sua resiliência e ódio.");
        System.out.println("Mesmo em sua nova vida como Chimera, Gyro se recusa a ser influenciado, reafirmando que seu destino está em suas próprias mãos.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("The last day of training, Gon and Killua faced Knuckle. " +
            "They were losing, but they didn't run away, and they were defeated. " + 
            "Knuckle used " + knucle_nen.getName() + " and Gon can't use Nen for 30 days.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("In the entrance of NGL, Gon devasted in tears, make Knuckle promise to save Kaito.");
        System.out.println("Knuckle promises and they enter in the NGL.\n");
        Thread.sleep(2000);

        ChimeraAnt shaiapouf = queen.createChimeraAnt();
        shaiapouf.setName("Shaiapouf");
        shaiapouf.setTraits("Butterfly, Human, ant");
        shaiapouf.setHierarchy(AntsHierarchyEnum.ROYAL_GUARD);

        ChimeraAnt yupi = queen.createChimeraAnt();
        yupi.setName("Yupi");
        yupi.setTraits("Magical Beasts, ant, Human");
        yupi.setHierarchy(AntsHierarchyEnum.ROYAL_GUARD);

        System.out.println("Meanwhile, the last 2 royal guards are born, " + shaiapouf.getName() + " and " + yupi.getName() + ".");
        
        ChimeraAnt meruem = queen.createChimeraAnt();
        meruem.setName("Meruem");
        meruem.setTraits("Human, ant");
        meruem.setHierarchy(AntsHierarchyEnum.KING);

        Nen meruem_nen = new Nen("Rage Blast, Aura Synthesis, Metamorphosis, Photon", null, NenUserTypeEnum.EMISSION);

        System.out.println("Right after it, the king is born prematurely, and he is called " + meruem.getName() + " the most powerful ant of the colony.");
        System.out.println("He has the traits of " + meruem.getTraits() + " and he is a " + meruem.getHierarchy());
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("This episode make the Queen be in a critical health situation, making the ants abandon the colony, because it doesn't have the necessecity to be there, if the queen can't reproduce anymore.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Desperate from the situation " + colt.getName() + 
        " asks for help to " + morel.getName() + " and " + knov.getName() + " to save the queen. And announces that the king is born.");
        System.out.println("\n The humans send help to the Queen. She didn't survive, but she left a small baby. " + 
        "Morel becomes emotional and let colt and the baby survive, if they promise to not attack the humans.");
        System.out.println("\n");
        Thread.sleep(2000);

        Continent east_gorteau = new Continent();
        east_gorteau.setName("Republic East of Gorteau");

        System.out.println("Meanwwhile, the King is looking for a Nen user to satisfy his hungry. " +
        " He goes through the NGL and find " + east_gorteau.getName() + " where they invade the palace and kill the local dictator.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Palm threat the boys as they lose the fight against Knuckle, and Gon, to calm her, accept to go on a date with her.");
        System.out.println("Killua will protect them from a possible attack, because Gon can't use nen.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Killua faces rammot, and he is facing problems because he is about the effect of Illumi's needle.");
        System.out.println("He is about to lose, but he remembers the words of Gon and he is able to remove the needle.");
        System.out.println("He uses his new ability " + killua_nen.getName() + " and defeat Rammot.");
        System.out.println("\n");
        Thread.sleep(2000);

        System.out.println("Kaito is tottally transformed in a toy, and Gon is devastated. He swear to find a way to cure him.\n");
        Thread.sleep(2000);

        System.out.println("Gon and Killua are going to " + east_gorteau.getName() + " with Knov. They see that the dictator is being controled by " + neferpitou.getName());
        System.out.println("They are going to the palace to face the royal guards and the king.");
        System.out.println("\n");
        Thread.sleep(2000);

        ChimeraAnt meleoron = queen.createChimeraAnt();
        meleoron.setName("Meleoron");
        meleoron.setTraits("Chameleon, ant");
        meleoron.setHierarchy(AntsHierarchyEnum.SQUADRON_LEADER);
        
        Nen meleoron_nen = new Nen("Perfect Plan, God's Accomplice", null, NenUserTypeEnum.SPECIALIZATION);
        System.out.println("Gon meets " + meleoron.getName() + " a ant that have traits of " + meleoron.getTraits() + " and he is a " + meleoron.getHierarchy() + 
            " he also have the abilities " + meleoron_nen.getName() + " that allows him to turn invisible and indetectable.");
        System.out.println("\n");
        Thread.sleep(2000);

        ChimeraAnt ikalgo = queen.createChimeraAnt();
        ikalgo.setName("Ikalgo");
        ikalgo.setTraits("Octopus, ant");
        ikalgo.setHierarchy(AntsHierarchyEnum.SQUADRON_LEADER);
        Nen ikalgo_nen = new Nen("Fleadom, Living Dead Dolls", null, NenUserTypeEnum.ENHANCEMENT);
        ikalgo.setNen(ikalgo_nen);
        System.out.println("Killua meets " + ikalgo.getName() + " a ant that have traits of " +
        ikalgo.getTraits() +  " and he is a " + ikalgo.getHierarchy() + " he also have the abilities " + ikalgo_nen.getName() + " . ");
        System.out.println("\n");
        Thread.sleep(2000);

        Event palace_raid_battle = new Event();
        palace_raid_battle.setDescription("\n" + "--- CONTEXT ---\n" +
            "🌍 Global Threat: Chimera Ants plan to consume and evolve by integrating human traits\n" + 
            "🏛️ Location: Remote NGL (Neo-Green Life) Country Royal Palace\n" + 
            "🦸 Hunter Team Leaders: Netero, Morel, Knov, Shoot\n");
        
        City palace_east_gorteau = new City();
        palace_east_gorteau.setName("Palace of East Gorteau");

        palace_raid_battle.setCity(palace_east_gorteau);
        palace_raid_battle.getDescription();
        
        Human komugi = new Human();
        komugi.setName("Komugi");
        komugi.setSex("Female"); 

        System.out.println("🎲 Komugi's Profile:");
        System.out.println("   - Blind Gungi prodigy");
        System.out.println("   - Socially awkward and seemingly fragile");
        System.out.println("   - Unparalleled board game genius");
        
        System.out.println("\n👑 Meruem's Initial State:");
        System.out.println("   - Chimera Ant King");
        System.out.println("   - Believes in absolute superiority");
        System.out.println("   - Views humans as insignificant");
        
        System.out.println("\n🧩 First Encounters:");
        System.out.println("   - Meruem challenges world's best board game players");
        System.out.println("   - Defeats Go masters with superhuman intellect");
        System.out.println("   - Meets Komugi, his first true intellectual challenge");
        
        System.out.println("\n💡 Psychological Evolution:");
        System.out.println("   - Becomes fascinated by Komugi's Gungi skills");
        System.out.println("   - Gradually develops respect and curiosity");
        System.out.println("   - Learns humility through their games");
        
        System.out.println("\n❤️ Emotional Transformation:");
        System.out.println("   - Develops genuine care for Komugi");
        System.out.println("   - Protects her from potential threats");
        System.out.println("   - Experiences first true emotional connection");

        System.out.println("The event starts: The init of the end of Chimera Ants War !\n");

        // Netero vs Meruem Battle
        System.out.println("\n--- NETERO VS MERUEM - THE ULTIMATE SHOWDOWN ---");
        System.out.println("🏆 Combatants:");
        System.out.println("   - Netero: 120-year-old Hunter Chairman");
        System.out.println("   - Meruem: Chimera Ant King, perfect genetic evolution");
        System.out.println("\n");

        System.out.println("\n🥋 Battle Dynamics:");
        System.out.println("   - Netero's 100-Type Guanyin Bodhisattva: Ultimate Nen technique");
        System.out.println("     > Statue with 100 arms performing constant attacks");
        System.out.println("     > Each arm represents a different martial arts technique");
        System.out.println("     > Attacks approach light-speed levels");
        System.out.println("\n");

        System.out.println("\n⚔️ Battle Progression:");
        System.out.println("   - Initial Phase: Meruem completely dominates");
        System.out.println("   - Middle Phase: Netero uses every possible technique");
        System.out.println("   - Final Phase: Netero activates miniature rose bomb");
        System.out.println("\n");

        System.out.println("\n🏅 Result: Strategic sacrifice");
        System.out.println("   - Netero critically wounds Meruem");
        System.out.println("   - Dies knowing he prevented global catastrophe");
        System.out.println("\n");
        System.out.println("\n");
        // Gon vs Pitou Battle
        System.out.println("\n--- GON VS PITOU - REVENGE AND TRANSFORMATION ---");
        System.out.println("🏆 Combatants:");
        System.out.println("   - Gon Freecss: Young Hunter seeking revenge");
        System.out.println("   - Neferpitou: Chimera Ant Royal Guard, Meruem's most loyal servant");
        System.out.println("\n");

        System.out.println("\n🔥 Emotional Trigger:");
        System.out.println("   - Kite's death at Pitou's hands");
        System.out.println("   - Gon's complete mental breakdown");
        System.out.println("\n");

        System.out.println("\n⚡ Battle Specifics:");
        System.out.println("   - Gon trades entire future potential for momentary power");
        System.out.println("   - Releases 100% of his Nen in a rage-fueled transformation");
        System.out.println("   - Becomes an adult-like version of himself");
        System.out.println("   - Completely obliterates Pitou in a single, devastating blow");
        System.out.println("\n");

        System.out.println("\n💥 Consequences:");
        System.out.println("   - Gon loses all his Nen abilities");
        System.out.println("   - Requires extensive medical treatment");
        System.out.println("   - Permanently altered physical and mental state");
        System.out.println("\n");

        // Killua vs Youpi Battle
        System.out.println("\n--- KILLUA VS YOUPI - TACTICAL GENIUS ---");
        System.out.println("🏆 Combatants:");
        System.out.println("   - Killua Zoldyck: Assassin prodigy");
        System.out.println("   - Youpi: Powerful Chimera Ant Royal Guard");
        System.out.println("\n");
        
        System.out.println("\n⚡ Battle Characteristics:");
        System.out.println("   - Killua uses lightning-based Nen");
        System.out.println("   - Utilizes speed and electrical manipulation");
        System.out.println("   - Constantly changing tactics");
        System.out.println("\n");

        System.out.println("\n🧠 Strategic Approach:");
        System.out.println("   - Exploits Youpi's emotional instability");
        System.out.println("   - Uses hit-and-run tactics");
        System.out.println("   - Psychological warfare over direct confrontation");
        System.out.println("\n");
        System.out.println("\n");
        // Morel vs Shaiapouf Battle
        System.out.println("\n--- MOREL VS SHAIAPOUF - MENTAL WARFARE ---");
        System.out.println("🏆 Combatants:");
        System.out.println("   - Morel Mackernasey: Experienced Hunter with smoke manipulation");
        System.out.println("   - Shaiapouf: Intelligent Chimera Ant Royal Guard");
        System.out.println("\n");

        System.out.println("\n🌫️ Battle Dynamics:");
        System.out.println("   - Intricate mental and physical confrontation");
        System.out.println("   - Smoke manipulation vs cellular division abilities");
        System.out.println("\n");

        System.out.println("\n🕹️ Battle Strategy:");
        System.out.println("   - Morel uses complex smoke puppet techniques");
        System.out.println("   - Shaiapouf attempts psychological manipulation");
        System.out.println("   - Battle of wits and Nen creativity");
        System.out.println("\n");

        System.out.println("\n--- FINAL MOMENTS: MERUEM AND KOMUGI ---");
        System.out.println("☢️ Radiation Aftermath:");
        System.out.println("   - Meruem infected by miniature rose bomb");
        System.out.println("   - Realizes his limited time");
        
        System.out.println("\n🕰️ Last Moments:");
        System.out.println("   - Chooses to spend final hours with Komugi");
        System.out.println("   - Plays endless Gungi matches");
        System.out.println("   - Experiences true human connection");
        
        System.out.println("\n💫 Tragic Yet Beautiful Ending:");
        System.out.println("   - Both Meruem and Komugi die together");
        System.out.println("   - Symbol of unexpected love and understanding");

        Event election = new Event();
        election.setDate("January 10th");
        City hunter_association_headquarters = new City();
        hunter_association_headquarters.setName("Hunter Association Headquarters");
        election.setCity(hunter_association_headquarters);
        election.setDescription("Election Arc:" + 
        "\n- Chairman Netero dies, triggering Hunter Association leadership selection" + 
        "\n- Pariston Hill and Ging Freecss emerge as key political figures" +
        "\n- Leorio Paradinight unexpectedly gains significant voter support\n");
        election.getDescription();
        election.getCity().getName();
        election.getDate();

        Human pariston = new Human();
        pariston.setName("Pariston Hill");
        pariston.setAge(34);

        VicePresident vp = VicePresident.getVicePresident();
        pariston.setOccupation(vp);

        System.out.println("The actual vp of the Hunter Association is " + pariston.getName() + " " + pariston.getOccupation() );
        System.out.println("\n");

        Human mizaistom = new Human();
        mizaistom.setName("Mizaistom Nana");
        mizaistom.setAge(34);
        Zodiacs mizaistom_cow = new Zodiacs();
        Mamal cow = new Mamal();
        cow.setSpecie("Cow");
        mizaistom.setOccupation(mizaistom_cow);
        mizaistom_cow.setAnimal(cow);

        Human botobai = new Human();
        botobai.setName("Botobai Gigante");
        botobai.setAge(34);
        Zodiacs botobai_dragon = new Zodiacs();
        Reptile dragon = new Reptile();
        dragon.setSpecie("Dragon");
        botobai.setOccupation(botobai_dragon);
        botobai_dragon.setAnimal(dragon);

        System.out.println("Some examples of the zodiacs are: " + mizaistom.getName() + " that is a " + mizaistom_cow.getAnimal().getSpecie() + " and " + botobai.getName() + " that is a " + botobai_dragon.getAnimal().getSpecie());
        System.out.println("\n");
        Thread.sleep(2000);
        
        Human cheadle = new Human();
        cheadle.setName("Cheadle Yorkshire");
        cheadle.setAge(30);
        Zodiacs cheadle_dog = new Zodiacs();
        Mamal dog = new Mamal();
        dog.setSpecie("Dog");
        cheadle.setOccupation(cheadle_dog);
        cheadle_dog.setAnimal(dog);

        System.out.println("The hunters elected " + cheadle.getName() + " as the new president of the Hunter Association. She is a " + cheadle_dog.getAnimal().getSpecie());
        System.out.println("\n");
        Thread.sleep(2000);

        // Gon's Recovery
        System.out.println("\nGon's Recovery:");
        System.out.println("- Suffered severe physical and mental trauma after Chimera Ant arc");
        System.out.println("- Underwent comprehensive medical rehabilitation");
        System.out.println("- Gradually recovered with support from friends, especially Killua");

        // Dark Continent Conversation
        System.out.println("\nDark Continent Conversation between Gon and Ging:");
        System.out.println("Thanks to Alluka's power, Gon is able to meet Ging in the World Tree.");
        Tree world_tree = new Tree();
        world_tree.setName("World Tree");
        
        world_tree.setHeight(1784);
        world_tree.setTrunk_diameter(50);

        world_tree.displayInfo();

        
        System.out.println("- Ging reveals details about the mysterious unexplored region");
        System.out.println("- Discussion highlights themes of exploration and discovery");
        System.out.println("- Conversation serves as narrative bridge to potential future storylines");


        System.out.println("THE END?\n");
    }
}