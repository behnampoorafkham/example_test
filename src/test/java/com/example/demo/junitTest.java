package com.example.demo;

import com.example.demo.model.City;
import com.example.demo.model.Continent;
import com.example.demo.model.Country;
import com.example.demo.repository.CityRep;
import com.example.demo.repository.ContinentRep;
import com.example.demo.repository.CountryRep;
import com.example.demo.service.CityService;
import com.example.demo.service.ContinentService;
import com.example.demo.service.CountryService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@SpringBootTest
public class junitTest {

    @Autowired
   CityService cityService;

    @Autowired
    ContinentService continentService;

    @Autowired
    CountryService countryService;

    static int test = 0;
//    @BeforeEach
//    void beforeEach(){
//        test+=1;
//        System.out.println("test:" + test);
//    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("START");
    }

    @DisplayName("test1 is ok")
    @Test
    void test1(){
        UUID randomUUID = UUID.randomUUID();
        City city = new City(randomUUID.toString(),"mashad",80);
        cityService.create(city);
        Assertions.assertEquals(city.getName() , cityService.findById(randomUUID).get().getName());
    }

    @DisplayName("test2 is ok")
    @Test
    void test2(){
        UUID randomUUID = UUID.randomUUID();
        Continent continent = new Continent(randomUUID.toString(),"asia",500);
        continentService.create(continent);
        Assertions.assertEquals(continent.getName() , continentService.findById(randomUUID).get().getName());
    }

    @DisplayName("test3 is ok")
    @Test
    void test3(){
        UUID randomUUID = UUID.randomUUID();
        Country country = new Country(randomUUID.toString(),"iran",340);
        countryService.create(country);
        Assertions.assertEquals(country.getName() , countryService.findById(randomUUID).get().getName());
    }

    @AfterAll
    static void afterAll(){
        System.out.println("FINISH");
    }

//    @AfterEach
//    void afterEach(){
//        System.out.println("Test:"+test);
//    }
}
