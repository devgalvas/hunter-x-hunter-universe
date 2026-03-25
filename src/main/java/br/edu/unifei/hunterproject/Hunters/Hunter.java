package br.edu.unifei.hunterproject.Hunters;

import java.util.ArrayList;
import java.util.List;

public class Hunter extends Occupation{
    private int stars;
    private int id;
    private List<Training> trainings = new ArrayList<Training>();

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }
}
