package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return List.of(
                new Country("IN", "India"),
                new Country("US", "United States"),
                new Country("JP", "Japan")
        );
    }
}