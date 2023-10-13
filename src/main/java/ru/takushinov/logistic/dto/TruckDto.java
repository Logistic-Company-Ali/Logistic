package ru.takushinov.logistic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TruckDto {
    private Long id;
    private String model;
    private String number;
    private Integer loadCapacity;
    private Integer length;
    private Integer height;
    private Integer width;
    private TransportCompanyDto transportCompany;
    private TruckTypeDto truckType;

}
