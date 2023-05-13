package org.example.relations.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "mothers")
public class Mother {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Job job;
    @OneToMany
    private List<Hobby> hobbies;
    @OneToMany(cascade = {CascadeType.PERSIST})
    private List<TvShows> tvshows;


    public Mother(Integer id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public Mother(Integer id, String name, Job job, List<Hobby> hobbies, List<TvShows> tvshows) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.hobbies = hobbies;
        this.tvshows = tvshows;
    }

    public Mother(){
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
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

    public List<TvShows> getTvshows() {
        return tvshows;
    }

    public void setTvshows(List<TvShows> tvshows) {
        this.tvshows = tvshows;
    }
}
