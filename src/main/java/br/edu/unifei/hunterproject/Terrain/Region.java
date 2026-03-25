package br.edu.unifei.hunterproject.Terrain;

import java.util.List;

public class Region extends Location {
    private List<City> cities;
    private String local_laws;
    
    public List<City> getCities() {
        return cities;
    }
    public void setCities(List<City> cities) {
        this.cities = cities;
    }
    public String getLocal_laws() {
        return local_laws;
    }
    public void setLocal_laws(String local_laws) {
        this.local_laws = local_laws;
    }
}
