package br.edu.unifei.hunterproject.nen;

public class Ko implements NenAbility{
    private int koLevel;

    @Override
    public void useNen() {
        System.out.println("Using Ko");
    }

    public int getKoLevel() {
        return koLevel;
    }

    public void setKoLevel(int koLevel) {
        this.koLevel = koLevel;
    }
}
