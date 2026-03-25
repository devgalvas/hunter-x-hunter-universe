package br.edu.unifei.hunterproject.Terrain;

public class City extends Location {
    private float economy;
    private cityEnum type;
    public float getEconomy() {
        return economy;
    }
    public void setEconomy(float economy) {
        this.economy = economy;
    }
    public cityEnum getType() {
        return type;
    }
    public void setType(cityEnum type) {
        this.type = type;
    }
}
