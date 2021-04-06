package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.model.Continent;
import com.example.demo.repository.CityRep;
import com.example.demo.repository.ContinentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContinentService {

        @Autowired
        ContinentRep  continentRep;

        public Continent create(Continent continent) {
            return continentRep.save(continent);
        }

        public Optional<Continent> findById(UUID id){
            return continentRep.findById(id.toString());
        }

        public List<Continent> findAll(){
            return continentRep.findAll();
        }

    }
