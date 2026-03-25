package br.edu.unifei.hunterproject.nen;

public class Shu implements NenAbility{
    private int shuLevel;

    public void useNen() {
        System.out.println("Using Shu");
    }

    public int getShuLevel() {
        return shuLevel;
    }

    public void setShuLevel(int shuLevel) {
        this.shuLevel = shuLevel;
    }
}
