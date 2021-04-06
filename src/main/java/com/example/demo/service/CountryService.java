package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CountryService {

    @Autowired
    CountryRep countryRep;

    public Country create(Country country) {
        return countryRep.save(country);
    }

    public Optional<Country> findById(UUID id){
        return countryRep.findById(id.toString());
    }

    public List<Country> findAll(){
        return countryRep.findAll();
    }
}
