package br.edu.unifei.hunterproject.ChimeraAnts;

import br.edu.unifei.hunterproject.LivingBeing.LivingBeing;

public class Queen extends LivingBeing implements ChimeraAntFactory{

    private static Queen queen = new Queen();

    private Queen() {}

    public static Queen getQueen() {
        return queen;
    }

    @Override 
    public ChimeraAnt createChimeraAnt() {
        return new ChimeraAnt();
    }

    public void phagogenesis() {
        System.out.println("The ant is using phagogenesis to create new ants.");
    }

    public void telepathy() {
        System.out.println("The ant is using telepathy to communicate with the ants.");
    }

}
