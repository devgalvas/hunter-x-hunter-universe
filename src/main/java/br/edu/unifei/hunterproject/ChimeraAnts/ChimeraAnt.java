package br.edu.unifei.hunterproject.ChimeraAnts;

import br.edu.unifei.hunterproject.animals.Animals;

public class ChimeraAnt extends Animals{
    private String name;
    private AntsHierarchyEnum hierarchy;
    private String traits;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AntsHierarchyEnum getHierarchy() {
        return hierarchy;
    }
    public void setHierarchy(AntsHierarchyEnum hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getTraits() {
        return traits;
    }

    public void setTraits(String traits) {
        this.traits = traits;
    }
}
