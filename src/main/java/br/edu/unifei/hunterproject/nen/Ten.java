package br.edu.unifei.hunterproject.nen;

public class Ten implements NenAbility{
    private int tenLevel;

    @Override
    public void useNen() {
        System.out.println("Using Ten");
    }

    public int getTenLevel() {
        return tenLevel;
    }

    public void setTenLevel(int tenLevel) {
        this.tenLevel = tenLevel;
    }
}
