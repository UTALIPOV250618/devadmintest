package com.example.devadmintest.payload.mapper;

import com.example.devadmintest.model.City;
import com.example.devadmintest.payload.dto.CityResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CityViewMapper {

    public CityResponse viewEntityData(City city){

        CityResponse cityResponse = new CityResponse();
        cityResponse.setId(city.getId());
        cityResponse.setName(city.getName());
        cityResponse.setCountryCode(city.getCountryCode());
        cityResponse.setDistrict(city.getDistrict());
        cityResponse.setPopulation(city.getPopulation());
        return cityResponse;
    }

    public List<CityResponse> viewAllEntityData(List<City> cities){

        List<CityResponse> cityResponseList = new ArrayList<>();
        for (City city:cities
             ) {
            cityResponseList.add(viewEntityData(city));
        }

        return cityResponseList;
    }
}
