package br.edu.unifei.hunterproject.nen;

public class Hatsu implements NenAbility {
    private int hatsuLevel;

    @Override
    public void useNen() {
        System.out.println("Using Hatsu");
    }

    public int getHatsuLevel() {
        return hatsuLevel;
    }

    public void setHatsuLevel(int hatsuLevel) {
        this.hatsuLevel = hatsuLevel;
    }
}
