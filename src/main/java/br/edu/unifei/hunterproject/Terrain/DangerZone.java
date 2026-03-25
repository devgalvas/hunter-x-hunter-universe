package br.edu.unifei.hunterproject.Terrain;

import br.edu.unifei.hunterproject.Hunters.Hunter;

public class DangerZone extends Location {
    private String threats;
    private String weather;
    private boolean isRestricted;
    public String getThreats() {
        return threats;
    }
    public void setThreats(String threats) {
        this.threats = threats;
    }
    public String getWeather() {
        return weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    public boolean isRestricted() {
        return isRestricted;
    }
    public void setRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public void evaluateDanger() {
        if (super.getDanger() == DangerEnum.SS || super.getDanger() == DangerEnum.S) {
            System.out.println("This place is extremely dangerous!");
        } else if (super.getDanger() == DangerEnum.A || super.getDanger() == DangerEnum.B) {
            System.out.println("This place is very dangerous!");
        } else if (super.getDanger() == DangerEnum.C) {
            System.out.println("This place is dangerous!");
        } else {
            System.out.println("This place is safe!");
        }
    }

    public void checkAcess(Hunter hunter) {
        if (isRestricted) {
            System.out.println("This place is restricted!");
            if (hunter.getStars() >= 1) {
                System.out.println("You have the right to be here!");
            } else {
                System.out.println("You don't have the right to be here!");
            }
        } else {
            System.out.println("This place is not restricted!");
        }
    }
}
