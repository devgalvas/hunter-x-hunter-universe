package br.edu.unifei.hunterproject.nen;

public class Restu implements NenAbility{
    private int retsuLevel;

    @Override
    public void useNen() {
        System.out.println("Using Restu");
    }

    public int getRetsuLevel() {
        return retsuLevel;
    }

    public void setRetsuLevel(int retsuLevel) {
        this.retsuLevel = retsuLevel;
    }
}
