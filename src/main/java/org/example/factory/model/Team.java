package org.example.factory.model;

public class Team {

    private int id;
    private String name;
    private String country;
    private int performance;

    public Team(int id, String name, String country, int performance) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.performance = performance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", performance=" + performance +
                '}';
    }
}
