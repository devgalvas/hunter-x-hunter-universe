package br.edu.unifei.hunterproject.plants;

public class Tree extends Plants<Tree> {
    private int height;
    private int age;
    private int trunk_diameter;

    @Override
    public void displayInfo() {
        System.out.println("Tree: " + getName() + " - specie - " + getSpecie() + " - continent - " 
                        + getContinent().getRegions() + " - height - " + height + " - age - " + age + " - trunk diameter - " + trunk_diameter);
    }

    @Override
    public Tree clone() {
        Tree t = new Tree();
        t.setName(getName());
        t.setHeight(height);
        t.setAge(age);
        
        return t;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrunk_diameter() {
        return trunk_diameter;
    }

    public void setTrunk_diameter(int trunk_diameter) {
        this.trunk_diameter = trunk_diameter;
    }

}
