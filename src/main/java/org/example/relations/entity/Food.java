package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "foods")
public class Food {
    @Id
    private Integer id;
    private String name;
    private Integer calories;
    private Boolean healthy;

    public Food(Integer id, String name, Integer calories, Boolean healthy) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.healthy = healthy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }
}
