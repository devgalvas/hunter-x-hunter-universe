package br.edu.unifei.hunterproject.Terrain;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.hunterproject.animals.Animals;
import br.edu.unifei.hunterproject.plants.Plants;

public class HuntingSite extends Location {
    private String resources;
    private String bestSeason;
    private List<Animals> animals = new ArrayList<Animals>();
    private List<Plants<?>> plants = new ArrayList<Plants<?>>();
    private TerrainTypeEnum terrain;
    
    public String getResources() {
        return resources;
    }
    public void setResources(String resources) {
        this.resources = resources;
    }
    public String getBestSeason() {
        return bestSeason;
    }
    public void setBestSeason(String bestSeason) {
        this.bestSeason = bestSeason;
    }
    public List<Animals> getAnimals() {
        return animals;
    }
    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }
    public List<Plants<?>> getPlants() {
        return plants;
    }
    public void setPlants(List<Plants<?>> plants) {
        this.plants = plants;
    }
    public TerrainTypeEnum getTerrain() {
        return terrain;
    }
    public void setTerrain(TerrainTypeEnum terrain) {
        this.terrain = terrain;
    }
}
