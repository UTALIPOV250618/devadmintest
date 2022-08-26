package com.example.devadmintest.payload.mapper;

import com.example.devadmintest.model.City;
import com.example.devadmintest.payload.dto.CityRequest;
import com.example.devadmintest.payload.dto.CityResponse;
import org.springframework.stereotype.Component;

@Component
public class CityEditMapper {

    public City insertNewData(CityRequest cityRequest){

        City city = new City();
        city.setName(cityRequest.getName());
        city.setCountryCode(cityRequest.getCountryCode());
        city.setDistrict(cityRequest.getDistrict());
        city.setPopulation(cityRequest.getPopulation());

        return city;
    }
    public City updateData(City city,CityRequest cityRequest){

        city.setName(cityRequest.getName());
        city.setCountryCode(cityRequest.getCountryCode());
        city.setDistrict(cityRequest.getDistrict());
        city.setPopulation(cityRequest.getPopulation());

        return city;
    }
}
