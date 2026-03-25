package br.edu.unifei.hunterproject.nen;

public class Nen {
    private String name;
    private NenAbility nenAbility;
    private NenUserTypeEnum userType;

    public Nen(String name, NenAbility nenAbility, NenUserTypeEnum userType) {
        this.name = name;
        this.nenAbility = nenAbility;
        this.userType = userType;
    }

    public void ability() {
        nenAbility.useNen();;
    }

    public NenAbility getNenAbility() {
        return nenAbility;
    }

    public void setNenAbility(NenAbility nenAbility) {
        this.nenAbility = nenAbility;
    }

    public NenUserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(NenUserTypeEnum userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
