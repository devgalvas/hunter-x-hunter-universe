package br.edu.unifei.hunterproject.Terrain;

public abstract class Location {
    private String name;
    private String coordinates;
    private DangerEnum danger;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
    public DangerEnum getDanger() {
        return danger;
    }
    public void setDanger(DangerEnum danger) {
        this.danger = danger;
    }
}
