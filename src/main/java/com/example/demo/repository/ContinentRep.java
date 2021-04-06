package com.example.demo.repository;

import com.example.demo.model.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.UUID;

public interface ContinentRep extends JpaRepository<Continent, String> {
}
