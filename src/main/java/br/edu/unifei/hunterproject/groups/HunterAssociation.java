package br.edu.unifei.hunterproject.groups;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.hunterproject.Hunters.Hunter;

public class HunterAssociation extends Group {
    private static HunterAssociation hunter_association;
    private List<Hunter> hunters = new ArrayList<Hunter>();
    private List<Mission> missions = new ArrayList<Mission>();
    private Exam hunter_exam;

    private HunterAssociation () {}

    public void registerHunters (Hunter hunter) {
        hunters.add(hunter);
    }

    public static HunterAssociation getHunter_association() {
        if (hunter_association == null) {
            hunter_association = new HunterAssociation();
        }
        return hunter_association;
    }

    public List<Hunter> getHunters() {
        return hunters;
    }

    public void setHunters(List<Hunter> hunters) {
        this.hunters = hunters;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public static void setHunter_association(HunterAssociation hunter_association) {
        HunterAssociation.hunter_association = hunter_association;
    }

    public Exam getHunter_exam() {
        return hunter_exam;
    }

    public void setHunter_exam(Exam hunter_exam) {
        this.hunter_exam = hunter_exam;
    }

    
}
