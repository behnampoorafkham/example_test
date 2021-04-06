package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "continent")
@Entity
public class Continent {

    public Continent() {

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

    public long getCountry_count() {
        return country_count;
    }

    public void setCountry_count(long country_count) {
        this.country_count = country_count;
    }

    public Continent(String id, String name, long country_count) {
        this.id = id;
        this.name = name;
        this.country_count = country_count;
    }

    @Id
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "country_count")
    long country_count;
}
