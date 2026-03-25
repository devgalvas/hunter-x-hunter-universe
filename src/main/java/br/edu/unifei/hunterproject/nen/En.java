package br.edu.unifei.hunterproject.nen;

public class En implements NenAbility{
    private int enLevel;

    @Override
    public void useNen() {
        System.out.println("Using En");
    }

    public int getEnLevel() {
        return enLevel;
    }

    public void setEnLevel(int enLevel) {
        this.enLevel = enLevel;
    }
}
