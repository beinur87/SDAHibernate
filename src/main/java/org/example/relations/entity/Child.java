package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "children")
public class Child {
    @Id
    private Integer id;
    private String name;
    @OneToOne()
    private Food favoriteFood;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Toy favouriteToy;

    public Child(Integer id, String name, Food favoriteFood, Toy favouriteToy) {
        this.id = id;
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.favouriteToy = favouriteToy;
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
}
