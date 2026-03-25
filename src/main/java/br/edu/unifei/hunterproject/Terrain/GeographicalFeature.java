package br.edu.unifei.hunterproject.Terrain;

public class GeographicalFeature {
    private String climate;
    private TerrainTypeEnum terrain;
    
    public String getClimate() {
        return climate;
    }
    public void setClimate(String climate) {
        this.climate = climate;
    }
    public TerrainTypeEnum getTerrain() {
        return terrain;
    }
    public void setTerrain(TerrainTypeEnum terrain) {
        this.terrain = terrain;
    }
}
