package br.edu.unifei.hunterproject.nen;

public class Gyo implements NenAbility{
    private int gyoLevel;
    
    @Override
    public void useNen() {
        System.out.println("Using Gyo");
    }

    public int getGyoLevel() {
        return gyoLevel;
    }

    public void setGyoLevel(int gyoLevel) {
        this.gyoLevel = gyoLevel;
    }
}
