package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mothers")
public class Mother {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Job job;

    public Mother(Integer id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }
    public Mother(){
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
