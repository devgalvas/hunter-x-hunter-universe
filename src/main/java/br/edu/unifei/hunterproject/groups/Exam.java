package br.edu.unifei.hunterproject.groups;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private String name;
    private String goal;
    private List<Test> tests = new ArrayList<Test>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGoal() {
        return goal;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
    public List<Test> getTests() {
        return tests;
    }
    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
