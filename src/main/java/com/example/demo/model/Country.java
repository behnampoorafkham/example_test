package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "country")
@Entity
public class Country {

    public Country() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public Country(String id, String name, long population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    @Id
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "population")
    long population;
}
