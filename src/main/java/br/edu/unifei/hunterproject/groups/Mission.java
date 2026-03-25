package br.edu.unifei.hunterproject.groups;

import br.edu.unifei.hunterproject.Terrain.DangerEnum;

public class Mission extends Event {
    private String title;
    private DangerEnum danger;
    private Reward reward;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public DangerEnum getDanger() {
        return danger;
    }
    public void setDanger(DangerEnum danger) {
        this.danger = danger;
    }
    public Reward getReward() {
        return reward;
    }
    public void setReward(Reward reward) {
        this.reward = reward;
    }
}
