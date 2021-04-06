package com.example.demo.repository;

import com.example.demo.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.UUID;
@Repository
public interface CityRep extends JpaRepository<City, String> {
}
