package br.edu.unifei.hunterproject.nen;

public class Ryu implements NenAbility{
    private int ryuLevel;

    @Override
    public void useNen() {
        System.out.println("Using Ryu");
    }

    public int getRyuLevel() {
        return ryuLevel;
    }

    public void setRyuLevel(int ryuLevel) {
        this.ryuLevel = ryuLevel;
    }
}
