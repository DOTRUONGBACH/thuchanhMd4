package com.example.thi_module_4.service;

import com.example.thi_module_4.model.City;
import com.example.thi_module_4.repo.ICityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class CityService {
    @Autowired
    ICityRepo cityRepo;

    public List<City> getAllCities() {
        return (List<City>) cityRepo.findAll();
    }
    public City createCity(City city) {
        return cityRepo.save(city);
    }
    public Optional<City> findById(int id){
return cityRepo.findById(id);
    }
}