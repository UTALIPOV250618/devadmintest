package com.example.devadmintest.payload.controller;

import com.example.devadmintest.payload.dto.CityRequest;
import com.example.devadmintest.payload.dto.CityResponse;
import com.example.devadmintest.service.impl.CityServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/city")
@RequiredArgsConstructor
public class CityController {

    private final CityServiceImpl cityService;

    @PostMapping()
    public CityResponse insert(@RequestBody CityRequest cityRequest) {
        return cityService.createDate(cityRequest);
    }

    @PutMapping("{cityId}")
    public CityResponse update(@PathVariable Long cityId, @RequestBody CityRequest cityRequest) {
        return cityService.update(cityId, cityRequest);
    }

    @DeleteMapping("{cityId}")
    public void delete(@PathVariable Long cityId) {
         cityService.deleteCity(cityId);
    }

    @GetMapping("{cityId}")
    public CityResponse getByCityById(@PathVariable Long cityId) {
        return cityService.viewCityById(cityId);
    }

    @GetMapping
    public List<CityResponse> getAllEntity() {
        return cityService.viewAllList();
    }

}
