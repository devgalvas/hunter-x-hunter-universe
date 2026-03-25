package br.edu.unifei.hunterproject.Hunters;

import br.edu.unifei.hunterproject.LivingBeing.LivingBeing;
import br.edu.unifei.hunterproject.groups.Group;

public class Human extends LivingBeing {
    private int age;
    private String sex;
    private String name;
    private Family Family;
    private Occupation occupation;
    private Group group;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Family getFamily() {
        return Family;
    }
    public void setFamily(Family family) {
        Family = family;
    }
    public Occupation getOccupation() {
        return occupation;
    }
    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
}
