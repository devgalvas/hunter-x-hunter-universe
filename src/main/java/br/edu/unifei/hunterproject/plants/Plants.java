package br.edu.unifei.hunterproject.plants;

import br.edu.unifei.hunterproject.LivingBeing.LivingBeing;
import br.edu.unifei.hunterproject.Terrain.Continent;

public abstract class Plants <T> extends LivingBeing {
    private String specie;
    private String name;
    private Continent continent;

    public abstract void displayInfo();

    public abstract Plants<T> clone();

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
