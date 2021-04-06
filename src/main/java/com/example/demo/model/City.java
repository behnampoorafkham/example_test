package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "city")
@Entity
public class City {

    public City(String id, String name, long people_count) {
        this.id = id;
        this.name = name;
        this.people_count = people_count;
    }

    @Id
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "people_count")
    long people_count;

    public City() {

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

    public long getPeople_count() {
        return people_count;
    }

    public void setPeople_count(long people_count) {
        this.people_count = people_count;
    }

}
