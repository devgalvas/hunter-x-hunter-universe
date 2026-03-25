package br.edu.unifei.hunterproject.nen;

public class In implements NenAbility {
    private int inLevel;

    @Override
    public void useNen() {
        System.out.println("Using In");
    }

    public int getInLevel() {
        return inLevel;
    }

    public void setInLevel(int inLevel) {
        this.inLevel = inLevel;
    }
}
