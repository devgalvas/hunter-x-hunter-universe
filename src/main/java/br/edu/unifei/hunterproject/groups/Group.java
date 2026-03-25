package br.edu.unifei.hunterproject.groups;

public abstract class Group {
    String foundation;
    private String purpose;
    
    public String getFoundation() {
        return foundation;
    }
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
