package br.edu.unifei.hunterproject.Terrain;

import java.util.List;

public class Continent extends Location{
    private GeographicalFeature geography;
    private List<Region> regions;
    private float population;
    
    public Continent() {
        this.geography = new GeographicalFeature();
    }
    
    public GeographicalFeature getGeography() {
        return geography;
    }
    public void setGeography(GeographicalFeature geography) {
        this.geography = geography;
    }
    public List<Region> getRegions() {
        return regions;
    }
    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
    public float getPopulation() {
        return population;
    }
    public void setPopulation(float population) {
        this.population = population;
    }
}
