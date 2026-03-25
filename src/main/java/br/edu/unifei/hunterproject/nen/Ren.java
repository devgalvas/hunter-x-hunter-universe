package br.edu.unifei.hunterproject.nen;

public class Ren implements NenAbility{
    private int renLevel;

    @Override
    public void useNen() {
        System.out.println("Using Ren");
    }

    public int getRenLevel() {
        return renLevel;
    }

    public void setRenLevel(int renLevel) {
        this.renLevel = renLevel;
    } 
}   
