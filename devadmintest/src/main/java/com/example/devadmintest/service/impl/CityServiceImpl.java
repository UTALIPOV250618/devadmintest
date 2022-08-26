package com.example.devadmintest.service.impl;

import com.example.devadmintest.model.City;
import com.example.devadmintest.payload.dto.CityRequest;
import com.example.devadmintest.payload.dto.CityResponse;
import com.example.devadmintest.payload.mapper.CityEditMapper;
import com.example.devadmintest.payload.mapper.CityViewMapper;
import com.example.devadmintest.service.CityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CityServiceImpl {

    private final CityRepository cityRepository;
    private final CityEditMapper cityEditMapper;
    private final CityViewMapper cityViewMapper;

    public CityResponse createDate(CityRequest cityRequest) {

        City city = cityEditMapper.insertNewData(cityRequest);

        return cityViewMapper.viewEntityData(cityRepository.save(city));
    }

    public CityResponse update(Long cityId, CityRequest cityRequest) {

        City city = cityRepository.findById(cityId).get();
        cityEditMapper.updateData(city, cityRequest);

        return cityViewMapper.viewEntityData(cityRepository.save(city));
    }

    public void deleteCity(Long cityId) {
        cityRepository.deleteById(cityId);
    }

    public CityResponse viewCityById(Long cityID){
        return cityViewMapper.viewEntityData(cityRepository.findById(cityID).get());
    }

    public List<CityResponse> viewAllList() {
        return cityViewMapper.viewAllEntityData(cityRepository.findAll());
    }
}
