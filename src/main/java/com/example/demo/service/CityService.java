package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CityService {

    @Autowired
    CityRep cityRep;

    public City create(City city) {
        return cityRep.save(city);
    }

    public Optional<City> findById(UUID id){
        return cityRep.findById(id.toString());
    }

    public List<City> findAll(){
        return cityRep.findAll();
    }

}
