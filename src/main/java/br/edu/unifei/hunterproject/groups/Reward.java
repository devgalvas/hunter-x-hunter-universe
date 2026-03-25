package br.edu.unifei.hunterproject.groups;

import br.edu.unifei.hunterproject.Hunters.Hunter;

public class Reward {
    private float jennyAmount;
    private int hunterPoints;

    public void claimReward(Hunter[] hunters) {
        for (Hunter hunter : hunters) {
            System.out.println("The hunters " + hunter.getHuman().getName() + 
            " claimed the reward of " + jennyAmount + " jennies and won " 
            + hunterPoints + " hunter points.");
        }

    }
}
