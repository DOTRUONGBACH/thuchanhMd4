package com.example.thi_module_4.controller;

import com.example.thi_module_4.model.City;
import com.example.thi_module_4.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping("/home")
    public String getALl(Model model){
        model.addAttribute("cities",cityService.getAllCities());
        return "home";
    }
}
