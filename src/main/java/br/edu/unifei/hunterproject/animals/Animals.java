package br.edu.unifei.hunterproject.animals;

import br.edu.unifei.hunterproject.LivingBeing.LivingBeing;

public abstract class Animals extends LivingBeing{
    private String specie;

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
