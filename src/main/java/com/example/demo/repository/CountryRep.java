package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.UUID;

public interface CountryRep extends JpaRepository<Country, String> {
}
