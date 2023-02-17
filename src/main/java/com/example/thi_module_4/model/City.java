package com.example.thi_module_4.model;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String country;
    @OneToOne
    private CityDetail cityDetail;

    public City(int id, String name, String country, CityDetail cityDetail) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.cityDetail = cityDetail;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CityDetail getCityDetail() {
        return cityDetail;
    }

    public void setCityDetail(CityDetail cityDetail) {
        this.cityDetail = cityDetail;
    }
}
