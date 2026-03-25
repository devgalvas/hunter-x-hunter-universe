package br.edu.unifei.hunterproject.plants;

public class Herbs extends Plants<Herbs>{
    private String medicalPurpose;

    public void displayInfo() {
        System.out.println("Herbs: " + getName() + " - specie - " + getSpecie() + " - continent - " 
                        + getContinent().getRegions() + " - medical purpose - " + medicalPurpose);        
    }

    @Override
    public Herbs clone() {
        Herbs h = new Herbs();
        h.setName(getName());
        h.setMedicalPurpose(this.medicalPurpose);

        return h;
    }

    public String getMedicalPurpose() {
        return medicalPurpose;
    }

    public void setMedicalPurpose(String medicalPurpose) {
        this.medicalPurpose = medicalPurpose;
    } 
}
