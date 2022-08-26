package com.example.devadmintest.payload.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityRequest {

    String name;
    Integer countryCode;
    String district;
    Long population;
}
