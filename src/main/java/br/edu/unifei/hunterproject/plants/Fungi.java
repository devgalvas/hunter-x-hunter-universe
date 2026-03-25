package br.edu.unifei.hunterproject.plants;

public class Fungi extends Plants<Fungi> {
    private String color;

    @Override
    public Fungi clone() {
        Fungi f = new Fungi();
        f.setName(getName());
        f.setColor(this.color);

        return f;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fungi: " + getName() + " - specie - " + getSpecie() + " - continent - " 
                        + getContinent().getRegions() + "- color - " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
