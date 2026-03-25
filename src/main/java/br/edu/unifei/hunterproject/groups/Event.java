package br.edu.unifei.hunterproject.groups;

import br.edu.unifei.hunterproject.Terrain.City;

public class Event {
    private String date;
    private City city;
    private String description;
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
